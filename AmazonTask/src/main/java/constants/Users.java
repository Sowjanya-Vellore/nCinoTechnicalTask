package constants;

public enum Users {
User("emeaintegrationautomation@outlook.com","AutomationTestUK"),
;
	private final String userName;
	private final String password ;
	
 Users(String userName, String password) {
	this.userName = userName;
	this.password = password;
}


public String getUserName() {
    return this.userName;
}

public String getPassword() {
    return this.password;
}
}