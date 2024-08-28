package org.javaacademy.core.homework.homework5;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        int number = 0;
        while (number < 10) {
            if (number == 0) {
                continue;
            }
            number++;
        }
        System.out.println(number);
        Object object = null;
        try {
            System.out.println(object.toString());
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
        ex1();
    }

    private static void ex1() {
        //Донаты со всего мира
        //Одному блогеру присылают пожертвования(донаты) за его ролики
        //Данные о пожертвованиях содержатся в файле donation.csv (папка resources)
        //Необходимо посчитать сумму пожертвований от пользователей из каждой страны
        //Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу)
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "donation.csv";
        //Чтение файла из папки resources (без привязки к конкретному расположению проекта)
        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
        System.out.println(scanner.nextLine());

        BigDecimal[] cunterDonate = new BigDecimal[countries.length];
        Arrays.fill(cunterDonate, BigDecimal.ZERO);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String country = line.substring(0, line.indexOf(';'));
            // Вырезаем после ';' денежное выражение
            String money = line.substring(line.indexOf(';') + 1, line.length());
            Pattern pattern = Pattern.compile("^\\d*,\\d*$");
            try {
                if (pattern.matcher(money).find()) {
                    money = money.replace(',', '.');
                    for (int i = 0; i < countries.length; i++) {
                        if (countries[i].equals(country)) {
                            cunterDonate[i] = cunterDonate[i].add(BigDecimal.valueOf(Double.valueOf(money)));
                            break;
                        }
                    }
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("ошибка в числе донатов в строке: " + line);
            }
        }

        for (int i = 0; i < countries.length; i++) {
            System.out.println(String.format("Страна %s - %S", countries[i], cunterDonate[i]));
        }

        //Ожидаемый вывод:
        //Список пожертвований по странам (пример):
        //Россия - 14233.00
        //Франция - 8000.32
        //Китай - 20000.11
        //Япония - 124.10
        //Турция - 777.55
    }

    private static void ex2() {
        //Сделать компьютерного шпиона
        //Смысл задания - отслеживать действия реального объекта и записывать их в лог
        //Создать компьютер:
        //1. Компьютер хранит в себе пользователя, который вошел в компьютер
        //2. Компьютер умеет:
        //2.1. Делать вход пользователя (на вход имя пользователя).
        // Изменяет пользователя, который зашел в компьютер
        //2.2 Делать выход пользователя. Удаляет пользователя из системы
        //2.3. Отправляет сообщение (на вход текст сообщения).
        // Печатает на экран "сообщение: {текст сообщения}".

        //Создать компьютерного шпиона, который наследуется от компьютера,
        // при этом хранит в себе обычный компьютер
        //Сделать так, чтобы при вызове методов компьютерного шпиона:
        //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
        // и вызывался метод компьютера.
        //2. При выходе делалась запись в comp.log "Пользователь вышел"
        //3. При отправке сообщения, делалась запись в comp.log:
        // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
        // и вызвался метод компьютера.

        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)
    }
}
