#include <stdio.h>
#include <string.h>

int main(void)
{
	char str1[20];
	char str2[20];
	printf("str1: ");
	scanf("%s", str1);
	printf("str2: ");
	scanf("%s", str2);

	if (!strcmp(str1, str2)) // If str1 == str2 it returns 0
	{
		puts("Same!");
	}
	else
	{
		puts("Different!");

		if (!strncmp(str1, str2, 3))
		{
			puts("But first 3 letters are the same.");
		}
	}

	return 0;
}