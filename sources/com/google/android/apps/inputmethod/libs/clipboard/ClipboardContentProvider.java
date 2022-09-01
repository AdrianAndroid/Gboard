package com.google.android.apps.inputmethod.libs.clipboard;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClipboardContentProvider extends ContentProvider {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider");
    private bvj b;
    private final UriMatcher c = new UriMatcher(-1);

    public static int a() {
        return ((Long) bwv.c.c()).intValue();
    }

    public static int b() {
        return ((Long) bwv.e.c()).intValue();
    }

    public static long c() {
        return ((Long) bwv.f.c()).longValue();
    }

    private final synchronized bvj d() {
        if (this.b == null) {
            this.b = new bvj(getContext());
        }
        return this.b;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = d().getWritableDatabase();
            int match = this.c.match(uri);
            if (match != 1) {
                if (match == 2) {
                    return writableDatabase.delete("clips", str, strArr);
                }
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "delete", 136, "ClipboardContentProvider.java")).w("%s can't be recognized.", uri);
                return 0;
            }
            String str2 = "_id = " + ContentUris.parseId(uri);
            if (!TextUtils.isEmpty(str)) {
                str2 = str2 + str;
            }
            return writableDatabase.delete("clips", str2, strArr);
        } catch (SQLiteException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "delete", (char) 139, "ClipboardContentProvider.java")).t("Error getting the writable database.");
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        int match = this.c.match(uri);
        if (match != 1) {
            if (match == 2) {
                return "vnd.android.cursor.dir/clips";
            }
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "getType", 95, "ClipboardContentProvider.java")).w("%s can't be matched.", uri);
            return null;
        }
        return "vnd.android.cursor.item/clips";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = d().getWritableDatabase();
            int match = this.c.match(uri);
            if (match != 1 && match != 2) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "insert", 113, "ClipboardContentProvider.java")).w("%s can't be matched.", uri);
            } else if (contentValues != null) {
                writableDatabase.insertWithOnConflict("clips", null, contentValues, 5);
            }
        } catch (SQLiteException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "insert", 't', "ClipboardContentProvider.java")).t("Error getting the writable database.");
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        String w = jbt.w(getContext(), ".clipboard_content");
        this.c.addURI(w, "clips/#", 1);
        this.c.addURI(w, "clips", 2);
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            return;
        }
        synchronized (this) {
            bvj bvjVar = this.b;
            if (bvjVar != null) {
                bvjVar.close();
                this.b = null;
            }
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            SQLiteDatabase readableDatabase = d().getReadableDatabase();
            if (this.c.match(uri) == 2) {
                return readableDatabase.query("clips", strArr, str, strArr2, null, null, str2);
            }
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "query", 191, "ClipboardContentProvider.java")).w("%s can't be recognized.", uri);
            return null;
        } catch (SQLiteException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "query", (char) 194, "ClipboardContentProvider.java")).t("Error getting the readable database.");
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = d().getWritableDatabase();
            int match = this.c.match(uri);
            if (match != 1) {
                if (match == 2) {
                    return writableDatabase.update("clips", contentValues, str, strArr);
                }
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "update", 163, "ClipboardContentProvider.java")).w("%s can't be recognized.", uri);
                return 0;
            }
            String str2 = "_id = " + ContentUris.parseId(uri);
            if (!TextUtils.isEmpty(str)) {
                str2 = str2 + str;
            }
            return writableDatabase.update("clips", contentValues, str2, strArr);
        } catch (SQLiteException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardContentProvider", "update", (char) 166, "ClipboardContentProvider.java")).t("Error getting the writable database.");
            return 0;
        }
    }
}
