#include <stdio.h>

// 참조관계 실패 사례

void swap_int_ptr(int* p1, int* p2)
{
	int* temp = p1;
	p1 = p2;
	p2 = temp;
}

int main(void)
{
	int num1 = 10, num2 = 20;
	int* ptr1, * ptr2;
	ptr1 = &num1, ptr2 = &num2;
	printf("*ptr1, *ptr2: %d %d\n", *ptr1, *ptr2);

	swap_int_ptr(ptr1, ptr2); // p1, p2에 ptr1, ptr2의 주소값이 복사가 됨. 즉 p1, p2는 별개
	printf("*ptr1, *ptr2: %d %d\n", *ptr1, *ptr2);
	return 0;
}