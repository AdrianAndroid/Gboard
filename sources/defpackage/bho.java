package defpackage;

/* compiled from: PG */
/* renamed from: bho  reason: default package */
/* loaded from: classes.dex */
public final class bho implements Cloneable {
    final float a;
    final int b;

    public bho(float f) {
        this.b = 1;
        this.a = f;
    }

    public bho(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final float a(bjo bjoVar) {
        float f;
        if (this.b == 9) {
            bhb b = bjoVar.b();
            if (b == null) {
                return this.a;
            }
            float f2 = b.c;
            float f3 = b.d;
            if (f2 == f3) {
                f = this.a;
            } else {
                double sqrt = Math.sqrt((f2 * f2) + (f3 * f3));
                f = this.a;
                f2 = (float) (sqrt / 1.414213562373095d);
            }
            return (f * f2) / 100.0f;
        }
        return c(bjoVar);
    }

    public final float b(bjo bjoVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : c(bjoVar);
    }

    public final float c(bjo bjoVar) {
        switch (this.b - 1) {
            case 0:
                return this.a;
            case 1:
                return this.a * bjoVar.a();
            case 2:
                return this.a * (bjoVar.f.d.getTextSize() / 2.0f);
            case 3:
                return this.a * 96.0f;
            case 4:
                return (this.a * 96.0f) / 2.54f;
            case 5:
                return (this.a * 96.0f) / 25.4f;
            case 6:
                return (this.a * 96.0f) / 72.0f;
            case 7:
                return (this.a * 96.0f) / 6.0f;
            default:
                bhb b = bjoVar.b();
                return b == null ? this.a : (this.a * b.c) / 100.0f;
        }
    }

    public final float d(bjo bjoVar) {
        if (this.b == 9) {
            bhb b = bjoVar.b();
            return b == null ? this.a : (this.a * b.d) / 100.0f;
        }
        return c(bjoVar);
    }

    public final boolean e() {
        return this.a < 0.0f;
    }

    public final boolean f() {
        return this.a == 0.0f;
    }

    public final float g() {
        int i = this.b - 1;
        return i != 0 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? this.a : (this.a * 96.0f) / 6.0f : (this.a * 96.0f) / 72.0f : (this.a * 96.0f) / 25.4f : (this.a * 96.0f) / 2.54f : this.a * 96.0f : this.a;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        switch (this.b) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            default:
                str = "percent";
                break;
        }
        return String.valueOf(valueOf).concat(str);
    }
}
