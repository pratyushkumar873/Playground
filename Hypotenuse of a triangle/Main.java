#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float x,y,z;
  scanf("%f %f",&x,&y);
  z=sqrt(pow(x,2)+pow(y,2));
  printf("%.2f",z);
  return 0;
}