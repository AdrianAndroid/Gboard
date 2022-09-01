package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* renamed from: mza  reason: default package */
/* loaded from: classes2.dex */
final class mza extends SQLiteOpenHelper {
    final /* synthetic */ mzb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mza(mzb mzbVar, Context context) {
        super(context, (String) null, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = mzbVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.a.b.d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("In-memory database will never call onUpgrade.");
    }
}
