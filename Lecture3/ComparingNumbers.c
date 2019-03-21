#include <stdio.h>

int main(void) {

	char aByte  = 5;
	short aShort = -9025;
	int anInt = 50000;
	long long aLong = 809230972398749L;
	float aFloat = 5.0F;
	double aDouble = 3.1415926535897;
	char char1 = 'A', char2 = 'B', char3 = 'a';

	int longFloatComparison = (aLong == aFloat),
		byteIntComparison	= (aByte <= anInt),
		doubleShortComparison = (aDouble != aShort),
		charComparison1 = (char1 == char3),
		charComparison2 = (char3 < char2);

	int expr = 15 % 4 * 7 + 15 >= 1
		|| 7 < 12 || !(-8 != 8 && 7 <= 10 && 5 > 7);

	printf("Compare long    & float: %s\n", longFloatComparison ? "true" : "false");
	printf("Compare byte	& int  : %s\n", byteIntComparison ? "true" : "false");
	printf("Compare double 	& short: %s\n", doubleShortComparison ? "true" : "false");
	printf("Compare char1	& char3: %s\n", charComparison1 ? "true" : "false");
	printf("Compare char3	& char2: %s\n", charComparison1 ? "true" : "false");
	printf("Value of long expression: %s\n", expr ? "true" : "false");

    return 0;
}
