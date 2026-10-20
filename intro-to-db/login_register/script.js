
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