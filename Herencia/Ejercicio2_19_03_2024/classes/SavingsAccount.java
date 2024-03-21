package Ejercicio2_19_03_2024.classes;

public class SavingsAccount extends Count {

    private boolean active;

    public SavingsAccount(float balance, float anualRate) {
        super(balance, anualRate);
    }

    public void Active(){
        if(balance<10000){
            active=false;
        }else{
            active=true;
        }
    }

    public void toDepositt(int amount){
        if(active){
            toDeposit(amount);
        }
    }
    public void toRetiredd(int amount){
        if(active){
            toRetired(amount);
        }

    }
}
