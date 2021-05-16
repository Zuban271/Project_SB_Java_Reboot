<!--Форма для вывода информации по списку планов проверки  -->
<!DOCTYPE html>
<html>
<head>
    <title>Plan</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<ul id="navbar">
    <li><a href="javascript:history.back()">Назад</a>
</ul>
<h2>План проверок</h2>

<table bgcolor="#ffcc00" border="1" cols="7">
    <tr>
        <th>Id</th>
        <th>Наименование объекта</th>
        <th>Адрес объекта</th>
        <th>Период</th>
        <th>Отвественный</th>
        <th>Выполнен:Да/Нет</th>
    </tr>

  <#list plans as plan>
    <tr>
        <td>${plan.id}</td>
        <td>${plan.nameObject}</td>
        <td>${plan.addressObject}</td>
        <td>${plan.period}</td>
        <td>${plan.responsible}</td>
        <td>${plan.done?c}</td>
    </tr>
</#list>

</table>
</body>
</html>