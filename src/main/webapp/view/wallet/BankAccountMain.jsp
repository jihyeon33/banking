<%@ page language="java" contentType="text/html ; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>bankAccountMain</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    $('#registerBtn').click(function(){
        alert("hello");
        var params =$('#accountInfoFrm').serialize();
        alert(params);

        $.ajax({
            type:"POST",
            url:"/wallet/AccountInfoRegister.json",
            dataType:"json",
            data : params,
            error:function(error){
                alert("Error!");
            },
            success:function(data){
                alert("success!");
                alert(data);
                alert(data.bankNm);
                alert(data.bankAccountNum);
            },
            complete:function(){
                alert("complete!");
            }
        });
    });
    $('#testBtn').on('click',function(){
        alert("hello2");
        var params=$('#accountInfoFrm').serialize();
        alert(params);
        $.ajax({
            type:"POST",
            url:"/wallet/AccountInfoRegister2.json",
            dataType:"json",
            data:params,
            error:function(){
                alert("fail");
            },
            success:function(data){
                alert("success");
                alert(data);
                alert(data.bankNm);
                alert(data.bankAccountNum);
            },
            complete:function(){
                alert("complete");
            }
        });
    });
});

</script>
</head>

<body>
    ${resultCode} <br/>
    ${msg} <br/>

    <form name="accountInfoFrm" id="accountInfoFrm">
    계좌 등록하기:
    <select name='bankName'>
      <option value='' selected>-- 은행 선택 --</option>
      <option value='kb'>국민은행</option>
      <option value='shinhan'>신한은행</option>
      <option value='hana'>하나은행</option>
      <option value='woori'>우리은행</option>
      <option value='kakao'>카카오뱅크</option>
      <option value='toss'>토스뱅크</option>
    </select>
    <input type="text" name="accountNumber" value="계좌번호를 입력하세요."/>
    </form>
    <button type="button" id="registerBtn">등록</button>
    <button type="button" id="testBtn">등록2</button>

    <div>----------------------------------------------------------------</div>
    <div>..은행()</div>


</body>

</html>