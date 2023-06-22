package Models;

import java.util.Random;

import Interfaces.Publisher;

public class Company {

    private static Random random = new Random();

    private String nameCompany;
    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() {
        int count = random.nextInt(1, 6);
        String position = "";
        int offeringSalary = 0;

        switch (count) {
            case 1:
                position = "Cleaning";
                offeringSalary = random.nextInt(10000, 30000);
                break;
            case 2:
                position = "Sales";
                offeringSalary = random.nextInt(50000, 120000);
                break;
            case 3:
                position = "IT";
                offeringSalary = random.nextInt(100000, 180000);
                break;
            case 4:
                position = "Manager";
                offeringSalary = random.nextInt(80000, 250000);
                break;
            case 5:
                position = "Unskilled_worker";
                offeringSalary = random.nextInt(10000, 80000);
                break;
        }
        jobAgency.sendOffer(nameCompany, new Vacancy(position, offeringSalary));
    }

}
