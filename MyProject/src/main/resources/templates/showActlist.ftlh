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
    <tr>
    <th>Id</th>
    <th>Подразделение:</th>
    <th>Адрес:</th>
    <th>Основание проверки:</th>
    <th>Сроки проведения:</th>
    <th>Проверяемые вопросы:</th>
    <th>Результат:</th>
    <th>План устранения нарушений:</th>
    <th>Список приложений:</th>
    </tr>
    <#list theact as theact>
    <tr>
        <td>${theact.id}</td>
        <td>${theact.department}</td>
        <td>${theact.address}</td>
        <td>${theact.authority}</td>
        <td>${theact.period}</td>
        <td>${theact.questions}</td>
        <td>${theact.result}</td>
        <td>${theact.plan}</td>
        <td>${theact.appendix}</td>
    </tr>
</#list>
</table>
    <p>Работники прнимавшие участие в проверке:<Br></p>
<table bgcolor="#ffcc00" border="1" cols="15">
<#list theact as theact>
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
</#list>
</table>
</body>
</html>