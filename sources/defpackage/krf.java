package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* renamed from: krf  reason: default package */
/* loaded from: classes.dex */
final class krf extends SQLiteException {
    public krf(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
