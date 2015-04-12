package ar.com.jclaser

class Enrollment {
	Date expiriation;//vensimiento
	String details;
    static constraints = {
		expiriation nullable:false;
		details nullable:false;
		
    }
}
