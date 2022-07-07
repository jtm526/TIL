#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <math.h>

struct point // 구조체 정의
{
	int xpos;
	int ypos;
};

int main(void)
{
	// 구조체 변수 선언
	struct point pos1, pos2;
	double distance;

	fputs("point1 position: ", stdout);
	scanf("%d %d", &pos1.xpos, &pos1.ypos);

	fputs("point2 position: ", stdout);
	scanf("%d %d", &pos2.xpos, &pos2.ypos);

	// Distance btw 2 positions
	distance = sqrt((double)((pos1.xpos - pos2.xpos) * (pos1.xpos - pos2.xpos) + (pos1.ypos - pos2.ypos) * (pos1.ypos - pos2.ypos)));
	printf("Distance btw 2 positions is %.2lf\n", distance);
}