
public class CountDistinct {

	public static void countdistinct(int arr[])
	{
		int count=0;
	//	boolean flag =false;
		for(int i=0;i<arr.length;i++) {
			 boolean flag = false;
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					flag = true;
				
				break;
				}	
					
			}
			if (flag == false)
				{
				System.out.println(arr[i]);
			count++;
				}
	}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [] = {2,3,4,5,3,4,4,2,3,5,4,5};
countdistinct(arr);
	}

}