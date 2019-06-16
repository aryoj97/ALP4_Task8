import java.io.*;  
import java.net.*;  
public class Live_Chat_client {  
	public static void main(String[] args) {  
		try (     
			Socket clientSocket = new Socket("localhost",5433);  
			PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader inputText = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));
		) 
		{
			String userInput;
			while ((userInput = stdIn.readLine()) != null) {
				output.println(userInput);
			}
			clientSocket.close();
		} catch(Exception e) {
			System.out.println(e);
		}  
	}  
}  