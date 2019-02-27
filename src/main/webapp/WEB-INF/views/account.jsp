<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>가 계 부</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(function() {

	init();
	$("#input").on("click",buttonEvent);
	
});
	function init(){
		callList();
	}
	
	function callList(){
		$.ajax({
			url:"selectAllaccountbook",
			type:"get",
			success:addList
		});
	}
	
	function addList(serverData){
		var content="";
		$.each(serverData,function(index,item){
			content += "<tr>";
			content += "<td>"+item.title+"</td>";
			content += "<td>"+item.content+"</td>";
			content += "<td>"+item.amount+"원</td>";
			content += "<td>"+item.eventdate+"</td>";
			content += "</tr>";
		});
		
		$("#resultList").html(content);
	}
	
	function buttonEvent(){
		var title=$("#title").val();
		var content=$("#content").val();
		var flag=$("input[name='flag']:checked").val();
		var amount=$("#amount").val();
		var eventdate=$("#eventdate").val();
		
		if (title.length==0) {
			alert("제목을 입력해주세요.");
			return;
		}
		
		var account={
			'title':title,
			'content':content,
			'flag':flag,
			'amount':amount,
			'eventdate':eventdate				
		};
		
		$.ajax({
			url:"inputaccountbook",
			data:account,
			type:"post",
			success: function(serverData){
				if (serverData==1) {
					alert("등록성공!");
					callList();
				}else{
					alert("등록실패!");	
				}
			}
		});
	}
	
</script>
</head>
<body>
	<h1>가계부</h1>
	<p>--------------------새로운가계부----------------------------</p><br>
	제목 : <input type="text" id="title"><br>
	내용 : <input type="text" id="content"><br>
	지출 : <input type="radio" id="expense" name="flag" value="지출" checked> &nbsp;
	소득 : <input type="radio" id="income" name="flag" value="수입"><br>
	가격(단위:원) : <input type="text" id="amount"><br>
	날짜 : <input type="date" id="eventdate"><br>
	<button id="input">등록하기</button>
	<p>---------------------목       록-----------------------------</p><br>
	<table id="resultList">
	</table>
<!-- 	<!--수입 -->
<!-- 	* 이 달의 총 소득 : <span id="income"></span> 원<br> -->
<!-- 	<!--지출 -->
<!-- 	* 이 달의 총 지출 : <span id="expense"></span> 원<br> -->
</body>
</html>