import java.util.*;
import java.io.*;

public class Cafe
{
   String category[] = {"Tea", "Espresso", "Americano", "Latte", "Cappuccino", "Hot chocolate", 
                        "Milkshakes", "Cakes", "Ice Cream"};
   // {item, price, description}
   String items[][] = { 
   {"Tea", "2.90", "Dried crushed tea leaves infused in boiling water"},
   {"English Tea", "8.10", "Tea with milk"},
   {"Iced Tea", "13.10", "Tea with ice"},
   {"Chocolate Tea", "12.30", "Tea with chocolate syrup"},
   {"Cream Tea", "15.80", "Tea with whipped cream"},
   {"Invigorating Tea", "38.00", "Tea with ice, lemon and mint"},
   {"Vanilla Tea", "18.30", "Tea with vanilla syrup"},
   {"Tea with Honey and Lemon", "19.10", "Tea with lemon and honey"},
   {"Sunrise Tea", "17.30", "Tea with ice, lemon, mint and caramel syrup"},
   {"Matcha Tea", "13.50", "Type of green tea made by whisking powdered young tea leaves with hot water."},
   {"Matcha Frappé", "15.20", "Matcha tea with ice, whipped cream and vanilla syrup"},
   {"Blue Tea", "14.30", "Butterfly pea flower tea"},
   {"Blue Dream Lemonade", "16.80", "Blue tea with ice, lemon, honey and soda"},
   {"Green Tea", "4.60", "Tea made from unfermented leaves and slightly bitter in flavour,"},
   {"Black Tea", "7.30", "Tea served without milk, that is fully fermented before drying"},
            
   {"Espresso", "4.40", "Strong black coffee made by forcing steam through ground coffee beans"},
   {"Double Espresso", "8.90", "Two shots of espresso"},
   {"Espresso Macchiato", "8.00", "Espresso with milk"},
   {"White Café Glacé", "13.70", "Espresso with vanilla ice cream and milk"},
   {"Mocha", "14.80", "Espresso with milk and chocolate syrup"},
   {"Iced Mocha", "23.30", "Espresso with milk, chocolate syrup and ice"},
   {"Chocolate Mocha", "25.60", "Espresso with milk, chocolate syrup and chocolate shavings"},
   {"Frappe", "21.30", "Espresso with ice and whipped cream"},
   {"Chocolate Frappe", "38.80", "Espresso with ice, chocolate syrup, whipped cream and chocolate shavings"},
   {"Caramel Frappe", "35.00", "Espresso with ice, chocolate syrup, whipped cream and caramel syrup"},
   {"Vanilla Frappe", "35.30", "Espresso with ice, chocolate syrup, whipped cream and vanilla syrup"},
   {"Paradise Glacé", "34.90", "Espresso with chocolate syrup, whipped cream, chocolate shavings and hazelnuts"},
   {"Turkish Coffee", "25.40", "Coffee prepared using very finely ground coffee beans without filtering"},
   {"Turkish Coffee with Whipped Cream and Chocolate", "29.30", "Turkish coffee with whipped cream and chocolate shavings"},
        
   {"Americano", "5.10", "Espresso diluted with hot water"},
   {"Americano with Milk", "9.40", "Americano with milk"},
   {"Americano with Cream", "19.20", "Americano with cinnamon and whipped cream"},
   {"Americano with Lemon", "14.90", "Americano with lemon"},
   {"Chocolate Americano", "27.60", "Americano with cinnamon, chocolate syrup and chocolate shavings"},
   {"Bavarian Coffee", "29.90", "Americano with chocolate syrup, lemon and chocolate shavings"},
   {"Sweet Americano", "41.80", "Americano with chocolate syrup, whipped cream, caramel syrup and vanilla syrup"},
   {"Mint Americano", "31.50", "Americano with milk, mint and vanilla syrup"},
   {"Honey Americano", "18.40", "Americano with chocolate syrup and honey"},
   {"Marshmallow Americano", "26.30", "Americano with caramel syrup and marshmallows"},
            
   {"Latte", "6.70", "Espresso blended with hot steamed milk, milkier than a cappuccino"},
   {"Ice Cream Latte", "23.10", "Latte with vanilla ice cream and whipped cream"},
   {"Summer Latte", "40.90", "Latte with ice, chocolate syrup and whipped cream"},
   {"Caramel Latte", "25.50", "Latte with ice, chocolate syrup and whipped cream"},
   {"Lemon and Mint Latte", "37.60", "Latte with lemon, chocolate shavings and mint"},
   {"Iced Latte", "28.80", "Latte with milk, ice, chocolate syrup and vanilla syrup"},
   {"Honey Bee Latte", "39.00", "Latte with vanilla syrup, hazelnuts and honey"},
   {"Christmas Latte", "28.80", "Latte with honey and marshmallows"},
   {"Sweet Tales Latte", "39.40", "Latte with ice, caramel syrup, vanilla syrup and coconut flakes"},
   {"Nordic Latte", "43.60", "Latte with lemon, strawberry ice cream, mint and berries"},
          
   {"Cappuccino", "9.00", "Espresso with milk, frothed up with pressurized steam, with distinctive layers"},
   {"Spiced Cappuccino", "14.00", "Cappuccino with cinnamon"},
   {"Chocolate Cappuccino", "27.10", "Cappuccino with chocolate syrup and chocolate shavings"},
   {"Vanilla Cappuccino", "31.90", "Cappuccino with cinnamon, chocolate shavings and vanilla syrup"},
   {"Nut Cappuccino", "37.10", "Cappuccino with cinnamon, whipped cream, chocolate shavings and hazelnuts"},
   {"Honey Cappuccino", "26.30", "Cappuccino with cinnamon, whipped cream and honey"},
   {"Super Marshmallow Cappuccino", "40.70", "Cappuccino with chocolate shavings, caramel syrup and marshmallows"},
   {"Berry Smoothie Cappuccino", "51.30", "Cappuccino with grape juice, strawberry ice cream, mint and berries"},
           
   {"Hot Chocolate", "13.30", "Milk with chocolate powder"},
   {"Spiced Hot Chocolate", "27.80", "Hot chocolate with cinnamon and caramel syrup}"},
   {"White Hot Chocolate", "45.40", "Hot chocolate with milk, whipped cream and vanilla syrup"},
   {"Italian-Styled Hot Chocolate", "50.30", "Hot chocolate with chocolate shavings, mint, vanilla syrup and honey"},
   {"Aroma Hot Chocolate", "45.00", "Hot chocolate with chocolate shavings, vanilla syrup and hazelnuts"},
   {"Winter Evening Hot Chocolate", "40.40", "Hot chocolate with whipped cream, hazelnuts and marshmallows"},
   {"Everest Hot Chocolate", "47.20", "Hot chocolate with whipped cream, vanilla syrup, chocolate ice cream and coconut flakes"},
   {"Chocolate Ocean", "54.60", "Hot chocolate with milk, whipped cream and caramel syrup"},
   {"Sweet Dreams Hot Chocolate", "61.00", "Hot chocolate with marshmallows, coconut flakes and vanilla syrup"},
          
   {"Vanilla Milkshake", "61.60", "Milkshake made with vanilla ice cream"},
   {"Strawberry Milkshake", "68.30", "Milkshake made with strawberry ice cream"},
   {"Strawberry Milkshake with Whipped Cream", "70.40", "Milkshake made with whipped cream, nuts and strawberry ice cream"},
   {"Mango Milkshake", "70.00", "Milkshake made with mango ice cream"},
   {"Blueberry Milkshake", "70.00", "Milkshake made with vanilla ice cream, blueberry puree and milk"},
   {"Chocolate Milkshake", "98.50", "Milkshake made with vanilla ice cream, chocolate syrup and chocolate shavings"},
   {"Chocolate Nut Milkshake", "99.20", "Milkshake made with vanilla ice cream, chocolate syrup, chocolate shavings and hazelnuts"},
   {"Cold Coffee Milkshake", "82.30", "Milkshake made with coffee which is creamy and caffeinated"},
   {"Rose milk", "95.00", "Milk with rose essence"},
   {"Kesar Badam Milkshake", "78.70", "Milk with saffron and almond"},
          
   {"Plain cake", "25.70", "Plain vanilla sponge cake"},
   {"Cupcake", "30.20", "With vanilla icing and rainbow sprinkles"},
   {"Cheesecake", "36.40", "A slice of cheesecake with blueberry glaze"},
   {"Tartlet", "42.40", "Mini tart with strawberry and blackberry"},
   {"Croissant", "33.70", "Buttery and flaky pastry"},
   {"Raspberry Cake", "37.80", "A slice of layered vanilla cake with raspberry filling and white chocolate"},
   {"Muffin", "35.20", "Quick bread muffin with chocolate chips"},
   {"Tiramisu", "46.40", "Coffee and cocoa flavoured layered Italian dessert with hazelnuts"},
   {"Chocolate Cake", "42.70", "A slice of sponge cake with chocolate icing, garnished with cherries"},
   {"Donut", "60.30", "A box of 3 cream-filled donuts: vanilla, strawberry and chocolate icing"},
   {"Crème caramel", "53.60", "Caramel custard with a layer of clear caramel sauce"},
   {"Waffles", "57.40", "With whipped cream and strawberry"},
   };
           
