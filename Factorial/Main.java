#include<stdio.h>
int main()
{
  long int n,a=1;
  int i;
  scanf("%ld",&n);
    for(i=1;i<=n;i++)
    {
      a=a*i;
    }
  printf("%ld",a);
  
  return 0;
	//your code here
}