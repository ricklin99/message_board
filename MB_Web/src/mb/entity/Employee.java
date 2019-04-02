package mb.entity;

public class Employee {
	private int emp_no;
	private RoleType roleType;
	
	public Employee() {}
	
	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public RoleType getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return "Employee [emp_no=" + emp_no + ", roleType=" + roleType + "]";
	}
	
}
