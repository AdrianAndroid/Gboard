package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fvi  reason: default package */
/* loaded from: classes.dex */
abstract class fvi extends fou {
    public fvi(fod fodVar) {
        super(fodVar);
    }

    protected abstract void b(fvo fvoVar);

    @Override // defpackage.fou
    protected final /* bridge */ /* synthetic */ void c(fnr fnrVar) {
        fvm fvmVar = (fvm) fnrVar;
        Context context = fvmVar.a;
        b((fvo) fvmVar.w());
    }
}
