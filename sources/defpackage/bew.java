package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bew  reason: default package */
/* loaded from: classes.dex */
public final class bew implements bep, bfg, bev {
    private volatile kdr A;
    private final Object a;
    private final bet b;
    private final ber c;
    private final Context d;
    private final ath e;
    private final Object f;
    private final Class g;
    private final bel h;
    private final int i;
    private final int j;
    private final atk k;
    private final bfh l;
    private final List m;
    private final bfq n;
    private final Executor o;
    private axh p;
    private long q;
    private Drawable r;
    private Drawable s;
    private int t;
    private int u;
    private boolean v;
    private RuntimeException w;
    private nuu z;
    private final jrr y = jrr.d();
    private int x = 1;

    public bew(Context context, ath athVar, Object obj, Object obj2, Class cls, bel belVar, int i, int i2, atk atkVar, bfh bfhVar, bet betVar, List list, ber berVar, kdr kdrVar, bfq bfqVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.a = obj;
        this.d = context;
        this.e = athVar;
        this.f = obj2;
        this.g = cls;
        this.h = belVar;
        this.i = i;
        this.j = i2;
        this.k = atkVar;
        this.l = bfhVar;
        this.b = betVar;
        this.m = list;
        this.c = berVar;
        this.A = kdrVar;
        this.n = bfqVar;
        this.o = executor;
        if (this.w != null || !athVar.f.a(atd.class)) {
            return;
        }
        this.w = new RuntimeException("Glide request origin trace");
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        if (this.s == null) {
            this.s = this.h.f;
        }
        return this.s;
    }

    private final void o() {
        if (!this.v) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    private final boolean p() {
        ber berVar = this.c;
        return berVar == null || berVar.h(this);
    }

    private final boolean q() {
        ber berVar = this.c;
        return berVar == null || !berVar.a().j();
    }

    private final void r(axd axdVar) {
        boolean z;
        int i;
        this.y.c();
        synchronized (this.a) {
            int i2 = this.e.e;
            String valueOf = String.valueOf(this.f);
            int i3 = this.t;
            int i4 = this.u;
            Log.w("Glide", "Load failed for [" + valueOf + "] with dimensions [" + i3 + "x" + i4 + "]", axdVar);
            List a = axdVar.a();
            int size = a.size();
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                Log.i("Glide", "Root cause (" + i6 + " of " + size + ")", (Throwable) a.get(i5));
                i5 = i6;
            }
            this.z = null;
            this.x = 5;
            this.v = true;
            List<bet> list = this.m;
            if (list != null) {
                z = false;
                for (bet betVar : list) {
                    z |= betVar.fi(axdVar, this.l, q());
                }
            } else {
                z = false;
            }
            bet betVar2 = this.b;
            if (betVar2 != null) {
                betVar2.fi(axdVar, this.l, q());
            }
            if (!z && p()) {
                if (this.r == null) {
                    bel belVar = this.h;
                    Drawable drawable = belVar.d;
                    this.r = drawable;
                    if (drawable == null && (i = belVar.e) > 0) {
                        Resources.Theme theme = this.d.getTheme();
                        ath athVar = this.e;
                        this.r = bcd.a(athVar, athVar, i, theme);
                    }
                }
                Drawable drawable2 = this.r;
                if (drawable2 == null) {
                    drawable2 = i();
                }
                this.l.a(drawable2);
            }
            this.v = false;
            ber berVar = this.c;
            if (berVar != null) {
                berVar.d(this);
            }
        }
    }

    @Override // defpackage.bev
    public final Object a() {
        this.y.c();
        return this.a;
    }

