#include <stdio.h>

int main(void)
{
	char* str = "Simple string";

	printf("%s\n", str);

	printf("---------\n");
	puts(str);
	puts("Simple string 2");

	printf("---------\n");
	fputs(str, stdout);
	printf("\n");
	fputs("Simple string 2", stdout);
}