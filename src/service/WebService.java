package service;

import javax.xml.ws.Endpoint;

/**
 * webservice�����
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
	
	//���ⷢ������
	public static void main(String args[]){
	    Endpoint.publish("http://localhost:8081/webservice/LoginController", new WebService());
	    System.out.println("public success");
	    }
}
