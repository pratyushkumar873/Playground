#include <stdio.h>
int main() {
	//Type your code
  int i,n;
  scanf("%d",&n);
  for(i=1;i<=2*n;i=i+2)
  {
    if(n%2==1)
      printf("%d\n",i);
  }
	return 0;
}