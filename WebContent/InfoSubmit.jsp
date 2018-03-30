<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="userInfo" /></title>
</head>
<body>


	<!-- REMEMBER edit the i18n resource and use them to show text in the page. -->
	<!-- just the "onsubmit" property there, we will discuss more when 
	we see it again in Spring -->
	<!-- Add more s:tags in s:form to provide the place to enter user information  -->
	<!-- Give each one a id for js usage. -->

	<s:form onsubmit="return false;">
		<!-- Eg. -->
		<s:textfield key="fName" id="firstName" />
		<!-- Your data -->
		<s:textfield key = "lName" id = "lastName"/>
		<s:textfield key ="email" id = "email"/>
		<s:textfield key = "pNumber" id = "phoneNumber"/>
		<s:submit key="submit" onclick="submitInfo()" />
	</s:form>

	<div id="result"></div>
</body>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
	// In js code, both "" and '' indicate a string but i suggest us '', 
	// we will discuss future.

	// You can use js selector to find the HTML Element and get the value
	// $('#(id)') can select the element whose id is what you typed in (id)
	// Eg.: $('#firstName') will give you the element with id="firstName"
	// So remember to give a id to each s:tag you need to get the value.

	// The val() function of selector will give you the value of the input box.

	// Add the userInfo into data using the way mentioned above.
	// Notice: use , to split each key-value pair. No , after the last please,
	// although it may still work.

	// REMEMBER: I said the requests themselves are same for both form request and 
	// ajax request. That means the format of data, the parse strategy of struts are
	// same. So, you should understand what is 'userInfo.firstName'

	function submitInfo() {
		$.ajax({
			'url' : 'infoSubmit',
			'type' : 'post',
			'data' : {
				//Eg.:
				'userInfo.firstName' : $('#firstName').val(),
				'userInfo.lastName' : $('#lastName').val(),
				'userInfo.phoneNumber' : $('#phoneNumber').val(),
				'userInfo.email' : $('#email').val()
			// Your data
			},
			'dataType' : 'json',
			'success' : function(data) {
				var result = $('#result');
				result.html('');
				for ( var key in data) {
					result.append(key + ' : ' + data[key] + '<br />');
				}
			}
		});
	}
</script>
</html>