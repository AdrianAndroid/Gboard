package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: awo  reason: default package */
/* loaded from: classes.dex */
public final class awo implements Runnable, Comparable, awj, bgo {
    private int A;
    private int B;
    public ath c;
    public auw d;
    public atk e;
    public int f;
    public int g;
    public awt h;
    public ava i;
    public awm j;
    public int k;
    public boolean l;
    public auw m;
    public volatile awk n;
    public volatile boolean o;
    public int p;
    public final bnc q;
    private final xx t;
    private Thread u;
    private auw v;
    private Object w;
    private avj x;
    private volatile boolean y;
    private boolean z;
    public final awl a = new awl();
    private final List s = new ArrayList();
    private final jrr C = jrr.d();
    public final nzv r = new nzv();
    public final awn b = new awn();

    public awo(bnc bncVar, xx xxVar, byte[] bArr) {
        this.q = bncVar;
        this.t = xxVar;
    }

    private final int g() {
        return this.e.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cb A[LOOP:1: B:73:0x007e->B:115:0x01cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d8 A[EDGE_INSN: B:116:0x01d8->B:117:0x01d8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x003e A[Catch: all -> 0x0205, TryCatch #8 {axd -> 0x020a, blocks: (B:3:0x0002, B:5:0x000a, B:120:0x01e2, B:66:0x0011, B:69:0x005b, B:119:0x01df, B:156:0x002a, B:160:0x0034, B:162:0x003e, B:167:0x0048, B:70:0x0065, B:118:0x01da, B:126:0x01fa, B:127:0x01ff), top: B:2:0x0002 }] */
    /* JADX WARN: Type inference failed for: r5v9, types: [auw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, auo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awo.i():void");
    }

    private final void j() {
        l();
        axd axdVar = new axd("Failed to load resource", new ArrayList(this.s));
        awm awmVar = this.j;
        synchronized (awmVar) {
            ((awz) awmVar).g = axdVar;
        }
        synchronized (awmVar) {
            ((awz) awmVar).l.c();
            if (((awz) awmVar).j) {
                ((awz) awmVar).e();
            } else if (!((awz) awmVar).a.e()) {
                if (!((awz) awmVar).h) {
                    ((awz) awmVar).h = true;
                    auw auwVar = ((awz) awmVar).b;
                    awy c = ((awz) awmVar).a.c();
                    ((awz) awmVar).d(c.a() + 1);
                    awz awzVar = (awz) awmVar;
                    awzVar.n.o(awzVar, auwVar, null);
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        awx awxVar = (awx) it.next();
                        awxVar.b.execute(new aww(awzVar, awxVar.a, 1));
                    }
                    awzVar.c();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        if (this.b.c()) {
            a();
        }
    }

    private final void k() {
        this.u = Thread.currentThread();
        bge.b();
        boolean z = false;
        while (!this.o && this.n != null && !(z = this.n.c())) {
            this.A = c(this.A);
            this.n = h();
            if (this.A == 4) {
                b();
                return;
            }
        }
        if ((this.A == 6 || this.o) && !z) {
            j();
        }
    }

    private final void l() {
        Throwable th;
        this.C.c();
        if (!this.y) {
            this.y = true;
            return;
        }
        if (this.s.isEmpty()) {
            th = null;
        } else {
            List list = this.s;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public final void a() {
        this.b.a();
        nzv nzvVar = this.r;
        nzvVar.c = null;
        nzvVar.b = null;
        nzvVar.a = null;
        awl awlVar = this.a;
        awlVar.c = null;
        awlVar.d = null;
        awlVar.m = null;
        awlVar.g = null;
        awlVar.j = null;
        awlVar.h = null;
        awlVar.n = null;
        awlVar.i = null;
        awlVar.o = null;
        awlVar.a.clear();
        awlVar.k = false;
        awlVar.b.clear();
        awlVar.l = false;
        this.y = false;
        this.c = null;
        this.d = null;
        this.i = null;
        this.e = null;
        this.j = null;
        this.A = 0;
        this.n = null;
        this.u = null;
        this.m = null;
        this.w = null;
        this.B = 0;
        this.x = null;
        this.o = false;
        this.s.clear();
        this.t.b(this);
    }

    @Override // defpackage.awj
    public final void b() {
        this.p = 2;
        this.j.a(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        awo awoVar = (awo) obj;
        int g = g() - awoVar.g();
        return g == 0 ? this.k - awoVar.k : g;
    }

    @Override // defpackage.awj
    public final void d(auw auwVar, Exception exc, avj avjVar, int i) {
        avjVar.d();
        axd axdVar = new axd("Fetching data failed", Collections.singletonList(exc));
        axdVar.b(auwVar, i, avjVar.a());
        this.s.add(axdVar);
        if (Thread.currentThread() != this.u) {
            this.p = 2;
            this.j.a(this);
            return;
        }
        k();
    }

    @Override // defpackage.awj
    public final void e(auw auwVar, Object obj, avj avjVar, int i, auw auwVar2) {
        this.m = auwVar;
        this.w = obj;
        this.x = avjVar;
        this.B = i;
        this.v = auwVar2;
        boolean z = false;
        if (auwVar != this.a.e().get(0)) {
            z = true;
        }
        this.z = z;
        if (Thread.currentThread() == this.u) {
            i();
            return;
        }
        this.p = 3;
        this.j.a(this);
    }

    @Override // defpackage.bgo
    public final jrr f() {
        return this.C;
    }

    private final awk h() {
        int i = this.A;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return new axi(this.a, this);
            }
            if (i2 == 2) {
                awl awlVar = this.a;
                return new awh(awlVar.e(), awlVar, this);
            } else if (i2 == 3) {
                return new axl(this.a, this);
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("Unrecognized stage: ".concat(cy.d(i)));
                }
                return null;
            }
        }
        throw null;
    }

    public final int c(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                if (!this.h.b()) {
                    return c(2);
                }
                return 2;
            } else if (i2 == 1) {
                if (!this.h.a()) {
                    return c(3);
                }
                return 3;
            } else if (i2 == 2) {
                return this.l ? 6 : 4;
            } else if (i2 != 3 && i2 != 5) {
                throw new IllegalArgumentException("Unrecognized stage: ".concat(cy.d(i)));
            } else {
                return 6;
            }
        }
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        avj avjVar = this.x;
        try {
            try {
                if (this.o) {
                    j();
                    if (avjVar == null) {
                        return;
                    }
                    return;
                }
                int i = this.p;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    this.A = c(1);
                    this.n = h();
                    k();
                } else if (i2 == 1) {
                    k();
                } else if (i2 == 2) {
                    i();
                } else {
                    throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                }
                if (avjVar == null) {
                    return;
                }
                avjVar.d();
            } finally {
                if (avjVar != null) {
                    avjVar.d();
                }
            }
        } catch (awg e) {
            throw e;
        } catch (Throwable th) {
            if (this.A != 5) {
                this.s.add(th);
                j();
            }
            if (!this.o) {
                throw th;
            }
            throw th;
        }
    }
}
