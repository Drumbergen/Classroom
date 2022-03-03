import wilder.Wilder;

public class Classroom{

    public static void main(String[] args){

    // 7.)  Add references to several instances of the Wilder class
    // inside the main() method of Classroom.  
    Wilder Streber = new Wilder ("Streber", true);
    // Streber.whoAmI(); // My name is Streber and I'm present

    Wilder Schlafmuetze = new Wilder ("Schlafmuetze", false);
    // Schlafmuetze.whoAmI(); // My name is Schlafmuetze and I'm not present
        
    System.out.println(Streber.whoAmI());
    System.out.println(Schlafmuetze.whoAmI());

    // Test setter and getter

    boolean test1;
    boolean test2;

    test1 = Streber.getPresent();
    test2 = Schlafmuetze.getPresent();

    Streber.setPresent(test2);
    Schlafmuetze.setPresent(test1);


    System.out.println(Streber.whoAmI());
    System.out.println(Schlafmuetze.whoAmI());

    }
}