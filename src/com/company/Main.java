package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("SudnoTanker");
        createObject("SudnoKonteinerevoz");
        createObject("SudnoBalker");

    }
    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className){
            case "SudnoTanker":
                printable = new SudnoTanker("Brown ", 1996, 400, 150);
                printable.print();
                break;
            case "SudnoKonteinerovoz":
                printable = new SudnoKonteinerovoz("Orange ", 1994, 500,
                        "HighCube 40 ", 26.800);
                printable.print();
                break;
            case "SudnoBalker":
                printable = new SudnoBalker("Black ", 2000, 380,
                        150, " Упакованные товары ");
                printable.print();
                break;
        }
        return printable;
    }
}
// b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
//c)  Создать Интерфейс Printable с методом void print();
//d)  Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы
// он распечатывал всю информацию о свойствах объекта.
//e)  В классе Main создать возвращаемый метод createObject(String className),
// который умеет создавать объекты класса 2й, 3й и 4й и после создания
// и задания свойств объекту метод возвращает ссылку на объект (пульт).
// Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
// Например если в параметре передается “2й” метод должен создать объект именно этого типа.
//f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createObject,
// и распечатать по ним информацию методом print();