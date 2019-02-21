#include <stdio.h>

int main(void)
{
    int number = 0,x;
    double factorial=1;
    printf ("Enter a Number: ");
    scanf ("%d",&number);
    for(x = 1; x <= number ; x++)
    {
      factorial= factorial * x; 
    }
    printf("The factorial of %d is %0.0f \n",number,factorial);
return 0;
}