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
<h2>Протокол проверки</h2>

<table bgcolor="#ffcc00" border="1" cols="15">
    <tr>
        <th>Id</th>
        <th>Дата</th>
        <th>Рабочее место:</th>
        <th>Помещение:</th>
        <th>Основание проверки:</th>
        <th>ФИО работника:</th>
        <th>Должность работника:</th>
        <th>Наличие конфиденциальных документов:Да/Нет</th>
        <th>АРМ не заблокирован:Да/Нет</th>
        <th>Нарушение целостности:Да/Нет</th>
        <th>Наличие неучтенной техники:Да/Нет</th>
        <th>Подключения к АРМ оборудования:Да/Нет</th>
        <th>Наличие ТМ-идентификаторов:Да/Нет</th>
        <th>Хранение паролей:Да/Нет</th>
        <th>Прочее:Да/Нет</th>
        <th>Для записей:Да/Нет</th>
    </tr>

  <#list protocols as protocol>
    <tr>
        <td>${protocol.id}</td>
        <td>${protocol.date?date}</td>
        <td>${protocol.workplace}</td>
        <td>${protocol.office}</td>
        <td>${protocol.authority}</td>
        <td>${protocol.fio}</td>
        <td>${protocol.position}</td>
        <td>${protocol.confidental?c}</td>
        <td>${protocol.notblock?c}</td>
        <td>${protocol.integrity?c}</td>
        <td>${protocol.unregistered?c}</td>
        <td>${protocol.device?c}</td>
        <td>${protocol.identificator?c}</td>
        <td>${protocol.password?c}</td>
        <td>${protocol.etc?c}</td>
        <td>${protocol.record}</td>
    </tr>
</#list>

</table>
</body>
</html>