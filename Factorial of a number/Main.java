#include <stdio.h>
int main() {
	//Type your code
  int i,num,fact=1;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
    fact=fact*i;
  }
  printf("%d",fact);
	return 0;
}