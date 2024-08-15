package homework3;

import homework3.city.ex4.City;
import homework3.city.ex4.House;
import homework3.factory.ex2.Iphone;
import homework3.factory.ex2.Samsung;
import homework3.factory.ex2.factoryIpnone;
import homework3.factory.ex2.factorySamsung;
import homework3.pyramid_ex3.Pyramid1;
import homework3.pyramid_ex3.Pyramid2;
import homework3.pyramid_ex3.Pyramid3;

public class Runner {
    public static void main(String[] args) {
        //В этом дз уже будет проверятся наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        //Зайди в shop.Runner
    }

    public static void ex2() {
        //Задача: Фабрика телефонов
        //Организовать фабрику создания двух телефонов
        //
        //Создать комплектующие телефона
        //Камера: умеет фотографировать. Свойство - количество мега пикселей.
        //Процессор: свойство - количество вычислений в секунду (mhz)
        //Корпус: свойства - размеры - ширина, высота, длина
        //
        //Создать телефон Samsung, который состоит из процессора, камеры, корпуса.
        //Умеет фотографировать используя камеру (печать в консоль - "сделано фото")
        //
        //Создать телефон Iphone, который состоит из двух процессоров, камеры, корпуса.
        //Умеет фотографировать используя камеру (печать в консоль - "сделано фото").
        //Умеет печатать на экран информацию о процессорах.
        //
        //Создать фабрику Iphone, которая:
        //Создает iphone и заполняет его двумя процессорами (1000 Mhz), 8 мегапиксельной камерой,
        // и корпусом 60х200х10
        //
        //Создать фабрику Samsung, которая:
        //Создает samsung и заполняет его процессором (1500 Mhz), 16 мегапиксельной камерой,
        // и корпусом 60х200х15
        //ВНИМАНИЕ! Фабрики создают телефоны без создания экземпляра фабрики!
        //factoryIpnone factoryIpnone = new factoryIpnone();
        Iphone iphone = factoryIpnone.Product();
        Samsung samsung = factorySamsung.Product();

////        //проверка методов созданных Айфонов
            iphone.infoCPU();
            iphone.camera.makePhoto();
////        //проверка методов созданных Самсунгов
            samsung.camera.makePhoto();

    }

    public static void ex3() {
        //Задача: Пирамида наследования
        //Создать классы Pyramid1, Pyramid2, Pyramid3.
        //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // M <- из Pyramid1
        // MM <- из Pyramid2
        // MMM <- из Pyramid3

        //Т.е. при вызове pyramid1.print выведется:
        // M
        // MM
        // MMM

        //при вызове pyramid2.print выведется:
        // MM
        // MMM

        //при вызове pyramid3.print выведется:
        // MMM

        //создать здесь экземпляр класса pyramid1 и вызвать print

        Pyramid1 Pyramid1 = new Pyramid1();
        Pyramid1.print();
    }

    /**
     * Для продвинутых
     */
    public static void ex4() {

////Зада: Иммутабельный город.
//        //
//        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
//        //Переопределить вывод в текст - вывод улицы и номера дома
//        //Создать иммутабельный класс City (наименование города, и массив домов).
//        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
//        //
//        //1. Создать два дома, создать город с массивом созданных домов
//        //2. Сделать так, чтобы у города нельзя было поменять свойства.
//        //3. Сделать так, что если дом получен из города, то при изменении свойств этого дома,
//        // эти изменения не затронут дом находящийся внутри города.
////        // Т.е. результат должен соответствовать псевдокоду ниже:
////        //
////        //[] - квадратные скобки - массив
////        //{} - объект

        House[] house =new House[2];

        house[0] = new House("Lenina",1);
        house[1] = new House("Pionerskaya",22);
        City city = new City(house, "Мурманск");

        System.out.println(city);
        House house2 = city.getHouses()[0];
        house2.setStreet("Kotova");
        System.out.println(house2);
        System.out.println(city);



    }
}