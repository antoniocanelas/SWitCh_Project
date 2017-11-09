package week6;

public class Person {

    private String name;
    private String phoneNumber;

    private ContactBook contactBook;

    public Person(String name, String phoneNumber) {

	this.phoneNumber = phoneNumber;
	this.name = name;
	this.contactBook = new ContactBook();

    }

    public String getPhoneNumber() {

	return this.phoneNumber;
    }

    public ContactBook getContactBook() {

	return this.contactBook;
    }

    public void setPhoneNumber(String phoneNumber) {

	this.phoneNumber = phoneNumber;
    }

    public String getName() {

	return this.name;
    }

    public void setName(String name) {

	this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	Person other = (Person) obj;
	if (this.phoneNumber == null) {
	    if (other.phoneNumber != null) {
		return false;
	    }
	} else if (!this.phoneNumber.equals(other.phoneNumber)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {

	return "Contact [name=" + this.name + ", phoneNumber=" + this.phoneNumber + "]";
    }

}
