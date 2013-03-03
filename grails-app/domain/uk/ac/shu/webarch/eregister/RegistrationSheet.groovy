package uk.ac.shu.webarch.eregister

class RegistrationSheet {

	String studentName

Set attendedStudents

    static hasMany = [attendedStudents:RegClass]

    static mappedBy = [attendedStudents:classes]
    
    static constraints = {
	studentName(nullable:false, blank:false, maxsize:256)
    }
}
