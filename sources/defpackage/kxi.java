package defpackage;

/* compiled from: PG */
/* renamed from: kxi  reason: default package */
/* loaded from: classes.dex */
public final class kxi {
    public kxa a;
    public kxa b;
    public kxa c;
    public kxa d;
    public kxc e;
    public kxc f;
    public kxc g;
    public kxc h;
    public kxc i;
    public kxc j;
    public kxc k;
    public kxc l;

    public kxi() {
        this.i = laq.l();
        this.j = laq.l();
        this.k = laq.l();
        this.l = laq.l();
        this.a = new kwy(0.0f);
        this.b = new kwy(0.0f);
        this.c = new kwy(0.0f);
        this.d = new kwy(0.0f);
        this.e = laq.g();
        this.f = laq.g();
        this.g = laq.g();
        this.h = laq.g();
    }

    public kxi(kxj kxjVar) {
        this.i = laq.l();
        this.j = laq.l();
        this.k = laq.l();
        this.l = laq.l();
        this.a = new kwy(0.0f);
        this.b = new kwy(0.0f);
        this.c = new kwy(0.0f);
        this.d = new kwy(0.0f);
        this.e = laq.g();
        this.f = laq.g();
        this.g = laq.g();
        this.h = laq.g();
        this.i = kxjVar.j;
        this.j = kxjVar.k;
        this.k = kxjVar.l;
        this.l = kxjVar.m;
        this.a = kxjVar.b;
        this.b = kxjVar.c;
        this.c = kxjVar.d;
        this.d = kxjVar.e;
        this.e = kxjVar.f;
        this.f = kxjVar.g;
        this.g = kxjVar.h;
        this.h = kxjVar.i;
    }

    public static void c(kxc kxcVar) {
        if (kxcVar instanceof kxh) {
            kxh kxhVar = (kxh) kxcVar;
        } else if (!(kxcVar instanceof kxb)) {
        } else {
            kxb kxbVar = (kxb) kxcVar;
        }
    }

    public final kxj a() {
        return new kxj(this);
    }

    public final void b(float f) {
        this.a = new kwy(f);
        this.b = new kwy(f);
        this.c = new kwy(f);
        this.d = new kwy(f);
    }
}
