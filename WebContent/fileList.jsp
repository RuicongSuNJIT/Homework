<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:text name="fileList" />
	<br />
	<div id="list"></div>
</body>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
	var list = $('#list');
	$(function() {

		$.ajax({
			'url' : 'fileList',
			'type' : 'get',
			'dataType' : 'json',
			'success' : function(data) {
				var len = data.length;
				for (var i = 0; i < len; ++i) {
					var a = '<a href="download?path=' + data[i] + '">'
							+ data[i] + '</a><br/>';
					list.append(a);
				}
			}
		});
	});
</script>
</html>