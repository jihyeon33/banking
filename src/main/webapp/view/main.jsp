<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>main</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script>

        function doBankAccountMain(){
            $ajax({
                url:"/bankAccountMain.do",
                type:"POST",
                data:{msg: "현금페이지로 이동했습니다.",resultCode:"success"},
                contentType:"application/x-www-form-urlencoded; charset=UTF-8;",
                success: function(result){
                    alert("clicked!");
                }
            })
        }
    </script>
</head>

<body>
    <a href='/cashMain.do' id='btnCash' onclick="doCashMain()">${cash}</a><br/>
    <a href='#' id='btnBankAccount' onclick="doBankAccountMain()">${bankAccount}</a><br/>
    ${stockAccount}
</body>

</html>