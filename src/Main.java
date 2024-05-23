//Product Management app

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductService service = new ProductService();

        //add the products
        service.addProduct(new Product("Dell Inspiron", "Laptop", "Silver Desk", 2024));
        service.addProduct(new Product("HP Pavilion", "Laptop", "White Table", 2023));
        service.addProduct(new Product("Lenovo ThinkPad", "Laptop", "Wooden Desk", 2023));
        service.addProduct(new Product("Acer Swift", "Laptop", "Glass Table", 2024));
        service.addProduct(new Product("Apple MacBook Air", "Laptop", "Metal Desk", 2022));
        service.addProduct(new Product("Microsoft Surface", "Laptop", "Marble Table", 2019));
        service.addProduct(new Product("Samsung Galaxy Book", "Laptop", "Plastic Desk", 2024));
        service.addProduct(new Product("Google Pixelbook", "Laptop", "Bamboo Table", 2020));
        service.addProduct(new Product("Huawei MateBook", "Laptop", "Granite Desk", 2024));
        service.addProduct(new Product("Sony VAIO", "Laptop", "Acrylic Table", 2022));

        List<Product> Products = service.getAllProducts();
        //printing the products

        // for (int i = 0; i < Products.size(); i++) {
        //     System.out.println((i + 1) + " : " + Products.get(i) + "\n");
        // }

        //extracting a specific product
        Scanner sx = new Scanner(System.in);
        int choice;
        String findProduct;
        int findProductOfWarranty;
        Product obtained;

        do {
            System.out.println("Enter the option you want to search the product based on : \n1. Name,\n2. Type,\n3. Place where it is kept,\n4. Warranty Year\n5. A particular text");
            choice = sx.nextInt();
            sx.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter name of the product to search : ");
                    findProduct = sx.nextLine();
                    obtained = service.getProductByName(findProduct);

                    System.out.println("The product to search for is : "+findProduct);
                    if (obtained != null) {
                        System.out.println(obtained);
                    } else {
                        System.out.println("Sorry, the product you are searching for is not present.");
                    }
                    break;

                case 2:
                    System.out.println("Enter type of the product to search : ");
                    findProduct = sx.nextLine();
                    
                    obtained = service.getProductByType(findProduct);

                    if (obtained != null) {
                        System.out.println(obtained);
                    } else {
                        System.out.println("Sorry, the product you are searching for is not present.");
                    }
                    break;


                case 3:
                    System.out.println("Enter place of the product to search : ");
                    findProduct = sx.nextLine();
                    obtained = service.getProductByPlace(findProduct);

                    if (obtained != null) {
                        System.out.println(obtained);
                    } else {
                        System.out.println("Sorry, the product you are searching for is not present.");
                    }
                    break;


                case 4:
                    System.out.println("Enter warranty year of the product to search : ");
                    findProductOfWarranty = sx.nextInt();
                    obtained = service.getProductByWarranty(findProductOfWarranty);

                    if (obtained != null) {
                        System.out.println(obtained);
                    } else {
                        System.out.println("Sorry, the product you are searching for is not present.");
                    }
                    break;
                
                case 5:
                    System.out.println("Enter text to search for the product containing it : ");
                    findProduct = sx.nextLine();
                    List<Product> desired = new ArrayList<>();

                    desired = service.getProductByText(findProduct);
                    
                    for(Product p:desired)
                    {
                        System.out.println(p);
                    }
                    break;

                default:
                    System.out.println("You entered the wrong choice. :(");
                    continue;
            }
            break;
        } while (true);


        //extracting all the products whose warranty period is over
        List<Product> expired = new ArrayList<>();

        for(Product p:Products)
        {
            if(service.checkIfExpired(p))
                expired.add(p);
        }

        System.out.println("\nList of all the expired products : \n");

        for(Product e:expired)
            System.out.println(e);

    }
}
