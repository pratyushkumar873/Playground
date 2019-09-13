#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,count,second,first;
  scanf("%d",&num);
  count=log10(num);
  second=num/pow(10,--count);
  second=second%10;
  
  printf("%d",second);
  
	return 0;
}