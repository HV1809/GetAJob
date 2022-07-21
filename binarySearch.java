// Binery Search Recurrsion
// Here we've given Array of numbers and input number to find out
public int binarySearch(arr[],x,start,end){
	if(start > end) return -1; // Base Cond
	mid = (start + end)//2;
	if(arr[mid] == x) return arr[mid];
	else if(arr[mid]>x) {
		return binarySearch(arr[],x,start,mid-1);
	else{
		return binarySearch(arr[],x,mid+1,end);

	}
	}
	


}