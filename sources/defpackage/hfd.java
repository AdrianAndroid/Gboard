package defpackage;

import android.os.SystemClock;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hfd  reason: default package */
/* loaded from: classes.dex */
public final class hfd {
    private static final float[] r = {0.0f};
    public ict c;
    public int g;
    public long h;
    public long i;
    public int j;
    public Object k;
    public int o;
    public int p;
    public ici[] q;
    public iah a = iah.PRESS;
    public iay[] b = iay.b;
    public int d = 0;
    public boolean e = false;
    public float[] f = gvw.c;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;

    private hfd() {
    }

    public static hfd b() {
        hfd e = e();
        e.k();
        return e;
    }

    public static hfd c(hfd hfdVar) {
        hfd e = e();
        e.a = hfdVar.a;
        e.b = i(hfdVar.b);
        e.f = h(hfdVar.f);
        e.g = hfdVar.g;
        e.h = hfdVar.h;
        e.i = hfdVar.i;
        e.j = hfdVar.j;
        e.k = hfdVar.k;
        e.l = hfdVar.l;
        e.m = hfdVar.m;
        e.n = hfdVar.n;
        e.o = hfdVar.o;
        e.p = hfdVar.p;
        e.c = hfdVar.c;
        e.d = hfdVar.d;
        e.e = hfdVar.e;
        ici[] iciVarArr = hfdVar.q;
        if (iciVarArr != null) {
            e.q = (ici[]) Arrays.copyOf(iciVarArr, iciVarArr.length);
        }
        return e;
    }

    public static hfd d(iay iayVar) {
        hfd e = e();
        e.k();
        e.j(iayVar);
        return e;
    }

    public static hfd e() {
        hfd hfdVar = new hfd();
        hfdVar.a = iah.PRESS;
        return hfdVar;
    }

    public static float[] h(float[] fArr) {
        int length = fArr.length;
        return length == 0 ? gvw.c : Arrays.copyOf(fArr, length);
    }

    public static iay[] i(iay[] iayVarArr) {
        int length = iayVarArr.length;
        return length == 0 ? iay.b : (iay[]) Arrays.copyOf(iayVarArr, length);
    }

    public final int a() {
        iay[] iayVarArr = this.b;
        if (iayVarArr.length > 0) {
            return iayVarArr[0].c;
        }
        return 0;
    }

    public final iay f() {
        iay[] iayVarArr = this.b;
        if (iayVarArr.length > 0) {
            return iayVarArr[0];
        }
        return null;
    }

    public final void g() {
        if (this.b.length == this.f.length) {
            return;
        }
        throw new IllegalArgumentException("Invalid keyData or scores");
    }

    public final void j(iay iayVar) {
        this.b = new iay[]{iayVar};
        this.f = r;
    }

    public final void k() {
        this.h = SystemClock.uptimeMillis();
    }

    public final void l(float f, float f2) {
        this.l = f;
        this.m = f2;
    }
}
