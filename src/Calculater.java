import java.util.Scanner;
public class Calculater {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        double n1,n2;
        System.out.println("Enter the first number: ");
        n1= input.nextDouble();
        System.out.println("Enter the second number: ");
        n2= input.nextDouble();

        System.out.println("Please choose arithmetic operation +:1 -:2 *:3 /:4 ");
        int operation= input.nextInt();
        switch (operation)
        {
            case 1:
                System.out.println(n1+n2);

            case 2:
                System.out.println(n1-n2);

            case 3:
                System.out.println(n1*n2);
            case 4:
                System.out.println(n1/n2);
            case 5:
                System.out.println("Wrong choosing. Please choose 1 to 4");
        }


    }
}
