package defpackage;

/* compiled from: PG */
/* renamed from: dnp  reason: default package */
/* loaded from: classes.dex */
public final class dnp {
    public static final hhl a = hhq.f("candidate_merging_strategy", 0);
    static final hhl b = hhq.h("candidate_merging_applist", "com.google.android.apps.maps*,com.google.android.apps.gmm*");
    public final hlj c;
    public final cbg d;
    public final hls e;
    public boolean f;
    public final iqe g = iqe.e(b, 3);

    public dnp(hlj hljVar, cbg cbgVar, hls hlsVar) {
        this.c = hljVar;
        this.d = cbgVar;
        this.e = hlsVar;
    }

    public final boolean a() {
        return this.f && ((Long) a.c()).longValue() > 0;
    }
}
