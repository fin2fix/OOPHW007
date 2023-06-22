package Models;

import java.util.ArrayList;
import java.util.Random;

import Interfaces.Observer;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;
    private int minSalary;
    private ArrayList<String> positions;

    public Student(String name, ArrayList<String> positions) {
        this.name = name;
        this.minSalary = random.nextInt(10000, 80000);
        this.positions = positions;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        boolean flag = false;

        for (String position : positions) {
            if (position.equals(vacancy.getPosition()))
                flag = true;
        }

        if (minSalary <= vacancy.getOfferingSalary() && flag) {
            System.out.printf("Студент %s (хочет %d, %s) >> Мне нужна эта работа! (%s предлагает %d, %s)\n",
                    name, minSalary, positions, nameCompany, vacancy.getOfferingSalary(), vacancy.getPosition());
            minSalary = vacancy.getOfferingSalary();
        } else if (!flag) {
            System.out.printf("Студент %s (хочет %d, %s) >>> Позиция не подходит (%s предлагает %d, %s)\n",
                    name, minSalary, positions, nameCompany, vacancy.getOfferingSalary(), vacancy.getPosition());
        } else {
            System.out.printf("Студент %s (хочет %d, %s) >>>> Я найду работу получше! (%s предлагает %d, %s)\n",
                    name, minSalary, positions, nameCompany, vacancy.getOfferingSalary(), vacancy.getPosition());
        }
    }
}
