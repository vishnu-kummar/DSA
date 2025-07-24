package LECTURE1;
import java.util.*;
public class practice {  
   public static void main(String[] args) {
     int arr[]= {6,9,1,5,3,11,4};

      int[] ans=sort(arr,0,arr.length-1);
      for (int i = 0; i < ans.length; i++) {
         System.out.print(ans[i]+" ");
      }

}

   private static int[] sort(int[] arr, int si, int ei) {
     
      if(si==ei){
         int[] ans=new int[1];
         ans[0]=arr[si];
         return ans;
      }

         int  mid= (si+ei)/2;

         int[] la=sort(arr, si, mid);
         int[] ra= sort(arr, mid+1, ei);
         int[] ans=merge(la,ra);
         return ans;

   }

   private static int[] merge(int[] arr1, int[] arr2) {
    int n=arr1.length;
   int m=arr2.length; 
      int[] ans=new int[n+m];
      int i=0,j=0,ind=0;

      while(i<arr1.length && j<arr2.length){
         if(arr1[i]>arr2[j]){
            ans[ind]=arr2[j];
            j++;
         }
         else{
            ans[ind]=arr1[i];
            i++;
         }
         ind++;
      }

      while(i<arr1.length){
         ans[ind]=arr1[i];
         i++;
         ind++;
      }
      while(j<arr2.length){
         ans[ind]=arr2[j];
         j++;
         ind++;
      }
      return ans;

         }

   

}
    

    





 //   public static class Seller{
//     String sellerName;
//     String product;
//     int price;
//     String location;

//     Seller(String n,String p, int pr,String l){
//         sellerName=n;
//         product=p;
//         price=pr;
//         location=l;

//     }
//     Seller(String p, int pr,String l){
//         product=p;
//         price=pr;
//         location=l;

//     }

// }

//     public static void main(String[] args) {

//     Seller s = new Seller("Ayush","D",150,"buddhaColony");
//     Seller s1=new Seller("Abhinay", 78, "boring");

//     System.out.println(s.sellerName+" "+s.product+" "+s.price+" "+s.location);


  
