import java.util.Scanner;
class ReverseOrder1
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int i=sc.nextInt();
    
    while(i>0)
    {
        System.out.println(i);
        i-=1;
    }
}
}
