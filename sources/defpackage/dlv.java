package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dlv  reason: default package */
/* loaded from: classes.dex */
public final class dlv implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessor");
    public final Context b;
    public final mkr c;
    public boolean d = false;
    public boolean e = false;
    public final idb h = new dlw(this);
    public final nfh f = mpy.b.t();
    public final nfh g = mpx.e.t();

    public dlv(Context context) {
        mks a2 = gxo.a(11);
        this.b = context;
        this.c = a2;
    }

    public final long a() {
        return this.h.e.a(iwd.a);
    }

    @Override // defpackage.idj
    public final void e() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessor", "onAttached", 82, "InputActionMetricsProcessor.java")).t("Attached to metrics manager.");
    }

    @Override // defpackage.idj
    public final void f() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionMetricsProcessor", "onDetached", 87, "InputActionMetricsProcessor.java")).t("Detached from metrics manager.");
        jan.b.e(dlt.a(this.b, false));
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.h.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final boolean s() {
        return false;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return dlw.a;
    }
}
