package Assignment2;
import java.util.Date;
import java.util.Arrays;
public class groupAccount {
	private group id;
	protected account[] account;
	private Date joinDate;
	public groupAccount(group id, account[] account, Date joinDate) {
		super();
		this.id = id;
		this.account = account;
		this.joinDate = joinDate;
	}
	public group getId() {
		return id;
	}
	public void setId(group id) {
		this.id = id;
	}
	public account[] getAccount() {
		return account;
	}
	public void setAccount(account[] account) {
		this.account = account;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String toString() {
		return "GroupAccount [id=" + id + ", account=" + Arrays.toString(account) + ", joinDate=" + joinDate + "]";
	}
}
