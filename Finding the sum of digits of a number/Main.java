#include <stdio.h>
int main() {
	//Type your code
  int num,sum=0,rem;
  scanf("%d",&num);
  while(num>0)
  {
    rem=num%10;
    sum=sum+rem;
    num/=10;
  }
  printf("%d",sum);
	return 0;
}