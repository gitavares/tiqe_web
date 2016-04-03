package br.com.tiqe.bean;

//import javax.faces.bean.ManagedBean;
import javax.annotation.ManagedBean;

import br.com.tiqe.model.User;

@ManagedBean
public class UserBean {

	private User user = new User();
	
	public User getUser(){
		return user;
	}
	
	public void setUser(){
		System.out.println("Gravando usuario... " + this.user.getFirstName() + " " + this.user.getLastName());
		
		if(user.getFirstName().isEmpty()){
			throw new RuntimeException("Usuario deve ter um nome");
		}
		
		//new DAO<User>(User.class).insert(this.user);
		
	}
}
