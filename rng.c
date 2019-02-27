/*
A C program to generate random numbers
**Using Linear Congruence Method
   X n+1 = a * Xn + c(mod m) (Search for exact formula)
*/

#include <stdio.h>

int main(void)
{
long int mod , a , c , seed , counter;
printf ("Enter the modulus value: ");
scanf ("%ld",&mod); 
printf ("Enter the multiplier value: ");
scanf ("%ld",&a); 
printf ("Enter the increment value: ");
scanf ("%ld",&c); 
printf ("Enter the seed value: ");
scanf ("%ld",&seed); 

while(counter < 10)
{
   seed = (a * seed + c) % mod;  
   printf ("%ld \n",seed); 
   counter++;
}
printf ("%ld",(a * seed + c) % mod);

return 0;
}