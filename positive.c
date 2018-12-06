#include<stdio.h>
int main(void)
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	if(n==0)
	{
		printf("\nZero");
	}
	else if(n>0)
	{
		printf("\nPositive");
	}
	else
	{
		printf("\nNegative");
	}
}
