package stu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;

public class youtube {

	public static String search(String search) throws IOException {
		String apiurl = "https://www.googleapis.com/youtube/v3/search";
		apiurl += "?key=AIzaSyCSNiWe_-oP1a3hDT0Y8wImEyLxVOQL1sU";
		apiurl += "&part=snippet&type=video&maxResults=20&videoEmbeddable=true";
		apiurl += "&q="+URLEncoder.encode(search,"UTF-8");
		System.out.println(apiurl);
//		"https://www.googleapis.com/youtube/v3/search?key=AIzaSyCSNiWe_-oP1a3hDT0Y8wImEyLxVOQL1sU&part=snippet&type=video&maxResults=20&videoEmbeddable=true&q="

		URL url = new URL(apiurl);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while((inputLine = br.readLine()) != null) {
			response.append(inputLine).append("\n");
		}
		br.close();
		
		return response.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(search(br.readLine()));
	}
}