package uk.ac.shu.webarch.eregister

class RegClass {
	String name
	String code

	Instructor classInstructor
	Course course

    Set enrolledStudent

    static hasMany = [enrolledStudent: Enrollment]

    static mappedBy = [enrolledStudent: 'classes']

    static constraints = {
	name(nullable:false, blank:false, maxsize:256)
    }

    static mapping = {
	classInstructor column: 'instructor_fk'
	course column: 'Course_fk'
}
}
