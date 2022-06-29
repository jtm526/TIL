#include <stdio.h>

int main(void)
{
	int num1 = 10, num2 = 20, num3 = 30;
	int* ptr1 = &num1;
	int* ptr2 = &num2;
	int* ptr3 = &num3;

	int* ptr_arr[] = { ptr1, ptr2, ptr3 };
	int** dptr = ptr_arr; // ptr_arr는 그 자체로 주소값 의미(==&ptr_arr[0])

	printf("%d %d %d\n", *ptr_arr[0], *ptr_arr[1], *ptr_arr[2]);
	printf("%d %d %d\n", *dptr[0], *dptr[1], *dptr[2]);

	return 0;
}