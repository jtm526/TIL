#include <stdio.h>

void simple_adder(int n1, int n2);
void show_str(char* str);

int main(void)
{
	char* str = "hello, world";
	int num1 = 10, num2 = 20;

	// Function pointers
	void (*fptr1)(int, int) = simple_adder;
	void (*fptr2)(char*) = show_str;

	// Function call using pointers
	fptr1(num1, num2);
	fptr2(str);

	return 0;
}

void simple_adder(int n1, int n2)
{
	printf("%d + %d = %d\n", n1, n2, n1 + n2);
}

void show_str(char* str)
{
	printf("%s\n", str);
}