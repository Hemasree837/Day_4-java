import java.util.*;
public class Switch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int flag=0;
        if (a>=18)
            flag=1;
            switch(flag){
                case 0:
                  System.out.println("Not eligible");
                  break;
                case 1:
                System.out.println("Eligible");
                break;
            }
        
    }
    
}
