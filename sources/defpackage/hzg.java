package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hzg  reason: default package */
/* loaded from: classes.dex */
public final class hzg implements idm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessor");
    public final ino b;
    public final idb c = new hzh(this);
    private final idi d;

    public hzg(idi idiVar, Context context) {
        this.d = idiVar;
        this.b = ino.K(context, "-mdd");
    }

    public static String a(String str, int i) {
        return String.format(Locale.US, "%s-%d", str, Integer.valueOf(i));
    }

    public final void b(mcm mcmVar) {
        idi idiVar = this.d;
        nfh t = mbh.aT.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbh mbhVar = (mbh) t.b;
        mcmVar.getClass();
        mbhVar.aJ = mcmVar;
        mbhVar.d |= 524288;
        mbh mbhVar2 = (mbh) t.cz();
        idb idbVar = this.c;
        idiVar.f(mbhVar2, 293, idbVar.c, idbVar.d);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.c.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return hzh.a;
    }
}
