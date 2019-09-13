#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,onum,rem,res=0,n=0;
  scanf("%d",&num);
  onum=num;
  while(onum!=0)
  {
    onum /=10;
    n++;
  }
  onum=num;
  while(onum!=0)
  {
    rem=onum%10;
    res+=pow(rem,n);
    onum/=10;
  }
  if(res==num)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
	return 0;
}