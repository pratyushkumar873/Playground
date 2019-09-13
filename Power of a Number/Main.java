#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here     
  int num,exp,q;
  scanf("%d %d",&num,&exp);
  q=pow(num,exp);
  if(exp>=0)
  {
    printf("%d",q);
  }
  else
    printf("Wrong input");
  
    return 0;
}