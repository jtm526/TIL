#include <stdio.h>

int main(void)
{
	int arr[3] = { 15, 25, 35 };
	int* ptr = &arr[0];

	printf("%d %d\n", ptr[0], arr[0]); // ptr이나 arr이나 동일하게 사용 가능
	printf("%d %d\n", *(ptr + 1), arr[1]);
}