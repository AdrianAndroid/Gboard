package defpackage;

/* compiled from: PG */
/* renamed from: iwp  reason: default package */
/* loaded from: classes.dex */
public final class iwp extends hzr {
    final /* synthetic */ iwq a;

    public iwp(iwq iwqVar) {
        this.a = iwqVar;
    }

    @Override // defpackage.hzr
    public final void a(int i) {
        mko mkoVar = this.a.d;
        if (mkoVar != null) {
            mkoVar.cancel(false);
        }
        this.a.b.c();
    }
}
