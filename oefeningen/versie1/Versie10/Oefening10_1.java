package oefeningen.versie1.versie10;

import java.util.*;

public class Oefening10_1 {

        private int id = 0;
        private double balance = 0;
        private static double annualInterestRate = 0;
        private Date dateCreated = new Date();

    public Oefening10_1(int id, double balance, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

        public int getId() {
            return id;
        }

        public double getBalance() {
            return balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAccount(int id, double balance, double annualInterestRate) {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
        }


        public Date getDateCreated() {
            return dateCreated;
    }

        private void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
    }

    }
