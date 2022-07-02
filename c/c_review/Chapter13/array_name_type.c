// 배열의 이름은 포인터(상수 형태의 포인터)
#include <stdio.h>

int main(void)
{
	int arr[3] = { 0, 1, 2 };
	printf("Name of array: %p\n", arr);
	printf("First element: %p\n", &arr[0]);
	printf("Second element: %p\n", &arr[1]);
	printf("Third element: %p\n", &arr[2]);
}