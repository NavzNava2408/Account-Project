package entity;

public class account_class {
	private String  firstname;
	private String surname;
	private int accountnumber;
	
	public account_class(String firstname, String surname, int accountnumber) {
		this.firstname = firstname;
		this.surname = surname;
		this.accountnumber = accountnumber;
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	public String getsurname() {
		return surname;
	}
	
	public int accountnumber() {
		return accountnumber;
	}
	
	public void setdetails(String firstname, String surname, int accountnumber) {
		this.firstname = firstname;
		this.surname = surname;
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "account_class [firstname=" + firstname + ", surname=" + surname + ", accountnumber=" + accountnumber
				+ "]";
	}
	
	
}
