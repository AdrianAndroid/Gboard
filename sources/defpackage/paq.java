package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: paq  reason: default package */
/* loaded from: classes2.dex */
public final class paq implements ozr {
    final Object a;
    private final /* synthetic */ int b;

    public paq(Callable callable, int i) {
        this.b = i;
        this.a = callable;
    }

    public paq(pav pavVar, int i) {
        this.b = i;
        this.a = pavVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.pan
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            try {
                ((ozs) obj).b(this.a.call());
                return;
            } catch (Throwable th) {
                ols.p(th);
                ((ozs) obj).il(th);
                return;
            }
        }
        ozs ozsVar = (ozs) obj;
        ozt oztVar = new ozt(ozsVar);
        ozsVar.c(oztVar);
        Object obj2 = this.a;
        par parVar = new par(oztVar);
        oztVar.a.a(parVar);
        ((pav) obj2).a.a(parVar);
    }
}
