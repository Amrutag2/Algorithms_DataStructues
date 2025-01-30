package oops;

import data_structures.Banking;

public class BankService{
    public Banking Factory(int choice){
        if(choice  == 0000){
            System.out.println("User has Choosen Atm mode of Payment");
            return new Atm();
        }
        else{
            System.out.println("User has Choosen UPI mode of Payment");
            return new UPI();
        }
    }
}
