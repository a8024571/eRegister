
<%@ page import="uk.ac.shu.webarch.eregister.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-student" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list student">
			
				<g:if test="${studentInstance?.fullStudentName}">
				<li class="fieldcontain">
					<span id="fullStudentName-label" class="property-label"><g:message code="student.fullStudentName.label" default="Full Student Name" /></span>
					
						<span class="property-value" aria-labelledby="fullStudentName-label"><g:fieldValue bean="${studentInstance}" field="fullStudentName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.studentNumber}">
				<li class="fieldcontain">
					<span id="studentNumber-label" class="property-label"><g:message code="student.studentNumber.label" default="Student Number" /></span>
					
						<span class="property-value" aria-labelledby="studentNumber-label"><g:fieldValue bean="${studentInstance}" field="studentNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.dateOfBirth}">
				<li class="fieldcontain">
					<span id="dateOfBirth-label" class="property-label"><g:message code="student.dateOfBirth.label" default="Date Of Birth" /></span>
					
						<span class="property-value" aria-labelledby="dateOfBirth-label"><g:fieldValue bean="${studentInstance}" field="dateOfBirth"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="student.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${studentInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.enrolledClasses}">
				<li class="fieldcontain">
					<span id="enrolledClasses-label" class="property-label"><g:message code="student.enrolledClasses.label" default="Enrolled Classes" /></span>
					
						<g:each in="${studentInstance.enrolledClasses}" var="e">
						<span class="property-value" aria-labelledby="enrolledClasses-label"><g:link controller="registerEntry" action="show" id="${e.id}">${e?.fullStudentName()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${studentInstance?.id}" />
					<g:link class="edit" action="edit" id="${studentInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
