package family_budger.dao;

import family_budger.model.Purchase;

import java.time.LocalDate;

public interface Budget {
    boolean addPurchase(Purchase purchase);
    double calcBudget();
    double budgetByPerson(String person);
    double budgetByStore(String store);
    double budgetByPeriod(LocalDate form, LocalDate to);
    double addMoney(double money);
    boolean checkBudget(Purchase purchase); // при покупке можем себе позволить
    double checkMoney(Purchase purchase); // даем каккую то покупку что будем  минус или плюс  денег остаток


}
