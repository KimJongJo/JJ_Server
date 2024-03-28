const checkObj = {
    "inputId" : false, // 아이디
    "inputPw" : false, // 비밀번호
    "inputPw2" : false, // 비밀번호 확인
    "inputName" : false, // 닉네임
}

// 아이디 유효성 검사
const inputId = document.getElementById("inputId");

inputId.addEventListener("keyup", function () {
    
    const regExp = /^[A-Za-z][/w!@^]{5,13}$/;

    if(regExp.test(this.value)){
        this.style.color = "green";
        checkObj.inputId = true;
    }else{
        this.style.color = "red";
        checkObj.inputId = false;
    }

});


// 비밀번호 유효성 검사
