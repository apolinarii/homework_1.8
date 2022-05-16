package com.company;


public class Main {

    public static void main(String[] args) {
        doExercise1(2022);
        String osName = "IOS";
        int clientsOS = getClientOS(osName);
        doExercise3(20);

    }

    public static void doExercise1 (int year) {
// Exercise 1
            if (year % 100 == 0 && year % 400 == 0)
                System.out.println(year + " this year is intercalary year.");
            else if (year % 4 == 0 && year % 100 > 0)
                System.out.println(year + " this year is interalary year.");
            else if (year % 100 == 0)
                System.out.println(year + " this year is not interalary year.");
            else
                System.out.println(year + " this year is not interalary year.");
        }

// Exercise 2
public static int getClientOS (String name) {
        if (name.equals("IOS")) {
            return 0;
        } else {
            return 1;
        }

// Exercise 3
    public static void task3(int deliveryDistance) {
            if (deliveryDistance <= 20) {
                System.out.println("Пoтрeбуется дней: 1");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потpeбуется дней: 2");
                if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println("Потpeбуется дней: 3");
                }
            }

}

}
