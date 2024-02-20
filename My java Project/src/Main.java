//import all classes from interface package
//import all classes from classes package
//import all classes from fileio package
import classes.*;
import interfaces.*;
import Fileio.*;
import java.util.*;

import Fileio.FileReadWriteDemo;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
    	//Create an object for TourismComp class
    	TourismComp t1 = new TourismComp ("JavaC Tour LTD", "Gulshan,Dhaka", "+88016767676767");
        //Create an object for Airline class for 1st tourpackage
    	Airline a1 = new Airline ("Bangladesh Airlines", 6287);
        //Create an object for RegularPack class using Hotel class object referance for 1st tourpackage
    	Hotel h1 = new RegularPack ("Turkey", "Hotel amaira", 131);
        //Create an object for Customer class
    	Customer c1 = new Customer();
        //Create an object for TourPack class for 1st tourpackage
    	TourPack p1 = new TourPack (01, "Starter pack", 15000, a1, c1, t1, h1);

        //Create an object for Airline class for 2nd tourpackage
    	Airline a2 = new Airline ("Bangladesh Airlines", 5587);
        //Create an object for AveragePack class using Hotel class object referance for 2nd tourpackage
    	Hotel h2 = new AveragePack ("Australia", "Hotel palace", 231);
        //Create an object for TourPack class for 2nd tourpackage
    	TourPack p2 = new TourPack (02, "Gold Pack", 25000, a2, c1, t1, h2) ;

        
        //Create an object for Airline class for 3rd tourpackage
    	Airline a3 = new Airline ("Bangladesh Airlines", 7787);
        //Create an object for SwishPack class using Hotel class object referance for 3rd tourpackage
    	Hotel h3 = new SwishPack ("Switzerland", "Hotel Royal", 331);
        //Create an object for TourPack class for 3rd tourpackage
    	TourPack p3 = new TourPack (03, "Premium Pack", 35000, a3, c1, t1, h3) ; 


       System.out.println("\n");
       System.out.println("              ==========================              ");
       System.out.println("              Welcome to "+t1.getName());// calling getName method through t1 object
       System.out.println("              ==========================              ");

       System.out.println("              Our address: "+t1.getAddress());//calling getAddress method through t1 object
       System.out.println("              Our Phone Number: "+t1.getPhoneNo());//calling getPhoneNo method through t1 object
    	 System.out.println("\n**Grab our best tour deal Now . There are 4 tour package available at the time** "    );
    	 System.out.println("              1. Starter Pack : Turkey (2 days 2 night) ");
    	 System.out.println("              2. Gold Pack : Australia (3 days 2 night) ");
    	 System.out.println("              3. Premium Pack : Switzerland (3 days 3 night) ");
         
         //create a scanner object n1 to take interger value
    	 Scanner n1 = new Scanner(System.in);
    	 System.out.print("\nPress 1/2/3 to visit your desire package :");
    	 int ch= n1.nextInt(); // Input Integer value in ch variable  

         //create switch , case for giving option to user
       switch(ch)  
         {  
        case 1:
            System.out.println("          =======================             ");   
            System.out.println("            ---Package Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("     Pack Number : "+p1.getid());//calling getid method through p1 object
            System.out.println("     Pack Name : "+p1.getName());//calling getName method through p1 object
            System.out.println("     Pack Price : "+p1.getAmmount());//calling getAmmount method through p1 object
            System.out.println("     ----------------------------------------------");
            System.out.println();
            System.out.println("          =======================             ");
            System.out.println("            ---Airline Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("     Airline Name under this pack : "+p1.getAirline().getName());//calling getName method through getAirline & p1 object
            System.out.println("     Seat Number of the Airline under this pack : "+p1.getAirline().getSeatNum());//calling getSeatNum method getAirline & through p1 object
            System.out.println("     ----------------------------------------------");
            System.out.println();
            RegularPack r1 = new RegularPack ("Turkey", "Hotel amaira", 131);// Create an RegularPack object for 1st tourpackage
            System.out.println("          =======================             ");
            System.out.println("              ---Hotel Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("     Hotel Name Under this package : "+r1.getHotelName());//calling getHotelName method through r1 object
            System.out.println("     Hotel Address : "+r1.getHotelAddress());//calling getHotelAddress method through r1 object
            System.out.println("     Hotel Room Number : "+r1.getRoomNo());//calling getRoomNo method through r1 object
            System.out.println("              ---Room Features---         ");
            r1.service();//calling service method through r1 object
            System.out.println("     ----------------------------------------------");
            System.out.println(); 
            break;  
        case 2: 

            System.out.println("          =======================             ");   
            System.out.println("            ---Package Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("              Pack Number : "+p2.getid());//calling getid method through p2 object
            System.out.println("              Pack Name : "+p2.getName());//calling getName method through p2 object
            System.out.println("              Pack Price : "+p2.getAmmount());//calling getAmmount method through p2 object
            System.out.println("     ----------------------------------------------");
            System.out.println();
            System.out.println("          =======================             ");
            System.out.println("            ---Airline Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("     Airline Name under this pack : "+p2.getAirline().getName());//calling getName method through getAirline & p2 object 
            System.out.println("     Seat Number of the Airline under this pack : "+p2.getAirline().getSeatNum());//calling getSeatNum method through getAirline & p2 object
            System.out.println("     ----------------------------------------------");
            System.out.println();
            AveragePack av1 = new AveragePack ("Australia", "Hotel palace", 231);// Create an AveragePack object for 2nd tourpackage
            System.out.println("          =======================             ");
            System.out.println("              ---Hotel Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("              Hotel Name Under this package : "+av1.getHotelName());//calling getHotelName method through av1 object
            System.out.println("              Hotel Address : "+av1.getHotelAddress());//calling getHotelAddress method through av1 object
            System.out.println("              Hotel Room Number : "+av1.getRoomNo());//calling getRoomNo method through av1 object
            System.out.println("              ---Room Features---         ");
            av1.service();//calling service method through av1 object 
            System.out.println("     ----------------------------------------------");
            System.out.println();   
            break;  
        case 3:
            System.out.println("          =======================             ");   
            System.out.println("            ---Package Info---         ");
            System.out.println("          =======================             ");
            System.out.println();   
            System.out.println("              Pack Number : "+p3.getid());//calling getid method through p3 object
            System.out.println("              Pack Name : "+p3.getName());//calling getName method through p3 object
            System.out.println("              Pack Price : "+p3.getAmmount());//calling getAmmount method through p3 object
            System.out.println();
            System.out.println("          =======================             ");
            System.out.println("            ---Airline Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("     Airline Name under this pack : "+p3.getAirline().getName());//calling getName method through getAirline & p3 object
            System.out.println("     Seat Number of the Airline under this pack : "+p3.getAirline().getSeatNum());//calling getSeatNum method through getAirline & p3 object
            System.out.println("     ----------------------------------------------");
            System.out.println();
            SwishPack sw1 = new SwishPack ("Switzerland", "Hotel Royal", 331);
            System.out.println("          =======================             ");
            System.out.println("              ---Hotel Info---         ");
            System.out.println("          =======================             ");
            System.out.println();
            System.out.println("     ----------------------------------------------");
            System.out.println("              Hotel Name Under this package : "+sw1.getHotelName());//calling getHotelName method through sw1 object
            System.out.println("              Hotel Address : "+sw1.getHotelAddress());//calling getHotelAddress method through sw1 object
            System.out.println("              Hotel Room Number : "+sw1.getRoomNo());//calling getRoomNo method through sw1 object
            System.out.println("           ---Room Features---         ");
            sw1.service();//calling service method through sw1 object
            System.out.println("     ----------------------------------------------");
            System.out.println();     
            break;  
          default:   
            System.out.println("    --You input the wrong number--");  
      } 



       System.out.println("            ==========================             ");   
       System.out.println("            ---Customer Information---         ");
       System.out.println("            ==========================             ");
       System.out.println();
       Scanner n2 = new Scanner(System.in);//Create an scanner object n2 for string value
       System.out.print("   Enter Your Nid : "); 
       String nid= n1.next(); // Input Integer value in nid variable 
       System.out.print("   Enter Your Name : "); 
       String name= n2.nextLine(); // Input string value in name variable 
       System.out.print("   Enter Your Phone : "); 
       String phone= n2.nextLine(); // Input string value in phone variable 
       
       FileReadWriteDemo frwd = new FileReadWriteDemo(); // create an object for FileReadWriteDemo class

       c1.setNid("nid"); // input value in setNid through c1 object
       c1.setName(name); // input value in setName through c1 object
       c1.setPhone(phone);  // input value in setPhone through c1 object

       frwd.writeInFile(name,nid,phone); // Create a text file through writeInFile method calling to take Customer name,nid,phone
       

            System.out.println("            ==========================             ");   
            System.out.println("            ---Payment  Information---         ");
            System.out.println("            ==========================             ");
            System.out.println();
       

       System.out.println("              There are 3 types of payment option: "  );
       System.out.println("                 1. Card ");
       System.out.println("                 2. Cash ");
       System.out.println("                 3. Mobile Bank ");

       System.out.print("\n   Press your desire Payment option :");
       int chy= n1.nextInt(); // Input Integer value in chy variable 

       //create switch , case for giving option to user
       switch(chy)  
         {  
        case 1:

        
            System.out.print("   Enter Your card name : ");
            String cardName= n2.nextLine(); // Input String value in cardName variable 
            System.out.print("   Enter Your card number : ");
            int cardNum= n1.nextInt(); // Input Integer value in cardNum variable 
            System.out.print("   Enter Your card pin number : ");
            int pinNum1= n1.nextInt(); // Input Integer value in pinNum1 variable 
            System.out.print("   Enter The actual amount(BDT) for this pack otherwise your payment will be cancel :");
            int ammount1 = n1.nextInt();  // Input Integer value in ammount1 variable 
            Card ca = new Card (cardName,cardNum,ammount1,pinNum1); // Create an obeject ca for Card class
            System.out.println();
            System.out.println("            ==========================             ");   
            System.out.println("            ---Provided  Card  info---         ");
            System.out.println("            ==========================             ");
            System.out.println();
            System.out.println("                 Card name : "+ca.getCardName()); //calling getCardName method through ca object
            System.out.println("                 Card number : "+ca.getCardNum()); //calling getCardNum method through ca object
            System.out.println("                 Card pin number : : "+ca.getPinNum()); //calling getPinNum method through ca object
            System.out.println("                 Ammount : "+ca.getAmmount()); //calling getAmmount method through ca object

            break;
              
        case 2:   

        
            System.out.print("   Enter Your receipt number : ");
            int receiptNum= n1.nextInt(); // Input Integer value in receiptNum variable 
            System.out.print("   Enter The actual amount(BDT) for this pack otherwise your payment will be cancel :");
            int ammount2 = n1.nextInt();  // Input Integer value in ammount2 variable 
            Cash cs = new Cash (ammount2,receiptNum); // Create an obeject cs for Cash class
            System.out.println();
            System.out.println("            ==========================             ");   
            System.out.println("            ---Provided  Cash  info---         ");
            System.out.println("            ==========================             ");
            System.out.println();
            System.out.println("                 Receipt number : "+cs.getReceiptNum()); //calling getReceiptNum method through cs object
            System.out.println("                 Ammount : "+cs.getAmmount()); //calling getAmmount method through cs object
            break;  
        case 3:  

         
            System.out.print("   Enter Your Mobile Bank name : ");
            String mbName= n2.nextLine();  // Input String value in mbName variable 
            System.out.print("   Enter Your Phone number : ");
            String phoneNum= n2.nextLine(); // Input String value in phoneNum variable 
            System.out.print("   Enter Your pin number : ");
            int pinNum2= n1.nextInt(); // Input Integer value in pinNum2 variable 
            System.out.print("   Enter The actual amount(BDT) for this pack otherwise your payment will be cancel :");
            int ammount3 = n1.nextInt();  // Input Integer value in ammount3 variable 
            MobileBank mb = new MobileBank (mbName,phoneNum,ammount3,pinNum2); // Create an obeject mb for MobileBank class
            System.out.println();
            System.out.println("            ===============================             ");   
            System.out.println("            ---Provided Mobile Bank info---         ");
            System.out.println("            ===============================             ");
            System.out.println();
            System.out.println("                 Mobile Bank name : "+mb.getmbName()); //calling getmbName method through mb object
            System.out.println("                 Phone number : "+mb.getphoneNum()); //calling getphoneNum method through mb object
            System.out.println("                 Pin number : : "+mb.getPinNum()); //calling getPinNum method through mb object
            System.out.println("                 Ammount : "+mb.getAmmount()); //calling getAmmount method through mb object
            break;  
        default:   
            System.out.println("You input the wrong number");  
    } 
      System.out.println("\n");
      System.out.println("                  Done!!!                  ");
      System.out.println("                  Dear Customer Thanks for your desire Package registration.                  ");
      System.out.println("                  We well contact with you soon through phone call.                  ");
       
       System.out.println("\n");
       System.out.println("Customer Info from Customer Info.txt file :");
       frwd.readFromFile();// Read text file from the dictionary through readFromFile method
  }

}