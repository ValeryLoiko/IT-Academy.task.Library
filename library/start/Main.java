package by.pvt.lessons.les_16.library.start;

import by.pvt.lessons.les_16.library.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        String role = null;
        String response = null;

        String messege = "SING_IN; Nikita1919; 123123asd";
        role = controller.executeTask(messege);
        System.out.println(role);

        String messege2 = "ADD_BOOK; Возвращение Шерлока Холмса; Артур Конан Дойль; 1905; 003";
        response = controller.executeTask(messege2);
        System.out.println(response);

    }
}
