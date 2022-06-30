#include <stdio.h>

int main(void)
{
	char c[] = "Good time";

	int c_len = sizeof(c) / sizeof(char);
	printf("c_len is %d\n", c_len); // null character 포함

	for (int i = 0; i < c_len; i++)
	{
		printf("%c", c[i]);
	}

	return 0;
}