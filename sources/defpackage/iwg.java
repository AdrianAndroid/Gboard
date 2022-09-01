package defpackage;

import android.content.Context;
import java.util.EnumSet;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iwg  reason: default package */
/* loaded from: classes.dex */
public final class iwg extends idc implements idm {
    public static final ltg b = ltg.j("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessor");
    public final Context c;
    public final idb e = new iwh(this);
    public final Executor d = gxo.c(19);

    public iwg(Context context, idi idiVar) {
        super(idiVar);
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str, String str2) {
        return String.format(Locale.US, "TC.TB.%s.V3.%s", str, str2);
    }

    @Override // defpackage.idr
    public final lmz a() {
        return lmz.p(EnumSet.allOf(iwe.class));
    }

    public final void d(String str) {
        ido idoVar = this.e.b;
        if (idoVar == null) {
            return;
        }
        this.a.d(idoVar.b(), str.hashCode());
    }

    public final void g(int i) {
        ido idoVar = this.e.b;
        if (idoVar == null) {
            return;
        }
        this.a.d(idoVar.b(), i);
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.e.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return iwh.a;
    }
}
