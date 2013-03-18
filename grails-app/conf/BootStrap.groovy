import uk.ac.shu.webarch.eregister.*;

class BootStrap {

    def init = { servletContext ->

	println("BootStrap::Init");

	def ian_instructor = Instructor.findByStaffid('12345') ?: new Instructor(staffid: '12345', name: 'Ian Ibbotson') .save()

	def web_arch_course = Course.findByCoursecode('12345') ?: new Course(courseName: 'Web Architectures', courseCode: 'abc123') .save()

    }
    def destroy = {
    }
}
