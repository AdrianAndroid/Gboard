package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jva  reason: default package */
/* loaded from: classes.dex */
final class jva {
    static final long a;
    static final long b;
    static final long c;
    static final String d;
    static final String e;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        a = millis;
        long millis2 = TimeUnit.SECONDS.toMillis(60L);
        b = millis2;
        long millis3 = TimeUnit.SECONDS.toMillis(60L);
        c = millis3;
        d = "CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), connection_attempts INT DEFAULT(3), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), http_conn_timeout_millis INT DEFAULT(" + millis + "), http_read_timeout_millis INT DEFAULT(" + millis2 + "), http_write_timeout_millis INT DEFAULT(" + millis3 + "), http_retry_on_conn_failure INT DEFAULT(1), UNIQUE (download_id) ON CONFLICT FAIL)";
        e = "CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), connection_attempts INT DEFAULT(3), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), http_conn_timeout_millis INT DEFAULT(" + millis + "), http_read_timeout_millis INT DEFAULT(" + millis2 + "), http_write_timeout_millis INT DEFAULT(" + millis3 + "), http_retry_on_conn_failure INT DEFAULT(1), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN scheduling_flags INT DEFAULT(2)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {"connection_attempts", "http_conn_timeout_millis", "http_read_timeout_millis", "http_write_timeout_millis", "http_retry_on_conn_failure"};
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("pragma table_info(pending_downloads);", null);
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(cursor.getColumnIndex("name")));
            }
            arrayList.removeAll(Arrays.asList(strArr));
            String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("ALTER TABLE pending_downloads RENAME TO pending_downloads_old;");
                sQLiteDatabase.execSQL("CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)");
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = new ArrayList();
                sb.append("INSERT INTO ");
                sb.append("pending_downloads");
                sb.append("(");
                ker.f(",", strArr2, sb);
                sb.append(") SELECT ");
                ker.f(",", strArr2, sb);
                sb.append(" FROM ");
                sb.append("pending_downloads");
                sb.append("_old;");
                klh e2 = ker.e(sb, arrayList2);
                sQLiteDatabase.execSQL(e2.a, e2.a());
                sQLiteDatabase.execSQL("DROP TABLE pending_downloads_old;");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN requires_idle INT DEFAULT(0)");
        sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN requires_battery_not_low INT DEFAULT(0)");
    }
}
