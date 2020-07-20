<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
<script type="text/javascript">
function fn_que4(){	
	if($("#storeMgtNm").val() == null || $("#storeMgtNm").val() == ''){
		alert("관리점을 입력하세요.");
		return false;
	}
}
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<table border=1>
<tr>
<td style="width:75px">SEQ
</td>
<td style="width:200px">Question</td>
<td style="width:75px"></td>
</tr>
<tr>
<td>1
</td>
<td>2018년, 2019년 각 연도별 합계 금액이 <br> 가장 많은 고객을 추출하는 API
</td>
<td>
<form name="form1" id="form1" action="/kakao/test01" method="get">
	<input type="submit" value="결과보기">
	
</form>
</td>
</tr>
<tr>
<td>2
</td>
<td>2018년 또는 2019년에  <br>거래가 없는 고객을 추출하는 API
</td>
<td>
<form name="form2" id="form2" action="/kakao/test02" method="get">
	<input type="submit" value="결과보기">
	
</form>
</td>
</tr>
<tr>
<td>3
</td>
<td>연도별 관리점별 거래금액 합계를 구하고 <br> 합계금액이 큰 순서로 출력하는 API
</td>
<td>
<form name="form3" id="form3" action="/kakao/test03" method="get">
	<input type="submit" value="결과보기">
	
</form>
</td>
</tr>
<tr>
<td>4
</td>
<td>분당점과 판교점을 통폐합하여 판교점으로 관리점 이관을 하였습니다. <br> 지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API
</td>
<td>
<form name="form4" id="form4" action="/kakao/test04" method="post" onSubmit="return fn_que4();">
	<input type="text" id="storeMgtNm" name="storeMgtNm" style="width:150px">
	<input type="submit" value="결과보기" id="" onclick="fn_que4()">
</form>
</td>
</tr>

</table>
</body>

</html>