#include <stdio.h>
#include <math.h>
int main(void)
{
    int decimal = 0 , binary = 0 ;
    int i , lcm; 
    printf ("Enter a decimal number\n");
    scanf("%d" , &decimal);
    /*for(lcm = 0; lcm > 1; i++)
    {
        lcm = decimal % 2;
        printf("%d\n",lcm);
    }
    */
    lcm = decimal % 2;
    printf("%d\n",lcm);
    lcm = decimal / 2;
    printf("%d\n",lcm);   
    printf("%d\n",decimal);





    return 0;
}