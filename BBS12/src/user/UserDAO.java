package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	//ȸ�� �����ͺ��̽� ���̺��� ������ �� �ֵ��� ���������� ȸ������ �ҷ����ų� �����ͺ��̽��� ȸ������ �ְ��� �� �� ��� 
	
	private Connection conn; 
	private PreparedStatement pstmt; 
	private ResultSet rs; 
	
	public UserDAO() { 
		//Connection conn=null;
		try { 
			String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String ID = "JSPUSER"; //SCOTT?
			String Password="1234"; //
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn=DriverManager.getConnection(URL,ID,Password);
			
			
		} catch(Exception e) { 
			e.printStackTrace();
		}
	}
	public int login(String userID, String userPassword) { //�α��� �ϴ� �Լ� ����� 
		String SQL="SELECT userPassword FROM USER1 WHERE userID= ?";  //��ŷ ��� ���? 
		try { 
			pstmt=conn.prepareStatement(SQL);   //���� !!!
			pstmt.setString(1,userID); 
			rs=pstmt.executeQuery();
			if(rs.next()) { 
				if(rs.getString(1).equals(userPassword)) 
					return 1; //�α��� ���� 
				else 
					return 0; //��й�ȣ ����ġ 
					
					
			}
			return -1; //���̵� ���� 
			
		}catch (Exception e) { 
			e.printStackTrace();
		}
		return -2; //�����ͺ��̽� ���� 
	}
	
		public int join(User user) { 
			String SQL= "INSERT INTO USER VALUES(?,?,?,?,?)"; 
		try { 
			pstmt=conn.prepareStatement(SQL); 
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			return pstmt.executeUpdate(); 
			
			
			
		} catch(Exception e) { 
			e.printStackTrace();
			
		}
		return -1; //�����ͺ��̽� ���� 
		
		
		
		
			
		}
		
	}
	
	
	
