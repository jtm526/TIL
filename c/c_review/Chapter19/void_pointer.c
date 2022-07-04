// 주소값에만 의미를 두고 포인터의 형은 나중에 결정 동적 할당과 깊은 관계!

#include <stdio.h>

void simple_func(void)
{
	printf("Simple function!\n");
}

int main(void)
{
	int num = 20;
	void* ptr;

	ptr = &num;
	printf("%p\n", ptr);

	ptr = simple_func;
	printf("%p\n", ptr);
	

	return 0;
}