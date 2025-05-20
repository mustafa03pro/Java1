#include <stdio.h>

// Function to calculate the sum of proper divisors of a number
int sumOfDivisors(int num) {
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
    return sum;
}

// Function to find and display all amicable number pairs in a given range
void findAmicableNumbers(int start, int end) {
    for (int a = start; a <= end; a++) {
        int b = sumOfDivisors(a);
        if (b > a && b <= end) {
            if (sumOfDivisors(b) == a) {
                printf("(%d, %d)\n", a, b);
                printf("(%d, %d)\n", b, a);
            }
        }
    }
}

// Main function
int main() {
    int start ;
    int end ;

    // You can uncomment the following lines to allow user input
    
    printf("Enter start of range: ");
    scanf("%d", &start);
    printf("Enter end of range: ");
    scanf("%d", &end);
    

    findAmicableNumbers(start, end);

    return 0;
}
