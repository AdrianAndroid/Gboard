package defpackage;

/* compiled from: PG */
/* renamed from: cqh  reason: default package */
/* loaded from: classes.dex */
public final class cqh {
    public static final ngt d;
    private static final lgb e = jdg.n(cqg.a);
    public final cqa a;
    public final cpu b;
    public final cpl c;

    static {
        ldu lduVar = ldu.a;
        llk e2 = llp.e();
        llk e3 = llp.e();
        kws.k("CREATE TABLE IF NOT EXISTS emoticon_shares (emoticon TEXT NOT NULL, truncated_timestamp_millis INTEGER NOT NULL, last_event_millis INTEGER NOT NULL, shares INTEGER NOT NULL)", e2);
        kws.k("CREATE TABLE IF NOT EXISTS emoji_shares (emoji TEXT NOT NULL, base_variant_emoji TEXT NOT NULL, truncated_timestamp_millis INTEGER NOT NULL, last_event_millis INTEGER NOT NULL, shares INTEGER NOT NULL)", e2);
        kws.k("CREATE TABLE IF NOT EXISTS animated_emoji_usage (animated_emoji TEXT NOT NULL, truncated_timestamp_millis INTEGER NOT NULL, last_event_millis INTEGER NOT NULL, usage INTEGER NOT NULL)", e2);
        e2.h(new cpo(false));
        e2.h(new cpx());
        e2.h(new cpo(true));
        d = new ngt(lduVar, e2.g(), e3.g(), new krm());
    }

    public cqh(iqx iqxVar, hbd hbdVar) {
        this.a = new cqa(iqxVar);
        this.b = new cpu(iqxVar, hbdVar);
        this.c = new cpl(iqxVar);
    }

    public static cqh a() {
        return (cqh) e.a();
    }
}
