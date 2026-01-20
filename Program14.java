// /*
//     Start
//         Accept age from user
//             If age is less than 5 then there will no ticket
//             If it is in between 5 to 18 then it will be 700
//             It it is in betwween 18 to 50 it will be 999
//             And if it is greater than 50 then it will be 500
//     Stop
// */

// import java.util.*;

// class ToDisplay
// {
//     public int iNo;

//     public Display(int A)
//     {
//         this.iNo = A;
//     }

//     public void ticketPrice()
//     {
//         if(iNo < 0)
//         {
//             System.out.println("Invalide Input : ");
//             return;
//         }

//         if(iNo < 5)
//         {
//             System.out.println("NO Ticket");
//         }
//         else if(iNo >= 5 && iNo < 18)
//         {
//             System.out.println("Ticket Price 700rs");   
//         }
//         else if(iNo >= 18 && iNo < 50)
//         {
//             System.out.println("Ticket Price 999rs");
//         }
//         else(iNo >= 50)
//         {
//             System.out.println("Ticket Price 500rs");
//         }
//     }
// }

// class Program14
// {
//     public static void main(String A[])
//     {
//         Scanner sobj = new Scanner(System.in);

//         int iAge = 0;

//         System.out.println("Enter your Age : ");
//         iAge = sobj.nextInt();

//         ToDisplay tobj = new ToDisplay(iAge);
//         tobj.ticketPrice();
//         sobj.close();
//     }
// }


import java.util.*;

class TicketCalculator // Better Class Name
{
    public int iAge;

    public TicketCalculator(int age)
    {
        this.iAge = age;
    }

    public void displayTicketPrice()
    {
        // FIX 1: Handle Invalid Input and STOP (return)
        if(iAge < 0)
        {
            System.out.println("Invalid Input: Age cannot be negative.");
            return; // Stops the function here
        }

        // Logic for valid ages
        if(iAge < 5)
        {
            System.out.println("Ticket: Free (No Ticket)");
        }
        else if(iAge >= 5 && iAge < 18)
        {
            System.out.println("Ticket Price: 700 rs");   
        }
        else if(iAge >= 18 && iAge < 50)
        {
            System.out.println("Ticket Price: 999 rs");
        }
        else // No need for 'else if(iAge >= 50)', just 'else' covers it
        {
            System.out.println("Ticket Price: 500 rs");
        }
    }
}

class Program14
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iAge = 0;

        System.out.println("Enter your Age: ");
        iAge = sobj.nextInt();

        TicketCalculator tobj = new TicketCalculator(iAge);
        tobj.displayTicketPrice();
        
        sobj.close();
    }
}