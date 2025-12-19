
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
        switch(iStandard)
        {
            case 1:
                    System.out.println("Your Exam time 8Am");
                    break;
            case 2:
                    System.out.println("Your Exam time 9Am");
                    break;
            case 3:
                    System.out.println("Your Exam time 10Am");
                    break;
            case 4:
                    System.out.println("Your Exam time 11Am");
                    break;
            case 5:
                    System.out.println("Your Exam time 12pm");
                    break;
            default:
                System.out.println("Invalide Input...");
        }
    }
}

class Program8
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