package api.TestData;

public class AddUser {

	private String accountno;
	private String departmentno;
	private String salary;
	private String pincode;
	
	public AddUser(String accountno, String departmentno, String salary, String pincode) {
		this.accountno = accountno;
		this.departmentno = departmentno;
		this.pincode = pincode;
		this.salary = salary;
	}
	
	public String getAccountNo() {
		return accountno;
	}
	
	public String getDepartmentNo() {
		return departmentno;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public String getPincode() {
		return pincode;
	}
}
