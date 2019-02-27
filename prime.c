#include <stdio.h>

int main(void)
{
    int x , y=0,prime=0,z;
    for (x=1;x<=100;x++)
    {
        prime = x % 2;
        if (prime == 1)
        {
        //y = x;
        //z = 2 * y/2;
        printf ("%d \n", x);
        }
    }



    return 0;
}
