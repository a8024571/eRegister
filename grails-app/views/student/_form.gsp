<%@ page import="uk.ac.shu.webarch.eregister.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'fullStudentName', 'error')} required">
	<label for="fullStudentName">
		<g:message code="student.fullStudentName.label" default="Full Student Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="fullStudentName" required="" value="${studentInstance?.fullStudentName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentNumber', 'error')} required">
	<label for="studentNumber">
		<g:message code="student.studentNumber.label" default="Student Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="studentNumber" required="" value="${studentInstance?.studentNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'dateOfBirth', 'error')} required">
	<label for="dateOfBirth">
		<g:message code="student.dateOfBirth.label" default="Date Of Birth" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="dateOfBirth" required="" value="${studentInstance?.dateOfBirth}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'gender', 'error')} required">
	<label for="gender">
		<g:message code="student.gender.label" default="Gender" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="gender" required="" value="${studentInstance?.gender}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'enrolledClasses', 'error')} ">
	<label for="enrolledClasses">
		<g:message code="student.enrolledClasses.label" default="Enrolled Classes" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${studentInstance?.enrolledClasses?}" var="e">
    <li><g:link controller="registerEntry" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="registerEntry" action="create" params="['student.id': studentInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'registerEntry.label', default: 'RegisterEntry')])}</g:link>
</li>
</ul>

</div>

