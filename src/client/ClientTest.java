package client;

/**
 * webservice�ͻ��˲��Գ���
 * @author HB
 *webservice�ͻ������ɷ�ʽ��
 *�Ҽ���Ŀ-new-other-web service cilent-��һ��������url��ַ�Ͱ�ȷ���Զ�����
 *url��ַ�������?wsdl
 */
public class ClientTest {

 public static void main(String args[]) {
		// TODO Auto-generated method stub
		WebService web;//�����ʵ����
	try {
		//ʵ��������˵Ľӿ�
		web =new WebServiceService().getWebServicePort();
		//���÷���˷���
		String str=web.transWords("i study webservice now");
		System.out.println(str);		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
}
