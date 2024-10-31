<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Flow - Вопросы</title>
    <link rel="stylesheet" href="/css/main.css" type="text/css"/>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600&family=Orienta&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
<header class="header">
    <div class="logo">
        <h1 class="logo-text">Java</h1>
        <div class="logo-subtext">FLOW</div>
    </div>
    <div class="auth-buttons">
        <a href="#" class="btn btn-outline">Регистрация</a>
        <a href="#" class="btn btn-primary">Войти</a>
    </div>
</header>
<main class="main-content">
    <nav class="sidebar">
        <a href="#" class="nav-item"><i class="fas fa-home"></i>Главная</a>
        <a href="#" class="nav-item nav-item-active"><i class="fas fa-question-circle"></i>Вопросы</a>
        <a href="#" class="nav-item"><i class="fas fa-pen"></i>Спросить</a>
    </nav>
    <section class="content-area">
        <form role="search">
            <input type="search" id="search-input" class="search-bar" placeholder="Поиск..." aria-label="Поиск">
        </form>
        <div class="divider"></div>
        <div class="question-list">
            <h2 class="section-title">Последние вопросы</h2>

            <#if questions?has_content>
                <#list questions as question>
                    <article class="question-item">
                        <div class="question-content">
                            <h3 class="question-title">${question.top}</h3>
                            <div class="tags">
                                <#list question.tags as tag>
                                    <span class="tag">${tag}</span>
                                </#list>
                            </div>
                        </div>
                        <div class="question-meta">
                            <p class="author">${question.author.username}</p>
                            <p>${question.dateOfCreated}</p>
                        </div>
                    </article>
                </#list>
            <#else>
                <p>Пока нет вопросов</p>
            </#if>
        </div>
    </section>
</main>
<footer class="footer">
    <div class="footer-section">
        <h3 class="footer-title">О нас</h3>
        <a href="#" class="footer-link">Наша миссия</a>
        <a href="#" class="footer-link">Команда</a>
        <a href="#" class="footer-link">Карьера</a>
    </div>
    <div class="footer-section">
        <h3 class="footer-title">FAQ</h3>
        <a href="#" class="footer-link">Часто задаваемые вопросы</a>
        <a href="#" class="footer-link">Правила сообщества</a>
        <a href="#" class="footer-link">Политика конфиденциальности</a>
    </div>
    <div class="footer-section">
        <h3 class="footer-title">Контакты</h3>
        <a href="#" class="footer-link"><i class="fas fa-envelope"></i>Связь с нами</a>
        <a href="#" class="footer-link"><i class="fab fa-telegram"></i>Telegram</a>
        <a href="#" class="footer-link"><i class="fab fa-vk"></i>VK</a>
        <a href="#" class="footer-link"><i class="fab fa-facebook"></i>Facebook</a>
    </div>
</footer>
</body>
</html>
