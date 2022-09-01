package defpackage;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* renamed from: htu  reason: default package */
/* loaded from: classes.dex */
public final class htu implements AutoCloseable, htd, jdt {
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/keyboard/impl/KeyboardViewHelper");
    public final icf a;
    public final long b;
    public final hud c;
    public long d = 0;
    public final hul e;
    private final htt g;
    private SoftKeyboardView h;

    public htu(htt httVar, icf icfVar, hud hudVar) {
        this.g = httVar;
        this.a = icfVar;
        this.c = hudVar;
        this.b = icfVar.h.d;
        this.e = new hul(icfVar);
    }

    @Override // defpackage.htd
    public final void a(View view) {
        SoftKeyboardView softKeyboardView = this.h;
        if (softKeyboardView != view || softKeyboardView == null) {
            return;
        }
        softKeyboardView.u = null;
        softKeyboardView.j(null);
        this.h = null;
        this.e.c = null;
        this.c.m(null);
        this.g.h(this.a);
    }

    @Override // defpackage.htd
    public final boolean b(int i, View view) {
        return this.h == view && view != null && this.g.m(i);
    }

    public final int c() {
        return this.a.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        g();
        this.c.close();
        this.e.close();
    }

    public final void e() {
        MotionEvent motionEvent;
        hud hudVar = this.c;
        ino M = ino.M(hudVar.a);
        int i = 0;
        while (true) {
            icd[] icdVarArr = hudVar.h;
            if (i >= icdVarArr.length) {
                break;
            }
            String str = icdVarArr[i].b;
            if (str != null) {
                M.Y(hudVar.i, str);
            }
            i++;
        }
        for (int i2 = 0; i2 < hudVar.g.length; i2++) {
            hudVar.k(M, i2, false);
            igx h = hudVar.h(i2);
            if (h != null) {
                h.e();
                if (hudVar.k == null && (motionEvent = hudVar.o) != null && h.A(motionEvent)) {
                    hudVar.m = true;
                    hudVar.k = h;
                    h.z(hudVar.o);
                }
            }
        }
        hudVar.i();
        hudVar.n = true;
    }

    public final void f() {
        this.c.j();
    }

    public final void g() {
        a(this.h);
    }

    public final void i(List list) {
        hul hulVar = this.e;
        hulVar.b();
        if (list != null) {
            mko hQ = gxo.a(5).hQ(new gnq(hulVar, list, 7));
            hulVar.h = hQ;
            kcu.U(hQ, new fel(hulVar, hQ, 5), gyc.a);
            return;
        }
        hulVar.f();
    }

    public final void j(long j) {
        long j2 = this.d;
        long j3 = this.b;
        long j4 = (j2 ^ j) & j3;
        if (j4 != 0) {
            long j5 = j & j3;
            this.d = j5;
            this.e.a(j5, j4);
            hud hudVar = this.c;
            long j6 = this.d;
            for (int i = 0; i < hudVar.g.length; i++) {
                igx h = hudVar.h(i);
                if (h != null) {
                    h.gP(j2, j6);
                }
            }
        }
    }

    public final void h(ibi ibiVar) {
        hul hulVar = this.e;
        ibi ibiVar2 = hulVar.d;
        if (ibiVar2 != ibiVar) {
            if (ibiVar2 != null) {
                SparseArray sparseArray = hulVar.b.h.b;
                SparseArray sparseArray2 = ibiVar2.b;
                int size = sparseArray2.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray2.keyAt(i);
                    icy icyVar = (icy) sparseArray.get(keyAt);
                    hulVar.e.put(keyAt, icyVar == null ? null : (ict) icyVar.c(hulVar.f));
                }
            }
            hulVar.d = ibiVar;
            hulVar.c();
            hulVar.d();
        }
    }

    public final View d(ViewGroup viewGroup) {
        htc d;
        int a;
        jda e;
        SoftKeyboardView softKeyboardView = this.h;
        if (softKeyboardView == null) {
            softKeyboardView = this.g.e(this, this.a.d, viewGroup);
            this.h = softKeyboardView;
            softKeyboardView.j(this.c);
            this.c.m(softKeyboardView);
            if (this.a.f) {
                float b = this.g.b();
                float a2 = this.g.a();
                if (softKeyboardView.s != b || softKeyboardView.t != a2) {
                    softKeyboardView.s = b;
                    softKeyboardView.t = a2;
                    softKeyboardView.g();
                    int size = softKeyboardView.j.size();
                    for (int i = 0; i < size; i++) {
                        ((SoftKeyView) softKeyboardView.j.valueAt(i)).k(softKeyboardView.s * softKeyboardView.t);
                    }
                    int size2 = softKeyboardView.i.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((jdb) softKeyboardView.i.valueAt(i2)).y(softKeyboardView.s, softKeyboardView.t);
                    }
                }
                ((ltd) ((ltd) f.b()).k("com/google/android/libraries/inputmethod/keyboard/impl/KeyboardViewHelper", "getView", 168, "KeyboardViewHelper.java")).w("Get view with height ratio:%f", Float.valueOf(b));
            }
            hul hulVar = this.e;
            SoftKeyboardView softKeyboardView2 = this.h;
            hulVar.c = softKeyboardView2;
            if (softKeyboardView2.n) {
                softKeyboardView2.o = new boolean[softKeyboardView2.j.size()];
                softKeyboardView2.p = new boolean[softKeyboardView2.i.size()];
            }
            hulVar.g(0L);
            hulVar.e(0L);
            if (!softKeyboardView2.n) {
                softKeyboardView2.n = true;
            } else {
                boolean[] zArr = softKeyboardView2.o;
                if (zArr != null) {
                    int size3 = softKeyboardView2.j.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        if (!zArr[i3]) {
                            ((SoftKeyView) softKeyboardView2.j.valueAt(i3)).n(null);
                        }
                    }
                    softKeyboardView2.o = null;
                }
                boolean[] zArr2 = softKeyboardView2.p;
                if (zArr2 != null) {
                    int size4 = softKeyboardView2.i.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        if (!zArr2[i4] && (e = softKeyboardView2.e(i4)) != null) {
                            e.gw(null);
                        }
                    }
                    softKeyboardView2.p = null;
                }
            }
            if (this.a.g != null) {
                icb icbVar = icb.LTR;
                int ordinal = this.a.g.ordinal();
                if (ordinal == 0) {
                    softKeyboardView.setLayoutDirection(0);
                } else if (ordinal == 1) {
                    softKeyboardView.setLayoutDirection(1);
                } else if (ordinal == 3) {
                    softKeyboardView.setLayoutDirection(this.g.c());
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/keyboard/impl/KeyboardViewHelper", "getView", 184, "KeyboardViewHelper.java")).t("Unsupported direction specified");
                }
            }
            softKeyboardView.u = this;
            this.g.g(softKeyboardView, this.a);
        }
        if (this.a.b == ice.BODY && (d = this.g.d()) != null && softKeyboardView.g != (a = d.a())) {
            ((ltd) ((ltd) SoftKeyboardView.d.b()).k("com/google/android/libraries/inputmethod/widgets/SoftKeyboardView", "setMaxHeight", 725, "SoftKeyboardView.java")).u("Set max keyboard height:%d.", a);
            softKeyboardView.g = a;
            softKeyboardView.g();
        }
        softKeyboardView.setVisibility(softKeyboardView.h);
        return softKeyboardView;
    }
}
