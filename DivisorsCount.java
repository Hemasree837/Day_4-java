import java.util.Scanner;

public class DivisorsCount{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
            int n=sc.nextInt();
            int c=0;
            for (int j=1;j*j<=n;j++)
            {
                if(n%j==0){
                    c+=1;
                if(j*j!=n){
                    c+=1;
                }
            }
            }
            System.out.println(c);
        
    
}
}









