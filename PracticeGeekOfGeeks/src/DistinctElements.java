import java.util.HashSet;
public class DistinctElements {
	static int countDistinct(int arr[], int n) {
//		int res=0;
//for (int i=0;i<n;i++)
//{
//	boolean flag= false;
//	for(int j=i-1;j>=0;j--)
//	{
//		if(arr[i]==arr[j])
//		{
//			flag=true;
//			break;
//		}
//	}
//	if(flag==false)
//		res++;
//	
//}
//return res;
//	}
HashSet <Integer> s =new HashSet <Integer>();
for(int i=0; i<n; i++)
	s.add(arr[i]);
return s.size();
	}
	
	

	public static void main(String[] args) {
int arr[]={12, 10, 9, 45, 2, 10, 10,45,64};
int n =arr.length;
System.out.println(countDistinct(arr,n));

}
}
