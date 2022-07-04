#include <stdio.h>

int main(int argc, char *argv[])
{
	printf("String passed: %d\n", argc);

	for (int i = 0; i < argc; i++)
	{
		printf("%dth str: %s\n", argv[i]);
	}

	return 0;
}