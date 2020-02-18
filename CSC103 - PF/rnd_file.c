#include <stdio.h>

FILE *fPtr;

struct book
{
    int id;
    char name[40];
    char author[20];
    float price;
} bn;

void writef();
void readf();
void readfs();
void init_file();

int main()
{
    int n;
    //init_file();
    printf("Enter a num: ");
    scanf("%d", &n);
    if (n == 1)
    {
        writef();
    }
    else if (n == 2)
    {
        readf();
    }
    else if (n == 3)
    {
        readfs();
    }
    return 0;
}

void init_file()
{
    struct book bn = {0, "", "", 0.0};
    int i;

    if ((fPtr = (fopen("book.dat", "ab+"))) == NULL)
    {
        printf("File not Found\n");
    }
    else
    {
        for (i = 0; i <= 100; i++)
        {
            fwrite(&bn, sizeof(struct book), 1, fPtr);
        }
        fclose(fPtr);
    }
}

void writef()
{
    if ((fPtr = (fopen("book.dat", "ab+"))) == NULL)
    {
        printf("File not Found\n");
    }
    else
    {
        printf("Enter a Record #: ");
        scanf("%d", &bn.id);
        if (bn.id != 0)
        {
            printf("Enter Name , Author , Price: ");
            fscanf(stdin, "%s %s %f", bn.name, bn.author, &bn.price);
            fseek(fPtr, (bn.id - 1) * sizeof(struct book), SEEK_SET);
            fwrite(&bn, sizeof(struct book), 1, fPtr);
            fclose(fPtr);
        }
    }
}

void readf()
{
    int rec = 1, resp;
    if (rec != 0)
    {
        if ((fPtr = (fopen("book.dat", "rb"))) == NULL)
        {
            printf("File not Found\n");
        }
        else
        {
            while (!feof(fPtr))
            {
                resp = fread(&bn, sizeof(struct book), 1, fPtr);
                if (resp != 0 && bn.id != 0)
                {
                    printf("%d %s %s %.2f\n", bn.id, bn.name, bn.author, bn.price);
                }
            }
            printf("DONE \n");
            fclose(fPtr);
        }
    }
}
void readfs()
{
    int rec;
    printf("Enter a Record #: ");
    scanf("%d", &rec);
    if ((fPtr = (fopen("book.dat", "rb"))) == NULL)
    {
        printf("File not Found\n");
    }
    else
    {
        fseek(fPtr,(rec - 1)*sizeof(struct book),SEEK_SET);
        fread(&bn, sizeof(struct book), 1, fPtr);
        if (rec != 0)
        {
            printf("%d %s %s %.2f\n", bn.id, bn.name, bn.author, bn.price);
        }
        printf("DONE \n");
        fclose(fPtr);
    }
}