const username = document.getElementById('username');
const password = document.getElementById('password');
const newusername = document.getElementById('new-username');
const newpassword = document.getElementById('new-password');
const email = document.getElementById('email');
const confirmPassword = document.getElementById('confirm-password');
const loginForm = document.getElementById('login-form');
const signupForm = document.getElementById('signup-form');

const loginLink = document.getElementById('login-link');
const signupLink = document.getElementById('signup-link');

loginLink.addEventListener('click', () => {
    document.getElementById('signup-page').style.display = 'none';
    document.getElementById('login-page').style.display = 'block';
})

signupLink.addEventListener('click', () => {
    document.getElementById('signup-page').style.display = 'block';
    document.getElementById('login-page').style.display = 'none';
})

loginForm.addEventListener('submit', async(e) => {
    let errorMsgs = [];
    console.log('called')
    let passwordPattern = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
    
    if(!passwordPattern.test(password.value)) {
        console.log('validation')
        errorMsgs.push('Password must be greater than 8 characters long and must contain one capital letter, number and special character.')
    }
    if(errorMsgs.length > 0) {
        e.preventDefault()
        document.getElementsByClassName('login-error').innerText = errorMsgs.join(', ')
        console.log(document.getElementsByClassName('login-error').innerText)
    }
    let user = {
        email: username.value,
        password: password.value
    };
    console.log(user)
    console.log(errorMsgs)
    let response = await fetch('/login', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(user)
    });
    let result = await response.json();
    console.log(result.message);
})

signupForm.addEventListener('submit', async(e) => {
    let errorMsgs = [];
    console.log('called')
    let passwordPattern = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
    let emailPattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;

    if(!passwordPattern.test(password.value)) {
        errorMsgs.push('Password must be greater than 8 characters long and must contain one capital letter, number and special character.')
    }
    if(!emailPattern.test(email.value)) {
        errorMsgs.push('Please enter valid email.')
    }
    if(password.value !== confirmPassword.value) {
        errorMsgs.push('Passwords did not match')
    }
    if(errorMsgs.length > 0) {
        e.preventDefault()
        document.getElementsByClassName('signup-error').innerText = errorMsgs.join(', ')
    }
    let user = {
        username: newusername.value,
        password: newpassword.value,
        email: email.value
    };
    console.log(user)
    let response = await fetch('/login', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(user)
    });
    let result = await response.json();
    console.log(result.message);
})
