package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mhs  reason: default package */
/* loaded from: classes.dex */
public final class mhs extends mhu {
    public mhs(mko mkoVar, Class cls, miy miyVar) {
        super(mkoVar, cls, miyVar);
    }

    @Override // defpackage.mhu
    public final /* bridge */ /* synthetic */ Object e(Object obj, Throwable th) {
        miy miyVar = (miy) obj;
        mko a = miyVar.a(th);
        jdg.O(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", miyVar);
        return a;
    }

    @Override // defpackage.mhu
    public final /* synthetic */ void f(Object obj) {
        p((mko) obj);
    }
}
