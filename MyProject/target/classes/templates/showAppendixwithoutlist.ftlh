<!--Форма для вывода информации по списку приложений без нарушениями к акту проверки  -->
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
    <tr>
        <th>Id</th>
        <th>Дата проверки:</th>
        <th>Проверяющие, ФИО:</th>
        <th>Проверяемое подразделение:</th>
        <th>Адрес:</th>
        <th>Количество проверенных рабочих мест:</th>
    </tr>

    <tr>
    <#list 0 ..< theappendixwithout?size as i>
        <td>${theappendixwithout[i].id}</td>
        <td>${theappendixwithout[i].date?date}</td>
        <td>${theappendixwithout[i].fio}</td>
        <td>${theappendixwithout[i].department}</td>
        <td>${theappendixwithout[i].address}</td>
        <td>${theappendixwithout[i].workplacecount}</td>
    </tr>
</#list>
</table>

</table>
</body>
</html>