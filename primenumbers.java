import java.util.*;
public class primenumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int c=0;
            for (int j=1;j<=n;j++)
            {
                if(n%j==0)
                {
                    c+=1;
                }
            }
            if(c==2) System.out.println("PrimeNumber");
            else System.out.println("Not a prime number");
        }
    
}
    
}
