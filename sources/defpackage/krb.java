package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: krb  reason: default package */
/* loaded from: classes.dex */
public final class krb {
    public final SQLiteDatabase a;
    public final Executor b;
    public final Executor c;
    public volatile boolean d = false;
    public final opu e;

    public krb(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.c = executor2;
        this.e = opuVar;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        throw new IllegalStateException("Already closed");
    }
}
