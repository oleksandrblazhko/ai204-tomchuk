## Прототипи методів програмних класів

<table>
    <thead align="center">
        <tr>
            <td>FR</td>
            <td>Опис функціональної вимоги</td>
            <td>Назва класу</td>
            <td>Назва методу класу</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">FR1</td>
            <td colspan="3">Пошук групи з інтересів</td>
        </tr>
        <tr>
            <td align="center">FR1.1</td>
            <td>Система має видавати перелік користувачів за критеріями.</td>
            <td>User</td><td>getUserBy(Interest interest)</td>
        </tr>
        <tr>
            <td align="center">FR1.2</td>
            <td>Танцюрист може шукати собі партнерів завдяки наявності фільтрів з критеріями.</td>
            <td>User</td><td>getUserByDanceType(DanceType dType)</td>
        </tr>
        <tr>
            <td align="center">FR1.3</td>
            <td>Танцюрист може подати заяву на вступ до певної групи.</td>
            <td>User</td><td>requestStatement(Group group)</td>
        </tr>
        <tr>
            <td align="center">FR1.4</td>
            <td>Танцюрист може залишати власну заяву з певним набором критеріїв для запрошення його до групи.</td>
            <td>User</td><td>setCriteria(Criteria criteria)</td>
        </tr>
        <tr>
            <td align="center">FR1.5</td>
            <td>Танцюрист може дивитися на те, яку групу тренер курирує.</td>
            <td>User</td><td>getCoach(Group group)</td>
        </tr>
        <tr>
            <td align="center">FR1.6</td>
            <td>Танцюрист може вибирати зручний час доби та місце для участі в танцях.</td>
            <td>User</td><td>setSchedule(Time time)</td>
        </tr>
        <tr>
            <td align="center">FR2</td>
            <td colspan="3">Моніторинг стану здоров'я</td>
        </tr>
        <tr>
            <td align="center">FR2.1</td>
            <td>Танцюрист/Тренер/Менеджер можуть спостерігати за показниками здоров'я під час проведення танцювальних практик.</td>
            <td>HealthCondition</td><td>getHealthCondition(Card card)</td>
        </tr>
        <tr>
            <td align="center">FR2.2</td>
            <td>Танцюрист/Тренер/Менеджер можуть бачити в профілю учасника, що перебуває в групі, список його показників за різним часом.</td>
            <td>HealthCondition</td><td>getHealthCondition (Card card, Time time)</td>
        </tr>
        <tr>
            <td align="center">FR2.3</td>
            <td>Танцюрист може бачити графік необхідних щодня тренувань для спостеріганням за тонусом.</td>
            <td>User</td><td>getGraphic(Card card)</td>
        </tr>
        <tr>
            <td align="center">FR2.4</td>
            <td>Танцюрист/Тренер/Менеджер може зв'язатися з особистим лікарем, закріпленим за конкретною групою.</td>
            <td>Card</td><td>getNumber(User user)</td>
        </tr>
    </tbody>
</table>