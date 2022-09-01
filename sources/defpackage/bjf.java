package defpackage;

/* compiled from: PG */
/* renamed from: bjf  reason: default package */
/* loaded from: classes.dex */
final class bjf {
    public final float a;
    public final float b;
    public float c;
    public float d;

    public bjf(float f, float f2, float f3, float f4) {
        this.c = 0.0f;
        this.d = 0.0f;
        this.a = f;
        this.b = f2;
        double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (sqrt != 0.0d) {
            double d = f3;
            Double.isNaN(d);
            this.c = (float) (d / sqrt);
            double d2 = f4;
            Double.isNaN(d2);
            this.d = (float) (d2 / sqrt);
        }
    }

    public final void a(bjf bjfVar) {
        this.c += bjfVar.c;
        this.d += bjfVar.d;
    }

    public final void b(float f, float f2) {
        float f3 = f - this.a;
        float f4 = f2 - this.b;
        double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (sqrt != 0.0d) {
            float f5 = this.c;
            double d = f3;
            Double.isNaN(d);
            this.c = f5 + ((float) (d / sqrt));
            float f6 = this.d;
            double d2 = f4;
            Double.isNaN(d2);
            this.d = f6 + ((float) (d2 / sqrt));
        }
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        return "(" + f + "," + f2 + " " + f3 + "," + f4 + ")";
    }
}
