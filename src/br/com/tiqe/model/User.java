package br.com.tiqe.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_User")
public class User {

	@Id
	@Column(name="ID_TiqeUser", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="Picture", nullable=true)
	private String picture;
	
	@Column(name="FirstName", nullable=false, length=20)
	private String firstName;
	
	@Column(name="LastName", nullable=false, length=20)
	private String lastName;
	
	@Column(name="Email", nullable=false, length=100)
	private String email;
	
	@Column(name="Pass", nullable=false, length=20)
	private String pass;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Birthday", nullable=true)
	private Date birthday;
	
	@Column(name="useTerms", nullable=false)
	private boolean useTerms;
	
	@Column(name="Status", nullable=false)
	private boolean status;
	
	@Column(name="FirstLogin", nullable=false)
	private boolean firstLogin;
	
	@Column(name="Language", nullable=false, length=5)
	private String language;   // (varchar(5), not null)(default: pt-Br, domains:pt-Br)
	
	@Column(name="SendLogError", nullable=false)
	private boolean sendLogError;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RegisterDate", nullable=false)
	private Date registerDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ModifyDate", nullable=false)
	private Date modifyDate;

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		picture = picture;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		pass = pass;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		birthday = dateFormat.format(birthday);
	}

	public boolean isUseTerms() {
		return useTerms;
	}

	public void setUseTerms(boolean useTerms) {
		useTerms = useTerms;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		status = status;
	}

	public boolean isFirstLogin() {
		return firstLogin;
	}

	public void setFirstLogin(boolean firstLogin) {
		firstLogin = firstLogin;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		language = language;
	}

	public boolean isSendLogError() {
		return sendLogError;
	}

	public void setSendLogError(boolean sendLogError) {
		sendLogError = sendLogError;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate() {
		Date data = new Date(System.currentTimeMillis());  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		registerDate = dateFormat.format(data);
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate() {
		Date data = new Date(System.currentTimeMillis());  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		modifyDate = dateFormat.format(data);
	}

}
