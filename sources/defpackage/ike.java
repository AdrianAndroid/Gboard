package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* renamed from: ike  reason: default package */
/* loaded from: classes.dex */
final class ike extends SQLiteOpenHelper {
    public ike(Context context) {
        super(context, "PersonalDictionary.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE entry(_id INTEGER PRIMARY KEY, word TEXT, shortcut TEXT,locale TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
