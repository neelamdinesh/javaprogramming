import java.util.*;
public class experiment6{
	public static void main(String args[])
	{
		int a[];
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = Input.nextInt();
		a = new int[n];
		System.out.println("Enter the array elements");		
		for(int i=0;i<n;i++)
		   a[i] = Input.nextInt();
		mergepass(a,0,n-1);
		System.out.println("\n After sorting...");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+"   ");
	}
	public static void mergepass(int a[], int lb,int ub)
	{
		int mid;
		if(lb!=ub)
		{
			mid = (lb+ub)/2;
			mergepass(a,lb,mid); 
			mergepass(a,mid+1,ub); 
			mergeSort(a,lb,mid,ub);
		}
	}

	public static void mergeSort(int a[], int lb,int mid,int ub)
	{
		int i; 
		int j; 
		int k; 
		int temp[];
		temp = new int[20];
	
		i = lb;
		j = mid+1;
		k = lb;
		while((i<=mid) && (j<=ub))
		{
			if(a[i] <= a[j])
			{
				temp[k] = a[i];
				k++; i++;
			}
			else
			{
				temp[k] = a[j];
				k++; j++;
			}		
		} 
		
		while(i<=mid)
		{
			temp[k] = a[i];
			k++; i++;
		}	
		while(j<=ub)
		{
			temp[k] = a[j];
			k++; j++;		
		}
		for(i=lb;i<=ub;i++) 	
			a[i] = temp[i];
	}
}