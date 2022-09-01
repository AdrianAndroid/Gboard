package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* compiled from: PG */
/* renamed from: kqz  reason: default package */
/* loaded from: classes.dex */
final class kqz implements SQLiteTransactionListener {
    final /* synthetic */ kra a;

    public kqz(kra kraVar) {
        this.a = kraVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (this.a.a) {
            return;
        }
        throw new krp();
    }
}
