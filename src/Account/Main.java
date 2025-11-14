package Account;

import java.util.Date;

class Account {
        public int id = 0;
        public double balance = 0;
        public static double annualInterestRate = 0;
        public Date dateCreated;

        public Account() {
            id=0;
            balance=0;
            dateCreated=new Date();
        }

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
            this.dateCreated = new Date();
        }

        public int getId() {
            return id;
        }

        public double getBalance() {
            return balance;
        }

        public static double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public Date getDateCreated() {return dateCreated;}

        public void setId(int id) {
            this.id = id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public static void setAnnualInterestRate(double annualInterestRate) {
            Account.annualInterestRate = annualInterestRate;
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        public double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100);
        }

        public void withdraw(double amount) {
            if (amount > balance) {
            } else {
                balance -= amount;
            }
        }

        public void deposit(double amount) {
            balance += amount;
        }
    }
    public class Main{
        public static void main(String[] args) {
            Account account = new Account(1122, 20000);
            Account.setAnnualInterestRate(4.5);
            account.withdraw(2000);
            account.deposit(3000);
            System.out.println("Account ID: " + account.getId());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("Monthly interest: $" + account.getMonthlyInterest());
            System.out.println("Account created on: " + account.dateCreated);

        }

    }


