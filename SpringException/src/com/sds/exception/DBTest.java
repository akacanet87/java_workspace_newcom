/*
		
		���� ó���� ���� : ������ ������ ����
		���� ó�� ��� : 
		
		1. try~catch
			���� �޼��忡�� ����ó���� �������Ѵ�.
			
		2. throws
			���ܸ� ������Ű�� ������ ���ܸ� ���� �޼��忡�� �������ϰ� ó���� ���
			������ ������ �ܺη� ������ �� ���
			
		���ܸ� �����ڰ� �߻���Ű�� ��� : throw
		
*/
package com.sds.exception;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest{
	
	/*
		
		�������� �����ϴ� db�� ����ϸ� Ʈ����� ó���� aop�� �̿��� ����
		���� �Ӹ� �ƴ϶� ����ó���� ��������.
		
	*/
	
	//	����Ŭ ����
	/*String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="spring";
	String password="spring";*/
	
	//	������db����
	String driver="org.mariadb.jdbc.Driver";
	String url="jdbc:mariadb://localhot:3306:mvc";
	String user="root";
	String password="";

	public DBTest() {
	
		connect();
	
	}
	
	public void connect() {
		
		try {
			
			Class.forName(driver);		//	����̹� �ε�
			DriverManager.getConnection(url, user, password);
		
		} catch (ClassNotFoundException e) {
			
			System.out.println("����̹� ��ΰ� �ùٸ��� �ʽ��ϴ�.");
		
		} catch (SQLException e) {
			
			System.out.println(e.getErrorCode());
			e.printStackTrace();
			
			/*if(e.getErrorCode()==17002){
			
				System.out.println("url ������ Ʋ�Ƚ��ϴ�.");
			
			}else if(e.getErrorCode()==1017){
				
				System.out.println("id�� Ʋ�Ƚ��ϴ�.");
				
			}*/
				
		}
		
	}
	
	public static void main(String[] args) {
		
		DBTest dbTest =  new DBTest();
		
	}
	
}