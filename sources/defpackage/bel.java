package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bel  reason: default package */
/* loaded from: classes.dex */
public class bel implements Cloneable {
    public Drawable d;
    public int e;
    public Drawable f;
    public boolean k;
    public boolean p;
    public boolean q;
    public boolean s;
    private int t;
    private int u;
    private Drawable v;
    private int w;
    private boolean x;
    private Resources.Theme y;
    private boolean z;
    public float a = 1.0f;
    public awt b = awt.c;
    public atk c = atk.NORMAL;
    public boolean g = true;
    public int h = -1;
    public int i = -1;
    public auw j = bft.b;
    public boolean l = true;
    public ava m = new ava();
    public Map n = new bfx();
    public Class o = Object.class;
    public boolean r = true;

    private final bel a(bbb bbbVar, ave aveVar) {
        return c(bbbVar, aveVar, false);
    }

    private final bel b(bbb bbbVar, ave aveVar) {
        return c(bbbVar, aveVar, true);
    }

    private final bel c(bbb bbbVar, ave aveVar, boolean z) {
        bel F;
        if (z) {
            F = O(bbbVar, aveVar);
        } else {
            F = F(bbbVar, aveVar);
        }
        F.r = true;
        return F;
    }

    private static boolean d(int i, int i2) {
        return (i & i2) != 0;
    }

    public bel A() {
        return b(bbb.a, new bbj());
    }

    public bel B(boolean z) {
        if (this.p) {
            return clone().B(z);
        }
        this.q = z;
        this.t |= 524288;
        U();
        return this;
    }

    public bel C() {
        return F(bbb.c, new bar());
    }

    public bel D() {
        return a(bbb.b, new bas());
    }

    public bel E() {
        return a(bbb.a, new bbj());
    }

    final bel F(bbb bbbVar, ave aveVar) {
        if (this.p) {
            return clone().F(bbbVar, aveVar);
        }
        x(bbbVar);
        return N(aveVar, false);
    }

    public bel G(int i) {
        return H(i, i);
    }

    public bel H(int i, int i2) {
        if (this.p) {
            return clone().H(i, i2);
        }
        this.i = i;
        this.h = i2;
        this.t |= 512;
        U();
        return this;
    }

    public bel I(Drawable drawable) {
        if (this.p) {
            return clone().I(drawable);
        }
        this.f = drawable;
        int i = this.t;
        this.u = 0;
        this.t = (i | 64) & (-129);
        U();
        return this;
    }

    public bel J(atk atkVar) {
        if (this.p) {
            return clone().J(atkVar);
        }
        ce.m(atkVar);
        this.c = atkVar;
        this.t |= 8;
        U();
        return this;
    }

    public bel K(auz auzVar, Object obj) {
        if (this.p) {
            return clone().K(auzVar, obj);
        }
        ce.m(auzVar);
        ce.m(obj);
        this.m.d(auzVar, obj);
        U();
        return this;
    }

    public bel L(auw auwVar) {
        if (this.p) {
            return clone().L(auwVar);
        }
        ce.m(auwVar);
        this.j = auwVar;
        this.t |= 1024;
        U();
        return this;
    }

    public bel M(ave aveVar) {
        return N(aveVar, true);
    }

    final bel N(ave aveVar, boolean z) {
        if (this.p) {
            return clone().N(aveVar, z);
        }
        bbh bbhVar = new bbh(aveVar, z);
        P(Bitmap.class, aveVar, z);
        P(Drawable.class, bbhVar, z);
        P(BitmapDrawable.class, bbhVar, z);
        P(bck.class, new bcn(aveVar), z);
        U();
        return this;
    }

    final bel O(bbb bbbVar, ave aveVar) {
        if (this.p) {
            return clone().O(bbbVar, aveVar);
        }
        x(bbbVar);
        return M(aveVar);
    }

    final bel P(Class cls, ave aveVar, boolean z) {
        if (this.p) {
            return clone().P(cls, aveVar, z);
        }
        ce.m(cls);
        ce.m(aveVar);
        this.n.put(cls, aveVar);
        int i = this.t;
        this.l = true;
        int i2 = i | 67584;
        this.t = i2;
        this.r = false;
        if (z) {
            this.t = i2 | 131072;
            this.k = true;
        }
        U();
        return this;
    }

    public final boolean Q(int i) {
        return d(this.t, i);
    }

    public final boolean R() {
        return bgj.p(this.i, this.h);
    }

    public bel S() {
        if (this.p) {
            return clone().S();
        }
        this.g = false;
        this.t |= 256;
        U();
        return this;
    }

