#include <stdio.h>
#include <limits.h>

int main(void)
{
	int arr[5];
	int min = INT_MAX, max = INT_MIN, sum = 0;

	for (int i = 0; i < 5; i++)
	{
		scanf("%d", &arr[i]); // 각 배열에 숫자 입력받기
	}

	for (int i = 0; i < 5; i++)
	{
		if (arr[i] < min)
		{
			min = arr[i];
		}
		if (arr[i] > max)
		{
			max = arr[i];
		}
		sum += arr[i];
	}

	printf("Max of arr is %d.\nMin of arr is %d.\nSum of arr is %d.\n", max, min, sum);
}