package jp.cp.internous.aquarium.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class LoginDAO ActionSupport{

	public String admin_neme;
		public String select(String user,String password){

			Connection conn = null;//connection �A������
			String ret = "error";
			try{
				conn = (Connecton)DBmanager.getConnection();
				String sql ="select*from 0000000 where";
				sql += "admin_id =? and admin_pass=?";
//				admin =�@�Ǘ��ҁi���[�U�[�j
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
//				PreparedStatement �i�[�@�@�@PrepareStatement�@�f�[�^�𑗂�B
				ps.setString(1,user);
				ps.setString(2,password);
//				getStiring = �I�u�W�F�N�g�̍s�����java����ɂ�String�Ƃ��Ď󂯎��
				ResultSet rs = ps.executeQuery();
//				ResultSet�Ɍ������ʂ�Ԃ�SQL�������s����B
//				executeQuery=�f�[�^�x�[�X�ɖ₢���킹�Ă���
				if(rs.next()){
					ret = "succsess";
//					rs�̌��ʂ�turu�̏ꍇ���ɂ���ret��succsess�ɂȂ�B
//					ResultSet+next �ŕ�����s���Ăяo�����̍s������Ƃ���
//					true.����ȏオ�Ȃ��Ƃ�(�����o���Ȃ��Ƃ�)false
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
//					SQLE�f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
					e.printStackTrace();
//					e.printStackTrase �ɗ�O����������
				}finally{
					if(conn != null){
						try{
							conn.close();
//							conn.close() = ��������ResultSet�I�u�W�F�N�g
//							��DB��JDBC���\�[�X���J������B(���\�[�X=����+���s�ɕK�v�ȏ����V�X�e���̗v�f��@��)
						}catch(SQLException e){
							e.printStackTrace();
						}
					}
				}
					return ret;
		}
}