    public bel T() {
        if (this.p) {
            return clone().T();
        }
        this.s = true;
        this.t |= 1048576;
        U();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U() {
        if (!this.x) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public void V() {
        this.x = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bel) {
            bel belVar = (bel) obj;
            if (Float.compare(belVar.a, this.a) == 0 && this.e == belVar.e && bgj.m(this.d, belVar.d)) {
                int i = belVar.u;
                if (bgj.m(this.f, belVar.f)) {
                    int i2 = belVar.w;
                    Drawable drawable = belVar.v;
                    if (bgj.m(null, null) && this.g == belVar.g && this.h == belVar.h && this.i == belVar.i && this.k == belVar.k && this.l == belVar.l) {
                        boolean z = belVar.z;
                        if (this.q == belVar.q && this.b.equals(belVar.b) && this.c == belVar.c && this.m.equals(belVar.m) && this.n.equals(belVar.n) && this.o.equals(belVar.o) && bgj.m(this.j, belVar.j)) {
                            Resources.Theme theme = belVar.y;
                            if (bgj.m(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int d = bgj.d(this.a);
        int f = bgj.f(null, bgj.e(0, bgj.f(this.f, bgj.e(0, bgj.f(this.d, bgj.e(this.e, d))))));
        boolean z = this.g;
        int i = this.h;
        int i2 = this.i;
        boolean z2 = this.k;
        boolean z3 = this.l;
        boolean z4 = this.q;
        return bgj.f(null, bgj.f(this.j, bgj.f(this.o, bgj.f(this.n, bgj.f(this.m, bgj.f(this.c, bgj.f(this.b, bgj.e(z4 ? 1 : 0, bgj.e(0, bgj.e(z3 ? 1 : 0, bgj.e(z2 ? 1 : 0, bgj.e(i2, bgj.e(i, bgj.e(z ? 1 : 0, f))))))))))))));
    }

    public bel n(bel belVar) {
        if (this.p) {
            return clone().n(belVar);
        }
        int i = belVar.t;
        if (d(i, 2)) {
            this.a = belVar.a;
        }
        if (d(i, 262144)) {
            boolean z = belVar.z;
            this.z = false;
        }
        if (d(i, 1048576)) {
            this.s = belVar.s;
        }
        if (d(i, 4)) {
            this.b = belVar.b;
        }
        if (d(i, 8)) {
            this.c = belVar.c;
        }
        if (d(i, 16)) {
            this.d = belVar.d;
            this.e = 0;
            this.t &= -33;
        }
        if (d(belVar.t, 32)) {
            this.e = belVar.e;
            this.d = null;
            this.t &= -17;
        }
        if (d(belVar.t, 64)) {
            this.f = belVar.f;
            this.u = 0;
            this.t &= -129;
        }
        if (d(belVar.t, 128)) {
            int i2 = belVar.u;
            this.u = 0;
            this.f = null;
            this.t &= -65;
        }
        int i3 = belVar.t;
        if (d(i3, 256)) {
            this.g = belVar.g;
        }
        if (d(i3, 512)) {
            this.i = belVar.i;
            this.h = belVar.h;
        }
        if (d(i3, 1024)) {
            this.j = belVar.j;
        }
        if (d(i3, 4096)) {
            this.o = belVar.o;
        }
        if (d(i3, 8192)) {
            Drawable drawable = belVar.v;
            this.v = null;
            this.w = 0;
            this.t &= -16385;
        }
        if (d(belVar.t, 16384)) {
            int i4 = belVar.w;
            this.w = 0;
            this.v = null;
            this.t &= -8193;
        }
        int i5 = belVar.t;
        if (d(i5, 32768)) {
            Resources.Theme theme = belVar.y;
            this.y = null;
        }
        if (d(i5, 65536)) {
            this.l = belVar.l;
        }
        if (d(i5, 131072)) {
            this.k = belVar.k;
        }
        if (d(i5, 2048)) {
            this.n.putAll(belVar.n);
            this.r = belVar.r;
        }
        if (d(belVar.t, 524288)) {
            this.q = belVar.q;
        }
        if (!this.l) {
            this.n.clear();
            int i6 = this.t;
            this.k = false;
            this.t = i6 & (-133121);
            this.r = true;
        }
        this.t |= belVar.t;
        this.m.c(belVar.m);
        U();
        return this;
    }

    @Override // 
    /* renamed from: o */
    public bel clone() {
        try {
            bel belVar = (bel) super.clone();
            ava avaVar = new ava();
            belVar.m = avaVar;
            avaVar.c(this.m);
            bfx bfxVar = new bfx();
            belVar.n = bfxVar;
            bfxVar.putAll(this.n);
            belVar.x = false;
            belVar.p = false;
            return belVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public bel u() {
        return b(bbb.b, new bas());
    }

    public bel v(Class cls) {
        if (this.p) {
            return clone().v(cls);
        }
        ce.m(cls);
        this.o = cls;
        this.t |= 4096;
        U();
        return this;
    }

    public bel w(awt awtVar) {
        if (this.p) {
            return clone().w(awtVar);
        }
        ce.m(awtVar);
        this.b = awtVar;
        this.t |= 4;
        U();
        return this;
    }

    public bel x(bbb bbbVar) {
        auz auzVar = bbb.f;
        ce.m(bbbVar);
        return K(auzVar, bbbVar);
    }

    public bel y(int i) {
        if (this.p) {
            return clone().y(i);
        }
        this.e = i;
        int i2 = this.t;
        this.d = null;
        this.t = (i2 | 32) & (-17);
        U();
        return this;
    }

    public bel z(Drawable drawable) {
        if (this.p) {
            return clone().z(drawable);
        }
        this.d = drawable;
        int i = this.t;
        this.e = 0;
        this.t = (i | 16) & (-33);
        U();
        return this;
    }

    public bel t() {
        if (!this.x || this.p) {
            this.p = true;
            V();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
}
