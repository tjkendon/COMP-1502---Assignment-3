public class UserInterface
{
    public static void main(String args[])
    {
        // define necessary variables here

        // place here the code for the processing requirements

        System.out.println ("Thank you for using the Payroll Processing System");
    }
    
   
    //   The Payroll processing menu
     
    public static void showMenu()
    {
        System.out.println("\nMENU:");
        System.out.println("A - Add a new employee");
        System.out.println("UH - Update hourly employee");
        System.out.println("UC - Update comissioned employee");        
        System.out.println("D - Remove an employee from payroll");     
        System.out.println("P - Print all employees report");        
        System.out.println("I - Print individual employee information");
        System.out.println("T - Print the top comissioned employees by total sales");
        System.out.println();
        System.out.println("W - End of week processing");
        System.out.println();
        System.out.println("Q - Quit the system");
    }

}
