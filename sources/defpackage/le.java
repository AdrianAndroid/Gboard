package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* renamed from: le  reason: default package */
/* loaded from: classes.dex */
final class le extends DataSetObserver {
    final /* synthetic */ lg a;

    public le(lg lgVar) {
        this.a = lgVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.u()) {
            this.a.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
