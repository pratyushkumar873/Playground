#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,max,lcm;
  scanf("%d %d",&a,&b);
  max=(a>b ? a:b);
  while(1)
  {
    if(max%a==0 && max%b==0)
    {
      printf("%d",max);
    break;
    }
    max++;
  }
  return 0;
}