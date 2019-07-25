#include<stdio.h>
#define PI 3.14
int main()
{
float r,a;
float ans;
scanf("%f %f",&r,&a);
ans=2*PI*r*a/360;
printf("%.2f",ans);
return 0;
}
