package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class tblEmp {
	@Id
	@Column
	private int userID;
	@Column
	private String name;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public tblEmp(int userID, String name) {
		super();
		this.userID = userID;
		this.name = name;
	}

	public tblEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
