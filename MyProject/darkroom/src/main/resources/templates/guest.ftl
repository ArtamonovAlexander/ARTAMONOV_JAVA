<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/style.css" >
    <link rel="stylesheet" href="/css/normalize.css">
    <script
            src="https://code.jquery.com/jquery-3.4.0.js"
            integrity="sha256-DYZMCC8HTC+QDr5QNaIcfR7VSPtcISykd+6eSmBW5qo="
            crossorigin="anonymous"></script>
    <title>Guest</title>
</head>
<body>
<form method="post" action="" class="login">
    <p>
        <label for="name">Имя:</label>
        <input type="text" name="name" id="name" placeholder="имя">
    </p>

    <p>
        <label for="age">Возраст:</label>
        <input type="number" name="age" id="age" placeholder="возраст">
    </p>

    <p>
        <label for="number">Номер телефона:</label>
        <input type="tel" name="number" id="number" placeholder="89179170000">
    </p>

    <p>
        <label>Пол</label>
        <input type="radio" name="gender" value="M">Мужской
        <input type="radio" name="gender" value="Ж">Женский<br>
<#--        <select type="text" name="gender">-->
<#--            <option title="Hi">M</option>-->
<#--            <option title="Hi">Ж</option>-->
<#--        </select>-->
        <br>
        <label>Дата и время сеанса </label>
        <input type="date" id="dateSeance" name="dateSeance"/>
        <input type="checkbox" name="dateSeance" value="17:00">17:00
        <input type="checkbox" name="dateSeance" value="19:30">19:30
        <input type="checkbox" name="dateSeance" value="21:00">21:00<br>
<#--        <select name="dateSeance">-->
<#--            <option>17:00</option>-->
<#--            <option>19:30</option>-->
<#--            <option>21:00</option>-->
<#--        </select>-->
    </p>

    <p>
        <input type="submit" value="Зарегистрироваться">
    </p>
</form>
<#--<div>-->
<#--    <form method="post">-->
<#--        <input type="text" name="name" placeholder="Имя">-->
<#--        <br>-->
<#--        <input type="number" name="age" placeholder="Кол-во лет">-->
<#--        <br>-->
<#--        <input type="number" name="number" placeholder="Номер телефона">-->
<#--        <p>-->
<#--            <label>Пол</label>-->
<#--            <select name="gender">-->
<#--                <option>M</option>-->
<#--                <option>Ж</option>-->
<#--            </select>-->
<#--            <br>-->
<#--            <label>Дата и время сеанса </label>-->
<#--            <input type="date" id="dateSeance" name="dateSeance"/>-->
<#--            <select name="dateSeance">-->
<#--                <option>17:00</option>-->
<#--                <option>19:30</option>-->
<#--                <option>21:00</option>-->
<#--            </select>-->
<#--        </p>-->
<#--        <br>-->
<#--        <input type="submit" value="Зарегистрироваться">-->
<#--        <br>-->
<#--    </form>-->
<#--</div>-->

<#--<div>-->
<#--    <table BORDER="1">-->

<#--    <#list guests as guest>-->
<#--        <tr>-->
<#--            <td>-->
<#--                <a href="/guest/${guest.id}">${guest.name}</a>-->
<#--                <br>-->
<#--                ${guest.gender}-->
<#--                <br>-->
<#--                ${guest.number}-->
<#--                <br>-->
<#--                ${guest.dateSeance}-->
<#--                <br>-->
<#--            </td>-->
<#--            <td><a href="/guest/delete/${guest.id}">Delete</a></td>-->
<#--        </tr>-->
<#--    </#list>-->
<#--    </table>-->
<#--</div>-->
</body>
</html>