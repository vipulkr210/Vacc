package connection;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Maina {
	public static void main(String[] args) {

		try {

		String recipient = "+916395950583";

		String messa= "greetings";

		String username = "vipul";

		String password = "12345678";

		String originator = "+918745993570";

		String requestUrl  = "http://127.0.0.1:8800/?User="+username+"&Password="+password+"&PhoneNumber="+recipient+"&text="+messa+"";

		 

		URL url = new URL(requestUrl);

		HttpURLConnection uc = (HttpURLConnection)url.openConnection();

		System.out.println(uc.getResponseMessage());

		uc.disconnect();

		} catch(Exception ex) {

		System.out.println(ex.getMessage());

		}

		}
}
