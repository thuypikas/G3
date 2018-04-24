package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class tblEmpAddr {
	@Column
	private int addr_ID;
	@Column
	private String addName;
	@Column
	private String phoneNo;
	@Column
	private int userID;

	public int getAddr_ID() {
		return addr_ID;
	}

	public void setAddr_ID(int addr_ID) {
		this.addr_ID = addr_ID;
	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public tblEmpAddr(int addr_ID, String addName, String phoneNo, int userID) {
		super();
		this.addr_ID = addr_ID;
		this.addName = addName;
		this.phoneNo = phoneNo;
		this.userID = userID;
	}

	public tblEmpAddr() {
		super();
		// TODO Auto-generated constructor stub
	}

}