   String iceCreamFlavours[] = {"Vanilla", "Strawberry", "Chocolate", "Butterscotch", "Mango", "Pistachio", 
   "Almond", "Fig", "Blackcurrant", "Tender coconut", "Cookie and cream", "Matcha", "Caramel", "Blueberry", "Pineapple"};
            
   String iceCreamToppings[] = {"None", "Rainbow sprinkles", "Chopped nuts", "Dry fruits", "Chocolate Chips", "White Chocolate Chips", "Tutti frutti",
   "Cherries", "Strawberries", "Blueberries", "Raspberries", "Blackberries", "Mango", "Pineapple"};
            
   String iceCreamSauce[] = {"None", "Chocolate syrup", "Strawberry sauce", "Caramel sauce", "Butterscotch sauce", "Honey"};
   
   String toppingsAndSauce[] = new String[3]; //Stores the user's choice
   
   // {item, price, quantity, total = price x quantity, description} 
   String choice[][] = new String[20][5]; //Order of the user is stored here
            
   String orderOption[] = {"Dine in", "Take away", "Delivery"};
            
   String timeSlot[] = {"8 a.m. - 9 a.m.", "9 a.m. - 10 a.m.", "10 a.m. - 11 a.m.", "11 a.m. - 12 p.m.",
   "3 p.m. - 4 p.m.", "4 p.m. - 5 p.m.", "5 p.m. - 6 p.m.", "6 p.m. - 7 p.m.", "7 p.m. - 8 p.m." };
   
