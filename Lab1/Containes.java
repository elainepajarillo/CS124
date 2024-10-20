public class Containers{
    // Private field to hold the item
    private int laman;

    // Method to set the value of laman 
    public void setItem(int b) {
        laman = b;
    }

    // Method to get the value of laman
    public int readItem() {
        return laman;
    }

    // Method to print the value of laman
    public void printItem() {
        System.out.println("The item in the container is " + laman);
    }

    public static void main(String[] args) {
        // Create instances of Container
        Containers a = new Containers();
        Containers b = new Containers();

        // Set item in container a
        a.setItem(10);
        a.printItem();

         // Set item in container b to be the value of container a plus 10
         b.setItem(a.readItem() + 10);
         b.printItem();
     }
 }
