package client;

/**
 * webservice客户端测试程序
 * @author HB
 *webservice客户端生成方式：
 *右键项目-new-other-web service cilent-下一步到输入url地址和包确认自动生成
 *url地址后需添加?wsdl
 */
public class ClientTest {

 public static void main(String args[]) {
		// TODO Auto-generated method stub
		WebService web;//服务端实体类
	try {
		//实例化服务端的接口
		web =new WebServiceService().getWebServicePort();
		//调用服务端方法
		String str=web.transWords("i study webservice now");
		System.out.println(str);		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
}
