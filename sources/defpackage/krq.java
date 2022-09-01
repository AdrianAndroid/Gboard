package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: PG */
/* renamed from: krq  reason: default package */
/* loaded from: classes.dex */
public final class krq implements SQLiteDatabase.CursorFactory {
    private final Object[] a;

    public krq(Object[] objArr) {
        this.a = objArr;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        if (this.a != null) {
            int i = 0;
            while (true) {
                Object[] objArr = this.a;
                if (i >= objArr.length) {
                    break;
                }
                int i2 = i + 1;
                Object obj = objArr[i];
                if (obj == null) {
                    sQLiteQuery.bindNull(i2);
                } else if (obj instanceof String) {
                    sQLiteQuery.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    sQLiteQuery.bindBlob(i2, (byte[]) obj);
                } else if (obj instanceof Long) {
                    sQLiteQuery.bindLong(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    sQLiteQuery.bindDouble(i2, ((Double) obj).doubleValue());
                } else {
                    throw new AssertionError("Attempted to bind an unsupported type");
                }
                i = i2;
            }
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
