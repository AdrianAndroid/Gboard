package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* renamed from: akz  reason: default package */
/* loaded from: classes.dex */
final class akz extends DataSetObserver {
    final /* synthetic */ alc a;

    public akz(alc alcVar) {
        this.a = alcVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.d();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.d();
    }
}
