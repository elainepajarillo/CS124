//Elaine T. Pajarillo
//CMSC 124 DP

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("***************************************************************************************");
        System.out.println("Please choose the Input Type that you want to try! Type only the letter of your choice.");
        System.out.println("A. Integer");
        System.out.println("B. Double");
        System.out.println("C. String");
        System.out.println("");
    
        System.out.print("Enter your choice: ");
        String input = sc.nextLine().toUpperCase();  
        System.out.println("");


        System.out.println("You have chosen: " + input);
        System.out.println("");

        if(input.equals("A")){    
            System.out.println("Enter three integers:");  

            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int max = Math.max(Math.max(a, b), c);

                System.out.println("");
                System.out.println("The maximum integer is: " + max);
            } catch (Exception e) {
                System.out.println("Input is not an integer!");
            }
        } 
        else if(input.equals("B")){
            System.out.println("Enter three doubles:"); 

            try {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double max = Math.max(Math.max(a, b), c);
                
                System.out.println("");
                System.out.println("The maximum double is: " + max);
            } catch (Exception e) {
                System.out.println("Input is not a double!");
            }
        } 
        else if (input.equals("C")){
            System.out.println("Enter three strings:");  

            try {
                String a = sc.nextLine();
                String b = sc.nextLine();
                String c = sc.nextLine();

                String max = a;

                // >0 - larger; =0 - same value; <0 - smaller
                if (b.compareTo(max) > 0){
                    max = b;
                }if (c.compareTo(max) > 0){
                    max = c;
                }              

                System.out.println("");
                System.out.println("The maximum string is: " + max);
                
            } catch (Exception e) {
                System.out.println("Input is not a string!");
            }
        }
        else{
            System.out.println("Invalid Input! Please choose between A, B, or C.");
        }

        
        sc.close();
        System.out.println("");
        System.out.println("************************************  Program end  ************************************");
    }
}
