package com.company;

import java.util.*;

//Надо каждый раз ввести значение температуры улицы пользователю!
//Возраст вводится случайные числа

public class Main {

    public static int generateRandomAge()//Метод генаратор случайного числа в диапозоне от 0 до 100;
    {
        Random random = new Random();
        return random.nextInt(101);//от 0, меньше 101;
    }

    public static String method_1(int age, double temperature)//Метод с двумя входыми параметрами(age, temperature);
    {
        if(age>=20 && age<=45 && temperature>=-20 && temperature<=30)//age = от 20, до 45; temp/re = от -20, до 30;
            {
                return "Можно идти гулять_1";
            }
        else if ((age<20) && (temperature>=0 && temperature<=28))//age = меньше 20; temp/re = от 0, до 28;
            {
                return "Можно идти гулять_2";
            }
        else if ((age>45) && (temperature>=-10 &&temperature<=25))//age = больше 45; temp/re = от -10, до 25;
            {
                return "Можно идти гулять_3";
            }
        else
            {
                return "Оставайтесь дома";
            }
    }

    public static void main(String[] args)
    {
        // write your code here
        System.out.println("------------------------");
        for(int i=0;i<5;i++)
        {
            System.out.println("Попытка №"+(i+1)+" == №5");//Счетчик сколько раз было введен данные температуры и age
            int age = generateRandomAge();//Случайное число сохраняется к переменной типа int

            Scanner in = new Scanner(System.in);
            System.out.print("Введите температуру: ");//Пользователь должен ввести температуру улицы
            int temperature = in.nextInt();

            System.out.println("age         = "+age+" \ntemperature = "+temperature);//Вывод входных данных (age, temperature)

            System.out.println("output = "+method_1(age, temperature)+"\n------------------------");//Вызвваем метод с входными двумя параметрами
        }
    }
}


