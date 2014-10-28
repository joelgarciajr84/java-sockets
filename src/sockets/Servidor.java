package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String[] args) throws IOException{
		
		ServerSocket servidor = new ServerSocket(2305);
		System.out.println("Porta 2305 aberta ...");
		
		Socket cliente = servidor.accept();
		System.out.println("Nova Conexao com o cliente "+ cliente.getInetAddress().getHostAddress());;
		
		Scanner entrada = new Scanner  (cliente.getInputStream());
		while (entrada.hasNextLine()){
			
			System.out.println(entrada.nextLine());
		}
		
		entrada.close();
		servidor.close();
	}

}
