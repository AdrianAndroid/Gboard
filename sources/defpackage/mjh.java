package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mjh  reason: default package */
/* loaded from: classes.dex */
public final class mjh extends mjj {
    final /* synthetic */ mjk a;
    private final mix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjh(mjk mjkVar, mix mixVar, Executor executor) {
        super(mjkVar, executor);
        this.a = mjkVar;
        jdg.u(mixVar);
        this.c = mixVar;
    }

    @Override // defpackage.mkn
    public final /* bridge */ /* synthetic */ Object a() {
        mko a = this.c.a();
        jdg.O(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.c);
        return a;
    }

    @Override // defpackage.mkn
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.mjj
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.p((mko) obj);
    }
}
