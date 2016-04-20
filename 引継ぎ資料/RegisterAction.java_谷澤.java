/**
 * 
 */
package jp.co.internous.tanithewan.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author tanizawatoru
 *
 */

public class RegisterAction extends ActionSupport {
	
	private String username;  //名前
	
	private int id;  //ID
	
	private String password;  //パスワード
	
	private String mailaddress;  //メールアドレス
	
	private String tellnum;  //電話番号
	
	private String postcode;  //郵便番号
	
	private String address;   //住所 
	
	private int i;		//インサートした結果

	private String result;  //結果
	
	//Map<String,Object> session;
	
	
	
	
	 
	 
	public String execute(){
		//result = ERROR;
		//NewmemberDAO newmemberdao = new NewmemberDAO();
		//DAOのインスタンス化
		//i = newmemberdao.insert(username,password);
		//DAOのインサートメソッドにユーザーとパスワードを渡して実行
		//if(i == 0){
			//return result;
		//}
		result = SUCCESS;
		return result;
	}
	
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	
	}

	public void setpassword(String password){
		this.password = password;
		
	}
	
	public String getMailaddress(){
		return mailaddress;
		
	}
	
	public void setmailaddress(String mailaddress){
		this.mailaddress = mailaddress;
		
	}
	
	public String getTellnum(){
		return tellnum;
		
	}
	
	public void settellnum(String tellnum){
		this.tellnum = tellnum;
		
	}
	
	public String getPostcode(){
		return postcode;
		
	}
	
	public void setpostcode(String postcode){
		this.postcode = postcode;
		
	}
	
	public String getAddress(){
		return address;
		
	}
	
	public void setaddress(String address){
		this.address = address;
		
	}
	
	public int getId(){
		return id;
		
	}
	
	public void setid(int id){
		this.id = id;
		
	}

	
}
