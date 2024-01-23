package Exceptions.CCWithExceptions.Main;

import Exceptions.CCWithExceptions.CCManagement.CC;
import Exceptions.CCWithExceptions.CCManagement.CifraNegativaException;
import Exceptions.CCWithExceptions.SaldoInsufficienteException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome = "Nicolò";
        double saldo = 120.0;

        int amountNonValido = -10;
        ManageCC(nome, saldo);

        s.close();

    }

    private static void ManageCC(String nome, double saldo) {
        try {
            CC cc = new CC(nome, saldo);
            cc.preleva(20);
            cc.deposita(100);
            cc.preleva(-95);
        } catch (CifraNegativaException | SaldoInsufficienteException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
