package wilder;

public class Wilder {
    // Inhalte der Klasse Wilder

    // muss man privat davor setzen?
    // private String firstname;
    // private boolean present;

    private String firstname;
    private boolean present;


    // Konstruktor
    public Wilder (String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    //Getter firstname
    public String getFirstname() {
        return this.firstname;
    }

    //Getter present
    public boolean getPresent () {
        return this.present;
    }

    //Setter firstname
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
        
    //Setter present
    public void setPresent(boolean present) {
    this.present = present;
    }
        
// 5.) Add a whoAmI() method that returns the text "My name is 
// firstname and I am present" or "My name is firstname and I am not present", depending on the state of the attributes firstname and present.

public String whoAmI() {
    String Ausgabe = "";
    if (present) {
            Ausgabe = "My name is " + getFirstname() + " and I am present";
    
    }   else {
            Ausgabe = "My name is " + getFirstname() + " and I not present";
    }


    return Ausgabe;
}

/*
public void present() {
        System.out.println("My name is: " + this.firstname + " and I am present.");

    }
*/

}

