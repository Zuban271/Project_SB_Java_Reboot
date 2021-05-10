<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <title>Appendix</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<ul id="navbar">
    <li><a href="javascript:history.back()">Назад</a>
</ul>
<h2>Приложение к АКТу проверки</h2>

<table bgcolor="#ffcc00" border="1" cols="15">
    <tr>
    <th>Id</th>
    <th>Номер раб. места/помещения:</th>
    <th>ФИО, Должность, Подразделение:</th>
    <th>Время фиксации:</th>
    <th>фотографии</th>
    <th>Объяснение сотрудника:</th>
    </tr>

<#list 0 ..< theappendix?size as i>
    <tr>
    <td>${theappendix[i].id}</td>
    <td>${theappendix[i].workplace}</td>
    <td>${theappendix[i].fio_pos_dep}</td>
    <td>${theappendix[i].time_fix?datetime}</td>
    <td><img alt="IMG" src='${base64EncodedImage[i]}' width="300" height="250" /></td>
    <td>${theappendix[i].explanation}</td>
    </tr>
</#list>
</table>

</body>
</html>