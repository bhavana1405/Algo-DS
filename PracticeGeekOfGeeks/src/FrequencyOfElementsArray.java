import java.util.HashMap;
import java.util.Map; 
import java.util.HashMap; 

public class FrequencyOfElementsArray {
static void CountFrequency(int arr[], int n) 
//{
//	for(int i=0;i<n;i++)
//	{
//		boolean flag= false;
//		for (int j=i-1;j>=0;j--)
//		{
//			if (arr[i]==arr[j])
//			{
//				flag= true;
//				break;
//			}
//		}
//		if (flag==true)
//			continue;
//		int freq=1;
//		for(int j= i+1; j<n; j++)
//			if(arr[i]==arr[j])
//				freq ++;
//		System.out.println(arr[i]+ " " + freq);
//	}
//}
{

HashMap<Integer, Integer> mp= new HashMap<Integer, Integer>();
for(int i=0;i<n;i++) 
{
if(mp.containsKey(arr[i]))
	mp.put(arr[i], mp.get(arr[i])+1);
else
	mp.put(arr[i],1);
}
for (Map.Entry<Integer, Integer> entry : mp.entrySet())  
    System.out.println("Element = " + entry.getKey() + 
                     ", Frequency = " + entry.getValue()); 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,14,16,12,12,5,9,10,16,9};
int n=arr.length;
CountFrequency(arr,n);

}
}