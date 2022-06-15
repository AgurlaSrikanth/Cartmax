const container = document.querySelector(".container"),
      pwShowHide = document.querySelectorAll(".showHidePw"),
      pwFields = document.querySelectorAll(".password"),
      signUp = document.querySelector(".signup-link");
     // login = document.querySelector(".login-link");
     const username = document.getElementById('username');
     const passsword = document.getElementById('password');
     //const login = document.getElementById('login');
     
      
     
      
     /* login.addEventListener("click", (e)=>{
        container.classList.remove("active");
         console.log(username, password);
    }); */
    
    function login() {
	console.log('login called')
	}
     
   
    pwShowHide.forEach(eyeIcon =>{
        eyeIcon.addEventListener("click", ()=>{
            pwFields.forEach(pwField =>{
                if(pwField.type ==="password"){
                    pwField.type = "text";

                    pwShowHide.forEach(icon =>{
                        icon.classList.replace("uil-eye-slash", "uil-eye");
                    })
                }else{
                    pwField.type = "password";

                    pwShowHide.forEach(icon =>{
                        icon.classList.replace("uil-eye", "uil-eye-slash");
                    })
                }
            }) 
        })
    })

    const login=async()=>{
	let user={
		username:username,
		password:password
	}
}
    signUp.addEventListener("click", ( )=>{
        container.classList.add("active");
    });
    