#include<stdio.h>
 #include<string.h>
struct duplicate
{char r[100];} s[100];
char c;
 int i,j;
 void rem(int a)
{
for(i=0;i<a;i++)
{
for(j=i+1;j<a;j++)
{if(strcmp(s[i].r,s[j].r)==0)
strcpy(s[j].r,"");
}
}
}
void display(int a)
{
for(i=0;i<a;i++)
printf("%s ",s[i].r);
}
 void main()
 {i=0;
printf("Enter a string\n");
do
{
scanf("%s",s[i].r);
i++;
c=getchar();
}while(c!='\n');
rem(i);
display(i);
}
