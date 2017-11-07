package week6;

public class Contact {

    private String phoneNumber;
    private String name;

    public Contact(String name, String phoneNumber) {

	this.phoneNumber = phoneNumber;
	this.name = name;
    }

    public String getPhoneNumber() {

	return this.phoneNumber;
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
    public int hashCode() {

	final int prime = 31;
	int result = 1;
	result = prime * result + ((this.phoneNumber == null) ? 0 : this.phoneNumber.hashCode());
	return result;
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
	Contact other = (Contact) obj;
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
