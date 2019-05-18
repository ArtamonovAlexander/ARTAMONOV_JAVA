<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body><h1>User info</h1>
<br>
<a href="/guest">Back</a>
<form name="guest" action="/guest/showGuest" method="post">
    <p>ID</p>
    <input type="text" name="id" value="${guestData.id}">
    <p>Name</p>
    <input type="text" name="name" value="${guestData.name}">
    <p>Age</p>
    <input type="number" name="age" value="${guestData.age}">
    <p>Number</p>
    <input type="number" name="number" value="${guestData.number}">
    <p>Gender</p>
    <input type="text" name="gender" value="${guestData.gender}">
    <p>Date and Time</p>
    <p>Зарегистрирован на ${guestData.dateSeance}</p>
    <input type="date" id="dateSeance" name="dateSeance"/>
    <select name="dateSeance">
        <option>17:00</option>
        <option>19:30</option>
        <option>21:00</option>
    </select>
    <br>
    <input type="submit" value="Edit">
    <br>
</form>
</body>
</html>