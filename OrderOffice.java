import java.util.Scanner;

public class OrderOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order od = new Order();

        while (true) {
            System.out.println("\t\t\t\t **********PIZZA POINT**********");
            System.out.println();
            System.out.println("\t\t *Choose pizza Which Kinds of  PIZZAS Your Want*");
            System.out.println();
            System.out.println("\t 1. Small Pizza");
            System.out.println("\t 2. Medium Pizza");
            System.out.println("\t 3. Large Pizza");
            System.out.println("\t 4. Cold Drink");
            System.out.println("\t 5. Generate Bill");
            System.out.println("\t 6. Exit");

            System.out.println("Enter the Number according to Above Statements:");
            int choice = scanner.nextInt();
            System.out.println("========================");

            switch (choice) {
                case 1:
                    System.out.println("Please enter the Quantity of Small Pizza:");
                    int smallQuantity = scanner.nextInt();
                    od.setTotalSmallQuantity(smallQuantity);
                    od.order(new SmallPizza());
                    break;
                case 2:
                    System.out.println("Please enter the Quantity of Medium Pizza:");
                    int mediumQuantity = scanner.nextInt();
                    od.setTotalMediumQuantity(mediumQuantity);
                    od.order(new MediumPizza());
                    break;
                case 3:
                    System.out.println("Please enter the Quantity of Large Pizza:");
                    int largeQuantity = scanner.nextInt();
                    od.setTotalLargeQuantity(largeQuantity);
                    od.order(new LargePizza());
                    break;
                case 4:
                    System.out.println("Please enter the Quantity of Cold Drink:");
                    int coldDrinkQuantity = scanner.nextInt();
                    od.setTotalColdDrinkQuantity(coldDrinkQuantity);
                    od.order(new ColdDrink());
                    break;
                case 5:
                    System.out.println("Total Bill:" + od.calculateTotalAmount());
                    break;
                case 6:
                    System.out.println("\t\t**Thank You for Purchasing!!");
                    System.out.println();
                    return;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Total quantity of Small pizzas ordered: " + od.getTotalSmallQuantity());
            System.out.println("Total quantity of Medium pizzas ordered: " + od.getTotalMediumQuantity());
            System.out.println("Total quantity of Large pizzas ordered: " + od.getTotalLargeQuantity());
            System.out.println("Total quantity of Cold Drinks ordered: " + od.getTotalColdDrinkQuantity());
        }
    }
}


/*
import java.util.Scanner;

public class OrderOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
while(true)
		{
        System.out.println("Choose pizza size: ");

        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        int choice = scanner.nextInt();
        Order od = new Order();

        switch (choice) {
            case 1:
                od.order(new SmallPizza());
                break;
			case 2:
                od.order(new MediumPizza());
                break;
            case 3:
                od.order(new LargePizza());
                break;
            default:
                System.out.println("Invalid choice");
		}
        }
    }
}
*/

/*
class OrderOffice
{
	public static void main(String[]args)
	{
		Order od = new Order();
       
        
         


		od.order(new MediumPizza());
        od.order(new LargePizza());
	}
	
}

*/