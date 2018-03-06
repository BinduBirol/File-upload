package DTO;

import java.io.File;

public class RegistrationDTO {

	String name;
	String type;
	String email;
	String phone;
	String address;
	String country;
	String paperID;
	String memberid;
	String category;
	String additional_paperid;
	String aff_ins;
	//File myFile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPaperID() {
		return paperID;
	}
	public void setPaperID(String paperID) {
		this.paperID = paperID;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAdditional_paperid() {
		return additional_paperid;
	}
	public void setAdditional_paperid(String additional_paperid) {
		this.additional_paperid = additional_paperid;
	}
	public String getAff_ins() {
		return aff_ins;
	}
	public void setAff_ins(String aff_ins) {
		this.aff_ins = aff_ins;
	}
	/*public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}*/
}
