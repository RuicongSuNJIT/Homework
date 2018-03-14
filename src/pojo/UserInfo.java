package pojo;

/**
 * You will add the fields to store user information. Please set them to
 * private. Then add the getters and setters.
 * 
 * HINT: If your parameter name is lName and use the eclipse feature
 * [source->generate getters and setters], it will automatically get you
 * getlName() and setlName(). But it is not satisfy the official format, (I
 * don't know why eclipse make this mistake when the parameter name first word
 * is only one character), the correct ones are getLName() and setLName().
 * 
 * @author Ruicong Su
 *
 */

public class UserInfo {
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
