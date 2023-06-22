package Interfaces;

import Models.Vacancy;

public interface Observer {

    void receiveOffer(String nameCompany, Vacancy vacancy);
}
