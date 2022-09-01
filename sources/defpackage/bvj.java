package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bvj  reason: default package */
/* loaded from: classes.dex */
public final class bvj extends SQLiteOpenHelper {
    private static final lug a = hin.a;
    private final Context b;

    public bvj(Context context) {
        super(context, "gboard_clipboard.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.b = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(bvq.a());
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis + 1;
        sQLiteDatabase.execSQL(efq.y(currentTimeMillis, this.b.getString(R.string.f149390_resource_name_obfuscated_res_0x7f140111), 6));
        long j2 = j + 1;
        sQLiteDatabase.execSQL(efq.y(j, this.b.getString(R.string.f149410_resource_name_obfuscated_res_0x7f140113), 10));
        sQLiteDatabase.execSQL(efq.y(j2, this.b.getString(R.string.f149400_resource_name_obfuscated_res_0x7f140112), 18));
        sQLiteDatabase.execSQL(efq.y(j2 + 1, this.b.getString(R.string.f149420_resource_name_obfuscated_res_0x7f140114), 34));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvj.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
