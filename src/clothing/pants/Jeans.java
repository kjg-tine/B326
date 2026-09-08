package clothing.pants;

// ============================================================
// TEST OPTION D
//import Shirt;

// TEST OPTION E
import clothing.Shirt;

// TEST OPTION C
//import static clothing.Shirt.getColor;

public class Jeans {
    public void matchShirt() {
        // Line n2:
        String color = Shirt.getColor(); // Use getColor() if testing Option C

        if (color.equals("Green")) {
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}