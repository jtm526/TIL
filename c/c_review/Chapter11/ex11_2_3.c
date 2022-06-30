// 아스키 코드 값이 가장 큰 문자 출력하기

#include <stdio.h>

int main(void)
{
	char str[50];
	printf("Type a word: ");
	scanf("%s", str);

	int max = 0, idx = 0;
	while (str[idx] != 0)
	{
		if ((int)str[idx] > max)
		{
			max = (int)str[idx];
		}
		idx++;
	}
	printf("%c", max);

	return 0;
}