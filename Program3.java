// Problem Statement : Accept radius from user and calculate the area of circle
import java.util.*;

class circleArea
{
    public float fRadius;

    public circleArea(float A)
    {
        this.fRadius = A;
    }

    public float calculateArea()
    {
        float PI = 3.14f;
        float fArea = PI * this.fRadius * this.fRadius;
        return fArea;
    }

}

class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fRadius = 0.0f, fAns = 0.0f;

        System.out.println("Enter the Value of Radius : ");
        fRadius = sobj.nextFloat();

        circleArea cobj = new circleArea(fRadius);
        fAns = cobj.calculateArea();
        
        System.out.println("Area of Circle is : "+fAns);

        sobj.close();

    }
}