class Linear_Search
{
    // This function returns index of element x in arr[]
    static void linearsearch(int arr[], int n, int search)
    {
      int i;
        for ( i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == search)
                {
                  System.out.println("Element is found at index: " + i);
                  break;
                }
        }

        if(i == arr.length)
        System.out.println("Element is not found!");
    }
}

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
}

class Search
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50 };
        int n=arr.length;
        int search=40;
        int last=arr.length-1;

         Linear_Search obj1= new Linear_Search();
         Binary_Search obj2=new Binary_Search();

         System.out.println("Searching Through Linear Search Algorithm\n");
         obj1.linearsearch(arr,n,search);

         System.out.println("Searching Through Binary Search Algorithm\n");
         obj2.binarySearch(arr,0,last,search);


    }
}
