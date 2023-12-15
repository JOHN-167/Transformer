package nn.core;

public final class VectorOps {

    private VectorOps() {}

    public static double matmul(double[] a, double[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Dot Product: Mismatch dimensions");
        }
        double out = 0; 
        for (int i = 0; i < b.length; i++) {
            out += a[i] * b[i];
        }
        return out;
    }

    public static double[] mul(double[] a, double[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Dot Product: Mismatch dimensions");
        }
        double[] out = new double[b.length]; 
        for (int i = 0; i < b.length; i++) {
            out[i] += a[i] * b[i];
        }
        return out;
    }

    public static double[] mul(double a, double[] b) {
        double[] out = new double[b.length]; 
        for (int i = 0; i < b.length; i++) {
            out[i] += a * b[i];
        }
        return out;
    }

    public static double[] mul(double[] b, double a) {
        return mul(b, a);
    }
    
}
