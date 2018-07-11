import java.io.*;
class Unique
{
 public static void main(String args[])throws IOException
  {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter total numbers: ");
        
        int n = Integer.parseInt(br.readLine());
           int arr[]=new int[n];
         System.out.print("Enter numbers: ");
          int i,count=0, j=0,k=0;
        for(i=0;i<n;i++)
           {   
             arr[i]=Integer.parseInt(br.readLine());
            }
         for(i=0;i<n;i++)
           {   
             count=0;
             for(j=0;j<n;j++)
              {
                if(arr[i]==arr[j])
                 {
                   count++;
                    if(count>1)
                    {
                     arr[j]=999;
                     }
                   }
                }
              }
             for(i=0;i<n;i++)
           {  
              if(arr[i]!=999)
              {
              System.out.print(arr[i]);
               }
            }
}
}
           
                     
        