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
    <tr><th>Id</th><td>${theappendix.id}</td></tr>
    <tr><th>Номер раб. места/помещения:</th><td>${theappendix.workplace}</td></tr>
    <tr><th>ФИО, Должность, Подразделение:</th><td>${theappendix.fio_pos_dep}</td></tr>
    <tr><th>Время фиксации:</th><td>${theappendix.time_fix?datetime}</td></tr>
    <tr><th>фотографии</th><td><img alt="IMG" src='${base64EncodedImage}' width="300" height="250" /></td></tr>
    <tr><th>Объяснение сотрудника:</th><td>${theappendix.explanation}</td></tr>

</table>

</table>
</body>
</html>