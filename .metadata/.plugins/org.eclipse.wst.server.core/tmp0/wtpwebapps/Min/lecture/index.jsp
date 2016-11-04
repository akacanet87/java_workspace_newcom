<%@page import="com.min.domain.LectureCategory"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<LectureCategory> list = (List) request.getAttribute("lecturecategorylist");
	
	out.print(list.size());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
.lectureImg {
	width: 200px;
}
</style>

<script>

function goList(){
	
	form1.action="/lecture/list.do";
	form1.submit();
	
}

</script>

</head>
<body>
	<form name="form1" method="post">

		<%-- <section>
		<h1>수강중인 강의</h1>

		<%
			for (int a = 0; a < 2; a++) {
		%>
		<div class="classPack">
			<div>
				<a href="/min/lecture/list.jsp"><img class="lectureImg"
					src="http://cfile209.uf.daum.net/image/26738E4455545EB41B36EA"></a>
			</div>
			<div>
				<ul>
					<li class="classDetail">강의구성 : 총 40강</li>
					<li class="classDetail">강사 : 민진호</li>
					<li class="classDetail">강좌 설명 : 객체지향 언어의 대표적인~~~</li>
				</ul>
			</div>
		</div>
		<%
			}
		%>

	</section> --%>


		<section>
			<h1>강의 리스트</h1>

			<%
				for (int a = 0; a < list.size(); a++) {

					LectureCategory lectureCategory = list.get(a);
					String lectureCategoryTitle = lectureCategory.getTitle();
					int lectureCategory_id = lectureCategory.getLecturecategory_id();
			
			%>
			<%=lectureCategoryTitle%>
			<%=lectureCategory_id%>
			<div>
				<div onClick="goList()">
					<%-- <input type="hidden" name="lecturecategory_id" value="<%=lectureCategory_id%>">
					<input type="hidden" name="title" value="<%=lectureCategoryTitle%>"> --%>
					<a href="/lecture/list.do?lecturecategory_id=<%=lectureCategory_id%>&<%=lectureCategoryTitle %>" >
					<img class="lectureImg"
						src="http://cfile209.uf.daum.net/image/26738E4455545EB41B36EA" ></a>			
				</div>
				<div>
					<ul>
						<li class="classDetail">강의구성 : 총 <%=lectureCategory.getNumoflecture()%>강
						</li>
						<li class="classDetail">강사 : <%=lectureCategory.getInstructor()%></li>
						<li class="classDetail">강좌 설명 : <%=lectureCategory.getContent()%></li>
					</ul>
				</div>
			</div>
			<%
				}
			%>

		</section>

	</form>
</body>
</html>