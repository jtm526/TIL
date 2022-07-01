#include <stdio.h>

int main(void)
{
	int num1 = 100, num2 = 100;
	int* pnum;

	pnum = &num1;
	*pnum += 30;

	pnum = &num2;
	*pnum -= 30;

	printf("num1 is now %d\n", num1);
	printf("num2 is now %d\n", num2);
}