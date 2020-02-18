#include <stdio.h>

int suggest();

int main()
{
    suggest();

    return 0;
}

int suggest()
{
    int ammount , cust_type;
    printf("Enter your range: ");
    scanf("%d",&ammount);
    printf("Are you a premium customer or a regular customer ? \n");
    printf("Use 0 for premium and 1 for regular: ");
    scanf("%d",&cust_type);
// conditions for recommendation
    if (ammount < 300000)
    {
        printf("You cannot purchase a car !\n");
    }
    else if ( ammount > 300000 && ammount <= 600000 && cust_type == 1)
    {
        printf("You should purchase a Mehran\n");
    }
    else if ( ammount > 600000 && ammount <= 1000000 && cust_type == 1)
    {
        printf("You should purchase a Cultus\n");
    }
    else if ( ammount > 1000000 && ammount <= 1500000 && cust_type == 1)
    {
        printf("You should purchase a Corolla\n");
    }
    else if ( ammount > 1000000 && ammount <= 1500000 && cust_type == 0)
    {
        printf("You should purchase a Corolla\n");
        printf("You get 15%% dsicount\n");
    }
    else if ( ammount > 1500000 && cust_type == 1)
    {
        printf("Car not avalible\n");

    }
    else if ( ammount > 1500000 && cust_type == 0)
    {
        printf("Car not avalible\n");
        printf("But if you buy a Corolla you get a 15%% discount\n");
    }
}