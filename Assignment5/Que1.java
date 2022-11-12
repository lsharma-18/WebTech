//define class Mammals
class Mammals{

    void display1() {
        System.out.println("I am mammal");
    }
};

//define class MarineAnimals
class MarineAnimals {

    void display2() {
        System.out.println("I am a marine animal");
    }
};

//define class BlueWhale
class BlueWhale extends Mammals, MarineAnimals{

    void display3() {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }

};

public class Que1 {

public static void main(String [] args) {
Mammals mammal = new Mammals ();  //object for class Mammals
MarineAnimals marineAnimal = new MarineAnimals (); //object for class MarineAnimals
BlueWhale blueWhale = new BlueWhale(); //object for class BlueWhale

mammal.display1(); // function of Mammals by the object of Mammal
marineAnimal.display2(); // function of MarineAnimal by the object of MarineAnimal 
blueWhale.display3(); // function of BlueWhale by the object of BlueWhale 
blueWhale.display1(); // function of Mammals by object of BlueWhale 
blueWhale.display2(); // func of MarineAnimals by object of BlueWhale 
        
}
    
}


//We will get an error for the above code because Java 
//does not support multiple inheritance.
//
//To make the code working, one alternative can be to use multi-level inheritance i.e.
//class MarineAnimals extends Mammals and class BlueWhale extends MarineAnimals. However, the 
//drawback of this is that MarineAnimals would now inherit traits of Mammmals!