#include <stdio.h>

int main(void)
{
	char str[] = "Good morning!";
	printf("Size of str: %d\n", sizeof(str)); // char이 1byte이니 글자수+null문자만큼 출력
	printf("Null character is %c\n", str[13]);
	printf("Null charcter is %d\n", str[13]);

	str[12] = '?'; // 문자열 배열은 변경 가능. 포인터는 안 되는 것으로 강의 들음.
	printf("str is now %s\n", str);

	return 0;
}