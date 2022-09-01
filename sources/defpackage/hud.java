package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: hud  reason: default package */
/* loaded from: classes.dex */
public final class hud implements AutoCloseable, jdc {
    private static final icd[] q = {new icd(BasicMotionEventHandler.class.getName(), null, false)};
    public final Context a;
    public final hsz b;
    public final ibm c;
    public final icf d;
    public final hsy e;
    public EditorInfo f;
    public final igx[] g;
    public final icd[] h;
    public final inm i;
    public SoftKeyboardView j;
    public igx k;
    public igz l;
    public boolean m;
    public boolean n;
    public MotionEvent o;
    public long p;
    private final boolean[] r;
    private int s = 0;

    public hud(Context context, hsz hszVar, ibm ibmVar, icf icfVar, hsy hsyVar) {
        this.a = context;
        this.b = hszVar;
        this.c = ibmVar;
        this.d = icfVar;
        this.e = hsyVar;
        icd[] icdVarArr = icfVar.i;
        icdVarArr = (icdVarArr == null || icdVarArr.length <= 0) ? q : icdVarArr;
        this.h = icdVarArr;
        this.i = new fdo(this, 6);
        int length = icdVarArr.length;
        this.g = new igx[length];
        this.r = new boolean[length];
    }

    private final void n(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 10) {
            this.k = null;
            this.m = false;
        }
    }

    @Override // defpackage.jdc
    public final gqc a() {
        gqc h = this.b.h();
        return h != null ? h : gqc.b;
    }

    @Override // defpackage.jdc
    public final void b(MotionEvent motionEvent) {
        igx igxVar;
        if (!this.n) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 9) {
            this.m = true;
        } else if (actionMasked == 1 || actionMasked == 6) {
            this.p = motionEvent.getEventTime();
        }
        if (!this.m) {
            return;
        }
        for (int i = 0; i < this.g.length; i++) {
            igx h = h(i);
            if (h != null && ((igxVar = this.k) == null || igxVar == h || h.gR())) {
                h.h(motionEvent);
                if (!this.n) {
                    break;
                }
            }
        }
        n(motionEvent);
    }

    @Override // defpackage.jdc
    public final void c() {
        this.s = 1;
        for (int i = 0; i < this.g.length; i++) {
            h(i);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        l();
        j();
        int i = 0;
        while (true) {
            igx[] igxVarArr = this.g;
            if (i < igxVarArr.length) {
                gvt.a(igxVarArr[i]);
                this.g[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.jdc
    public final void d() {
        this.s = 2;
        for (int i = 0; i < this.g.length; i++) {
            igx h = h(i);
            if (h != null) {
                h.j();
            }
        }
    }

    @Override // defpackage.jdc
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.g.length; i5++) {
            igx h = h(i5);
            if (h != null) {
                h.k(z, i, i2, i3, i4);
            }
        }
    }

    @Override // defpackage.jdc
    public final void f(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.o = MotionEvent.obtain(motionEvent);
        }
    }

    @Override // defpackage.jdc
    public final boolean g(MotionEvent motionEvent) {
        igx igxVar = this.k;
        if (igxVar == null || !igxVar.B(motionEvent)) {
            return false;
        }
        n(motionEvent);
        return true;
    }

    public final igx h(int i) {
        if (!this.r[i]) {
            return null;
        }
        igx igxVar = this.g[i];
        if (igxVar == null) {
            icd icdVar = this.h[i];
            huc hucVar = new huc(this);
            igxVar = (igx) jbt.v(this.a.getClassLoader(), igx.class, icdVar.a, new Class[]{Context.class, igy.class}, this.a, hucVar);
            if (igxVar != null) {
                hucVar.a = igxVar;
            }
            this.g[i] = igxVar;
        }
        return igxVar;
    }

    public final void i() {
        MotionEvent motionEvent = this.o;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.o = null;
        }
    }

    public final void j() {
        if (!this.n) {
            return;
        }
        l();
        int i = 0;
        this.n = false;
        for (int i2 = 0; i2 < this.g.length; i2++) {
            igx h = h(i2);
            if (h != null) {
                h.g();
            }
        }
        i();
        ino M = ino.M(this.a);
        while (true) {
            icd[] icdVarArr = this.h;
            if (i >= icdVarArr.length) {
                return;
            }
            String str = icdVarArr[i].b;
            if (str != null) {
                M.af(this.i, str);
            }
            i++;
        }
    }

    public final void k(ino inoVar, int i, boolean z) {
        boolean ak;
        icd icdVar = this.h[i];
        String str = icdVar.b;
        if (str == null) {
            ak = true;
        } else {
            ak = inoVar.ak(str);
            if (icdVar.c) {
                ak = !ak;
            }
        }
        if (this.r[i] != ak) {
            if (z) {
                l();
            }
            this.r[i] = ak;
            if (ak) {
                igx h = h(i);
                h.n(this.j);
                if (this.l == null && (h instanceof igz)) {
                    this.l = (igz) h;
                }
                if (this.n) {
                    h.e();
                }
                int i2 = this.s;
                if (i2 == 1) {
                    h.y();
                    h.k(true, this.j.getLeft(), this.j.getTop(), this.j.getRight(), this.j.getBottom());
                    return;
                } else if (i2 != 2) {
                    return;
                } else {
                    h.j();
                    return;
                }
            }
            igx igxVar = this.g[i];
            if (igxVar == null) {
                return;
            }
            gvt.a(igxVar);
            igz igzVar = this.l;
            igx[] igxVarArr = this.g;
            if (igzVar == igxVarArr[i]) {
                this.l = null;
            }
            igxVarArr[i] = null;
        }
    }

    public final void l() {
        for (int i = 0; i < this.g.length; i++) {
            igx h = h(i);
            if (h != null) {
                h.m();
            }
        }
        this.m = false;
        this.k = null;
        this.s = 0;
    }

    public final void m(SoftKeyboardView softKeyboardView) {
        if (softKeyboardView == null && this.j != null) {
            l();
        }
        this.j = softKeyboardView;
        for (int i = 0; i < this.g.length; i++) {
            igx h = h(i);
            if (h != null) {
                h.n(this.j);
            }
        }
    }
}
