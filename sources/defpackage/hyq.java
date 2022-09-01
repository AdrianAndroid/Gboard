package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hyq  reason: default package */
/* loaded from: classes.dex */
public final class hyq {
    public static final hyr a() {
        return (hyr) ijl.b().a(hyr.class);
    }

    public static final boolean b() {
        hyr a = a();
        if (a != null && a.b > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = a.b;
            if (currentTimeMillis < j && j - currentTimeMillis <= hyr.a) {
                return true;
            }
        }
        return false;
    }

    public static final void c(int i, boolean z) {
        ijl.b().g(new hyp(i, z));
    }

    public static int d(boolean z, boolean z2) {
        int f = f();
        if (f == 2) {
            if (!z) {
                return 1;
            }
            f = 2;
        }
        if (f != 4 || z2) {
            return f;
        }
        return 1;
    }

    public static int e(boolean z, boolean z2) {
        return d(z, z2) == 4 ? 4 : 1;
    }

    public static int f() {
        int b = ino.L().b(l(irn.d()), 1);
        return b == 4 ? j() ? 4 : 1 : b;
    }

    public static View g(View view, int i) {
        return (view == null || i != 3) ? view : view.findViewById(R.id.keyboard_holder);
    }

    public static boolean h(Context context) {
        return jam.b(context) >= ((Double) hwq.a.c()).floatValue();
    }

    public static boolean i() {
        long longValue = ((Long) hwq.h.c()).longValue();
        if (longValue < 0) {
            hwq.h.i();
            longValue = ((Long) hwq.h.c()).longValue();
            ieh.j().e(hhv.READ_TIMESTAMP_ERROR, 0);
        }
        return longValue <= 0 || gva.c() >= longValue;
    }

    public static boolean j() {
        String d = irn.d();
        if (((Boolean) hwq.i.c()).booleanValue()) {
            if (((Boolean) gzq.b.c()).booleanValue() && "foldable".equals(d)) {
                return true;
            }
            return ((Boolean) gzq.a.c()).booleanValue() && "tablet_large".equals(d);
        }
        return false;
    }

    public static boolean k(Context context) {
        if (gzq.c(context) || gzq.e(context)) {
            return false;
        }
        return ((Boolean) hwq.n.c()).booleanValue();
    }

    public static String l(String str) {
        return m(str).concat("keyboard_mode");
    }

    public static String m(String str) {
        return str.equals("foldable") ? "keyboard_mode_foldable_" : "";
    }

    public static hiz n(hdi hdiVar) {
        return hdiVar.a().u(fxd.s, mjl.a);
    }

    public static void o(hdi hdiVar, hel helVar) {
        hdiVar.e(((hea) helVar).a);
    }

    public static llp p(hbe hbeVar, llp llpVar, int i, hdl hdlVar, boolean z, boolean z2) {
        return q(hbeVar, llpVar, i, hdlVar, z, z2, -1);
    }

    public static llp q(hbe hbeVar, llp llpVar, int i, hdl hdlVar, boolean z, boolean z2, int i2) {
        int i3;
        llk e = llp.e();
        hdz a = hdz.a();
        int size = llpVar.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            hel helVar = (hel) llpVar.get(i6);
            if (i2 != -1 && i5 >= i2) {
                break;
            }
            if (helVar.b() == 1) {
                if (a.g(helVar.a(), hdlVar)) {
                    llp b = a.b(hbeVar.a(helVar.a()), hdlVar);
                    if (!z2 || ((lrl) b).c <= 1) {
                        b = llp.q();
                    }
                    e.h(new hcq(i, i5, helVar.a(), (String[]) b.toArray(new String[i4]), z));
                    i5++;
                }
            } else {
                helVar.b();
                if (helVar.b() == 4) {
                    i3 = i5 + 1;
                    e.h(new hcs(i, i5, helVar.c()));
                } else if (helVar.b() == 3) {
                    i3 = i5 + 1;
                    helVar.d();
                    e.h(new hbl(i, i5));
                } else if (helVar.b() == 5) {
                    e.h(new hde(i, i5));
                    i5++;
                } else {
                    helVar.b();
                }
                i5 = i3;
            }
            i6++;
            i4 = 0;
        }
        return e.g();
    }

    public static hiz r(hbe hbeVar, hdj hdjVar, hdl hdlVar, int i, boolean z) {
        hiz b = hdjVar.b();
        return hiz.k(kcu.X(b, ((hau) hbeVar).f).a(new hdd(b, hbeVar, hdlVar, z, i, 0), mjl.a));
    }

    public static void s(Context context) {
        jai.b.a(context);
        hdq.f(context);
    }

    public static /* synthetic */ void t(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public static hiz u(final hbe hbeVar, dxe dxeVar, final hdl hdlVar, final int i, final boolean z, final boolean z2) {
        long longValue = ((Long) ean.e.c()).longValue();
        final hiz p = hiz.p(new cvs((kcq) dxeVar.a, cnx.h(), (int) longValue, 1, null, null, null), gxo.a(1));
        return hiz.k(kcu.X(p, ((hau) hbeVar).f).a(new Callable() { // from class: hdc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hiz hizVar = hiz.this;
                return hyq.q(hbeVar, (llp) Collection$EL.stream((llp) hizVar.A(llp.q())).map(eoe.g).collect(ljr.a), -1, hdlVar, z, z2, i);
            }
        }, mjl.a));
    }
}
