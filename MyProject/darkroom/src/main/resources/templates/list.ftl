<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<#--    <link rel="stylesheet" href="/css/style.css" >-->
<#--    <link rel="stylesheet" href="/css/normalize.css">-->
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <script src="/js/viewButton.js"></script>
    <title>Guest</title>
</head>
<body>
<button onclick="listView()"><i class="fa fa-bars"></i> List</button>
<button onclick="gridView()"><i class="fa fa-th-large"></i> Grid</button>

<div class="row">
    <div class="column" style="background-color:#aaa;">
        <h2>Column 1</h2>
        <p>Some text..</p>
    </div>
    <div class="column" style="background-color:#bbb;">
        <h2>Column 2</h2>
        <p>Some text..</p>
    </div>
</div>

<div class="row">
    <div class="column" style="background-color:#ccc;">
        <h2>Column 3</h2>
        <p>Some text..</p>
    </div>
    <div class="column" style="background-color:#ddd;">
        <h2>Column 4</h2>
        <p>Some text..</p>
    </div>
</div>

<#--<div>-->
<#--    <table BORDER="1">-->

<#--        <#list guests as guest>-->
<#--            <tr>-->
<#--                <td>-->
<#--                    <a href="/guest/${guest.id}">${guest.name}</a>-->
<#--                    <br>-->
<#--                    ${guest.gender}-->
<#--                    <br>-->
<#--                    ${guest.number}-->
<#--                    <br>-->
<#--                    ${guest.dateSeance}-->
<#--                    <br>-->
<#--                </td>-->
<#--                <td><a href="/guest/delete/${guest.id}">Delete</a></td>-->
<#--            </tr>-->
<#--        </#list>-->
<#--    </table>-->
<#--</div>-->
</body>
</html>