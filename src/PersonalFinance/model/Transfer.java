package PersonalFinance.model;

import PersonalFinance.exception.ModelException;

import java.util.Date;

public class Transfer {

    private Account fromAccount;
    private Account toAccount;
    private double fromAmount;
    private String toAmount;
    private String notice;
    private Date date;

    public Transfer () {}

    public Transfer(Account fromAccount, Account toAccount, double fromAmount, String toAmount, String notice, Date date) {
        if (fromAccount ==null) throw new ModelException(ModelException.ACCOUNT_EMPTY);
        if (toAccount== null) throw new ModelException(ModelException.ACCOUNT_EMPTY);
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
        this.notice = notice;
        this.date = date;
    }
}
