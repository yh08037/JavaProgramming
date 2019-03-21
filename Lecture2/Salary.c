#include <stdio.h>

int main(void) {

    int monthly_salary;
    int annual_income;

    printf("Enter your monthly salary: ");
    scanf("%d", &monthly_salary);

    annual_income = 12 * monthly_salary;
    printf("Your annual income is %d\n", annual_income);

    return 0;
}
