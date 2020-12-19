 import java.util.Scanner;
 class Task15 {
     public static void main (String args[]){
         int r,s,g;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter No. of Robbers:");
         r=obj.nextInt();
         int ro[]=new int[r];
         int ret[]=new int[r];
         int k=0,count=0;
         int i,n;
         for( i=1;i<=r;i++){
            ro[k]=i;
            k++;
         }
         System.out.println("Enter The Robber with whom Sam will start shooting:");
         s=obj.nextInt();
         System.out.println("Enter the gap between the robbers:");
         g=obj.nextInt();
         int b=0;
         System.out.println("Target = "+ro[s-1]+", "+(++b)+" shots completed");       
         ret[0]=s-1;
         n=1;
         for(i=s;i<r;i++){
         count=count+1;
         if(count==g+1){
           System.out.println("Target = "+ro[i]+", "+(++b)+" shots completed");
           count=0;
           ret[n]=i;
           n++;
         }
         } 
         for(int a=0;b<=r-1;a++){
         for(i=0;i<r;i++){
           for(int j=0;j<n;j++){
             if(i==ret[j]){
               count=count-1;
               break;
                }
           }
           count=count+1;
           if(count==g+1){
            System.out.println("Target = "+ro[i]+", "+(++b)+" shots completed");
            count=0;
            ret[n]=i;
            n++;
          }
         }
        }
        System.out.println(+b+" shots taken");
        System.out.println("The shootout sequence was:");
        for(n=0;n<ret.length;n++){
        if(n==ret.length-1) 
        System.out.print(ret[n]+1);
        else
        System.out.print(ret[n]+1+",");
        }
        }
      }
