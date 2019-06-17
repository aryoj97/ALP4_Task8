import java.net.*;  
import java.util.*;
import java.io.*;
public class Live_Chat { 
	public static void main(String[] args) throws IOException{ 
		try (
			ServerSocket serverSocket = new ServerSocket(5433);
			Socket clientSocket = serverSocket.accept();     
			PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);                   
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		) {
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				output.println("Hello world");
				System.out.println(inputLine);
			}
		} catch (IOException e) {
			System.out.println("User signed off");
		}
	} 
} 