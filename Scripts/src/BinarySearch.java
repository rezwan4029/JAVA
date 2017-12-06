public class BinarySearch {
  
  
  public static int lowerBound(int[] a, int n, int key) {
    int low = 0, high = n;
    while(low < high) {
      final int mid = (low + high) / 2;
      if(key <= a[mid]) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    if( a[low] == key) return low;
    return -1;
  }
  
  public static int upperBound(int[] a, int n, int key) {
    int low = 0, high = n;
    while(low < high) {
      final int mid = (low + high) / 2;
      if(key >= a[mid]) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    if( a[low] == key) return low;
    return -1;
  }
  
}
