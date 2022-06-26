//const container = document.querySelector(".container"),
//       pwShowHide = document.querySelectorAll(".showHidePw"),
//       pwFields = document.querySelectorAll(".password"),
//       signUp = document.querySelector(".signup-link"),
//       login = document.querySelector(".login-link");

   
//     pwShowHide.forEach(eyeIcon =>{
//         eyeIcon.addEventListener("click", ()=>{
//             pwFields.forEach(pwField =>{
//                 if(pwField.type ==="password"){
//                     pwField.type = "text";

//                     pwShowHide.forEach(icon =>{
//                         icon.classList.replace("uil-eye-slash", "uil-eye");
//                     })
//                 }else{
//                     pwField.type = "password";

//                     pwShowHide.forEach(icon =>{
//                         icon.classList.replace("uil-eye", "uil-eye-slash");
//                     })
//                 }
//             }) 
//         })
//     })

    
   
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

//     window.addEventListener( "load", function () {
//   function sendData() {
//     const XHR = new XMLHttpRequest();
//      // Access the form element...
//   const form = document.getElementById( "myForm" );

//     // Bind the FormData object and the form element
//     const FD = new FormData( form );

//     // Define what happens on successful data submission
//     XHR.addEventListener( "load", function(event) {
//       alert( event.target.responseText );
//     } );

//     // Define what happens in case of error
//     XHR.addEventListener( "error", function( event ) {
//       alert( 'Oops! Something went wrong.' );
//     } );

//     // Set up our request
//     XHR.open( "POST", "https://localhost:9051/register" );

//     // The data sent is what the user provided in the form
//     XHR.send( FD );
//   }

 

//   // ...and take over its submit event.
//   form.addEventListener( "submit", function ( event ) {
//     event.preventDefault();
//     sendData()
//     }
//     )

  

// } );

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
     
    // const formData={
    //     "name":fullName,
    //     "email":emailAddress,
    //      "password":Password
    // }
    // formData.append('name',fullName)
    // formData.append('email',emailAddress)
    // formData.append('password',Password)

    
    //console.log((formData));
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
    
    // new code