// 2차원 배열 주소값 알아보기
#include <stdio.h>

int main(void)
{
	int arr[3][2];
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 2; j++)
		{
			printf("%p\n", &arr[i][j]);
		}
	}

	return 0;
}