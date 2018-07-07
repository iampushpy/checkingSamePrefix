class SamePrefix
{
 public static void main(String args[])
 {
  int n=Integer.parseInt(args[0]);
  int i,j,k,flag=0;
  char[] ch=new  char[n];
  String pre=" ";
  for(i=1;i<=n;i++)
   {
    for(j=0;j<n;j++)
     {
       ch[j]=args[j+1].charAt(j);
       pre=pre+ch[j];
      }
     for(k=0;k<n-1;k++)
     {
         if(ch[k]!=ch[k+1])
          {
           flag=1;
            break;
           }
        }
      if(flag==1)
      {
        break;
      }
  }
 System.out.println(pre);
}
}
 
     
  
