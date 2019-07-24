# -*- coding: utf-8 -*-
import re
import urllib.request

from bs4 import BeautifulSoup

from flask import Flask
from slack import WebClient
from slackeventsapi import SlackEventAdapter


SLACK_TOKEN = 'xoxb-678362887939-691909768582-wftKiOMwOevEgokDCFtbVYvL'
SLACK_SIGNING_SECRET = '0ece744c67ce9bea228432cba56276de'


app = Flask(__name__)
# /listening 으로 슬랙 이벤트를 받습니다.
slack_events_adaptor = SlackEventAdapter(SLACK_SIGNING_SECRET, "/listening", app)
slack_web_client = WebClient(token=SLACK_TOKEN)


# 크롤링 함수 구현하기
def _crawl_music_chart(text):
    if not "music" in text:
        return "`@<봇이름> music` 과 같이 멘션해주세요."

    # 여기에 함수를 구현해봅시다.
    url = "https://music.bugs.co.kr/chart"
    source_code = urllib.request.urlopen(url).read()
    soup = BeautifulSoup(source_code, 'html.parser')
    
    message = []
    for music in soup.find('tbody').find_all('tr'):
        ranking = music.find('strong').get_text()
        # ranking = music.find('ranking').get_text()
        title = music.find('p', class_='title').find('a').get_text()
        artist = music.find('p', class_='artist').find('a').get_text()
        message.append(str(ranking+"위 : " + title + " / " + artist))

    return '\n'.join(message)
    #한글 지원을 위해 unicode u를 붙여줌.
    # return u'\n'.join(message)
    


# 챗봇이 멘션을 받았을 경우
@slack_events_adaptor.on("app_mention")
def app_mentioned(event_data):
    channel = event_data["event"]["channel"]
    text = event_data["event"]["text"]

    message = _crawl_music_chart(text)
    slack_web_client.chat_postMessage(
        channel=channel,
        text=message
    )


# / 로 접속하면 서버가 준비되었다고 알려줍니다.
@app.route("/", methods=["GET"])
def index():
    return "<h1>Server is ready.</h1>"


if __name__ == '__main__':
    app.run('0.0.0.0', port=5000)
