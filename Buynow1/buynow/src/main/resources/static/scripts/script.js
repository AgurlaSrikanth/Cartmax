/*const container = document.querySelector(".container"),
      pwShowHide = document.querySelectorAll(".showHidePw"),
      pwFields = document.querySelectorAll(".password"),
      signUp = document.querySelector(".signup-link"),
      login = document.querySelector(".login-link");

   
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
    const container = document.querySelector(".container"),
      pwShowHide = document.querySelectorAll(".showHidePw"),
      pwFields = document.querySelectorAll(".password"),
      signUp = document.querySelector(".signup-link"),
      login = document.querySelector(".login-link");
    //   btn= document.querySelector("#nishant")

   
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

    
    signUp.addEventListener("click", ( )=>{
        container.classList.add("active");
    });
    login.addEventListener("click", ( )=>{
        container.classList.remove("active");
    });
    const myForm=document.getElementById('myForm');
myForm.addEventListener('submit',function(e){
    e.preventDefault();
    const formData=new FormData(this);
    const searchParams=new URLSearchParams();
    for(const pair of formData){
        searchParams.append(pair[0],pair[1],pair[2])
    }
    console.log(formData);
    fetch('/register',{
        method:'post',
        body:searchParams
    }).then(function (response){
        return response.text();
    }).then(function (text){
        console.log(text);
    }).catch(function (error){
        console.error(error);
    })

    
})
    
    
    login.addEventListener("click", ( )=>{
        container.classList.remove("active");
    });
    signUp.addEventListener("click", ( )=>{
        container.classList.add("active");
    });
    
*/
const container = document.querySelector(".container"),
      pwShowHide = document.querySelectorAll(".showHidePw"),
      pwFields = document.querySelectorAll(".password"),
      signUp = document.querySelector(".signup-link"),
      login = document.querySelector(".login-link");
    //   btn= document.querySelector("#nishant")

   
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
    const myForm=document.getElementById('myForm');
function submitForm(e){
    console.log("hello");
    console.log(myForm);
     const name = 
     myForm.elements['name'];
    const email =
     myForm.elements['email'];
      const password =
      myForm.elements['password'];
      let fullName = name.value;
      let emailAddress = email.value;
      let Password = password.value;
      fetch('http://localhost:9051/register',{
         method:'post',
          body:JSON.stringify({
          name :fullName,
         email:emailAddress,
         password:Password
           }),
           headers: {
                'Content-Type': 'application/json;charset=utf-8'}
   }).then(function (response){
        return response.text();
     }).then(function (text){
         console.log(text);
     }).catch(function (error){
         console.error(error);
     })

    
 }
    
   console.log(myForm); 
    login.addEventListener("click", ( )=>{
        container.classList.remove("active");
        console.log("hi");
        submitForm();
    });
    signUp.addEventListener("click", ( )=>{
        container.classList.add("active");
    });