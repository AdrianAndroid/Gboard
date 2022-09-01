package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gkw  reason: default package */
/* loaded from: classes.dex */
public final class gkw {
    private static final ltg d = ltg.j("com/google/android/libraries/gsa/io/impl/AsyncHttpConnection");
    public final bmi a;
    public final blw b;
    public final mld c;
    private final blw e;
    private final lfb f;
    private final blc g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private volatile RuntimeException i = null;
    private final dsl j;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, blw] */
    /* JADX WARN: Type inference failed for: r2v3, types: [mko, java.lang.Object] */
    public gkw(bmi bmiVar, blw blwVar, dsl dslVar, lfb lfbVar, blc blcVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bmiVar;
        jdg.u(blwVar);
        this.e = blwVar;
        this.j = dslVar;
        this.f = lfbVar;
        this.b = new gkv(this, dslVar.a);
        mld e = mld.e();
        this.c = e;
        this.g = blcVar;
        kcu.U(dslVar.b, new eay(this, 18), mjl.a);
        e.d(new fqa(this, 8), mjl.a);
    }

    public final void a() {
        if (!this.h.getAndSet(true)) {
            ((glz) this.j.c).a(656395);
            this.b.c();
            this.e.c();
        }
    }

    protected final void finalize() {
        super.finalize();
    }
}
