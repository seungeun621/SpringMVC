<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>


<table>

		<tr>

			<td align="center">년도</td>
			<td align="center">학기</td>
			<td align="center">이수 학점</td>
			<td align="center">상세보기</td>

		</tr>

		<tr>

			<td align="center">2014</td>
			<td align="center">1</td>
			<td align="center">${a}</td>
			<td align="center"><a href="${pageContext.request.contextPath}/A"> 링크 </a></td>

		</tr>
		
		<tr>

			<td align="center">2014</td>
			<td align="center">2</td>
			<td align="center">${b}</td>
			<td align="center"><a href="${pageContext.request.contextPath}/B"> 링크 </a></td>

		</tr>
		
		<tr>

			<td align="center">2015</td>
			<td align="center">1</td>
			<td align="center">${c}</td>
			<td align="center"><a href="${pageContext.request.contextPath}/C"> 링크 </a></td>

		</tr>
		
		<tr>

			<td align="center">2015</td>
			<td align="center">2</td>
			<td align="center">${d}</td>
			<td align="center"><a href="${pageContext.request.contextPath}/D"> 링크 </a></td>

		</tr>
		
		<tr>

			<td align="center">2016</td>
			<td align="center">1</td>
			<td align="center">${e}</td>
			<td align="center"><a href="${pageContext.request.contextPath}/E"> 링크 </a></td>

		</tr>

	</table>

</body>
</html>