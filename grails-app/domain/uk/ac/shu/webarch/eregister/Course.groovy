package uk.ac.shu.webarch.eregister

class Course {

String courseName
String courseCode
String description

Set classes

static hasMany = [classes: RegClass]

static mappedBy = [classes: 'course']

    static constraints = {
	courseName(nullable:false, blank:false, maxsize:256)
	courseCode(nullable:false, blank:false, maxsize:20)
	description(nullable:false, blank:false, maxsize:256)

    }
}
