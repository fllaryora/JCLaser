package ar.com.jclaser

class Provider extends Pearson{
	
    static constraints = {
    }
	
	static hasMany = [enrollments: Enrollment]
}
