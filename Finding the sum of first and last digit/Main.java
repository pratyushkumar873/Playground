#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,first,last;
  scanf("%d",&num);
  int count=log10(num);
  first=num/pow(10,count);
  last=num%10;
  printf("%d",first+last);
  
	return 0;
}