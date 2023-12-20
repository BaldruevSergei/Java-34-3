package family_budger.dao;

import family_budger.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget{
    // свои поля

    List<Purchase> purchaseList;
    double budget;

    public BudgetImpl(List<Purchase> purchaseList, double budget) {
        this.purchaseList = new ArrayList<>(); // все покупки индивидуальные - HashSet, TreeSet - если надо отсортировать
        this.budget = budget;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        // если бюджет позволяет  то регистрируем покупку
        // проверка пор уникальность ?
        return purchaseList.add(purchase);
    }

    @Override
    public double calcBudget() {

        return purchaseList.stream()
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByPerson(String person) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getPerson().equals(person))
                .mapToDouble(Purchase::getTotalCost)
                .sum();// суммы потраченные по персонам
    }

    @Override
    public double budgetByStore(String store) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equals(store))
                .mapToDouble(Purchase::getTotalCost)
                .sum(); // суммы потраченные по магазинам
    }

    @Override
    public double budgetByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getDate().isAfter(from)&&purchase.getDate().isBefore(to))
                .mapToDouble(Purchase::getTotalCost)
                .sum();// суммы потраченные по  датам
    }

    @Override
    public double addMoney(double money) {
        return budget+ money; // добавили деньги
    }

    @Override
    public boolean checkBudget(Purchase purchase) {
        return budget >= calcBudget();
    }

    @Override
    public double checkMoney(Purchase purchase) {
        return budget - calcBudget();
    }
}
