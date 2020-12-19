import java.util.Arrays;
import java.util.Scanner; 
public class Task16 {
    public static void main(String[] args) {
           Scanner obj = new Scanner(System.in);
           System.out.println("Enter the number of words: ");
           int n=0,k,p=0,a,j;
           int i=obj.nextInt();
           System.out.println("\na)-------------------------------------------------------------\n"); 
           System.out.println("Enter the words ");
           String str[] = new String[i];
           for( j=0;j<i;j++)
           str[j]=obj.next();
           for(j=0;j<i;j++){
           k=str[j].length();
           if(j==0){
           n=k;
           p=j;
           }
           if(k<n){
           n=k;
           p=j;
           } 
           }
           System.out.println("The shortest word is :"+str[p]); 
           System.out.println("\nb)-------------------------------------------------------------\n"); 
           System.out.println("Enter a word to search: "); 
           String str2=obj.next();
           for( a=0;a<i;a++){
           if(str2.equals(str[a])){
           System.out.println("The word is present in the list");
           break;
           }
           if(a==i-1){
           System.out.println("The word is not present in the list");
           break;
           }
           }
           System.out.println("\nc)-------------------------------------------------------------\n"); 
           System.out.println("The sorted array is: "); 
           Arrays.sort(str);
           for(int b = 0; b<i; b++) {
           System.out.println(str[b]);
           }
           System.out.println("\nd)-------------------------------------------------------------\n");
           int d=0,f=0;
           int index[]=new int[i];
           for (int e = 0; e < str.length; e++) {
           StringBuilder rev =new StringBuilder(str[e]);
           rev.reverse();
           if(str[e].equals(rev.toString())){
                   d++;
                   index[f]=e;
                   f++;
           } 
           }    
           int e=0;   
            System.out.println("The number of palindromes in the list: "+d);
            for (int g = 0; g <f; g++) {
             e=index[g];
            System.out.println(str[e]);
        }
        }
    }


          
