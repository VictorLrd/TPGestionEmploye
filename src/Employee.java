

public abstract class Employee {

    private static String NAME_PATTERN = "%s %s %s";
    private String firstname;
    private String lastname;
    private int age;
    private String entryYear;


    public Employee(String firstname, String lastname, int age, String entryYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.entryYear = entryYear;
    }

    public abstract double calculerSalaire();
    public abstract String getPosition();

    public String getName() {
        return String.format(NAME_PATTERN, getPosition(), firstname, lastname);
    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEntryYear() {
		return entryYear;
	}

	public void setEntryYear(String entryYear) {
		this.entryYear = entryYear;
	}
}
