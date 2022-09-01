package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* renamed from: vo  reason: default package */
/* loaded from: classes2.dex */
public final class vo {
    public static final ThreadLocal a = new ThreadLocal();

    public static double a(double[] dArr, double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static int b(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(i((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), i((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), i((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int c(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, h(Color.red(i), alpha2, Color.red(i2), alpha, i3), h(Color.green(i), alpha2, Color.green(i2), alpha, i3), h(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int d(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void e(int i, int i2, int i3, double[] dArr) {
        if (dArr.length == 3) {
            double d = i;
            Double.isNaN(d);
            double d2 = d / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = i2;
            Double.isNaN(d3);
            double d4 = d3 / 255.0d;
            double pow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            double d5 = i3;
            Double.isNaN(d5);
            double d6 = d5 / 255.0d;
            double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static void f(int i, double[] dArr) {
        e(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double g = g(d / 95.047d);
        double g2 = g(d2 / 100.0d);
        double g3 = g(d3 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * g2) - 16.0d);
        dArr[1] = (g - g2) * 500.0d;
        dArr[2] = (g2 - g3) * 200.0d;
    }

    private static double g(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    private static int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static int i(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }
}
