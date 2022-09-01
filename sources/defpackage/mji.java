package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mji  reason: default package */
/* loaded from: classes.dex */
public final class mji extends mjj {
    final /* synthetic */ mjk a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mji(mjk mjkVar, Callable callable, Executor executor) {
        super(mjkVar, executor);
        this.a = mjkVar;
        jdg.u(callable);
        this.c = callable;
    }

    @Override // defpackage.mkn
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.mkn
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.mjj
    public final void c(Object obj) {
        this.a.c(obj);
    }
}
