## Словник атрибутів об’єктів

<table>
    <thead align="center">
        <tr>
            <td>Об'єкт</td>
            <td>Атрибут</td>
            <td>Короткий опис</td>
            <td>Тип</td>
            <td>Обмеження</td>
        </tr>
    </thead>
        <tbody>
        <tr>
            <td rowspan="11">USER</td>
            <td>role</td>
            <td>Назва ролі користувача</td>
            <td>role</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td>name</td>
            <td>Ім'я користувача</td>
            <td>Текст</td>
            <td>Щонайменше 4 символів</td>
        </tr>
        <tr>
            <td>surname</td>
            <td>Прізвище користувача</td>
            <td>Текст</td>
            <td>Щонайменше 4 символів</td>
        </tr>
        <tr>
            <td>balance</td>
            <td>Кількість грошей на рахунку користувача</td>
            <td>Чисельний</td>
            <td>Не менший за 0</td>
        </tr>
        <tr>
            <td>sex</td>
            <td>Стать людини</td>
            <td>Текст</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td>weight</td>
            <td>Вага людини</td>
            <td>Чисельний</td>
            <td>Не менший за 0</td>
        </tr>
        <tr>
            <td>height</td>
            <td>Ріст людини</td>
            <td>Чисельний</td>
            <td>Не менший за 0</td>
        </tr>
        <tr>
            <td>profession</td>
            <td>Занятість людини</td>
            <td>Текст</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td>about me</td>
            <td>Коротка інформація о людині</td>
            <td>Текст</td>
            <td></td>
        </tr>
        <tr>
            <td>interests</td>
            <td>Перелік хобі</td>
            <td>Текст</td>
            <td></td>
        </tr>
        <tr>
            <td>dance</td>
            <td>Танці, якими інтересується людина</td>
            <td>danceType</td>
            <td>Не порожнє значення</td>
        </tr>
                <tr>
            <td rowspan="5">HEALTHCONDITION</td>
            <td>calories</td>
            <td>Кількість калорій людини</td>
            <td>Чисельний</td>
            <td>Не менший за 0</td>
        </tr>
        <tr>
            <td>pulse</td>
            <td>Пульс людини</td>
            <td>Чисельний</td>
            <td>Не менший за 0</td>
        </tr>
        <tr>
            <td>pace</td>
            <td>Зроблені кроки людини</td>
            <td>Чисельний</td>
            <td>Не менший за 0</td>
        </tr>
        <tr>
            <td>pressure</td>
            <td>Тиск людини</td>
            <td>Чисельний</td>
            <td>Не менший за 0</td>
        </tr>
        <tr>
            <td>date</td>
            <td>Час отримання даних</td>
            <td>Дата</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td rowspan="3">GROUP</td>
            <td>name</td>
            <td>Назва групи</td>
            <td>Текст</td>
            <td>Щонайменш 10 символів</td>
        </tr>
        <tr>
            <td>type</td>
            <td>Направлення групи</td>
            <td>Текст</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td>trainer</td>
            <td>Куратор (тренер) групи</td>
            <td>user</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td>CARD</td>
            <td>number</td>
            <td>Номер картки людини</td>
            <td>Чисельний</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td>ROLE</td>
            <td>name</td>
            <td>Назва ролі</td>
            <td>Текст</td>
            <td>Не порожнє значення</td>
        </tr>
        <tr>
            <td>DANCETYPE</td>
            <td>name</td>
            <td>Назва жанра танців</td>
            <td>Текст</td>
            <td>Не порожнє значення</td>
        </tr>
    </tbody>
</table>