## Geomentry
Работа с геометрическими фигурами. Осуществляется работа с прямоугольниками и параллелепипедами.
Класс Figure содержит поля и методы для работы с фигурами. Поля — длины сторон фигуры, экземпляры прямоугольников и параллелепипедов, а также список прямоугольников. Методы, помимо стандартных добавления, удаления, инициализации и вывода, реализуют проверку положения групп прямоугольников и параллелепипедов относительно фигуры, описанной в полях класса Figure.
Класс Parallelepiped - наследник класса Figure. Содержит поле — высоту параллелепипеда, а также метод, возвращающий данную высоту. Также реализован метод, подсчитывающий периметр параллелепипеда. 
Класс Rectangle содержит поля  - длину и ширину прямоугольника. Методы — инициализации, вывод и возврат полей, подсчет периметра прямоугольника и сравнение периметров двух прямоугольников.
Интерфейс SumPerimeterFigure описывает подсчет сумм периметров фигур.
Классы Rectangles и Parallelepipeds реализуют интерфейс SumPerimeterFigure для подсчета сумм периметров соответственно для прямоугольников и параллелепипедов.
