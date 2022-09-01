package defpackage;

/* compiled from: PG */
/* renamed from: adj  reason: default package */
/* loaded from: classes.dex */
public final class adj {
    double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final adf j;

    public adj() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new adf();
    }

    public final float a() {
        return (float) this.i;
    }

    public final void c(float f) {
        this.i = f;
    }

    public adj(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new adf();
        this.i = f;
    }

    public final void d(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final adf b(double d, double d2, long j) {
        double cos;
        double d3;
        double d4;
        double d5;
        double pow;
        if (!this.c) {
            if (this.i != Double.MAX_VALUE) {
                double d6 = this.b;
                if (d6 > 1.0d) {
                    double d7 = this.a;
                    this.f = ((-d6) * d7) + (d7 * Math.sqrt((d6 * d6) - 1.0d));
                    double d8 = this.b;
                    double d9 = this.a;
                    this.g = ((-d8) * d9) - (d9 * Math.sqrt((d8 * d8) - 1.0d));
                } else if (d6 >= 0.0d && d6 < 1.0d) {
                    this.h = this.a * Math.sqrt(1.0d - (d6 * d6));
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d10 = j;
        Double.isNaN(d10);
        double d11 = d10 / 1000.0d;
        double d12 = d - this.i;
        double d13 = this.b;
        if (d13 > 1.0d) {
            double d14 = this.g;
            double d15 = ((d14 * d12) - d2) / (d14 - this.f);
            double d16 = d12 - d15;
            d3 = (Math.pow(2.718281828459045d, d14 * d11) * d16) + (Math.pow(2.718281828459045d, this.f * d11) * d15);
            double d17 = this.g;
            double pow2 = Math.pow(2.718281828459045d, d17 * d11);
            double d18 = this.f;
            d5 = d16 * d17 * pow2;
            d4 = d15 * d18;
            pow = Math.pow(2.718281828459045d, d18 * d11);
        } else if (d13 == 1.0d) {
            double d19 = this.a;
            d4 = d2 + (d19 * d12);
            double d20 = d12 + (d4 * d11);
            d3 = Math.pow(2.718281828459045d, (-d19) * d11) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.a) * d11);
            double d21 = -this.a;
            d5 = d20 * pow3 * d21;
            pow = Math.pow(2.718281828459045d, d21 * d11);
        } else {
            double d22 = this.h;
            double d23 = this.a;
            double d24 = (1.0d / d22) * ((d13 * d23 * d12) + d2);
            double pow4 = Math.pow(2.718281828459045d, (-d13) * d23 * d11) * ((Math.cos(this.h * d11) * d12) + (Math.sin(this.h * d11) * d24));
            double d25 = this.a;
            double d26 = this.b;
            double pow5 = Math.pow(2.718281828459045d, (-d26) * d25 * d11);
            double d27 = this.h;
            double sin = Math.sin(d27 * d11);
            double d28 = this.h;
            cos = ((-d25) * pow4 * d26) + (pow5 * (((-d27) * d12 * sin) + (d24 * d28 * Math.cos(d28 * d11))));
            d3 = pow4;
            adf adfVar = this.j;
            adfVar.a = (float) (d3 + this.i);
            adfVar.b = (float) cos;
            return adfVar;
        }
        cos = d5 + (d4 * pow);
        adf adfVar2 = this.j;
        adfVar2.a = (float) (d3 + this.i);
        adfVar2.b = (float) cos;
        return adfVar2;
    }
}
