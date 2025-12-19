// Problem Statement : Accept value from user and calculate the cube.
// int chya ivaji long best aahe.

import java.util.*;

class Calculate
{
    public int iNo;

    public Calculate(int A)
    {
        this.iNo = A;
    }

    public int calculateCube()
    {
        int iCube = 0;
        iCube = this.iNo * this.iNo * this.iNo;
        return iCube;
    }
}

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iAns = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Calculate cobj = new Calculate(iValue);
        iAns = cobj.calculateCube();

        System.out.println("Cube is : "+iAns);

        sobj.close();
    }
}