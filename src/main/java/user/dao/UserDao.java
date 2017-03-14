package user.dao;
import user.model.User;

import java.sql.*;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import bdd.ConnectionProvider;

public interface UserDao {
	
	void newUser(User user);
	
	void delete (User user);
	
	User findUserByPseudo(String pseudo);
	
	List<User> findAllUser();
	
	void ChangePass (String password);
	
	
	
	
	
	public static int register(User u){  
		int status=0;  
		try{  
		Connection con=ConnectionProvider.getCon();  
		PreparedStatement ps=con.prepareStatement("insert into User values(?,?,?)");  
		ps.setInt(1,u.getUserid());  
		ps.setString(2,u.getMotdepasse());  
		ps.setString(3,u.getPseudo()); 
		ps.setBoolean(4,u.getIsadmin());
		ps.setDate(5,(java.sql.Date) u.getDateinscription());    
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
		return status;  
		}  

}
