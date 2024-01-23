package Exceptions.CCWithExceptions.CCManagement;

import Exceptions.CCWithExceptions.SaldoInsufficienteException;

public class CC {
    private String nomeCorrentista;
    private double saldo;

    public CC(String nomeCorrentista, double saldo) throws CifraNegativaException {
        if (saldo < 0) throw new CifraNegativaException("Saldo negativo inserito" + saldo);

        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public void preleva(double amount) throws CifraNegativaException, SaldoInsufficienteException {
        if (amount < 0) throw new CifraNegativaException("Il valore da prelevare è negativo (" + amount + ")");

        if (amount > saldo) throw new SaldoInsufficienteException("Saldo insufficiente per un prelievo di" + amount);

        saldo -= amount;
        System.out.println("Prelievo di " + amount + " effettuato. Nuovo saldo: " + saldo);
    }

    public void deposita(double amount) throws CifraNegativaException {
        if (amount < 0) throw new CifraNegativaException("Il valore da prelevare è negativo (" + amount + ")");

        saldo += amount;
        System.out.println("Deposito di " + amount + " effettuato. Nuovo saldo: " + saldo);

    }
}
