package PersonalFinance.model;

import PersonalFinance.exception.ModelException;

import java.util.Objects;

public class Account extends Common{
    private String title;
    private Currency currency;
    private double startAmount;
    private double amount;

    public Account() {}

    public Account(String title, Currency currency, double startAmount, double amount) {
        if (title.length() ==0) throw new ModelException(ModelException.TITLE_EMPTY);
        if (currency == null) throw new ModelException(ModelException.CURRENCY_EMPTY);
        this.title = title;
        this.currency = currency;
        this.startAmount = startAmount;
    }

    public double getAmount() {
        return amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return title.equals(account.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
    public String getValueForComboBox() {
        return title;
    }
    public void SetAmountFromTransactionsAndTransfers() {

    }

}

