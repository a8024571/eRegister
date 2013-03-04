package uk.ac.shu.webarch.eregister

class RegistrationSheet {

	String studentName

RegisterEntry registerEntry
RegClass classes

Set attendedStudents

    static hasMany = [attendedStudents:RegisterEntry]

    static mappedBy = [attendedStudents: 'registrationSheet']
    
    static constraints = {
	studentName(nullable:false, blank:false, maxsize:256)
    }
}
