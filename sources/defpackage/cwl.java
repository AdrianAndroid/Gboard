package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cwl  reason: default package */
/* loaded from: classes.dex */
public final class cwl {
    public final knk a;
    public final lgb b;
    public final lgb c;
    public final leq d;
    public final gjz e;
    private final hst inputSessionListener;
    private final hzr trimMemoryListener;

    public cwl(knk knkVar, lgb lgbVar, lgb lgbVar2, leq leqVar, gjz gjzVar, Executor executor, byte[] bArr) {
        this.a = knkVar;
        this.b = lgbVar;
        this.c = lgbVar2;
        this.d = leqVar;
        this.e = gjzVar;
        cwk cwkVar = new cwk(knkVar);
        cwkVar.g(executor);
        this.inputSessionListener = cwkVar;
        this.trimMemoryListener = icu.k(new bxj(knkVar, 18), executor);
    }
}
