#include <stdio.h>

FILE *fPtr;

int main()
{
    char name[40];
    int age;
    printf ("Enter your name & age: ");
    scanf("%40s %d",name,&age);

    if((fPtr = fopen("file.txt","r")) == NULL)
    {
        printf("File not found");
    }
    else
    {
        /*
        while (!feof(stdin))
        {
            fprintf(fPtr,"%s %d \n",name,age);
            printf ("Enter your name & age: ");
            scanf("%40s %d",name,&age);
        }
        printf("\nFile saved successfully \n");
        fclose(fPtr);
        */
        puts("");
        printf("%40s %4s\n","NAME","AGE");
        fscanf(fPtr,"%40s %d",name,&age);
        while(!feof(fPtr))
        {
            printf("%40s %4d\n",name,age);
            fscanf(fPtr,"%40s %4d",name,&age);
        }
        fclose(fPtr);
    }
    return 0; 
}