
package pkg01;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Trinh
 */
public class b1 {
    public static void main(String[] args){
        float a[]=new float[100];
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu : ");
        n=sc.nextInt();
         for ( i=0;i<n;i++)
         {
             System.out.println("a "+i);
             a[i]=sc.nextFloat();
         }
            System.out.println("cac phan tu trong mang");
            for(i=0;i<n;i++)
            System.out.print(a[i]+"  ");
           System.out.println();
           System.out.println("cac so thuc am : ");
           for(i=0;i<n;i++)
               if (a[i]<0)   System.out.print(a[i]+" ");
           System.out.println();
           System.out.println("cac so thuc duong : ");
           for(i=0;i<n;i++)
               if (a[i]>0)   System.out.print(a[i]+" ");
             System.out.println();
            float max =a[0];
            float min =a[0];
            for (i=0;i<n;i++)
            { if (a[i]>max) max=a[i];
              if (min>a[i]) min =a[i];
            }
          System.out.println();
           System.out.println("Min = "+min+"     Max= "+max);  
            for (i=0;i<n;i++)
              if (a[i]<0) {max=a[i];break;}
            for (i=0;i<n;i++)
             if (a[i]<0&& a[i]>max) max=a[i];
            System.out.println("Max am ="+max);       
    }
}
    
