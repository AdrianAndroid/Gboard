package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: bvi  reason: default package */
/* loaded from: classes.dex */
public final class bvi {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProviderUtils");

    public static ContentProviderOperation a(Uri uri, buk bukVar) {
        return ContentProviderOperation.newInsert(uri).withValue("_id", Long.valueOf(bukVar.d)).withValue("text", bukVar.i()).withValue("html_text", bukVar.h()).withValue("timestamp", Long.valueOf(bukVar.e)).withValue("item_type", Integer.valueOf(bukVar.d())).withValue("entity_type", Integer.valueOf(bukVar.c())).withValue("uri", bukVar.j()).build();
    }

    public static Uri b(Context context, int i, long j) {
        Uri build = new Uri.Builder().scheme("content").authority(jbt.w(context, ".clipboard_content")).appendPath("clips").build();
        return i != 1 ? build : ContentUris.withAppendedId(build, j);
    }

    public static buk c(Cursor cursor) {
        if (cursor.isClosed()) {
            return null;
        }
        buj g = buk.g();
        g.a = cursor.getLong(cursor.getColumnIndex("_id"));
        g.e(cursor.getString(cursor.getColumnIndex("text")));
        g.c(cursor.getString(cursor.getColumnIndex("html_text")));
        g.d(cursor.getInt(cursor.getColumnIndex("item_type")));
        g.b(cursor.getInt(cursor.getColumnIndex("entity_type")));
        g.b = cursor.getLong(cursor.getColumnIndex("timestamp"));
        String string = cursor.getString(cursor.getColumnIndex("uri"));
        if (string != null) {
            g.f(Uri.parse(string));
        }
        return g.a();
    }

    public static void d(Context context, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((buk) it.next()).d));
        }
        e(context, arrayList);
    }

    public static void e(Context context, List list) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ContentProviderOperation.newDelete(b(context, 1, ((Long) it.next()).longValue())).build());
        }
        try {
            context.getContentResolver().applyBatch(jbt.w(context, ".clipboard_content"), arrayList);
        } catch (Exception e) {
            ((ltd) ((ltd) a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProviderUtils", "deleteItemsViaId", 157, "ClipboardContentProviderUtils.java")).t("batch deletion failed.");
        }
    }

    public static void f(Context context, Collection collection) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a(b(context, 1, 0L), (buk) it.next()));
        }
        try {
            context.getContentResolver().applyBatch(jbt.w(context, ".clipboard_content"), arrayList);
        } catch (Exception e) {
            ((ltd) ((ltd) a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProviderUtils", "insertItems", 74, "ClipboardContentProviderUtils.java")).t("insert items failed.");
        }
    }
}
