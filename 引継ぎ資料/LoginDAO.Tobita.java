package jp.cp.internous.aquarium.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class LoginDAO ActionSupport{

	public String admin_neme;
		public String select(String user,String password){

			Connection conn = null;//connection 連結する
			String ret = "error";
			try{
				conn = (Connecton)DBmanager.getConnection();
				String sql ="select*from 0000000 where";
				sql += "admin_id =? and admin_pass=?";
//				admin =　管理者（ユーザー）
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
//				PreparedStatement 格納　　　PrepareStatement　データを送る。
				ps.setString(1,user);
				ps.setString(2,password);
//				getStiring = オブジェクトの行き先をjava言語にのStringとして受け取る
				ResultSet rs = ps.executeQuery();
//				ResultSetに検索結果を返しSQL文を実行する。
//				executeQuery=データベースに問い合わせている
				if(rs.next()){
					ret = "succsess";
//					rsの結果がturuの場合次にいきretがsuccsessになる。
//					ResultSet+next で文を一行ずつ呼び出し次の行があるときは
//					true.それ以上がないとき(書き出せないとき)false
					dto.setUserId(rs.getInt(1));
					dto.setUserLoginID(rs.getString(2));
					dto.setName(rs.getString(3));
					dto.setEmail(rs.getString(4));
					dto.setNumber(rs.getString(5));
					dto.setPasswprd(rs.getString(6));

					admin_name =rs.getString("admin_name");
				}
			    }
				catch(SQLException e){
//					SQLEデータベースアクセスエラーが発生した場合
					e.printStackTrace();
//					e.printStackTrase に例外が投げられる
				}finally{
					if(conn != null){
						try{
							conn.close();
//							conn.close() = ただちにResultSetオブジェクト
//							のDBとJDBCリソースを開放する。(リソース=資源+実行に必要な処理システムの要素や機器)
						}catch(SQLException e){
							e.printStackTrace();
						}
					}
				}
					return ret;
		}
}

