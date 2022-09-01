package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: gpf  reason: default package */
/* loaded from: classes.dex */
public final class gpf {
    public final float[] a;

    public gpf() {
        this.a = new float[4];
    }

    public gpf(gpp gppVar) {
        this.a = new float[]{Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f};
        Iterator it = gppVar.iterator();
        while (it.hasNext()) {
            f((gpo) it.next());
        }
    }

    public final float a() {
        return this.a[2];
    }

    public final float b() {
        return this.a[1];
    }

    public final float c() {
        return this.a[3];
    }

    public final float d() {
        return this.a[0];
    }

    public final gpf e(gpf gpfVar) {
        gpf gpfVar2 = new gpf(this.a);
        if (gpfVar.d() < gpfVar2.d()) {
            gpfVar2.j(gpfVar.d());
        }
        if (gpfVar.a() > gpfVar2.a()) {
            gpfVar2.g(gpfVar.a());
        }
        if (gpfVar.b() < gpfVar2.b()) {
            gpfVar2.h(gpfVar.b());
        }
        if (gpfVar.c() > gpfVar2.c()) {
            gpfVar2.i(gpfVar.c());
        }
        return gpfVar2;
    }

    public final void f(gpo gpoVar) {
        float f = gpoVar.b;
        float[] fArr = this.a;
        if (f < fArr[0]) {
            fArr[0] = f;
        }
        float f2 = gpoVar.a;
        if (f2 < fArr[1]) {
            fArr[1] = f2;
        }
        if (f > fArr[2]) {
            fArr[2] = f;
        }
        if (f2 > fArr[3]) {
            fArr[3] = f2;
        }
    }

    public final void g(float f) {
        this.a[2] = f;
    }

    public final void h(float f) {
        this.a[1] = f;
    }

    public final void i(float f) {
        this.a[3] = f;
    }

    public final void j(float f) {
        this.a[0] = f;
    }

    public final String toString() {
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        return "[" + f + "," + f2 + "," + f3 + "," + f4 + "]";
    }

    public gpf(gpq gpqVar) {
        int i;
        this.a = new float[]{Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f};
        int size = gpqVar.size();
        int i2 = 0;
        while (i2 < size) {
            Iterator it = ((gpp) gpqVar.get(i2)).iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    f((gpo) it.next());
                }
            }
            i2 = i;
        }
    }

    public gpf(float[] fArr) {
        this.a = (float[]) fArr.clone();
    }
}
