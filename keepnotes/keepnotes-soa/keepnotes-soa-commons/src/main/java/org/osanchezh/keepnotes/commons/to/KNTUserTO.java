package org.osanchezh.keepnotes.commons.to;

import java.io.Serializable;

public class KNTUserTO implements Serializable {

    //KNT
	
	private static final long serialVersionUID = 3503727830941330198L;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int id;
    private String name;
    private String password;
    private String email;
	@Override
	public String toString() {
		return "UserDO [id=" + id + ", name=" + name + ", password=" + password
				+ ", email=" + email + "]";
	}
    
    
    
}
