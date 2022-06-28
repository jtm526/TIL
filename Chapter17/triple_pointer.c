#include <stdio.h>

int main(void)
{
	int num = 100;
	int* ptr = &num;
	int** dptr = &ptr;
	int*** tptr = &dptr; // triple pointer에는 douple pointer의 주소값 저장

	printf("%d %d %d\n", *ptr, **dptr, ***tptr);

	return 0;
}