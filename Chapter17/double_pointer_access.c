#include <stdio.h>

int main(void)
{
	double num = 3.14;
	double* ptr = &num;
	double** dptr = &ptr;
	double* ptr2;

	printf("%9p %9p\n", ptr, *dptr); // Same value printed
	printf("%9g %9g\n", num, **dptr); // Same value printed, %g is similar as %e
	ptr2 = *dptr; // ptr1 = ptr2 = *dptr
	*ptr2 = 10.99;
	printf("%9g %9g\n", num, **dptr);

	return 0;
}