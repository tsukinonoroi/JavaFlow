<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Авторизация - JavaFlow</title>
    <link rel="stylesheet" href="/css/login.css" type="text/css"/>
</head>
<body>
<div class="container">
    <header>
        <h1>JavaFlow</h1>
        <p>Авторизация</p>
    </header>
    <main>
        <form action="/auth/login" method="post">

            <label for="email">Электронная почта:</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Пароль:</label>
            <input type="password" id="password" name="password" required>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <button type="submit">Войти</button>
        </form>
    </main>

</div>
</body>
</html>
