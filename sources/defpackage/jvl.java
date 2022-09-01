package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jvl  reason: default package */
/* loaded from: classes.dex */
public final class jvl extends SQLiteOpenHelper implements jum {
    public static final /* synthetic */ int b = 0;
    private static final String[] g;
    private static final String[] h;
    private static volatile jvl k;
    public final jls a = jls.e();
    private final int m = 17;
    private static final String[] c = {"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), requires_idle INT DEFAULT(0), requires_battery_not_low INT DEFAULT(0), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, sync_metadata BLOB, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] d = {"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, sync_metadata BLOB, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] e = {"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] f = {jva.e, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] i = {"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), connection_attempts INT DEFAULT(3), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] j = {"DROP TABLE IF EXISTS pending_downloads", "DROP TABLE IF EXISTS file_metadata", "DROP TABLE IF EXISTS selected_packs", "DROP TABLE IF EXISTS pending_packs", "DROP TABLE IF EXISTS manifest_table"};
    private static final Object l = new Object();

    static {
        String str = jva.d;
        g = new String[]{str, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
        h = new String[]{str, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    }

    private jvl(Context context) {
        super(context, "superpacks.db", (SQLiteDatabase.CursorFactory) null, 17);
    }

    public static jvl b(Context context) {
        if (k == null) {
            synchronized (l) {
                if (k == null) {
                    k = new jvl(context);
                }
            }
        }
        return k;
    }

    @Override // defpackage.jun
    public final void a(IOException iOException) {
        this.a.a(new jpg(iOException, 8));
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        String[] strArr = j;
        int length = strArr.length;
        for (int i2 = 0; i2 < 5; i2++) {
            sQLiteDatabase.execSQL(strArr[i2]);
        }
        d(sQLiteDatabase, this.m);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ((luc) jsh.a.b()).E("Creating database %s, version %d", "superpacks.db", this.m);
        d(sQLiteDatabase, this.m);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        ((luc) jsh.a.b()).J("Downgrading database %s, old version: %d, new version: %d", "superpacks.db", Integer.valueOf(i2), Integer.valueOf(i3));
        c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        ((luc) jsh.a.b()).J("Upgrading database %s, old version: %d, new version: %d", "superpacks.db", Integer.valueOf(i2), Integer.valueOf(i3));
        switch (i2) {
            case 11:
                if (i3 >= 12) {
                    long j2 = jva.a;
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_conn_timeout_millis INT DEFAULT(" + j2 + ")");
                    long j3 = jva.b;
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_read_timeout_millis INT DEFAULT(" + j3 + ")");
                    long j4 = jva.c;
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_write_timeout_millis INT DEFAULT(" + j4 + ")");
                    sQLiteDatabase.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_retry_on_conn_failure INT DEFAULT(1)");
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (i3 >= 13) {
                    sQLiteDatabase.execSQL("ALTER TABLE file_metadata ADD COLUMN validation_count INT DEFAULT(0)");
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (i3 >= 14) {
                    jva.a(sQLiteDatabase);
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (i3 >= 15) {
                    jva.b(sQLiteDatabase);
                }
            case 15:
                if (i3 >= 16) {
                    sQLiteDatabase.execSQL("ALTER TABLE selected_packs ADD COLUMN sync_metadata BLOB ");
                    break;
                }
                break;
            case 16:
                break;
            default:
                c(sQLiteDatabase);
                return;
        }
        if (i3 >= 17) {
            jva.c(sQLiteDatabase);
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase, int i2) {
        String[] strArr;
        switch (i2) {
            case 11:
                strArr = i;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                strArr = h;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                strArr = g;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                strArr = f;
                break;
            case 15:
                strArr = e;
                break;
            case 16:
                strArr = d;
                break;
            case 17:
                strArr = c;
                break;
            default:
                throw new IllegalArgumentException("Invalid database version: " + i2);
        }
        int length = strArr.length;
        for (int i3 = 0; i3 < 5; i3++) {
            sQLiteDatabase.execSQL(strArr[i3]);
        }
    }
}
