<!--Форма для вывода информации по Приложению без нарушений к акту проверки  -->
<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <title>Appendixwithoutviolation</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<ul id="navbar">
    <li><a href="javascript:history.back()">Назад</a>
</ul>
<h2>Приложение без нарушений к АКТу проверки</h2>

<table bgcolor="#ffcc00" border="1" cols="15">
    <tr><th>Id</th><td>${theappendixwithout.id}</td></tr>
    <tr><th>Дата проверки:</th><td>${theappendixwithout.date?date}</td></tr>
    <tr><th>Проверяющие, ФИО:</th><td>${theappendixwithout.fio}</td></tr>
    <tr><th>Проверяемое подразделение:</th><td>${theappendixwithout.department}</td></tr>
    <tr><th>Адрес:</th><td>${theappendixwithout.address}</td></tr>
    <tr><th>Количество проверенных рабочих мест:</th><td>${theappendixwithout.workplacecount}</td></tr>
</table>

</table>
</body>
</html>