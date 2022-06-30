// scanf를 이용한 문자열의 입력
// 문자열은 맨 끝에 \0존재
// {'h', 'e', 'l', 'l', 'o'} 는 문자의 배열일 뿐 문자열은 아님!

#include <stdio.h>

int main(void)
{
	char str[50];
	int idx = 0;

	printf("Type a string: ");
	scanf("%s", str); // 공백 전까지만 입력 가능(scanf saves a word)
	printf("You typed %s\n", str);

	printf("Print by characters: ");
	while (str[idx] != '\0') // 문자열 끝은 \0으로 저장
	{
		printf("%c\n", str[idx]);
		idx++;
	}
}