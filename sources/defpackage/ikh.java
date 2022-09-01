package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* renamed from: ikh  reason: default package */
/* loaded from: classes.dex */
public final class ikh implements AutoCloseable {
    private static final String[] b = {"_id", "word", "shortcut", "locale"};
    public final ike a = new ike(guw.a());

    private static ContentValues g(ika ikaVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("word", ikaVar.b);
        contentValues.put("shortcut", ikaVar.c);
        contentValues.put("locale", ikaVar.d.n);
        return contentValues;
    }

    private static void h() {
        ijl.b().g(ikg.a);
    }

    public final long a(ika ikaVar) {
        if (!f(ikaVar)) {
            try {
                long insert = this.a.getWritableDatabase().insert("entry", null, g(ikaVar));
                h();
                return insert;
            } catch (SQLiteException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public final long b(ika ikaVar) {
        if (f(ikaVar)) {
            e(ikaVar.a);
            return -1L;
        } else if (ikaVar.a == -1) {
            return a(ikaVar);
        } else {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                ContentValues g = g(ikaVar);
                long j = ikaVar.a;
                writableDatabase.update("entry", g, "_id = " + j, null);
                h();
                return ikaVar.a;
            } catch (SQLiteException unused) {
                return -1L;
            }
        }
    }

    public final ikf c() {
        return new ikf(this.a.getReadableDatabase().query("entry", b, null, null, null, null, "word"));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final ikf d(jav javVar) {
        return new ikf(this.a.getReadableDatabase().query("entry", b, "locale = ?", new String[]{javVar.n}, null, null, "word"));
    }

    public final void e(long j) {
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.delete("entry", "_id = " + j, null);
            h();
        } catch (SQLiteException unused) {
        }
    }

    public final boolean f(ika ikaVar) {
        boolean z = false;
        Cursor query = this.a.getReadableDatabase().query("entry", b, "word = ? AND shortcut = ? AND locale = ?", new String[]{ikaVar.b, ikaVar.c, ikaVar.d.n}, null, null, null, null);
        if (query.getCount() > 0) {
            z = true;
        }
        query.close();
        return z;
    }
}
