package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: buq  reason: default package */
/* loaded from: classes.dex */
public final class buq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipItemDataSource");
    public final Context b;
    public bup c;

    public buq(Context context) {
        this.b = context;
    }

    public static List b(Cursor cursor, int i) {
        ArrayList arrayList = new ArrayList(i);
        if (cursor != null && !cursor.isClosed() && i != 0) {
            cursor.moveToFirst();
            int i2 = 0;
            while (!cursor.isAfterLast() && i2 < i) {
                buk c = bvi.c(cursor);
                if (c != null) {
                    arrayList.add(c);
                }
                i2++;
                cursor.moveToNext();
            }
        }
        return arrayList;
    }

    public final Cursor a(Uri uri, String str, String[] strArr, String str2) {
        return this.b.getContentResolver().query(uri, null, str, strArr, str2);
    }
}
