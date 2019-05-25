<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/style.css" >
    <link rel="stylesheet" href="/css/normalize.css">

    <title>SignUp</title>
</head>
<body>
<form method="post" action="" class="login">
    <p>
        <label for="login">Имя:</label>
        <input type="text" name="name" id="name" placeholder="Имя">
    </p>
    <p>
        <label for="login">Логин:</label>
        <input type="text" name="login" id="login" placeholder="Логин">
    </p>

    <p>
        <label for="password">Пароль:</label>
        <input type="password" name="password" id="password" placeholder="Пароль">
    </p>

    <p class="login-submit">
        <button type="submit" class="login-button">Регистрация</button>
    </p>
</form>
<#--<div>-->
<#--    <form method="post">-->
<#--        <input type="text" name="name" placeholder="Имя">-->
<#--        <br>-->
<#--        <input type="text" name="login" placeholder="Логин">-->
<#--        <br>-->
<#--        <input type="password" name="password" placeholder="Пароль">-->
<#--        <br>-->
<#--        <input type="submit" value="Регистрация">-->
<#--    </form>-->
<#--</div>-->
</body>
</html>