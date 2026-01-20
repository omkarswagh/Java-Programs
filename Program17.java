class Display
{
   public void display()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}

class Program17
{
    public static void main(String A[])
    {
        Display dobj = new Display();
        dobj.display();
    }
}