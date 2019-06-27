<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/forList2.css" >

</head>
<body>
<div>
    <table BORDER="1">

        <#list guests as guest>
            <tr>
                <td>
                    <a href="/guest/${guest.id}">${guest.name}</a>
                    <br>
                    ${guest.gender}
                    <br>
                    ${guest.number}
                    <br>
                    ${guest.dateSeance}
                    <br>
                </td>
                <td><a href="/guest/delete/${guest.id}">Delete</a></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>