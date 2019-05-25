<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/style.css" >
    <link rel="stylesheet" href="/css/normalize.css">
    <title>Document</title>
</head>
<body>
<br>
<a href="/guest">Back</a>
<form method="post" action="/guest/showGuest" class="login">
    <p>
    <h1>Информация о госте</h1>
        <label for="id">ID:</label>
        <input type="text" name="id" id="id" value="${guestData.id}">
    </p>

    <p>
        <label for="name">Имя:</label>
        <input type="text" name="name" id="name" value="${guestData.name}">
    </p>
    <p>
        <label for="age">Возраст:</label>
        <input type="number" name="age" id="age" value="${guestData.age}">
    </p>
    <p>
        <label for="number">Номер телефона:</label>
        <input type="tel" name="number" id="number" value="${guestData.number}">
    </p>
    <p>
        <label>Пол</label>
        <input type="radio" name="gender" value="M">Мужской
        <input type="radio" name="gender" value="Ж">Женский
        <br>
    </p>
        <p>Дата и время сеанса </p>
        <p>Зарегистрирован на ${guestData.dateSeance}</p>
    <p>
        <input type="date" id="dateSeance" name="dateSeance"/>
        <input type="checkbox" name="dateSeance" value="17:00">17:00
        <input type="checkbox" name="dateSeance" value="19:30">19:30
        <input type="checkbox" name="dateSeance" value="21:00">21:00<br>
    </p>

    <p>
        <input type="submit" value="Редактировать">
    </p>
</form>
</body>
</html>