/*
A Program to convert decimal to binary

Algorithm to convert Decimal to Binary number

    Divide the input decimal number by 2 and store the remainder.
    Store the quotient back to the input number variable.
    Repeat this process till quotient becomes zero.
    Equivalent binary number will be the remainders in above process in reverse order.
*/
#include <stdio.h>
#include <math.h>
int main(void)
{
    int decimal = 0 , binary = 0 , quo ,x;
    printf ("Enter a decimal number : ");
    scanf("%d" , &decimal);
    quo = decimal;
    for (x = 1 ; quo != 0 ; x++)
    {
        printf ("%d",quo % 2);
        quo = quo / 2;
    }
    printf ("\n");
    
    return 0;
}