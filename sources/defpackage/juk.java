package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: juk  reason: default package */
/* loaded from: classes.dex */
public final class juk implements jus {
    private final jvh b;
    private final Map c = new HashMap();
    public final juz a = new juz(this, 1);

    public juk(jvh jvhVar) {
        this.b = jvhVar;
    }

    @Override // defpackage.jus
    public final synchronized int a(String str) {
        int i;
        Integer num = (Integer) this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        jvh jvhVar = this.b;
        try {
            Cursor query = jvhVar.b.getReadableDatabase().query("manifest_table", jvh.a, "name=?", new String[]{str}, null, null, null, null);
            if (query != null && query.moveToNext()) {
                i = query.getInt(1);
            } else {
                i = -1;
                if (query != null) {
                }
                Integer valueOf = Integer.valueOf(i);
                this.c.put(str, valueOf);
                return valueOf.intValue();
            }
            query.close();
            Integer valueOf2 = Integer.valueOf(i);
            this.c.put(str, valueOf2);
            return valueOf2.intValue();
        } catch (SQLiteException e) {
            jum jumVar = jvhVar.b;
            IOException iOException = new IOException("SqliteManifestTable#getSyncVersion, SQL query failed, superpackName: " + str, e);
            jumVar.a(iOException);
            throw iOException;
        }
    }

    @Override // defpackage.jus
    public final synchronized Collection b() {
        jvh jvhVar;
        try {
        } catch (SQLiteException e) {
            jum jumVar = jvhVar.b;
            IOException iOException = new IOException("SqliteManifestTable#getAll, SQL query failed.", e);
            jumVar.a(iOException);
            throw iOException;
        }
        return jtq.u(this.b.b.getReadableDatabase(), "manifest_table", jvh.a, jky.k);
    }

    @Override // defpackage.jus
    public final synchronized void c(String str) {
        jvh jvhVar = this.b;
        try {
            jvhVar.b.getWritableDatabase().delete("manifest_table", "name=?", new String[]{str});
            this.c.remove(str);
        } catch (SQLiteException e) {
            jum jumVar = jvhVar.b;
            IOException iOException = new IOException("SqliteManifestTable#remove, SQL delete failed, superpackName: ".concat(String.valueOf(str)), e);
            jumVar.a(iOException);
            throw iOException;
        }
    }

    @Override // defpackage.jus
    public final synchronized void d(jtr jtrVar) {
        jvh jvhVar = this.b;
        try {
            SQLiteDatabase writableDatabase = jvhVar.b.getWritableDatabase();
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("name", ((jrn) jtrVar).a);
            contentValues.put("version", Integer.valueOf(((jrn) jtrVar).b));
            long replaceOrThrow = writableDatabase.replaceOrThrow("manifest_table", null, contentValues);
            if (replaceOrThrow < 0) {
                jum jumVar = jvhVar.b;
                String obj = jtrVar.toString();
                IOException iOException = new IOException("SqliteManifestTable#setSyncVersion, SQL replaceOrThrow returned < 0, versionedName: " + obj + ", rowId: " + replaceOrThrow);
                jumVar.a(iOException);
                throw iOException;
            }
            this.c.put(((jrn) jtrVar).a, Integer.valueOf(((jrn) jtrVar).b));
        } catch (SQLiteException e) {
            jum jumVar2 = jvhVar.b;
            IOException iOException2 = new IOException("SqliteManifestTable#setSyncVersion, SQL replaceOrThrow failed, versionedName: ".concat(jtrVar.toString()), e);
            jumVar2.a(iOException2);
            throw iOException2;
        }
    }
}
