<%@page import="com.min.domain.MyQuestion"%>
<%@page import="java.util.List"%>
<%@page import="com.min.domain.Lecture"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Lecture lecture = (Lecture) request.getAttribute("lecture");
	HashMap<String, String> lectureValues = (HashMap) request.getAttribute("lecturevalues");

	List<MyQuestion> questionList = (List) request.getAttribute("questionList");

	String title = request.getParameter("title");
	int lecture_id = Integer.parseInt(request.getParameter("lecture_id"));
	int lectureNum = Integer.parseInt(request.getParameter("lectureNum"));
%>
<%@ include file="../inc/header.jsp"%>

<div class="container marketing" style="margin-top: 60px;">
	<form enctype="multipart/form-data" name="form1" method=post>
		<section>
			<h1>
				<span class="label label-default"><%=title%> <%=lectureNum%>강</span>
			</h1>
		</section>
		<section>

			<div>
				<iframe name="player" id="player"
					src="<%=lecture.getLink()%>?fullscreen=1&autoplay=1&loop=0'"
					width="100%" height="500px" frameborder="0" webkitallowfullscreen
					mozallowfullscreen allowfullscreen hidefocus="true"></iframe>
			</div>

		</section>
		<section>
			<div class="row">
				<div class="col-md-3" style="margin-bottom: 20px;">
					<a href="/data/file/lec/<%=lecture.getLecturefile()%>">자료 다운 받는
						곳</a>
				</div>
				<div class="col-md-3" style="margin-bottom: 20px;">
					<input type="file" name="lectureFile" placeholder="과제 첨부하는 곳">
				</div>
				<div class="col-md-3" style="margin-bottom: 20px;">
					<input type="button" value="등록" id="registHomework" name="myFile">
				</div>
			</div>
		</section>
		<section>
			<div>
				<input type="text" size="115" id="content" name="content"
					placeholder="강사님께 드릴 질문을 입력하세요"> <input type="button"
					value="등록" id="sendQuestion"> <input type="hidden"
					id="lecture_id" value="<%=lecture_id%>"> <input
					type="hidden" id="member_id" value="1">
			</div>
		</section>
		<section>
			<h3>
				<span class="label label-default">나의 질문들</span>
			</h3>
			<ul id="showQList">
				<%
					for (int a = 0; a < questionList.size(); a++) {
				%>
				<li>
					<%
						MyQuestion myQuestion = questionList.get(a);
							int myQuestion_id = myQuestion.getMyquestion_id();
							String content = myQuestion.getContent();
							String replyer = myQuestion.getReplyer();
							String reply = myQuestion.getReply();
					%>
					<div>
						<h3>나의 질문내용</h3>
						<p><%=content%></p>
					</div> <%
 	if (replyer == null) {
 %>
					<div style="display: none;">
						<%
							} else {
						%>
						<div style="display: block;">
							<h3>답변</h3>
							<p id="reply_<%=myQuestion_id%>"><%=reply%></p>
						</div>
					</div> <%
 	}
 %>
				</li>
				<%
					}
				%>
			</ul>
		</section>
	</form>
</div>
<%@ include file="../inc/footer.jsp"%>