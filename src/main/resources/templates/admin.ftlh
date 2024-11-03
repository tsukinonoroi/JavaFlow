<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Panel</title>
</head>
<body>
<h1>Управление тегами</h1>
<form action="/admin/tags" method="post">
    <label for="tagName">Название тега:</label>
    <input type="text" id="tagName" name="tagName" required>
    <button type="submit">Добавить тег</button>
</form>

<h2>Существующие теги</h2>
<ul>
    <!-- Здесь будут выводиться теги -->
    <li>Tag 1 <a href="/admin/tags/delete/1">Удалить</a></li>
    <!-- Добавьте список тегов и возможность удаления каждого -->
</ul>
</body>
</html>