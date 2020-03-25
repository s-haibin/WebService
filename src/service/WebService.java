package service;

import javax.xml.ws.Endpoint;

/**
 * webservice服务端
 * @author HB
 *	?wsdl
 */

@javax.jws.WebService
public class WebService {
	public String transWords(String words){
	    String res ="";
	    for(char ch:words.toCharArray()){
	         res+=ch+",";
	      }
	     return res;
	    }
	
	//对外发布服务
	public static void main(String args[]){
	    Endpoint.publish("http://localhost:8081/webservice/LoginController", new WebService());
	    System.out.println("public success");
	    }
}
