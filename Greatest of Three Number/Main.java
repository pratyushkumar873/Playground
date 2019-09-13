#include <stdio.h>

int main()
{ 
    // type your code here
  int a,b,c;
  scanf("%d,%d,%d",&a,&b,&c);
  if(a<b)
  {
    if(c>b)
    {
      printf("%d",c);
    }
    else
      printf("%d",b);
    
}
  else
    printf("%d",a);
}