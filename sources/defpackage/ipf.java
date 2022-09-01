package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ipf  reason: default package */
/* loaded from: classes.dex */
public final class ipf {
    private static final lex a = lex.d(", ");

    public static llw a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("PRAGMA TABLE_INFO(%s)", str), null);
        try {
            lls h = llw.h();
            if (rawQuery.moveToFirst()) {
                do {
                    String string = rawQuery.getString(1);
                    String string2 = rawQuery.getString(2);
                    boolean z = rawQuery.getInt(3) == 0;
                    boolean z2 = rawQuery.getInt(5) != 0;
                    ioy ioyVar = (ioy) ((lrk) ioz.a).e.get(jdg.Y(string2));
                    if (ioyVar != null) {
                        h.a(string, iox.a(ioyVar, z2, z));
                    } else {
                        throw new IllegalArgumentException("No matching type for given type name: ".concat(String.valueOf(string2)));
                    }
                } while (rawQuery.moveToNext());
            }
            llw l = h.l();
            if (rawQuery != null) {
                rawQuery.close();
            }
            return l;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.lmz b(android.database.sqlite.SQLiteDatabase r3) {
        /*
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "table"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type=?"
            android.database.Cursor r3 = r3.rawQuery(r1, r0)
            lmx r0 = defpackage.lmz.g()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L25
        L18:
            java.lang.String r1 = r3.getString(r2)     // Catch: java.lang.Throwable -> L2f
            r0.d(r1)     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r3.moveToNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L18
        L25:
            lmz r0 = r0.g()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L2e
            r3.close()
        L2e:
            return r0
        L2f:
            r0 = move-exception
            if (r3 == 0) goto L3a
            r3.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r3 = move-exception
            defpackage.kez.v(r0, r3)
        L3a:
            goto L3c
        L3b:
            throw r0
        L3c:
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipf.b(android.database.sqlite.SQLiteDatabase):lmz");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.lmz c(android.database.sqlite.SQLiteDatabase r6, java.lang.String r7, boolean r8) {
        /*
            lmx r0 = defpackage.lmz.g()
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "index"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r7
            java.lang.String r4 = "SELECT name, sql FROM sqlite_master WHERE type=? AND tbl_name=?"
            android.database.Cursor r6 = r6.rawQuery(r4, r1)
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L59
        L1b:
            java.lang.String r1 = r6.getString(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = r6.getString(r2)     // Catch: java.lang.Throwable -> L63
            if (r2 == r8) goto L28
            java.lang.String r5 = "CREATE INDEX"
            goto L2a
        L28:
            java.lang.String r5 = "CREATE UNIQUE INDEX"
        L2a:
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r4.<init>()     // Catch: java.lang.Throwable -> L63
            r4.append(r7)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "_"
            r4.append(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L63
            boolean r4 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L53
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L63
            int r4 = r4 + r2
            java.lang.String r1 = r1.substring(r4)     // Catch: java.lang.Throwable -> L63
            r0.d(r1)     // Catch: java.lang.Throwable -> L63
        L53:
            boolean r1 = r6.moveToNext()     // Catch: java.lang.Throwable -> L63
            if (r1 != 0) goto L1b
        L59:
            if (r6 == 0) goto L5e
            r6.close()
        L5e:
            lmz r6 = r0.g()
            return r6
        L63:
            r7 = move-exception
            if (r6 == 0) goto L6e
            r6.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            defpackage.kez.v(r7, r6)
        L6e:
            goto L70
        L6f:
            throw r7
        L70:
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipf.c(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean):lmz");
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str, String str2, iox ioxVar) {
        StringBuilder sb = new StringBuilder(String.format("ALTER TABLE %s ADD COLUMN %s %s", str, str2, ioz.b(ioxVar.a)));
        if (!ioxVar.c) {
            m(sb, ioxVar.a);
        }
        sQLiteDatabase.execSQL(sb.toString());
    }

    public static void e(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete(str, null, null);
    }

    public static void f(SQLiteDatabase sQLiteDatabase, String str, String str2, boolean z) {
        sQLiteDatabase.execSQL(String.format(true != z ? "CREATE INDEX IF NOT EXISTS %s ON %s(%s)" : "CREATE UNIQUE INDEX IF NOT EXISTS %s ON %s(%s)", l(str, str2), str, str2));
    }

    public static void g(SQLiteDatabase sQLiteDatabase, String str, llw llwVar) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append(" (");
        ArrayList arrayList = new ArrayList(((lrq) llwVar).d);
        lsz it = llwVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iox ioxVar = (iox) entry.getValue();
            String b = ioz.b(ioxVar.a);
            StringBuilder sb2 = new StringBuilder((String) entry.getKey());
            sb2.append(' ');
            sb2.append(b);
            if (ioxVar.b) {
                sb2.append(" PRIMARY KEY");
            }
            if (!ioxVar.c) {
                m(sb2, ioxVar.a);
            }
            arrayList.add(sb2.toString());
        }
        a.j(sb, arrayList);
        sb.append(")");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public static void h(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.execSQL(String.format("DROP INDEX IF EXISTS %s", l(str, str2)));
    }

    public static void i(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", str));
    }

    public static void j(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            ioy ioyVar = ioy.INTEGER;
            i2 = i + (-1) != 0 ? 5 : 4;
        }
        sQLiteDatabase.insertWithOnConflict(str, null, contentValues, i2);
    }

    public static void k(SQLiteDatabase sQLiteDatabase, String str, int i) {
        long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, str);
        long j = i;
        if (queryNumEntries <= j) {
            return;
        }
        sQLiteDatabase.delete(str, String.format(Locale.US, "%s IN (SELECT %s FROM %s ORDER BY %s LIMIT %d)", "_id_", "_id_", str, "_timestamp_", Long.valueOf(queryNumEntries - j)), null);
    }

    private static String l(String str, String str2) {
        return String.format("%s_%s", str, str2);
    }

    private static void m(StringBuilder sb, ioy ioyVar) {
        sb.append(" NOT NULL ");
        int ordinal = ioyVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            sb.append("DEFAULT 0");
        } else if (ordinal != 2 && ordinal != 3) {
        } else {
            sb.append("DEFAULT \"\"");
        }
    }
}
