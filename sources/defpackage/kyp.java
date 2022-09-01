package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kyp  reason: default package */
/* loaded from: classes.dex */
public final class kyp extends DataSetObserver {
    final /* synthetic */ kyv a;

    public kyp(kyv kyvVar) {
        this.a = kyvVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.f();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.f();
    }
}
