package Assignment_1;

public class department {
	private int departmentID;
	private String departmentName;
	
	public department(int departmentID, String departmentName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String toString() {
		return "Department [ ID: " + departmentID + " Name: " + departmentName +  "] ";
	}
}
