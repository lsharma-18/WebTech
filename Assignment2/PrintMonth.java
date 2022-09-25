import java.util.Scanner;

public class PrintMonth {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter index of the month");
        int index = scn.nextInt();

        //If input is out of range
        while(index < 1 || index > 12)
        {
            System.out.println("Please enter valid values");
            index = scn.nextInt();
        }

        scn.close();

        String month = ""; // To store name of the month
        int numOfDays = 0; // To store number of days in the month provided

        switch(index)
        {
            case 1 : month = "January";
                    numOfDays = 31;
                    break;
            
            case 2 : month = "February";
                    numOfDays = 28;
                    break;
            
            case 3 : month = "March";
                    numOfDays = 31;
                    break;       
            
            case 4 : month = "April";
                    numOfDays = 30;
                    break;
            
            case 5 : month = "May";
                    numOfDays = 31;
                    break;

            case 6 : month = "June";
                    numOfDays = 30;
                    break;
            
            case 7 : month = "July";
                    numOfDays = 31;
                    break;
                 
            case 8 : month = "August";
                    numOfDays = 31;
                    break;
                
            case 9 : month = "September";
                    numOfDays = 30;
                    break;
                
            case 10 : month = "October";
                    numOfDays = 31;
                    break;

            case 11 : month = "November";
                    numOfDays = 30;
                    break;

            case 12 : month = "December";
                    numOfDays = 31;
                    break;
        }

        System.out.println("Month is " + month + " and number of days are " + numOfDays);
    }
    
}
