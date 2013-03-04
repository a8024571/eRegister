package uk.ac.shu.webarch.eregister

class Student {
	
	String fullStudentName
	String studentNumber
	String dateOfBirth
	String gender

    Set enrolledClasses

    static hasMany = [enrolledClasses:RegisterEntry]

    static mappedBy = [enrolledClasses: 'enrolledStudent']
 
    static constraints = {
	fullStudentName(nullable:false, blank:false, maxsize:256)
	studentNumber(nullable:false, blank:false, maxsize:20)
	dateOfBirth(nullable:false, blank:false, maxsize:15)
	gender(nullable:false, blank:false, maxsize:10)
    }
}
