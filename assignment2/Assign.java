import java.util.Scanner;
public class Assign{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter total number of employees:");
        int te=obj.nextInt();
        System.out.print("Enter name of supervisor:");
        String sname=obj.next();
        System.out.print("How many times the Nuclear waste is removed from the core: ");
        int nw= obj.nextInt();
        System.out.print("What is total weight of the waste produced every 1 week: ");
        float tw= obj.nextFloat();
        System.out.print("Is Electric Motor being replaced every 18 days(press y for yes & n for no): ");
        String yesorno="";
        char er= obj.next().charAt(0);
        if(er == 'y')
        {
             yesorno= "yes";
        }
        else if(er=='n')
        {
             yesorno= "no";
        }
        
      
        System.out.print("What is core temperature of Nuclear Reactor? ");
        double ct= obj.nextDouble();
        System.out.println("\n\n");
        System.out.println("\nTotal number of employees :" + te);
    
        System.out.println("\nName of Supervisor :" + sname);
    
        System.out.println("\nTimes the Nuclear waste is removed from the core :" + nw);

        System.out.println("\nTotal weight of the waste produced every 1 week :" + tw);
    
        System.out.println("\nIs Electric Motor being replaced every 18 days? :" + yesorno);
        double res= ct + 273.15;
   
        System.out.println("\nCore average temperature of nuclear reactor is:" + ct +" °C"+" &"+res+" K");

    }
}