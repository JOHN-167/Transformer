package nn.core;

import java.util.Random;

abstract public class Unit {

    private double v = 0;
    private double[] W;
    private double b;
    
    public double fit(double[] X) {
        v = VectorOps.matmul(X, W) + b;
        return threshold(v);
    }
    
    abstract double threshold(double v);

    /**
     * Return the signals to the previous layer
     */
    public double[] update(double s, double[] x) {
        double[] W_ = W.clone();
        double slope = slope(v);
        for (int i = 0; i < W.length; i++) {
            W[i] += s * slope * x[i];
        }
        b += s * slope;
        return VectorOps.mul(s, W_);
    }

    abstract double slope(double v);

}