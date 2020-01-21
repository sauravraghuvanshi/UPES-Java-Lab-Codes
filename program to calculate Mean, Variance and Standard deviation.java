import java.lang.Math;
public class Mean_Variance_SD
{
  public static void main(String[] args) {
    int a[]={10,20,30,40,50};
      int n=a.length;

      int sum1=0;
      for (int i=0;i<n ;i++ ) {
        sum1+=a[i];
      }

      double mean=sum1/n;

      for (int i=0;i<n ;i++ ) {
        a[i]-=mean;
      }

      int sum2=0;
      for (int i=0;i<n;i++ ) {
        sum2+=(a[i]*a[i]);
      }

      double variance=sum2/n;
      double sd=Math.sqrt(variance);


      System.out.printf("Mean=%f  Variance=%f  S.D=%f\n",mean,variance,sd);
  }
}
