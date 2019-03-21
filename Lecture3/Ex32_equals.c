#include <stdio.h>
#include <string.h>
#include <ctype.h>

int strcmpIgnore(char const *a, char const *b)
{
    for (;; a++, b++) {
        int d = tolower((unsigned char)*a) - tolower((unsigned char)*b);
        if (d != 0 || !*a)
            return d;
    }
}

int main(void) {

	char string1[] = "aardvarks";
	int comp1 = 0, comp2 = 0, comp3 = 0, comp3b = 0, comp4 = 0;

	comp1 = !strcmp(string1, "boa constrictors");
	comp2 = !strcmp(string1, "aardvarks");
	comp3 = !strcmp(string1, "Aardvarks");
	comp3b = !strcmpIgnore(string1, "Aardvarks");
	comp4 = !strcmp(string1, "aardvarks are cooler");

	printf("%s %s %s %s %s\n", comp1 ? "true" : "false",
		comp2 ? "true" : "false", comp3 ? "true" : "false",
		comp3b ? "true" : "false", comp4 ? "true" : "false");

	return 0;
}
