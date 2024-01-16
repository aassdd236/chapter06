package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		//서버 소켓 생성
		ServerSocket serverSocket=new ServerSocket();
		
		//바인딩
		serverSocket.bind(new InetSocketAddress("192.168.0.80", 10001));

		//서버시작
		System.out.println("<서버 시작>");
		System.out.println("==============================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		//클라이언트가 접속을 하면 accept()가 실행됨
		Socket socket=serverSocket.accept();
		System.out.println("클라이언트가 연결되었습니다.");

		//로직
		socket.close();
		serverSocket.close();
	}

}
