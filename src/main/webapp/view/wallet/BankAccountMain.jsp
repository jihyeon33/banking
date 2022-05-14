<%@ page language="java" contentType="text/html ; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>bankAccountMain</title>
</head>

<body>
    ${resultCode} <br/>
    ${msg} <br/>
    계좌 등록하기:
    <select name='fruits'>
      <option value='' selected>-- 은행 선택 --</option>
      <option value='apple'>국민은행</option>
      <option value='banana'>신한은행</option>
      <option value='lemon'>하나은행</option>
      <option value='lemon'>우리은행</option>
      <option value='lemon'>우체국은행</option>
      <option value='lemon'>카카오뱅크</option>
      <option value='lemon'>토스은행</option>
    </select>
    <input type="text" id="accountNumber"/value="계좌번호를 입력하세요.">
    <button type="button">등록</button>

</body>

</html>