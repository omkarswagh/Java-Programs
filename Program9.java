
// Write a program that accepts the standard (class) number of a student as input 
// and displays the exam time according to the following schedule:

// | Standard | Exam Time   |
// |----------|-------------|
// | 1        | 8 AM        |
// | 2        | 9 AM        |
// | 3        | 10 AM       |
// | 4        | 11 AM       |
// | 5        | 12 NOON     |

import java.util.*;

class Display 
{
    public int iStandard;

    public Display(int A)
    {
        this.iStandard = A;
    }

    public void DisplayTime()
    {
        if(iStandard == 1)
        {
            System.out.println("Your Exam is at 8 AM");
        }
        else if(iStandard == 2)
        {
            System.out.println("Your Exam is at 9 AM");
        }
        else if(iStandard == 3)
        {
            System.out.println("Your Exam is at 10 AM");
        }
        else if(iStandard == 4)
        {
            System.out.println("Your Exam is at 11 AM");
        }
        else if(iStandard == 5)
        {
            System.out.println("Your Exam is at 12 NOON");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}

class Program9
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iStandard  = 0;

        System.out.println("Enter your Division : ");
        iStandard = sobj.nextInt();

        Display dobj = new Display(iStandard);
        dobj.DisplayTime();


    }
}