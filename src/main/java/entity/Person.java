package entity;

import java.util.Date;

public final class Person {

	private String firstName;
	private String lastName;
	private Date dob;

	public Person(String firstName, String lastName, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Person{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", dob=").append(dob);
		sb.append('}');
		return sb.toString();
	}
}
