// Here we've given Array of numbers and input number to find out
public int binarySearch(arr[],x){
	int start,mid,end;
	start=0;
	end=arr.length-1;
	mid=(start+end)/2;
	while(start<=end){
		if(arr[mid]==x) return arr[mid];
		else if(arr[mid]<x) {
		start = mid+1;
		}
		else end=mid-1;
	}
	return -1;


}