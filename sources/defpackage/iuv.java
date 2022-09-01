package defpackage;

import android.content.Context;
import android.util.SparseBooleanArray;
import j$.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: iuv  reason: default package */
/* loaded from: classes.dex */
public final class iuv implements idm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaeprocessor/NebulaeTrainingCacheMetricsProcessor");
    static final hic b = hhq.k("training_cache_experiment_id_list", njc.b);
    static final hhl c = hhq.a("enable_auto_correction_stats", false);
    static final hhl d = hhq.a("enable_spatial_stats", false);
    static final hhl e = hhq.a("enable_typo_stats", false);
    static final hhl f = hhq.a("enable_metric_counters", false);
    static final hic g = hhq.k("metric_counter_aliases", njc.b);
    static final hhl h = hhq.a("enable_ac_threshold", false);
    static final hhl i = hhq.a("enable_kc_threshold", false);
    public final Context j;
    public final ixj k;
    public final idk l;
    public final Supplier m;
    public mrm p;
    public mvi q;
    public mro r;
    public mql s;
    public byte[] t;
    public byte[] u;
    public byte[] v;
    public byte[] w;
    public byte[] x;
    public final List n = new ArrayList();
    public final SparseBooleanArray o = new SparseBooleanArray();
    public final nfh A = mve.g.t();
    public final nfh z = mxa.u.t();
    public final idb y = new iuw(this);

    static {
        hhq.a("enable_metric_counts_stats", false);
    }

    public iuv(Context context, ixj ixjVar, idk idkVar, Supplier supplier) {
        this.j = context;
        this.k = ixjVar;
        this.l = idkVar;
        this.m = supplier;
    }

    public final long a() {
        return this.y.e.a(iwd.a);
    }

    @Override // defpackage.idj
    public final void e() {
    }

    @Override // defpackage.idj
    public final void f() {
        this.o.clear();
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.y.b(idoVar, iduVar, j, j2, objArr);
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
        return iuw.a;
    }
}
