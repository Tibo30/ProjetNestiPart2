import java.sql.Date;




public class Admin {
private int id;
private String firstName;
private String lastName;
private String userName;
private String password;
private String adress;
private String state;
private boolean superAdmin;
Date creationDate;
Date updateDate;

public Admin(int id, String firstName, String lastName, String userName, String password, String adress, String state, boolean superAdmin, Date creationDate, Date updateDate) {
	this.id= id;
	this.firstName= firstName;
	this.lastName= lastName;
	this.userName=userName;
	this.password=password;
	this.state=state;
	this.creationDate=creationDate;
	this.updateDate=updateDate;
	this.superAdmin= superAdmin;
	
}

public int getId() {
	return id;
}
public boolean isSuperAdmin() {
	return superAdmin;
}
public void setSuperAdmin(boolean isSuperAdmin) {
	this.superAdmin = isSuperAdmin;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

public Date getCreationDate() {
	return creationDate;
}

public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}

public Date getUpdateDate() {
	return updateDate;
}

public void setUpdateDate(Date updateDate) {
	this.updateDate = updateDate;
}

@Override
public String toString() {
	return "Admin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
			+ ", password=" + password + ", adress=" + adress + ", state=" + state + ", isSuperAdmin=" + superAdmin
			+ "]";
}



	
	
}