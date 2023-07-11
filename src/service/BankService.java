package service;

import model.BankAccount;
import model.MovementType;
import model.PaymentMovement;

import java.math.BigDecimal;

public class BankService {

    public BankAccount createBankAccount(String bankName, String ibanNo, String companyName, BigDecimal amount) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setBankName(bankName);
        bankAccount.setIbanNo(ibanNo);
        bankAccount.setCompanyName(companyName);
        bankAccount.setAmount(amount);

        return bankAccount;
    }

    public PaymentMovement createPaymentMovement(BankAccount bankAccount, String description,
                                                 MovementType movementType, BigDecimal amount) {

        PaymentMovement paymentMovement = new PaymentMovement();

        paymentMovement.setBankAccount(bankAccount);
        paymentMovement.setDescription(description);
        paymentMovement.setMovementType(movementType);
        paymentMovement.setAmount(amount);

        return  paymentMovement;
    }
}
