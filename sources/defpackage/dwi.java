package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: dwi  reason: default package */
/* loaded from: classes.dex */
public final class dwi {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaUiManager");
    public final dvu a;
    public final dwf b;
    public final dvm c;
    private final dwh e;
    private final ino f;
    private final dvz g;
    private final dvv h;
    private final dvx i;
    private Context j;
    private dwk k;
    private dwk l;
    private dwk m;
    private EditorInfo n;
    private hhk o;

    public dwi(dwh dwhVar, ino inoVar, dwf dwfVar, dvu dvuVar, dvm dvmVar) {
        this.e = dwhVar;
        this.f = inoVar;
        this.b = dwfVar;
        this.g = new dvz(dwhVar);
        this.a = dvuVar;
        this.h = new dvv(dwhVar);
        this.i = new dvx(dwhVar);
        this.c = dvmVar;
    }

    private static void l(boolean z) {
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaUiManager", "setScreenWakeLock", 566, "NgaUiManager.java")).t("ServiceLifeCycleNotification does not have a GoogleInputMethodService instance. There is no way to get a Window instance to toggle FLAG_KEEP_SCREEN_ON.");
            return;
        }
        Window window = b.getWindow().getWindow();
        if (window == null) {
            ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaUiManager", "setScreenWakeLock", 573, "NgaUiManager.java")).t("ServiceLifeCycleNotification does not have a Window instance. There is no way to toggle FLAG_KEEP_SCREEN_ON.");
        } else if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    private final void m() {
        if (this.o != null) {
            gqj.d.g(this.o);
            this.o = null;
        }
    }

    private final void n(bkr bkrVar, int i, int i2) {
        Context context = this.j;
        if (context == null) {
            return;
        }
        hsk b = hsx.b();
        dwm dwmVar = b == null ? null : new dwm(context, b);
        if (dwmVar == null) {
            return;
        }
        dwf dwfVar = this.b;
        if (true != bkrVar.b) {
            i = 2;
        }
        dwfVar.c(dwmVar, bkrVar, i, i2);
    }

    public final void a() {
        this.a.b.d(true, null);
        dwk dwkVar = this.m;
        if (dwkVar != null) {
            this.m = null;
            dwkVar.j();
            Context context = this.j;
            if (context == null) {
                return;
            }
            String string = context.getString(R.string.f158720_resource_name_obfuscated_res_0x7f14056e);
            nfh t = bki.c.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            bki bkiVar = (bki) t.b;
            bkiVar.b = true;
            string.getClass();
            bkiVar.a = string;
            dwr.a((bki) t.cz());
        }
    }

    public final void b(boolean z) {
        dvu dvuVar = this.a;
        dxa dxaVar = dvuVar.f;
        if (dxaVar != null) {
            dxaVar.c();
            dvuVar.f = null;
        }
        dvuVar.c(bkk.g);
        dvuVar.b.b();
        dvl dvlVar = dvuVar.e;
        if (dvlVar == null || !z) {
            dvuVar.a();
        } else {
            dvlVar.h(new dvd(dvuVar, 3));
        }
        dsl dslVar = dvuVar.h;
        if (dslVar != null) {
            grd.b(R.id.key_pos_header_access_points_menu, ((gqh) dslVar.a).a);
            dsl.a();
        }
        dvuVar.g = false;
        dvuVar.d = null;
        dvuVar.h = null;
        l(false);
    }

    public final void c() {
        dwk dwkVar = this.l;
        if (dwkVar == null) {
            return;
        }
        this.l = null;
        dwkVar.j();
    }

    public final void d() {
        dwk dwkVar = this.k;
        if (dwkVar != null) {
            this.k = null;
            dwkVar.j();
        }
    }

    public final void e() {
        this.b.a();
        m();
    }

