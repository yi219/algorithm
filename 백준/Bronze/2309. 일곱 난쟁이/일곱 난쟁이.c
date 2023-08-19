#include <stdio.h>

int main()
{
	int boy[9];
	int total=0;
	int i, j;
	int k=0;
	int num;
	
	scanf("%d", &boy[0]); scanf("%d", &boy[1]); scanf("%d", &boy[2]); scanf("%d", &boy[3]); scanf("%d", &boy[4]); 
	scanf("%d", &boy[5]); scanf("%d", &boy[6]); scanf("%d", &boy[7]); scanf("%d", &boy[8]);
	
	for (i=0; i<9; i++)
	{
		total += boy[i];
	}
	
	for (i=0; i<8; i++)
	{
		for (j=i+1; j<9; j++)
		{
			if (total-boy[i]-boy[j]==100)
	    	{
	    		boy[i]=0;
	    		boy[j]=0;
	    		k=1;
		    	break;
		    }
		}
		if (k==1)
		{
			break;
		}

	}
	
	for (i=0; i<8; i++)
	{
		for (j=i+1; j<9; j++)
		{
			if (boy[i]>boy[j])
			{
				num=boy[i];
				boy[i]=boy[j];
				boy[j]=num;
			}
		}
	}
	
	for (i=0; i<9; i++)
	{
		if (boy[i]!=0)
		{
			printf("%d\n", boy[i]);
		}
	}
}