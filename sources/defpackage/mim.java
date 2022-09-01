package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mim  reason: default package */
/* loaded from: classes.dex */
public final class mim extends mio {
    public mim(mko mkoVar, miy miyVar) {
        super(mkoVar, miyVar);
    }

    @Override // defpackage.mio
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        miy miyVar = (miy) obj;
        mko a = miyVar.a(obj2);
        jdg.O(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", miyVar);
        return a;
    }

    @Override // defpackage.mio
    public final /* synthetic */ void f(Object obj) {
        p((mko) obj);
    }
}
