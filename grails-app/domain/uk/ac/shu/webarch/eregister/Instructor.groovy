package uk.ac.shu.webarch.eregister

/**
* An instructor teaches a class
* A class has many instructors
*/

class Instructor {

// Declaring attributes for class here


String name
String staffid

// Here I am telling the framework that my instrutor class is just a set of RegClass instances.

Set classes

static hasMany = [classes: RegClass]

// The mappedby property is telling the framework how to create the join between both classes.
// Example:  in SQL this would be 'SELECT * from RegClass WHERE Class_instructor = 10'

static mappedBy = [classes: 'classinstructor']


// Some fields can be left null or empty.  My contraints are declared here

    static constraints = {
	name(nullable:false, blank:false, maxsize:256)
	staffid(nullable:false, blank:false, maxsize:20)
    }
}
