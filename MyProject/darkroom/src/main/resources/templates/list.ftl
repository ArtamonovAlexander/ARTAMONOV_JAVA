<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/forList.css" >

</head>
<body>

<br>
<div class="datagrid">
    <table>
        <thead>
        <tr>
            <th>header</th>
            <th>header</th>
            <th>header</th>
            <th>header</th>
        </tr>
        </thead>
        <tfoot>
        <tr>
            <td colspan="4">
                <div id="paging">
                    <ul>
                        <li><a href="#"><span>Previous</span></a></li>
                        <li><a href="#" class="active"><span>1</span></a></li>
                        <li><a href="#"><span>2</span></a></li>
                        <li><a href="#"><span>3</span></a></li>
                        <li><a href="#"><span>4</span></a></li>
                        <li><a href="#"><span>5</span></a></li>
                        <li><a href="#"><span>Next</span></a></li>
                    </ul>
                </div>
        </tr>
        </tfoot>
        <tbody>
        <#list guests as guest>
        <tr class="alt">>
            <td>${guest.name}</td>
            <td>${guest.gender}</td>
            <td>${guest.number}</td>
            <td>${guest.dateSeance}</td>
        </tr>
<#--        <tr class="alt">-->
<#--            <td>data</td>-->
<#--            <td>data</td>-->
<#--            <td>data</td>-->
<#--            <td>data</td>-->
<#--        </tr>-->
        </#list>
        </tbody>
    </table>
</div>
<#--<script src="/js/viewList.js"></script>-->
</body>
</html>

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
<#--</body>-->
<#--</html>-->