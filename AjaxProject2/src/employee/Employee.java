package employee;

public class Employee {
	int employee_id;
	String first_name;
	String email;
	int salary;
	public Employee(int employee_id, String first_name, String email, int salary) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.email = email;
		this.salary = salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}


