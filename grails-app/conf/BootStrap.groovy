import uk.ac.shu.webarch.eregister.*;

class BootStrap {

    def init = { servletContext ->

	println("BootStrap::Init");

	def ian_instructor = Instructor.findByStaffid('12345') ?: new Instructor(staffid: '12345', name: 'Ian Ibbotson') .save()

	def matthew_instructor = Instructor.findByStaffid('253425') ?: new Instructor(staffid:'253425', name:'Matthew Love').save();

def web_arch_course = Course.findByCourseCode('443343dd') ?: new Course(courseCode:'443343dd', 
                                                                            courseName:'Web Architectures', 
                                                                            description:'A course teaching stuff ..').save();

def db_course = Course.findByCourseCode('7654523') ?: new Course(courseCode:'7654523', 
                                                                            courseName:'Database Systems', 
                                                                            description:'A course teaching databases ..').save();

 
    def monday_pm_class = RegClass.findByCourseAndName(web_arch_course, 'WebArch-Mondays') ?: 
                  					new RegClass(name:'WebArch-Mondays', code:'123',
                               				classInstructor:ian_instructor, 
                               				course:web_arch_course).save(failOnError:true);

    def tuesday_pm_class = RegClass.findByCourseAndName(web_arch_course, 'WebArch-Tuesday') ?: 
                  					new RegClass(name:'WebArch-Tuesday', code:'456',
                               				classInstructor:ian_instructor, 
                               				course:web_arch_course).save(failOnError:true);

def student_1 = Student.findByStudentNumber('a8024571') ?: 
			new Student(studentNumber:'a8024571', fullStudentName:'Elliot Naylor', dateOfBirth:'11/08/1989', 				gender:'Male').save();

def student_2 = Student.findByStudentNumber('b8634571') ?: 
			new Student(studentNumber:'b8634571', fullStudentName:'Nicole Cooper', dateOfBirth:'29/07/1993', 				gender:'Female').save();

def student_3 = Student.findByStudentNumber('c6074580') ?: 
			new Student(studentNumber:'c6074580', fullStudentName:'Stan Smith', dateOfBirth:'05/11/1989', 				gender:'Male').save();

def student_4 = Student.findByStudentNumber('a5624671') ?: 
			new Student(studentNumber:'a5624671', fullStudentName:'Peter Griffin', dateOfBirth:'01/02/1983', 				gender:'Male').save();

def student_5 = Student.findByStudentNumber('b8025689') ?: 
			new Student(studentNumber:'b8025689', fullStudentName:'Steve Goodinson', dateOfBirth:'09/12/1989', 				gender:'Male').save();

def student_6 = Student.findByStudentNumber('c5678571') ?: 
			new Student(studentNumber:'c5678571', fullStudentName:'Diana Prince', dateOfBirth:'22/12/1989', 				gender:'Female').save();

def student_7 = Student.findByStudentNumber('b4567571') ?: 
			new Student(studentNumber:'b4567571', fullStudentName:'Louis Lane', dateOfBirth:'11/08/1990', 				gender:'Female').save();

def student_8 = Student.findByStudentNumber('a8067834') ?: 
			new Student(studentNumber:'a8067834', fullStudentName:'Bruce Wayne', dateOfBirth:'11/08/1988', 				gender:'Male').save();

def student_9 = Student.findByStudentNumber('c8056789') ?: 
			new Student(studentNumber:'c8056789', fullStudentName:'Clark Kent', dateOfBirth:'11/08/1980', 				gender:'Male').save();

def student_10 = Student.findByStudentNumber('d8023476') ?: 
			new Student(studentNumber:'d8023476', fullStudentName:'Barry Allen', dateOfBirth:'16/03/1985', 				gender:'Male').save();



    
}
    def destroy = {
    }
}




