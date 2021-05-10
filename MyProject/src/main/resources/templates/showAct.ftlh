<!DOCTYPE html>
<html>
<head>
    <title>Protocol</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<ul id="navbar">
    <li><a href="javascript:history.back()">Назад</a>
</ul>
<h2>АКТ проверки</h2>

<table bgcolor="#ffcc00" border="1" cols="15">
    <tr><th>Id</th><td>${theact.id}</td></tr>
    <tr><th>Подразделение:</th><td>${theact.department}</td></tr>
    <tr><th>Адрес:</th><td>${theact.address}</td></tr>
    <tr><th>Основание проверки:</th><td>${theact.authority}</td></tr>
    <tr><th>Сроки проведения:</th><td>${theact.period}</td></tr>
    <tr><th>Проверяемые вопросы:</th><td>${theact.questions}</td></tr>
    <tr><th>Результат:</th><td>${theact.result}</td></tr>
    <tr><th>План устранения нарушений:</th><td>${theact.plan}</td></tr>
    <tr><th>Список приложений:</th><td>${theact.appendix}</td></tr>
</table>
    <p>Работники прнимавшие участие в проверке:<Br></p>
<table bgcolor="#ffcc00" border="1" cols="15">
<tr>
    <th>Подразделение</th>
    <th>Должность</th>
    <th>ФИО</th>
</tr>
  <#list theact.employees as employee>
    <tr>
        <td>${employee.department}</td>
        <td>${employee.position}</td>
        <td>${employee.fio}</td>
    </tr>
</#list>

</table>
</body>
</html>