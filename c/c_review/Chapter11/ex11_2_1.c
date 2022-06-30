#include <stdio.h>

int main(void)
{
	char str[50];
	printf("Type a word: ");
	scanf("%s", str);

	int len = 0, idx = 0;
	while (str[idx] != 0)
	{
		len++;
		idx++;
	}
	printf("%d\n", len);
	return 0;
}