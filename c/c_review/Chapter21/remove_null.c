#include <stdio.h>
#include <string.h>

void remove_null(char str[])
{
	int len = strlen(str);
	str[len - 1] = 0;
}

int main(void)
{
	char str[100];
	printf("Type a string: ");
	fgets(str, sizeof(str), stdin);
	printf("Length: %d, str: %s\n", strlen(str), str);

	remove_null(str);
	printf("Length: %d, str: %s\n", strlen(str), str);
	
	return 0;
}