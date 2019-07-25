#include<stdio.h>
#include<math.h>
int main()
{
float a,b,c,o,ad,h;
  scanf("%f %f",&a,&b);
  o=a*a;
  ad=b*b;
  c=o+ad;
  h=sqrt(c);
  printf("%.2f",h);
  
  
  return 0;
}