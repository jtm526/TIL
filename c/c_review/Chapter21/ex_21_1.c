// getchar(), putchar()의 활용

#include <stdio.h>

int main(void)
{
	int c;
	while (1)
	{
		c = getchar();
		if (c >= 97 || c <= 122)
		{
			c -= 32;
			putchar(c);
			break;
		}
		else
		{
			printf("Wrong input!"); // ?
			break;
		}
	}

	return 0;
}