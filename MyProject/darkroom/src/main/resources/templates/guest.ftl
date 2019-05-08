<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Guest</title>
</head>
<body>
<div>
    <form method="post">
        <input type="text" name="name" placeholder="Имя">
        <br>
        <input type="text" name="age" placeholder="Кол-во лет">
        <br>
        <input type="text" name="gender" placeholder="Пол">
        <br>
        <input type="text" name="number" placeholder="Номер телефона">
        <p>
            <label for="dateSeance">Дата и время сеанса </label>
            <input type="date" id="dateSeance" name="dateSeance"/>
        <select class = "form-control" name="timeSeance">
            <option>17:00</option>
            <option>19:30</option>
            <option>21:00</option>
        </select>
        </p>
        <br>
        <input type="submit" value="Зарегистрироваться">
    </form>
</div>
<div>
    <table BORDER="1">
        <tr>
            <th>10.10.19  17:00</th>
        </tr>
    <#list guests as guest>
        <tr>
            <td>
                ${guest.name}
                <br>
                ${guest.gender}
                <br>
                ${guest.number}
                <br>
            </td>
        </tr>

<#--        <tr>-->
<#--            <th>ID</th>-->
<#--            <th>Имя</th>-->
<#--            <th>Кол-во лет</th>-->
<#--            <th>Пол</th>-->
<#--            <th>Номер телефона</th>-->
<#--            <th>Дата сеанса</th>-->
<#--            <th>Время</th>-->
<#--        </tr>-->
<#--        <tr>-->
<#--            <td>${guest.id}</td>-->
<#--            <td>${guest.name}</td>-->
<#--            <td>${guest.age}</td>-->
<#--            <td>${guest.gender}</td>-->
<#--            <td>${guest.number}</td>-->
<#--            <td>${guest.dateSeance}</td>-->
<#--            <td>${guest.timeSeance}</td>-->
<#--        </tr>-->
    </#list>
    </table>
</div>
</body>
</html>