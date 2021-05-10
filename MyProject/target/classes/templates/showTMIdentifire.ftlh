<!DOCTYPE html>
<html>
<head>
    <title>TM_identifires</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<ul id="navbar">
    <li><a href="javascript:history.back()">Назад</a>
</ul>
<h2>Журнал выдачи ТМ</h2>

<table bgcolor="#ffcc00" border="1" cols="7">
    <tr>
        <th>Id</th>
        <th>Дата</th>
        <th>Номер ТМ</th>
        <th>Отвественный</th>
        <th>Передан:Да/Нет</th>
        <th>Кому:</th>
        <th>ЗНО:</th>
    </tr>

  <#list tm_identifires as tm_identifire>
    <tr>
        <td>${tm_identifire.id}</td>
        <td>${tm_identifire.date?date}</td>
        <td>${tm_identifire.number_TM}</td>
        <td>${tm_identifire.responsible}</td>
        <td>${tm_identifire.given?c}</td>
        <td>${tm_identifire.toWhom}</td>
        <td>${tm_identifire.zno}</td>
    </tr>
</#list>

</table>
</body>
</html>