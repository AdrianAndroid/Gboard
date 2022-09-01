package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ebr  reason: default package */
/* loaded from: classes.dex */
public final class ebr implements AutoCloseable, hhk {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsHelper");
    static final hhl b = hhq.f("emotion_model_max_input_words", 30);
    public volatile int c = ((Long) b.c()).intValue();
    public final hhl d;
    public volatile boolean e;
    public final igr f;
    private final hhl g;

    private ebr(igr igrVar, hhl hhlVar, hhl hhlVar2) {
        this.f = igrVar;
        this.g = hhlVar;
        this.d = hhlVar2;
        this.e = ((Boolean) hhlVar.c()).booleanValue();
    }

    public static ebr b(Context context, hhl hhlVar, hhl hhlVar2) {
        ebr ebrVar = new ebr(igr.d(context), hhlVar, hhlVar2);
        ebrVar.g.e(ebrVar);
        return ebrVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.g.g(this);
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        this.e = ((Boolean) this.g.c()).booleanValue();
        this.c = ((Long) b.c()).intValue();
    }
}
