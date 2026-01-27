/*
    Write a program that accepts a student’s percentage marks (a floating-point value between 0 and 100) 
    from the user and displays the result as a class description based on the following criteria:

    If percentage is between 0.0 and less than 35.0, display “You are fail..”.

    If percentage is between 35.0 and less than 50.0, display “Your class is Pass class”.

    If percentage is between 50.0 and less than 60.0, display “Your class is Second class”.

    If percentage is between 60.0 and less than 75.0, display “Your class is First class”.

    If percentage is between 75.0 and 100.0 (inclusive), display “Your class is First with Distinction”.

*/

// Problem Statement : Calculate Percentage
import java.util.*;

class Display
{
    public float fMarks;

    public Display(float A)
    {
        this.fMarks = A;
    }

    public void displayClass()
    {
        if(fMarks < 0.0f || fMarks > 100.0f)
        {
            System.out.println("Invalid Input: Marks must be between 0 and 100.");
            return;
        }

        if(fMarks >= 0.0  && fMarks < 35.0)
        {
            System.out.println("You are Fail");
        }
        else if(fMarks >= 35.0  && fMarks < 50.0)
        {
            System.out.println("Your class is Pass class");
        }
        else if(fMarks >= 50.0  && fMarks < 60.0)
        {
            System.out.println("Your class is Second class");
        }
        else if(fMarks >= 60.0  && fMarks < 75.0)
        {
           System.out.println("Your class is First class"); 
        }
        else if(fMarks >= 75.0  && fMarks <= 100.0)
        {
           System.out.println("Your class is First with Distictions class");  
        }
    }
}

class Program7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fObtainedMark = 0.0f;

        System.out.println("Enter Your Obtained Mark : ");
        fObtainedMark = sobj.nextFloat();

        Display dobj = new Display(fObtainedMark);
        dobj.displayClass();

        sobj.close();

    }
}
