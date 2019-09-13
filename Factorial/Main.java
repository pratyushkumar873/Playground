#include<stdio.h>
int main()
{
	//your code here
  long int a,i,fact=1;
  scanf("%ld",&a);
  for(i=1;i<=a;i++)
  {
    fact=fact*i; 
  }
  printf("%ld",fact);
}