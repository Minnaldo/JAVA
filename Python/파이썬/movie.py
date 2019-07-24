import urllib.request
from bs4 import BeautifulSoup

def main():
    print("영화 리뷰")

    # 리뷰를 수집할 사이트 주소 입력
    url = "https://movie.naver.com/movie/bi/mi/review.nhn?code=168058#"


    # URL 주소에 있는 HTML 코드를 soup에 저장합니다.
    source_code = urllib.request.urlopen(url).read()
    soup = BeautifulSoup(source_code, "html.parser")


#     list = []
# #인기검색어에 있는 태그를 가져오는것 class_="ah_k"
#     for naver_text in soup.find_all('span', class_="ah_k"):
#         #not it list  =>  리스트에 없으면 넣어주세요!
#         if naver_text.get_text() not in list:
#             list.append(naver_text.get_text())

#     print(list)
    


    # 1. 리뷰가 있는 있는 ul 태그 찾기
    # 2. ul 안에 있는 모든 li 태그 찾기
    # 3. li 태그 안에 있는 strong 태그에서 get_text()로 텍스트 추출

    review_list = []
    for i in soup.find('ul', class_='rvw_list_area').find_all('li'):
        review_list.append(i.find('strong').get_text())
        
    print(review_list)
        
        


if __name__ == "__main__":
    main()
