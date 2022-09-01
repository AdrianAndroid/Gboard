package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvg  reason: default package */
/* loaded from: classes.dex */
public final class jvg implements juq {
    static final String[] a = {"namespace", "name", "reserved_size", "reservation_state", "gc_priority", "last_access_millis", "source", "superpack_name", "superpack_version", "validation_count"};
    private static final jup d;
    public final jum b;
    public final jtb c;

    static {
        juo i = jup.i();
        i.d(jsr.d("default", "default"));
        d = i.a();
    }

    public jvg(jum jumVar, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = jumVar;
        this.c = new jur(this, opuVar, 0, null, null, null, null);
    }

    @Override // defpackage.juq
    public final jup a(jsr jsrVar) {
        Cursor cursor;
        try {
            try {
                cursor = this.b.getReadableDatabase().query("file_metadata", a, "namespace=? AND name=?", new String[]{jsrVar.b(), jsrVar.a()}, null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToNext()) {
                            juo i = jup.i();
                            i.d(jsr.d(cursor.getString(0), cursor.getString(1)));
                            i.f(cursor.getLong(2));
                            i.c(cursor.getLong(5));
                            int i2 = cursor.getInt(4);
                            jrp.e(i2);
                            i.b(i2);
                            int i3 = cursor.getInt(3);
                            jtq.w(i3);
                            i.e(i3);
                            i.b = cursor.getString(6);
                            i.g(cursor.getInt(9));
                            String string = cursor.getString(7);
                            if (string != null) {
                                i.a = jtr.c(string, cursor.getInt(8));
                            }
                            jup a2 = i.a();
                            cursor.close();
                            return a2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                juo i4 = jup.i();
                i4.d(jsrVar);
                jup a3 = i4.a();
                if (cursor != null) {
                    cursor.close();
                }
                return a3;
            } catch (SQLiteException e) {
                jum jumVar = this.b;
                IOException iOException = new IOException("SqliteFileMetadataTable#get, SQL query failed, name: ".concat(String.valueOf(String.valueOf(jsrVar))), e);
                jumVar.a(iOException);
                throw iOException;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    @Override // defpackage.juq
    public final void c(jsr jsrVar, int i) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("reservation_state", Integer.valueOf(i));
        e(jsrVar, contentValues);
    }

    public final List d(String str) {
        Throwable th;
        SQLiteException e;
        String str2;
        String[] strArr;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase readableDatabase = this.b.getReadableDatabase();
                if (str != null) {
                    str2 = "namespace=?";
                    strArr = new String[]{str};
                } else {
                    str2 = null;
                    strArr = null;
                }
                Cursor query = readableDatabase.query("file_metadata", a, str2, strArr, null, null, null, null);
                if (query == null) {
                    return arrayList;
                }
                while (query.moveToNext()) {
                    try {
                        try {
                            i = query.getInt(4);
                            jrp.e(i);
                        } catch (IllegalArgumentException e2) {
                            ((luc) ((luc) jsh.a.d()).i(e2)).t("Invalid gc priority value found in the table, ignoring row...");
                            i = 0;
                        }
                        try {
                            i2 = query.getInt(3);
                            jtq.w(i2);
                        } catch (IllegalArgumentException e3) {
                            ((luc) ((luc) jsh.a.d()).i(e3)).t("Invalid reservation state value found in the table, ignoring row...");
                            i2 = 0;
                        }
                        String string = query.getString(7);
                        jtr c = string != null ? jtr.c(string, query.getInt(8)) : null;
                        juo i3 = jup.i();
                        i3.d(jsr.d(query.getString(0), query.getString(1)));
                        i3.b(i);
                        i3.e(i2);
                        i3.c(query.getLong(5));
                        i3.f(query.getLong(2));
                        i3.b = query.getString(6);
                        i3.a = c;
                        i3.g(query.getInt(9));
                        arrayList.add(i3.a());
                    } catch (SQLiteException e4) {
                        e = e4;
                        cursor = query;
                        jum jumVar = this.b;
                        IOException iOException = new IOException("SqliteFileMetadataTable#getAll, SQL query failed", e);
                        jumVar.a(iOException);
                        throw iOException;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e5) {
                e = e5;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [jvg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [jvg] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.ContentValues] */
    public final void e(jsr jsrVar, ContentValues contentValues) {
        int i;
        int i2;
        int i3;
        long j;
        String str;
        long j2;
        String str2;
        String str3;
        jvg jvgVar = this;
        try {
            if (jvgVar.b.getWritableDatabase().update("file_metadata", contentValues, "namespace=? AND name=?", new String[]{jsrVar.b(), jsrVar.a()}) > 0) {
                return;
            }
            jtr c = (!contentValues.containsKey("superpack_name") || !contentValues.containsKey("superpack_version")) ? null : jtr.c(contentValues.getAsString("superpack_name"), contentValues.getAsInteger("superpack_version").intValue());
            if (contentValues.containsKey("gc_priority")) {
                i = contentValues.getAsInteger("gc_priority").intValue();
                jrp.e(i);
            } else {
                i = ((jui) d).c;
            }
            if (contentValues.containsKey("reservation_state")) {
                i2 = contentValues.getAsInteger("reservation_state").intValue();
                jtq.w(i2);
            } else {
                i2 = ((jui) d).d;
            }
            if (contentValues.containsKey("last_access_millis")) {
                i3 = i;
                j = contentValues.getAsLong("last_access_millis").longValue();
            } else {
                i3 = i;
                j = ((jui) d).e;
            }
            if (contentValues.containsKey("reserved_size")) {
                str = "superpack_version";
                j2 = contentValues.getAsLong("reserved_size").longValue();
            } else {
                str = "superpack_version";
                j2 = ((jui) d).b;
            }
            if (contentValues.containsKey("source")) {
                str2 = "Update failed for ";
                str3 = contentValues.getAsString("source");
            } else {
                str2 = "Update failed for ";
                str3 = ((jui) d).f;
            }
            int intValue = contentValues.containsKey("validation_count") ? contentValues.getAsInteger("validation_count").intValue() : ((jui) d).g;
            try {
                SQLiteDatabase writableDatabase = jvgVar.b.getWritableDatabase();
                jvgVar = new ContentValues(8);
                jvgVar.put("namespace", jsrVar.b());
                jvgVar.put("name", jsrVar.a());
                jvgVar.put("gc_priority", Integer.valueOf(i3));
                jvgVar.put("last_access_millis", Long.valueOf(j));
                jvgVar.put("reservation_state", Integer.valueOf(i2));
                jvgVar.put("reserved_size", Long.valueOf(j2));
                jvgVar.put("source", str3);
                if (c != null) {
                    jvgVar.put("superpack_name", ((jrn) c).a);
                    jvgVar.put(str, Integer.valueOf(((jrn) c).b));
                } else {
                    jvgVar.putNull("superpack_name");
                    jvgVar.put(str, 0);
                }
                jvgVar.put("validation_count", Integer.valueOf(intValue));
                long replace = writableDatabase.replace("file_metadata", null, jvgVar);
                if (replace >= 0) {
                    return;
                }
                String valueOf = String.valueOf(jsrVar);
                throw new IOException(str2 + valueOf + ", rowId: " + replace);
            } catch (SQLiteException e) {
                jvgVar = this;
                jum jumVar = jvgVar.b;
                IOException iOException = new IOException("SqliteFileMetadataTable#insertOrUpdate, SQL replace failed, name: ".concat(String.valueOf(String.valueOf(jsrVar))), e);
                jumVar.a(iOException);
                throw iOException;
            }
        } catch (SQLiteException e2) {
            jum jumVar2 = jvgVar.b;
            IOException iOException2 = new IOException("SqliteFileMetadataTable#updateColumns, SQL update failed, name: ".concat(String.valueOf(String.valueOf(jsrVar))), e2);
            jumVar2.a(iOException2);
            throw iOException2;
        }
    }

    @Override // defpackage.juq
    public final void b(jsr jsrVar) {
        try {
            this.b.getWritableDatabase().delete("file_metadata", "namespace=? AND name=?", new String[]{jsrVar.b(), jsrVar.a()});
        } catch (SQLiteException e) {
            jum jumVar = this.b;
            IOException iOException = new IOException("SqliteFileMetadataTable#remove, SQL delete failed, name: ".concat(String.valueOf(String.valueOf(jsrVar))), e);
            jumVar.a(iOException);
            throw iOException;
        }
    }
}
