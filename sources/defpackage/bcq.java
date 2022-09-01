package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bcq  reason: default package */
/* loaded from: classes.dex */
public final class bcq {
    public final aug a;
    public final List b = new ArrayList();
    public final atw c;
    public boolean d;
    public bco e;
    public boolean f;
    public bco g;
    public Bitmap h;
    public bco i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final axp n;
    private boolean o;
    private ats p;

    public bcq(atb atbVar, aug augVar, int i, int i2, ave aveVar, Bitmap bitmap) {
        axp axpVar = atbVar.a;
        atw c = atb.c(atbVar.a());
        ats n = atb.c(atbVar.a()).b().n(((beu) ((beu) beu.c(awt.a).T()).S()).H(i, i2));
        this.c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new fre(this, 1));
        this.n = axpVar;
        this.m = handler;
        this.p = n;
        this.a = augVar;
        e(aveVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return ((auk) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        bco bcoVar = this.i;
        if (bcoVar != null) {
            this.i = null;
            c(bcoVar);
            return;
        }
        this.o = true;
        auk aukVar = (auk) this.a;
        aui auiVar = aukVar.f;
        int i2 = auiVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = aukVar.e) >= 0) {
            i3 = i < i2 ? ((auh) auiVar.e.get(i)).i : -1;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.a.b();
        this.g = new bco(this.m, ((auk) this.a).e, uptimeMillis + i3);
        this.p.n(beu.d(new bfu(Double.valueOf(Math.random())))).i(this.a).s(this.g);
    }

    public final void c(bco bcoVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, bcoVar).sendToTarget();
        } else if (!this.d) {
            this.i = bcoVar;
        } else {
            if (bcoVar.b != null) {
                d();
                bco bcoVar2 = this.e;
                this.e = bcoVar;
                int size = this.b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((bcp) this.b.get(size)).c();
                }
                if (bcoVar2 != null) {
                    this.m.obtainMessage(2, bcoVar2).sendToTarget();
                }
            }
            b();
        }
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ave aveVar, Bitmap bitmap) {
        ce.m(aveVar);
        ce.m(bitmap);
        this.h = bitmap;
        this.p = this.p.n(new beu().M(aveVar));
        this.j = bgj.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
