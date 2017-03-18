/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01;

/**
 *
 * @author Trinh
 */
import static java.time.Clock.system;
import java.util.Scanner;
public class b2 {
    public static void main(String[] args){
        int a[]=new int[100];
        int n,i,j,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu : ");
        n=sc.nextInt();
         for ( i=0;i<n;i++)
         {
             System.out.println("a "+i);
             a[i]=sc.nextInt();
         }
         int s=0;
         int sole=0;
         int am=0;
         int chan=0;
         int nguyento=0;
         int ktra;
            System.out.println("cac phan tu trong mang");
            for(i=0;i<n;i++){
             s=s+a[i];
             if (a[i]%2!=0) sole++;
             if (a[i]<0) am=1;
             if (a[i]%2==1) chan=1;
             ktra=0;
             for(j=2;j<a[i];j++)
             {if (a[i]%j==0) ktra=1; break;}
             if (ktra==0&& a[i]>=2)nguyento++;
            System.out.print(a[i]+"  ");}
           System.out.println();
           System.out.println("tong : "+s);
           System.out.println("so le : "+sole);
           System.out.println("nguyen to : "+nguyento);
          if (am==0) System.out.println("khong co so am");
                  else System.out.println("co so am");
           if (chan==0) System.out.println("toan chan");
                  else System.out.println("khong toan chan");
           for(i=0;i<n-1;i++)
               for(j=i+1;j<n;j++)
               if (a[i]>a[j]){ t=a[i];
               a[i]=a[j];
               a[j]=t;
               }  
            System.out.println("cac phan tu trong mang tang dan");
            for(i=0;i<n;i++)
            System.out.print(a[i]+"  ");
           System.out.println();
    }
}
    

