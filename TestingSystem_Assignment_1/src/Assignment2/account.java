package Assignment2;
import java.time.LocalDate;
import java.util.Date;

public class account {
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private department department;
	private position position;
	private Date createDate;
	protected group[] groups;
	public account() {}
	public account(int id, String email, String userName, String fullName, department department, position position,
			Date createDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
	}
	public group[] getGroups() {
		return groups;
	}
	public void setGroups(group[] groups) {
		this.groups = groups;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public department getDepartment() {
		return department;
	}
	public void setDepartment(department department) {
		this.department = department;
	}
	public position getPosition() {
		return position;
	}
	public void setPosition(position position) {
		this.position = position;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + "]";
	}
}
