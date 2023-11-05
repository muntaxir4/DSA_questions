#include<stdio.h>
 #include<string.h>
struct word
{char r[100];} s[100];
char c;
 int i;
 void rem (int a,char str[100])
{
for(i=0;i<a;i++)
{
if(strcmp(s[i].r,str)==0)
strcpy(s[i].r,"");
}
}
void display(int a)
{
for(i=0;i<a;i++)
printf("%s ",s[i].r);
}
 void main() 
 {
 i=0;
printf("Enter a string\n");
do
{
scanf("%s",s[i].r);
i++;
c=getchar();
}while(c!='\n');
printf("Enter the word you want to remove\n");
char wd[100];
scanf("%s",wd);
rem(i,wd);
printf("Updated string \n");
display(i);
}

