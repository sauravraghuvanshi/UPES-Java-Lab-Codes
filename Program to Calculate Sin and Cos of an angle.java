import static java.lang.Math.sin;
import static java.lang.Math.cos;

// JAVA code for implementing sin function

class Sin_Cos {

// Function for calculating sin value
static void cal_sin(float n)
{
    float accuracy1 = (float) 0.0001, denominator, sinx, sinval;
    n = n * (float)(3.142 / 180.0);

    float x1 = n;
    sinx = n;

    sinval = (float)sin(n);
    int i = 1;
    do
    {
        denominator = 2 * i * (2 * i + 1);
        x1 = -x1 * n * n / denominator;
        sinx = sinx + x1;
        i = i + 1;
    } while (accuracy1 <= sinval - sinx);
      System.out.println(sinx);
}

static void cal_cos(float n) {
    float accuracy2 = (float) 0.0001, x1, denominator, cosx, cosval;

    n = n * (float) (3.142 / 180.0);
    x1 = 1;


    cosx = x1;

    cosval = (float) cos(n);
    int i = 1;
    do {
        denominator = 2 * i * (2 * i - 1);
        x1 = -x1 * n * n / denominator;
        cosx = cosx + x1;
        i = i + 1;

    }
    while (accuracy2 <= cosval - cosx);
    System.out.println(cosx);

}

// Main function


    public static void main(String[] args) {
        float n = 90;
      System.out.print("sin(n) & cos(n):\n");
    cal_sin(n);
    cal_cos(n);

    }
}
