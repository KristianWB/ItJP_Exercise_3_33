import java.util.Scanner;

public class CompareCost {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Enter the weight and price of two homogeneous products"
        );
        System.out.print(
                "Item 1, weight: "
        );
        double weight1 = input.nextDouble();
        System.out.print(
                "Item 1, price: "
        );
        double price1 = input.nextDouble();

        System.out.print(
                "Item 2, weight: "
        );
        double weight2 = input.nextDouble();
        System.out.print(
                "Item 2, price: "
        );
        double price2 = input.nextDouble();

        // Calculations
        double item1 = price1 / weight1;
        double item2 = price2 / weight2;

        if (item1 < item2)
            System.out.print(
                    "Product one is cheaper then product 2"
            );
        else if (item1 == item2)
            System.out.print(
                    "The products have the same price"
            );
        else
            System.out.print(
                    "Product two is cheaper than product one"
            );
    }
}
