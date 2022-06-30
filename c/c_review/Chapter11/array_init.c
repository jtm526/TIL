#include <stdio.h>

int main(void)
{
	int arr1[5] = { 1, 2, 3, 4, 5 };
	int arr2[] = { 1, 2, 3, 4 };
	int arr3[5] = { 1, 2 }; // 남은 값은 0으로 초기화
	int arr1_len, arr2_len, arr3_len;

	printf("Size of arr1: %zu\n", sizeof(arr1));
	printf("Size of arr2: %zu\n", sizeof(arr2));
	printf("Size of arr3: %zu\n", sizeof(arr3));

	// 각 배열의 크기 계산
	arr1_len = sizeof(arr1) / sizeof(arr1[0]);
	arr2_len = sizeof(arr2) / sizeof(arr2[0]);
	arr3_len = sizeof(arr3) / sizeof(int);

	for (int i = 0; i < arr1_len; i++)
	{
		printf("%d ", arr1[i]);
	}
}