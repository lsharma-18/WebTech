import java.util.Scanner;

class Customer{

    String name,address;
    int age;
}

 

class Account{

    String accType,branchType;
}

 
// Base class
class RBI{ 

    int withLimit, n; //number of years
    double Amount, Principle, rate;
    float t; //time
    long avg, total, minBalance;

     

    int setWithdrawalLimit() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account Type");

        String actype = input.nextLine();

        System.out.println("Enter branch type");

        String brtype = input.nextLine();

        input.close();

        if(actype=="SAVINGS" && brtype=="METRO") {

            withLimit = 5000;

        }
        
        else {

            withLimit = 4000;
        
        }

      return withLimit;

    }

     

    double setInterestRate() {

        Amount =(Principle + rate)/n*t;

        return Amount;

      }

     

    long setMinBalance() {

        minBalance = (avg * total)/31;

        return minBalance;

    }

}

 
// Child class1
class ICICI extends RBI{ 

    double setInterestRate() {

        Amount = (Principle * rate) / n + t;

        return Amount;

    }

     

    int setWithdrawalLimit() {

        withLimit = 9000;

        return withLimit;

      }

}

 
// Child class2
class SBI extends RBI{ 

    double setInterestRate() {

        Amount = Principle * (1 + rate /n) + n*t;

        return Amount;

    }

    long setMinBalance() {

        minBalance = (avg + total)/30;

        return minBalance;

    }

}

public class Que2 {

public static void main(String args[]) {

    ICICI icici = new ICICI();
    
    SBI sbi = new SBI();

    sbi.Principle = 100;

    sbi.rate = 7;

    sbi.n = 5;

    sbi.t = 7;

    Double sbiInt = sbi.setInterestRate();

    System.out.println("SBI interest rate is:" + sbiInt);

    int iciciWithdrawlLimit = icici.setWithdrawalLimit();

    System.out.println("ICICI withdraw limit is:" + iciciWithdrawlLimit);

}

}

