package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jvi  reason: default package */
/* loaded from: classes.dex */
public final class jvi implements jux {
    public final jum a;
    public final jtb b = new juz(this, 0);

    private jvi(jum jumVar) {
        this.a = jumVar;
    }

    public static jvi e(jum jumVar) {
        return new jvi(jumVar);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0053: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:21:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // defpackage.jux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.juu a(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "SqlitePendingDownloadQueue#get, SQL query failed, download: "
            r1 = 0
            jum r2 = r13.a     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L37
            android.database.sqlite.SQLiteDatabase r3 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L37
            java.lang.String[] r5 = defpackage.juu.a     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L37
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L37
            r2 = 0
            r7[r2] = r14     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L37
            java.lang.String r4 = "pending_downloads"
            java.lang.String r6 = "download_id=?"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L37
            if (r2 == 0) goto L2f
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L2d java.lang.Throwable -> L52
            if (r3 == 0) goto L2f
            juu r14 = defpackage.juu.h(r2)     // Catch: android.database.sqlite.SQLiteException -> L2d java.lang.Throwable -> L52
            r2.close()
            return r14
        L2d:
            r1 = move-exception
            goto L3b
        L2f:
            if (r2 == 0) goto L34
            r2.close()
        L34:
            return r1
        L35:
            r14 = move-exception
            goto L54
        L37:
            r2 = move-exception
            r12 = r2
            r2 = r1
            r1 = r12
        L3b:
            jum r3 = r13.a     // Catch: java.lang.Throwable -> L52
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L52
            r5.append(r14)     // Catch: java.lang.Throwable -> L52
            java.lang.String r14 = r5.toString()     // Catch: java.lang.Throwable -> L52
            r4.<init>(r14, r1)     // Catch: java.lang.Throwable -> L52
            r3.a(r4)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L52
        L52:
            r14 = move-exception
            r1 = r2
        L54:
            if (r1 == 0) goto L59
            r1.close()
        L59:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvi.a(java.lang.String):juu");
    }

    @Override // defpackage.jux
    public final List b(boolean z) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.a.getReadableDatabase().query("pending_downloads", juu.a, true != z ? "completed=0" : null, null, null, null, "start_timestamp_millis ASC", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        arrayList.add(juu.h(cursor));
                    }
                }
                return arrayList;
            } catch (SQLiteException e) {
                jum jumVar = this.a;
                IOException iOException = new IOException("SqlitePendingDownloadQueue#getAll, SQL query failed, includeCompleted: " + z, e);
                jumVar.a(iOException);
                throw iOException;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @Override // defpackage.jux
    public final void d(juu juuVar) {
        try {
            int update = this.a.getWritableDatabase().update("pending_downloads", juuVar.e(), "download_id=?", new String[]{juuVar.l()});
            if (update == 1) {
                return;
            }
            jum jumVar = this.a;
            IOException iOException = new IOException(String.format(Locale.US, "SqlitePendingDownloadQueue#update, SQL update failed, download: %s, updated %d.", juuVar.l(), Integer.valueOf(update)));
            jumVar.a(iOException);
            throw iOException;
        } catch (SQLiteException e) {
            jum jumVar2 = this.a;
            IOException iOException2 = new IOException("SqlitePendingDownloadQueue#update, SQL update failed, download: ".concat(juuVar.l()), e);
            jumVar2.a(iOException2);
            throw iOException2;
        }
    }

    @Override // defpackage.jux
    public final void c(String str) {
        try {
            this.a.getWritableDatabase().delete("pending_downloads", "download_id=?", new String[]{str});
        } catch (SQLiteException e) {
            jum jumVar = this.a;
            IOException iOException = new IOException("SqlitePendingDownloadQueue#remove, SQL delete failed, download: ".concat(String.valueOf(str)), e);
            jumVar.a(iOException);
            throw iOException;
        }
    }
}
