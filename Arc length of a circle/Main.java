#include<stdio.h>
int main()
{
  float r,angle,arc;
  scanf("%f %f",&r,&angle);
  arc=2*3.14*r*(angle/360);
  printf("%.2f",arc);
  
}