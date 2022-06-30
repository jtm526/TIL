// 문자열 뒤집기

#include <stdio.h>

int main(void)
{
	char str[50];
	printf("Type a word: ");
	scanf("%s", str);

	// Get length of the word
	int idx = 0, len = 0;
	while (str[idx] != 0)
	{
		len++;
		idx++;
	}


	char str2[50]; // Array to copy the word in reverse order
	for (int i = 0; i < len; i++)
	{
		str2[i] = str[len - i - 1]; // 문자열 절반의 횟수만큼 for문 돌린 후 앞 뒤로 재배치하는 방법도 있음.
	}
	str2[len] = 0;
	printf("Reversed word is a %s\n", str2);

	return 0;
}