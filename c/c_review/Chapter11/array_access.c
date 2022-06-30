#include <stdio.h>

int main(void)
{
	int arr[5];
	int sum = 0;

	for (int i = 0; i < 5; i++)
	{
		arr[i] = i * 10;
	}

	for (int i = 0; i < 5; i++)
	{
		sum += arr[i];
	}

	printf("Sum of the array is %d\n", sum);

	return 0;
}