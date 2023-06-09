package requestRepositoryPackage;

import java.io.IOException;
import java.util.ArrayList;

import commonFunctionsPackage.Utility_Common_Functions;

public class post_req_repository {
	
	public static String base_URI() {
		String BaseURI = "https://reqres.in/";
		
		return BaseURI;
	}
	
	public static String post_req_tc1() throws IOException {
		ArrayList<String> data = Utility_Common_Functions.readDataExcel("Post_Sheet", "Post_TC_1");
		String req_name = data.get(1);
		String req_job = data.get(2);
		
		String requestBody1 = "{\r\n"
		                + "    \"name\": \""+req_name+"\",\r\n"
		                + "    \"job\": \""+req_job+"\"\r\n"
		                + "}";
		return requestBody1;	

	}
	
		public static String post_resource() {
			String resource = "/api/users";
			
			return resource;				
			}
	
}  
