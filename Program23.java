// Write a program that takes two integers as input and checks whether the second number is a factor of the first number.
// If divisible, display that it is a factor; otherwise, display that it is not.

import java.util.*;

class Calculate
{
        public int iNo1;
        public int iNo2;

        public Calculate(int A, int B)
        {
            this.iNo1 = A;
            this.iNo2 = B;
        }

        public boolean checkFactor()
        {
            if(this.iNo2 == 0)
            {
                return false;
            }

           if((iNo1 % iNo2) == 0)
           {
                return true;
           }
           else
           {
                return false;
           }
        }
}

class Program23
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;

        System.out.println("Enter the First Number");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Second Number");
        iValue2 = sobj.nextInt();

        Calculate cobj = new Calculate(iValue1, iValue2);
        bRet = cobj.checkFactor();

        if(bRet == true)
        {
            System.out.println(iValue2+" is Factor of "+iValue1);
        }
        else
        {
           System.out.println(iValue2+" is Not Factor of "+iValue1); 
        }

        sobj.close();

    }
}