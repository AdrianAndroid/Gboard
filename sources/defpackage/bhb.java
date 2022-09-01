package defpackage;

/* compiled from: PG */
/* renamed from: bhb  reason: default package */
/* loaded from: classes.dex */
public final class bhb implements Cloneable {
    public float a;
    public float b;
    public float c;
    public float d;

    public bhb(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static bhb c(float f, float f2, float f3, float f4) {
        return new bhb(f, f2, f3 - f, f4 - f2);
    }

    public final float a() {
        return this.a + this.c;
    }

    public final float b() {
        return this.b + this.d;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        return "[" + f + " " + f2 + " " + f3 + " " + f4 + "]";
    }
}
