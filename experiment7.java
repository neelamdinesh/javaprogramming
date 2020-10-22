import java.util.Random;
public class experiment7
{
	public static void main(String[] args) {
	    Random rn=new Random();
		int count=0;
		int ar1[] = new int[1000];
		int ar2[] = new int[1000];
		System.out.println("Same");
		for(int i=0;i<1000;i++){
		    ar1[i]=1+rn.nextInt(6);
		    ar2[i]=1+rn.nextInt(6);
		    if(ar1[i]==ar2[i]){
			System.out.print(ar1[i]+ar2[i]+" ");
		        count++;
		    }
		}
		System.out.println("doubles = "+count);
	}
}
