package Interfaces;

import Models.Vacancy;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, Vacancy vacancy);

}
