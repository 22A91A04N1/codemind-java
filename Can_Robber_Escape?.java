import java.util.*;
public class Divya
{
    public static void main(String args[])
    {
        int a,count=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
            if(b[i]%2!=0)
            count++;
        }
        if(count>2)
        System.out.print("NO");
        else
        System.out.print("YES");
    }
}