    @Override // defpackage.bep
    public final void b() {
        synchronized (this.a) {
            o();
            this.y.c();
            this.q = bge.b();
            if (this.f == null) {
                if (bgj.p(this.i, this.j)) {
                    this.t = this.i;
                    this.u = this.j;
                }
                r(new axd("Received null model"));
                return;
            }
            int i = this.x;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i == 4) {
                e(this.p, 5);
                return;
            }
            List<bet> list = this.m;
            if (list != null) {
                for (bet betVar : list) {
                    if (betVar instanceof ben) {
                        ben benVar = (ben) betVar;
                        throw null;
                    }
                }
            }
            this.x = 3;
            if (bgj.p(this.i, this.j)) {
                g(this.i, this.j);
            } else {
                this.l.e(this);
            }
            int i2 = this.x;
            if ((i2 == 2 || i2 == 3) && p()) {
                this.l.f(i());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [bev, java.lang.Object] */
    @Override // defpackage.bep
    public final void c() {
        synchronized (this.a) {
            o();
            this.y.c();
            if (this.x != 6) {
                o();
                this.y.c();
                this.l.g(this);
                nuu nuuVar = this.z;
                axb axbVar = null;
                if (nuuVar != null) {
                    synchronized (nuuVar.c) {
                        ((awz) nuuVar.b).g(nuuVar.a);
                    }
                    this.z = null;
                }
                axh axhVar = this.p;
                if (axhVar != null) {
                    this.p = null;
                    axbVar = axhVar;
                }
                ber berVar = this.c;
                if (berVar == null || berVar.g(this)) {
                    this.l.fg(i());
                }
                this.x = 6;
                if (axbVar == null) {
                    return;
                }
                axbVar.f();
            }
        }
    }

    @Override // defpackage.bev
    public final void d(axd axdVar) {
        r(axdVar);
    }

    @Override // defpackage.bev
    public final void e(axh axhVar, int i) {
        Throwable th;
        axb axbVar;
        boolean z;
        this.y.c();
        axb axbVar2 = null;
        try {
            try {
                synchronized (this.a) {
                    try {
                        this.z = null;
                        if (axhVar == null) {
                            d(new axd("Expected to receive a Resource<R> with an object of " + this.g.toString() + " inside, but instead got null."));
                            return;
                        }
                        Object c = axhVar.c();
                        if (c != null && this.g.isAssignableFrom(c.getClass())) {
                            ber berVar = this.c;
                            if (berVar == null || berVar.i(this)) {
                                boolean q = q();
                                this.x = 4;
                                this.p = axhVar;
                                if (this.e.e <= 3) {
                                    c.getClass().getSimpleName();
                                    String.valueOf(this.f);
                                    bge.a(this.q);
                                    ce.d(i);
                                }
                                this.v = true;
                                List<bet> list = this.m;
                                if (list != null) {
                                    z = false;
                                    for (bet betVar : list) {
                                        z |= betVar.b(c, this.l, q);
                                        if (betVar instanceof ben) {
                                            z |= ((ben) betVar).c();
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                bet betVar2 = this.b;
                                if (betVar2 != null) {
                                    betVar2.b(c, this.l, q);
                                }
                                if (!z) {
                                    this.l.c(c, this.n.a(i));
                                }
                                this.v = false;
                                ber berVar2 = this.c;
                                if (berVar2 != null) {
                                    berVar2.e(this);
                                }
                                return;
                            }
                            this.p = null;
                            this.x = 4;
                            axbVar = (axb) axhVar;
                            axbVar.f();
                        }
                        this.p = null;
                        d(new axd("Expected to receive an object of " + this.g.toString() + " but instead got " + String.valueOf(c != null ? c.getClass() : "") + "{" + String.valueOf(c) + "} inside Resource{" + axhVar.toString() + "}." + (c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                        axbVar = (axb) axhVar;
                        axbVar.f();
                    } catch (Throwable th2) {
                        th = th2;
                        axhVar = null;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            axbVar2 = axhVar;
                            if (axbVar2 != null) {
                                axbVar2.f();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.bep
    public final void f() {
        synchronized (this.a) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a0 A[Catch: all -> 0x01ad, TryCatch #2 {, blocks: (B:4:0x000a, B:6:0x000f, B:7:0x0076, B:30:0x01aa, B:20:0x0199, B:22:0x01a0, B:23:0x01a3, B:43:0x0195, B:62:0x01ab), top: B:3:0x000a }] */
    /* JADX WARN: Type inference failed for: r12v6, types: [xx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [awz, awm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [axa] */
    /* JADX WARN: Type inference failed for: r9v11, types: [awf] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v19, types: [kdr] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [awf] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ayh] */
    @Override // defpackage.bfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bew.g(int, int):void");
    }

    @Override // defpackage.bep
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.x == 4;
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.x == 6;
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.x == 4;
        }
        return z;
    }

    @Override // defpackage.bep
    public final boolean m(bep bepVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        bel belVar;
        atk atkVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        bel belVar2;
        atk atkVar2;
        int size2;
        if (!(bepVar instanceof bew)) {
            return false;
        }
        synchronized (this.a) {
            i = this.i;
            i2 = this.j;
            obj = this.f;
            cls = this.g;
            belVar = this.h;
            atkVar = this.k;
            List list = this.m;
            size = list != null ? list.size() : 0;
        }
        bew bewVar = (bew) bepVar;
        synchronized (bewVar.a) {
            i3 = bewVar.i;
            i4 = bewVar.j;
            obj2 = bewVar.f;
            cls2 = bewVar.g;
            belVar2 = bewVar.h;
            atkVar2 = bewVar.k;
            List list2 = bewVar.m;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && bgj.l(obj, obj2) && cls.equals(cls2) && belVar.equals(belVar2) && atkVar == atkVar2 && size == size2;
    }

    @Override // defpackage.bep
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            int i = this.x;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.a) {
            obj = this.f;
            cls = this.g;
        }
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        String obj3 = cls.toString();
        return obj2 + "[model=" + valueOf + ", transcodeClass=" + obj3 + "]";
    }
}
