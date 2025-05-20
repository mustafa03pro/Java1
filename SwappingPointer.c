// SwapingUsingPointer
// Write a program in C to swap elements using call by reference.
// ------

// -> create int main() function.
// -> create void swap(int *a, int *b, int *c) function.
// -> in main function read value for a,b,c and call the swap fuction by passing addresses of all three variable.
// -> NOTE : print the result before swap and after swap in main funtion only and understand the use/power of pointer.

// Sample input : a = 5 , b = 6 , c = 7;

// Sample output :

// The value before swapping are :                                        
// a = 5                                                 
// b = 6                                                 
// c = 7                                                 
                                                    
// The value after swapping are :                                        
// a = 7                                                 
// b = 5                                                 
// c = 6 
#include <stdio.h>

// Function to swap values using pointers
void swap(int *a, int *b, int *c) {
    int temp = *a;
    *a = *c;
    *c = *b;
    *b = temp;
}

int main() {
    int a, b, c;

    // Read input values
    printf("Enter value of a: ");
    scanf("%d", &a);
    printf("Enter value of b: ");
    scanf("%d", &b);
    printf("Enter value of c: ");
    scanf("%d", &c);

    // Print values before swapping
    printf("\nThe value before swapping are:\n");
    printf("a = %d\n", a);
    printf("b = %d\n", b);
    printf("c = %d\n", c);

    // Call swap function using pointers (call by reference)
    swap(&a, &b, &c);

    // Print values after swapping
    printf("\nThe value after swapping are:\n");
    printf("a = %d\n", a);
    printf("b = %d\n", b);
    printf("c = %d\n", c);

    return 0;
}
