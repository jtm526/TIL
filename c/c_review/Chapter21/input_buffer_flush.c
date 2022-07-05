#include <stdio.h>

void clear_buffer(void); // 어떤 원리?

int main(void)
{
	char per_id[7]; // 주민번호 앞 6자리
	char name[20];

	fputs("Your bday: ", stdout);
	fgets(per_id, sizeof(per_id), stdin);
	clear_buffer();

	fputs("Your name: ", stdout);
	fgets(name, sizeof(name), stdin);

	printf("Bday: %s\n", per_id);
	printf("Name: %s\n", name);

	return 0;
}

void clear_buffer(void)
{
	while (getchar() != '\n');
}