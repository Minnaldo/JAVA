package Friday_Project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
public class SimpleChatServer {
    private ArrayList<ChatService> room = new ArrayList<>();
    
    public synchronized void addClient(ChatService client) {
        room.add(client);
    }
    public synchronized void removeClient(ChatService client){
        room.remove(client);
    }
    
    public synchronized void broadcast(String msg) {
        for(ChatService client: room) {
            try {
                client.sendMessage(msg);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        SimpleChatServer server = new SimpleChatServer();
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(6543);
            while(true) {
                System.out.println("Client 대기중......");
                Socket s = ss.accept();
                System.out.println(s.getInetAddress());//접속된사람의 주소
                //Thread 작성
                ChatService client = new ChatService(s,server);
                client.start();
                server.addClient(client);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(ss!=null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    System.out.println("소캣닫기 실패");
                }
            }
        }
    }
}
class ChatService extends Thread{
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;
    SimpleChatServer server;
    public ChatService(Socket socket, SimpleChatServer server) {
        this.socket = socket;
        this.server = server;
    }
    public void sendMessage(String msg) throws IOException {
        // TODO Auto-generated method stub
        if(dos!=null)
            dos.writeUTF(msg);
    }
    
}