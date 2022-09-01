package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: jgq  reason: default package */
/* loaded from: classes.dex */
public final class jgq {
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public boolean k = true;
    public boolean l = false;
    public double m = 0.0d;
    public final double a = 100.0d;
    public final double b = 18.0d;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public static boolean e(double d, double d2, double d3) {
        return d2 < d3 ? d > d3 : d < d3;
    }

    public final boolean a() {
        return Math.abs(this.g) <= 0.005d && Math.abs(this.j - this.f) <= 0.005d;
    }

    public final void b() {
        this.l = true;
    }

    public final void c(double d) {
        if (d != this.j) {
            this.j = d;
            this.i = this.f;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((jez) it.next()).k(this);
            }
        }
    }

    public final void d(double d) {
        if (d != this.f) {
            this.f = d;
            this.i = d;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                jez jezVar = (jez) it.next();
                jezVar.k(this);
                jezVar.l(d);
            }
        }
    }

    public final void f(jez jezVar) {
        this.c.add(jezVar);
    }
}
