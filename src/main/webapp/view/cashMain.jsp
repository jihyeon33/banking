<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>index</title>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script>
        $('#saveBtn').on("click",function(){
            var form1 = $("#form").serialize();
            var form1 =new formData($("#form"));
            console.log(form1);
            alert(form1);
        })
    </script>
</head>

<body>
    ${resultCode} <br/>
    ${msg} <br/>
    현금 페이지
    <form name="form">
    지갑속에 갖고계신 잔액을 입력해 주세요: <input type="text" name="cashInput" id="cashInput" value="0"/>
    <button type="button" id="saveBtn" >저장</button>
    </form>

</body>

</html>