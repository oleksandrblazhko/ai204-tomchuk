|FR id|TC id|Опис кроків тестового сценарію|Опис очікуваних результатів|
|:-:|:-:|:-|:-:|
|FR2.1|TC1.1|Початкові умови: відсутні <br> Кроки сценарію: <br> 1) idCard = 9  <br> 2) date = "16.07.21"<br> 3) calories/pulse/pace/pressure = "446/68/6734/118" |Результат =  1|
|FR2.1|TC1.2|Початкові умови: відсутні <br> Кроки сценарію: <br> 1) idCard = -100  <br> 2) date = "16.07.21"<br> 3) calories/pulse/pace/pressure = "446/68/6734/118" |Результат =  -1|
|FR2.1|TC1.3|Початкові умови: відсутні <br> Кроки сценарію: <br> 1) idCard = 9  <br> 2) date = "16.07.21"<br> 3) calories/pulse/pace/pressure = "-100/68/6734/118" |Результат =  -3|
|FR2.1|TC1.4|Початкові умови: відсутні <br> Кроки сценарію: <br> 1) idCard = 9  <br> 2) date = "16.13.26"<br> 3) calories/pulse/pace/pressure = "446/68/6734/118" |Результат =  -2|