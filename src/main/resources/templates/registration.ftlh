<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Регистрация - JavaFlow</title>
    <link rel="stylesheet" href="/css/registration.css" type="text/css"/>
</head>
<body>
<div class="container">
    <header>
        <h1>JavaFlow</h1>
        <p>Регистрация</p>
    </header>
    <main>
        <form action="/auth/registration" method="post" onsubmit="return validatePasswords()">
            <!-- Поле для имени пользователя -->
            <label for="username">Имя пользователя:</label>
            <input type="text" id="username" name="username" required>
            <#if usernameError??>
                <p class="error" style="color: red;">${usernameError}</p>
            </#if>

            <!-- Поле для email -->
            <label for="email">Электронная почта:</label>
            <input type="email" id="email" name="email" required>
            <#if emailError??>
                <p class="error" style="color: red;">${emailError}</p>
            </#if>

            <!-- Поле для пароля -->
            <label for="password">Пароль:</label>
            <div class="password-container">
                <input type="password" id="password" name="password" required>
                <button type="button" class="toggle-password" onclick="togglePasswordVisibility('password')">👁️</button>
            </div>

            <!-- Поле для подтверждения пароля -->
            <label for="confirm-password">Подтвердите пароль:</label>
            <div class="password-container">
                <input type="password" id="confirm-password" name="confirm-password" required>
                <button type="button" class="toggle-password" onclick="togglePasswordVisibility('confirm-password')">👁️</button>
            </div>

            <!-- Ошибка для подтверждения пароля -->
            <p id="password-error" style="color: red; display: none;">Пароли не совпадают</p>

            <!-- CSRF токен -->
            <input type="hidden" name="_csrf" value="${_csrf.token}">

            <!-- Кнопка регистрации -->
            <button type="submit">Регистрация</button>
        </form>

        <!-- Общая ошибка для username и email -->
        <#if bothError??>
            <p class="error" style="color: red;">${bothError}</p>
        </#if>

    </main>
    <footer>
        <p>Уже есть аккаунт? <a href="/login">Войти</a></p>
    </footer>
</div>

<script>
    // Проверка совпадения паролей
    function validatePasswords() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirm-password").value;

        if (password !== confirmPassword) {
            document.getElementById("password-error").style.display = "block";
            return false;
        }
        document.getElementById("password-error").style.display = "none";
        return true;
    }

    // Переключение видимости пароля
    function togglePasswordVisibility(fieldId) {
        var field = document.getElementById(fieldId);
        field.type = field.type === "password" ? "text" : "password";
    }
</script>

</body>
</html>