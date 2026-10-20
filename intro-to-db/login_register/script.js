
function togglePassword(inputId, icon) {
    const passwordInput = document.getElementById(inputId);

    if (passwordInput.type === "password") {
        passwordInput.type = "text";
        icon.classList.replace("bx-show", "bx-hide");
    } else {
        passwordInput.type = "password";
        icon.classList.replace("bx-hide", "bx-show");
    }
}
function checkPassword() {
    const passwordInput = document.getElementById("password");
    const confirmPasswordInput = document.getElementById("confirm_password");

    if (passwordInput.value !== confirmPasswordInput.value) {
        alert("Passwords don't match!");

        confirmPasswordInput.value = "";
        return false;
    }
    return true;
}



const registerForm = document.getElementById("registerForm");

if (registerForm) {
    registerForm.addEventListener("submit", async function(event) {
        event.preventDefault();

        const formData = new FormData(registerForm);
        const message = document.getElementById("message");

        try {
            const response = await fetch(registerForm.action, {
                method: "POST",
                body: formData
            });

            const result = await response.text();
            message.textContent = result;

        } catch (error) {
            message.textContent = "Try again";
        }
    });
}

const loginForm = document.getElementById("loginForm");

if (loginForm) {
    loginForm.addEventListener("submit", async function(event) {
        event.preventDefault();

        const formData = new FormData(loginForm);
        const message = document.getElementById("message");

        try {
            const response = await fetch(loginForm.action, {
                method: "POST",
                body: formData
            });

            const result = await response.text();
            message.textContent = result;

        } catch (error) {
            message.textContent =
                "Try Again";
        }
    });
}