    public final void f() {
        dvu dvuVar = this.a;
        bkk bkkVar = dvuVar.c;
        if (bkkVar.e) {
            return;
        }
        nfh nfhVar = (nfh) bkkVar.N(5);
        nfhVar.cG(bkkVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        bkk bkkVar2 = (bkk) nfhVar.b;
        bkkVar2.a = bkk.g.a;
        bkkVar2.b = bkk.G();
        dvuVar.d((bkk) nfhVar.cz());
    }

    public final void h(boolean z) {
        d();
        b(z);
        c();
        e();
        a();
    }

    public final void i(Context context, EditorInfo editorInfo) {
        this.j = context;
        this.n = editorInfo;
    }

    public final void j(boolean z) {
        View view;
        dvl dvoVar;
        d();
        dvu dvuVar = this.a;
        Context context = this.j;
        if (!dvuVar.g && context != null) {
            dvuVar.d = context;
            dvuVar.g = true;
            View view2 = null;
            if (dxa.e(context)) {
                dvuVar.f = new dxa(context, ino.M(context).x(R.string.f161150_resource_name_obfuscated_res_0x7f140693, false) ? null : dzg.e(dzg.d(context)));
                view = dvuVar.f.a();
            } else {
                view = null;
            }
            dwd dwdVar = dvuVar.a;
            dwdVar.f = new FrameLayout(context);
            dwdVar.g = LayoutInflater.from(context);
            dwdVar.e = view;
            View inflate = dwdVar.g.inflate(R.layout.f143680_resource_name_obfuscated_res_0x7f0e0480, (ViewGroup) dwdVar.f, false);
            if (inflate instanceof ViewGroup) {
                dwdVar.d = (ViewGroup) inflate;
            }
            dwdVar.c = dxf.b(context);
            dwdVar.h = context.getResources().getDimensionPixelSize(R.dimen.f41040_resource_name_obfuscated_res_0x7f070596);
            boolean booleanValue = ((Boolean) iho.b.c()).booleanValue();
            dvuVar.b.d = booleanValue;
            if (booleanValue) {
                SoftKeyboardView a = fcq.a();
                if (a != null) {
                    view2 = fcq.b(a);
                }
                if (view2 != null) {
                    dvuVar.h = new dsl(context, view2);
                    gqq.b(R.id.key_pos_header_access_points_menu, (gqh) dvuVar.h.a);
                }
            }
            dvuVar.b();
            dvuVar.c(dvuVar.c);
            dvl dvlVar = dvuVar.e;
            if (dvlVar != null) {
                dvlVar.g();
            } else {
                if (((Boolean) gqj.d.c()).booleanValue()) {
                    dvoVar = new dvq();
                } else {
                    dvoVar = new dvo();
                }
                dvuVar.e = dvoVar;
                dvuVar.e.j(z);
                dvuVar.e.k(dvuVar.c.c);
                dvuVar.e.l(context, booleanValue);
                ijf.j(jcj.b);
            }
        }
        l(true);
        dsv dsvVar = dsv.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (dsvVar.c > 0) {
            dsvVar.b();
        }
        dsvVar.c = elapsedRealtime;
        if (dsvVar.b > 0) {
            dsvVar.g.g(dta.NGA_MIC_TAP_TO_VOICE_UI_SHOWN_TIME, elapsedRealtime - dsvVar.b);
        }
    }

    public final void k(Context context, bkr bkrVar) {
        dwf dwfVar = this.b;
        int aF = lre.aF();
        hky a = hlf.a();
        a.p("NGA_MIC_TIP");
        a.m = 1;
        a.f(aF);
        a.d = new dwp(context, 3);
        a.g(context.getString(R.string.f158910_resource_name_obfuscated_res_0x7f140583));
        dwfVar.d(new dwq(context, a), bkrVar, true != bkrVar.b ? 2 : 8, 9, R.layout.f143920_resource_name_obfuscated_res_0x7f0e0498);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.bkn r17) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwi.g(bkn):void");
    }
}
