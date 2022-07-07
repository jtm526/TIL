#include <stdio.h>

struct employee 
{
	char name[20];
	char per_id[20];
	long income;
};

int main(void)
{
	struct employee person;
	printf("Type a name: "); scanf("%s", person.name);
	printf("Type a per_id: "); scanf("%s", person.per_id);
	printf("Type a income: "); scanf("%ld", &person.income);

	printf("Employee' info\n");
	printf("Name: %s\n", person.name);
	printf("Personal id: %s\n", person.per_id);
	printf("Income: %ld\n", person.income);

	return 0;
}