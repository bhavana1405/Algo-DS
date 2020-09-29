
public class WaterTapping {

	public static void main(String[] args) {
		int[] arr= { 0,1,0,2,1,0,1,3,2,1,2,1};
		int n= arr.length;
		System.out.print(maxWater(arr,n));

	}

	public static int maxWater(int[] arr, int n) {
		// TODO Auto-generated method stub
		int ans=0;
		for(int i=0;i<n;i++) {
			ans=ans+(Math.min(leftmax(arr,n,i),rightmax(arr,n,i))-arr[i]);
		}
		return ans;
	}

	public static int rightmax(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
		int rx=0;
		for(int k=n-1;k>=i;k--)
		{
			rx=Math.max(rx,arr[k]);
		}
		
		return rx;
	}

	public static int leftmax(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
		int lx=0;
		for(int j=0;j<=i;j++)
		{
			lx=Math.max(lx,arr[j]);
		}
		return lx;
	}

}