   int totalBill = 0; //total amount of all ordered items
   static int n; //the category number
   int x = 0;
   int a, b; //stores array index of items[]
   int totalPrice; //Stores total amount for each item (item x quantity)
   String name;
   String mobile;
   String address;
   int c; //Stores value which determines the running of the for loop in the main method
   int seats, t;
   int tax;
    
   public void details() //Accepts user details
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following details: \n");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Phone number: ");
        mobile = sc.nextLine();
        System.out.print("Delivery Address: ");
        address = sc.nextLine();
   }
   public void line() //This method prints a line. It is used in the main method to add clarity in the output screen
   {
        for (int i = 0; i <= 130; i++)
            System.out.print("_"); 
        System.out.println("\n");
   }
   public void Category() //This method displays all the categories and accepts user's input
   {
        Scanner sc = new Scanner(System.in);
        Cafe obj = new Cafe();
        obj.line();
        
        System.out.println("Select a number based on the category: \n");
        System.out.println("Drinks:");
        for (int i = 0; i <= 5; i++)
            System.out.println( (i+1) + ". " + category[i]);
        System.out.println("Desserts:");
        for (int i = 6; i <= 8; i++)
            System.out.println( (i+1) + ". " + category[i]);
        System.out.println("(Enter 0 to view bill)"); //When asked for the category, if 0 is pressed, the bill at that point is displayed
        
        obj.line();
        System.out.print("Category: ");
        n = sc.nextInt(); //Accepts user's choice of category
        System.out.println();
   }
    
   public void items(int a, int b) //This method displays all items in the selected category in a specific format according to the range a and b
   {
        System.out.println(category[n-1] + ": \n");
        for (int i = a, j=1; i <= b; i++, j++) //This loop prints all items in a category
        {
            System.out.print(j + ". " + items[i][0] + " ");
                
            int l = items[i][0].length();
            if(j <= 9)   
                for (int k = 0; k <= 80-l; k++)
                    System.out.print(".");
            else
                for (int k = 1; k <= 80-l; k++)
                    System.out.print(".");
            
            System.out.println(" " + items[i][1] + "\n   " + "(" + items[i][2] + ")\n");
        }
   }
   
   public void displayItems() //This method specifies a and b for each category and items(int a, int b) is called
   {
        Cafe obj = new Cafe();
        switch(n)
            {
            case 1: a = 0; b = 14; //These numbers are used as array indices for items[] for each category
            break;
            case 2: a = 15; b = 28;
            break;
            case 3: a = 29; b = 38;
            break;
            case 4: a = 39; b = 48;
            break;
            case 5: a = 49; b = 56;
            break;
            case 6: a = 57; b = 65;
            break;
            case 7: a = 66; b = 75;
            break;
            case 8: a = 76; b = 87;
            break;
            }
        obj.items(a,b); 
   }
     
   public void yourOrders() //This method asks for the item in a category and the quantity, stores them in an array and calculates the total price untill now
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number based on your choice: ");
        int m = sc.nextInt();
        System.out.print("Enter quantity: ");
        int q = sc.nextInt();
        
        choice[x][0] = items[m+a-1][0]; //Stores item name
        
        choice[x][1] = items[m+a-1][1]; //Item price
        
        String Q = Integer.toString(q);
        choice[x][2] = Q; //Item quantity
        
        totalPrice = (int)Math.round( Double.parseDouble(choice[x][1]) * (double)q );
        choice[x][3] =  Integer.toString(totalPrice); //price x quantity
        
        choice[x][4] = items[m+a-1][2]; //Item description
        x++;
        
        totalBill += totalPrice; //Total price of each item is added to totalBill
   }
   public void iceCream() //This method accepts and stores ice cream flavour, number of scoops, toppings and sauce if needed. It stores all the information in a sentence form in choice[].
   {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(category[n-1] + ": \n");
        System.out.println("Select a flavour (each for Rs. 50.00):");
        for(int i = 0; i < 15; i++)
            System.out.println((i+1) + ". " + iceCreamFlavours[i]);
        
        System.out.print("\nFlavour: ");
        int f = sc.nextInt();
        choice[x][0] = iceCreamFlavours[f-1] + " ice cream" ;
        
        System.out.print("Enter number of scoops(1 to 3): ");
        int s1 = sc.nextInt();
        String Q = Integer.toString(s1);
        choice[x][2] = Q;
        String scoop = "";;
        if(s1 >= 2)
        scoop = "scoops";
        else if(s1 == 1)
        scoop = "scoop";
        
        System.out.println("\nDo you want toppings and sauce?");
        System.out.println("1. Yes (or) 2. No");
        System.out.print("Enter your choice: ");
        int c = sc.nextInt();
        System.out.println();
        int t = 0;
        int price = 0;
        
        switch(c)
        {
            case 1:
            System.out.println("Toppings (select any 2 each for Rs. 20 - 15 grams): ");
            for(int i = 0; i <= 13; i++)
                System.out.println((i+1) + ". " + iceCreamToppings[i]);
            System.out.print("\nTopping 1: ");
            int t1 = sc.nextInt();
            if(t1 != 1)
                {
                    toppingsAndSauce[t] = iceCreamToppings[t1-1];
                    t++;
                    price += 20;
                }
            System.out.print("Topping 2: ");
            int t2 = sc.nextInt();
            System.out.println();
            if(t2 != 1)
               {
                   toppingsAndSauce[t] = iceCreamToppings[t2-1];
                   t++;
                   price += 20;
               }
            
            System.out.println("Sauce (select any 1 each for Rs. 25 - 20 grams): ");
            for(int i = 0; i <= 5; i++)
                System.out.println((i+1) + ". " + iceCreamSauce[i]);
            System.out.print("\nSauce: ");
            int s = sc.nextInt();
            System.out.println();
            if(s != 1)
               {
                   toppingsAndSauce[t] = iceCreamSauce[s-1];
                   t++;
                   price += 25;
               }
            choice[x][1] = Integer.toString(50 + price) + ".00 ";
            
            switch(t)
            {
                case 1:
                choice[x][4] = s1 + " " + scoop + " with " + toppingsAndSauce[0]; 
                break;
                case 2:
                choice[x][4] = s1 + " " + scoop + " with " + toppingsAndSauce[0] + " and " + toppingsAndSauce[1];
                break;
                case 3:
                choice[x][4] = s1 + " " + scoop + " with " + toppingsAndSauce[0] + ", " + toppingsAndSauce[1] + " and " + toppingsAndSauce[2];
                break;
                default:
                choice[x][4] = s1 + " " + scoop ;
            }
            break;
            
            case 2:
            choice[x][1] = "50.00";
            choice[x][4] = s1 + " " + scoop ;
            break;
        }
        totalPrice = (int)Double.parseDouble(choice[x][1]) * s1 ;
        String sTotalPrice = Integer.toString(totalPrice);
        choice[x][3] =  sTotalPrice;
        x++;
        totalBill = totalBill + totalPrice;
   }
   public void  display() //It displays the entire bill
   {
        System.out.println("Bill: \n");
        System.out.print("No. Item");
        for (int k = 0; k <= 73; k++)
            System.out.print(" ");
        System.out.println(" Price          Quantity         Total price \n");
            
        for (int i = 0, j = 1; i < x; i++, j++)
        {  
            System.out.print(j + ". " + choice[i][0] + " ");
            
            int l = 3 + choice[i][0].length();
            if(j <= 9)
                for (int k = 0; k <= 80-l; k++)
                    System.out.print(".");
            else
                for (int k = 1; k <= 80-l; k++)
                    System.out.print(".");
            
            System.out.print(" " + choice[i][1]);
            
            int lc = choice[i][1].length();
            for(int m = 0; m <= 14-lc; m++)
                System.out.print(" ");
            System.out.print(choice[i][2]);
              
            int lc2 = choice[i][2].length();
            for(int m = 0; m <= 16-lc2; m++)
                System.out.print(" ");
                
            System.out.println(choice[i][3] + "\n   (" + choice[i][4] + ")\n");
        }
            
        System.out.println("Sub total: Rs. " + totalBill);
        tax = (int)Math.round((double)totalBill * (10.0/100.0));
        System.out.println("Tax (10%): Rs. " + tax);
        System.out.println("Grand total: Rs. " + (totalBill + tax));
   }     
   public void orderOption() //This method asks for delivery or number of seats and time slot if it is dine in.
   {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your choice:");
        for (int i = 0; i <= 2; i++)
            System.out.println((i+1) + ". " + orderOption[i]);
        
        System.out.print("Your choice: ");
        c = sc.nextInt();
        
        if((c-1) == 0)
        {
        System.out.print("\nEnter number of seats to be booked: ");
        seats = sc.nextInt();
        
        System.out.println("\nChoose a time slot (from 8.00 a.m. - 8.00 p.m.): ");
        for (int i = 0; i <= 8; i++)
        System.out.println((i+1) + ". " + timeSlot[i]);
        
        System.out.print("Your choice: ");
        t = sc.nextInt();
        }
   } 
   public void file() //This method stores all the information entered by the user in a file
   {
        String fileName = ("CafeOrder.txt");
                
        try
        {
            FileWriter fw = new FileWriter (fileName);  //true
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter outFile = new PrintWriter (bw);
                    
            outFile.println("Final Bill: \n");
            outFile.println("Name: " + name);
            outFile.println("Moblie number: " + mobile);
            outFile.println("Delivery Address: " + address + "\n");
                
            outFile.println("Bill: \n");
            outFile.print("No. Item");
            for (int k = 0; k <= 73; k++)
                outFile.print(" ");
            outFile.println(" Price          Quantity         Total price \n");
                    
            for (int i = 0, j = 1; i < x; i++, j++)
            {  
                outFile.print(j + ". " + choice[i][0] + " ");
                    
                int l = 3 + choice[i][0].length();
                if(j <= 9)
                    for (int k = 0; k <= 80-l; k++)
                        outFile.print(".");
                else
                    for (int k = 1; k <= 80-l; k++)
                        outFile.print(".");
                    
                outFile.print(" " + choice[i][1]);
                    
                int lc = choice[i][1].length();
                for(int m = 0; m <= 14-lc; m++)
                     outFile.print(" ");
                outFile.print(choice[i][2]);
                    
                int lc2 = choice[i][2].length();
                for(int m = 0; m <= 16-lc2; m++)
                    outFile.print(" ");
                        
                outFile.println(choice[i][3] + "\n   (" + choice[i][4] + ")\n");
            }
                    
            outFile.println("Sub total: Rs. " + totalBill);
            tax = (int)((double)totalBill * (10.0/100.0));
            outFile.println("Tax (10%): Rs. " + tax);
            outFile.println("Grand total: Rs. " + (totalBill + tax) + "\n");
                
            outFile.println("Order option: " + orderOption[c-1]);
            if((c-1) == 0)
            {
                outFile.println("Number of seats booked: " + seats);
                outFile.println("Time slot: " + timeSlot[t-1]);
            }
            outFile.close();
                    
            System.out.println("Your order has been recorded.\n");
        }
        catch(IOException e)
        {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }       
        try //This part prints everything that is stored in the file
        {
            FileReader file = new FileReader(fileName);
            BufferedReader fileInput = new BufferedReader(file);
            String text;
                        
            while( (text = fileInput.readLine()) != null)
            {
                System.out.println(text);
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occured.");
        }
   } 
   public static void main(String args[])
     {
      Scanner sc = new Scanner (System.in);
      Cafe cafe = new Cafe();
      System.out.println("\uD83C\uDF52 CHERY CAFE " + '\u2615');
      cafe.line();
      System.out.println("Welcome to my Café! \n");
       
      cafe.details();
      int c = 1;
       do //This process is repeated until the user does not want to continue ordering
       {
           cafe.Category();
           if ((n>=1) && (n<=8))
           {
               cafe.displayItems();
               cafe.yourOrders();
           }
           else if(n == 9)
               cafe.iceCream();
           else if(n == 0)
           {
               cafe.display();
               cafe.line();
               
               System.out.println("Do you want to continue your order?");
               System.out.println("1. Yes (or) 2. No");
               System.out.print("Enter your choice: ");
               c = sc.nextInt();
               
               System.out.println();
               if(c == 2)
                  break;
           }
      } while(c == 1);
      cafe.line();
      cafe.orderOption();
      cafe.line();
      cafe.file();
      cafe.line();
      System.out.println("Thank you for ordering!");
   }
}