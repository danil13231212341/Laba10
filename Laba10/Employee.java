public abstract class Employee {

	public String ssn;
	public String name;
	public String email;
	public int counter;

	public Employee(String ssn, String name, String email, int counter) {
		this.ssn = ssn;
		this.name = name;
		this.email = email;
		this.counter = counter;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}