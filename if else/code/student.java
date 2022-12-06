import java.util.Scanner;
class student
{
    public static void main(String[] args)
	{ 
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the mark");
    int value=obj.nextInt();
if (value <35)
{
   System.out.println("Fail: RA");
}
    else if((value>35)&&(value<=50))
	{
		System.out.println("pass:"+value+ "with D grade");
	}
	else if ((value>50)&&(value<=65))
	{
		System.out.println("pass:"+value+ "with C grade");
	}
    else if((value>65)&&(value<=75))
    {
		System.out.println("pass:"+value+ "with B grade");
	}
   else if ((value>75)&&(value<=85))
   {
        System.out.println("pass:"+value+ "with A grade");
   }
   else if ((value>85)&&(value<=95)) 
   {
	   System.out.println("pass:"+value+ "with A+ grade");
   }
   else if ((value>95)&&(value<=100))
   {
	   System.out.println("pass:" +value+ "with O grade");
   }
else 
{
	System.out.println("enter the correct mark");
}
	}
}

   