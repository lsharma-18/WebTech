public class Ques4 {

    public static void main (String[] args)
    {
        int population = 80000;
        float rate = 0.05f;
        int year = 0;

        //while loop that runs until the population exceeds 150000
        while(population < 150000)
        {
            population = population + (int)(rate * population); //Population has to be an integer
            ++year;
        }

        System.out.println("Population first exceeds 150000 after " + year + " year");
    }
    
}
