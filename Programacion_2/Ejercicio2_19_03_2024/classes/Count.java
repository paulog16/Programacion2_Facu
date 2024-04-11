package Ejercicio2_19_03_2024.classes;

public class Count {
    protected float balance;
    protected int numberOfDeposits=0;
    protected int numberOfRetired=0;

    protected float anualRate;
    protected float monthlyComision=0;

    public Count() {
    }

    public Count(float balance, int numberOfDeposits, int numberOfRetired, float anualRate, float monthlyComision) {
        this.balance = balance;
        this.numberOfDeposits = numberOfDeposits;
        this.numberOfRetired = numberOfRetired;
        this.anualRate = anualRate;
        this.monthlyComision = monthlyComision;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public void setNumberOfDeposits(int numberOfDeposits) {
        this.numberOfDeposits = numberOfDeposits;
    }

    public int getNumberOfRetired() {
        return numberOfRetired;
    }

    public void setNumberOfRetired(int numberOfRetired) {
        this.numberOfRetired = numberOfRetired;
    }

    public float getAnualRate() {
        return anualRate;
    }

    public void setAnualRate(float anualRate) {
        this.anualRate = anualRate;
    }

    public float getMonthlyComision() {
        return monthlyComision;
    }

    public void setMonthlyComision(float monthlyComision) {
        this.monthlyComision = monthlyComision;
    }

    public Count(float balance, float anualRate){

        this.balance=balance;
        this.anualRate=anualRate;
    }

    public void toDeposit(float amount){
        balance+=amount;
        numberOfDeposits++;
    }
    public void toRetired(float amount){

        float newBalance= balance-amount;

        if(newBalance>0){
            balance-=amount;
            numberOfRetired++;
        }else{
            System.out.println("el monto excede");
        }
    }
    public void calculateInterest(){
        float monthlyRate= anualRate/12;
        float monthlyInterest=balance*monthlyRate;
        balance+=monthlyInterest;
    }

    public void monthlyStatement(){
        balance-=monthlyComision;
        calculateInterest();
    }

}
