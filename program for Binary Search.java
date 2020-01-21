class Binary_Search
{
  public static void binarySearch(int arr[], int first, int last, int search)
  {
    int mid = (first + last)/2;
    while( first <= last )
    {
      if ( arr[mid] < search )
      {
        first = mid + 1;
      }
      else if ( arr[mid] == search )
      {
        System.out.println("Element is found at index: " + mid);
        break;
      }
      else
      {
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if ( first > last ){
      System.out.println("Element is not found!");
   }
 }
 public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int search = 50;
        int last=arr.length-1;
        binarySearch(arr,0,last,search);
 }
}
