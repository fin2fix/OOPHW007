import java.util.ArrayList;
import java.util.Arrays;

import Models.Company;
import Models.Immigrant;
import Models.JobAgency;
import Models.Manager;
import Models.Master;
import Models.Student;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     * добавить новый тип соискателя.
     * **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * **.3 Предусмотреть тип вакансии (enum)
     * 
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company mailRu = new Company("Mail.ru", jobAgency);

        Master ivanov = new Master("Ivanov", new ArrayList<String>(Arrays.asList("Sales", "IT")));
        Master petrov = new Master("Petrov", new ArrayList<String>(Arrays.asList("IT")));
        Student sidorov = new Student("Sidorov",
                new ArrayList<String>(Arrays.asList("Cleaning", "Sales", "IT", "Unskilled_worker")));
        Manager kuznetsov = new Manager("Kuznetsov", new ArrayList<String>(Arrays.asList("Sales", "Manager")));
        Immigrant ravshan = new Immigrant("Ravshan",
                new ArrayList<String>(Arrays.asList("Cleaning", "Unskilled_worker")));

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(kuznetsov);
        jobAgency.registerObserver(ravshan);

        for (int i = 0; i < 2; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            mailRu.needEmployee();
            System.out.printf("\n\n");
        }
    }
}
