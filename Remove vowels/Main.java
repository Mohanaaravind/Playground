#include<stdio.h>
int main()
{
  char a[100];
  int i;
  scanf("%[^\n]s", a);
  for(i=0;a[i]!='\0';i++)
  {
    if(!(a[i] =='a' ||a[i] =='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')) 
    {
      printf("%c", a[i]);
    }
  } 
  
  //Type your code here
  
  return 0;
}