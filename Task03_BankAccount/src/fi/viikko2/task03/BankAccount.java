/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {
   String accountNumber;
   private double balance;

   public BankAccount(String accountNumber, double balance){
    if(balance < 0){
        this.balance = 0;
    }else{
        this.balance=balance;
    }
    this.accountNumber=accountNumber;
   }

public double getBalance() {
    return balance;
}

   public boolean withdraw(double amount){
    if(amount>balance){
        System.out.println("Et voi nostaa yli saldon, yritit tallettaa "+amount+", saldosi on " + balance);
        return false;
    }
    else{
        this.balance -= amount;
       System.out.println("Nosto onnistui, saldoa jäljellä: " + balance);
        return true;
    }
   }

   public boolean deposit(double amount){
    if(amount <= 0){
        System.out.println("talletus summa täytyy olla isompi kuin 0, yritit tallettaa"+amount);
        return false;
    }else{
    this.balance += amount;
    System.out.println("talletus onnistui, saldoa: "+ balance);
    return true;
    }
   }



    @Override
    public String toString(){
        return "accountNumber="+accountNumber+", balance="+ balance;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!( o instanceof BankAccount)) return false;
        BankAccount other = (BankAccount)o;

        return this.accountNumber.equals(other.accountNumber);

    }
}