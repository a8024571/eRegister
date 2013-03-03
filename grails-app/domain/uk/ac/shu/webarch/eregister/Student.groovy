package uk.ac.shu.webarch.eregister

class Student {
	
	String fullStudentName
	String studentNumber
	String dateOfBirth
	String gender

    Set enrolledClasses

    static hasMany = [enrolledClasses:RegisterEntry]

    static mappedBy = [enrolledClasses:enrolledStudent]
 
    static constraints = {
	FullStudentName(nullable:false, blank:false, maxsize:256)
	StudentNumber(nullable:false, blank:false, maxsize:20)
	DateOfBirth(nullable:false, blank:false, maxsize:15)
	Gender(nullable:false, blank:false, maxsize:10)
    }
}
