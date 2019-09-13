#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c,lar,seclar;
  scanf("%d %d %d",&a,&b,&c);
   if(a<b)
   {
     if(b<c)
       seclar=b;
     else
       seclar=(a<c ? c:a);
   }
  else
  {
    if(a<c)
      seclar=a;
    else
      seclar=(b<c?b:c);
  }
  printf("%d",seclar);
}