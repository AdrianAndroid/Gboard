package defpackage;

/* compiled from: PG */
/* renamed from: aox  reason: default package */
/* loaded from: classes.dex */
public final class aox {
    public final String a;
    public final String b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;
    public final int k;

    public aox(String str, String str2, float f, int i, int i2, float f2, float f3, int i3, int i4, float f4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.k = i;
        this.d = i2;
        this.e = f2;
        this.f = f3;
        this.g = i3;
        this.h = i4;
        this.i = f4;
        this.j = z;
    }

    public final int hashCode() {
        int hashCode = ((int) ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c)) * 31;
        int i = this.k;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = this.d;
            long floatToRawIntBits = Float.floatToRawIntBits(this.e);
            return ((((((hashCode + i2) * 31) + i3) * 31) + ((int) ((floatToRawIntBits >>> 32) ^ floatToRawIntBits))) * 31) + this.g;
        }
        throw null;
    }
}
