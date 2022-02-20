package com.hiberante.curd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@Column(name="userid")
   int userid;
	@Column(name="username")
	String username;
	@Column(name="passward")
   String passward;
	@Column(name="firstname")
   String fristname;
	@Column(name="lastname")
   String lastname;
	
	
	public int getUserid() {
		return userid;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getFristname() {
		return fristname;
	}
	public void setFristname(String fristname) {
		this.fristname = fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Users(int userid, String username, String passward, String fristname, String lastname) {
		this.userid= userid;
        this.username = username;
		this.passward = passward;
		this.fristname = fristname;
		this.lastname = lastname;
	}

	
	
		public Users(String username, String passward, String fristname, String lastname) {
		this.username = username;
		this.passward = passward;
		this.fristname = fristname;
		this.lastname = lastname;
		
	}
	
     public Users() {
	super();
}
}
	
