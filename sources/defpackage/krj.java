package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* renamed from: krj  reason: default package */
/* loaded from: classes.dex */
public final class krj implements ComponentCallbacks2 {
    public static final ltg a = ltg.j("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final lfb d;
    public final List e;
    public final List f;
    public final krm g;
    public final Executor j;
    public mko k;
    public boolean n;
    public final jlr o;
    private final mix q;
    private ScheduledFuture t;
    public final Set h = new HashSet();
    public final Object i = new Object();
    public final opu p = new opu(this);
    private final mka r = new hyw(this, 15);
    public int l = 0;
    private boolean s = false;
    public boolean m = false;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    @Deprecated
    public krj(Context context, ScheduledExecutorService scheduledExecutorService, jlr jlrVar, mix mixVar, ngt ngtVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.q = mixVar;
        this.c = scheduledExecutorService;
        this.o = jlrVar;
        this.j = kcu.E(scheduledExecutorService);
        this.b = context;
        this.d = (lfb) ngtVar.d;
        this.e = ngtVar.a;
        this.f = ngtVar.b;
        this.g = (krm) ngtVar.c;
    }

    public static SQLiteDatabase a(Context context, File file, krm krmVar, lfb lfbVar, List list, List list2) {
        SQLiteDatabase g = g(context, krmVar, file);
        try {
            if (i(g, krmVar, list, list2)) {
                g.close();
                g = g(context, krmVar, file);
                try {
                    lcq a2 = ldh.a("Configuring reopened database.");
                    try {
                        jdg.G(!i(g, krmVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                        a2.close();
                    } catch (Throwable th) {
                        try {
                            a2.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    g.close();
                    throw new krf("Failed to open database.", e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    g.close();
                    throw new krf("Failed to open database.", e);
                } catch (Throwable th3) {
                    g.close();
                    throw th3;
                }
            }
            return g;
        } catch (SQLiteException e3) {
            g.close();
            throw new krf("Failed to open database.", e3);
        } catch (Throwable th4) {
            g.close();
            throw th4;
        }
    }

    public static mjf b(mko mkoVar, Closeable... closeableArr) {
        jdg.u(mkoVar);
        return new mjf(new opu(closeableArr), mjl.a, null, null, null).c(new kqy(mkoVar, 2), mjl.a);
    }

    public static boolean f(Context context, krm krmVar) {
        int i = krmVar.a;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static SQLiteDatabase g(Context context, krm krmVar, File file) {
        boolean f = f(context, krmVar);
        int i = f ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (f) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new krf("Failed to open database.", th);
        }
    }

    private static boolean h(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        int version = sQLiteDatabase.getVersion();
        int i = ((lrl) list).c;
        jdg.K(version <= i, "Can't downgrade from version %s to version %s", version, i);
        jma jmaVar = new jma(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            try {
                try {
                    if (version != ((lrl) list).c) {
                        lcq a2 = ldh.a("Applying upgrade steps");
                        try {
                            for (kro kroVar : ((llp) list).subList(version, ((lrl) list).c)) {
                                kroVar.a(jmaVar);
                            }
                            a2.close();
                            sQLiteDatabase.setVersion(((lrl) list).c);
                        } catch (Throwable th) {
                            try {
                                a2.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    }
                    lta listIterator = ((llp) list2).listIterator();
                    if (listIterator.hasNext()) {
                        kws kwsVar = (kws) listIterator.next();
                        throw null;
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    return version != sQLiteDatabase.getVersion();
                } catch (Throwable th3) {
                    sQLiteDatabase.endTransaction();
                    throw th3;
                }
            } catch (SQLiteDatabaseLockedException e) {
                e = e;
                throw new kri("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (InterruptedException e2) {
                throw new kri("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e2);
            }
        } catch (SQLiteDiskIOException e3) {
            e = e3;
            throw new kri("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteFullException e4) {
            e = e4;
            throw new kri("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteOutOfMemoryException e5) {
            e = e5;
            throw new kri("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteTableLockedException e6) {
            e = e6;
            throw new kri("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (Throwable th4) {
            throw new krh(th4);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    private static boolean i(SQLiteDatabase sQLiteDatabase, krm krmVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        for (String str : krmVar.b) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf(str)));
        }
        return h(sQLiteDatabase, list, list2);
    }

    public final mjf c() {
        mko mkoVar;
        mko J;
        WeakHashMap weakHashMap = ldh.a;
        lcq lcqVar = null;
        try {
            synchronized (this.i) {
                int i = this.l + 1;
                this.l = i;
                if (this.k == null) {
                    jdg.G(i == 1, "DB was null with nonzero refcount");
                    lcqVar = ldh.a("Opening database");
                    try {
                        mko P = kcu.P(this.q, this.j);
                        kcu.U(P, this.r, this.c);
                        J = mio.g(P, ldd.a(new leq() { // from class: krd
                            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.Set, java.lang.Object] */
                            @Override // defpackage.leq
                            public final Object a(Object obj) {
                                SQLiteDatabase a2;
                                krj krjVar = krj.this;
                                File databasePath = krjVar.b.getDatabasePath((String) obj);
                                if (!krjVar.m) {
                                    jlr jlrVar = krjVar.o;
                                    String path = databasePath.getPath();
                                    if (jlrVar.a.add(path)) {
                                        krjVar.m = true;
                                        boolean f = krj.f(krjVar.b, krjVar.g);
                                        krjVar.n = f;
                                        if (f) {
                                            try {
                                                File cacheDir = krjVar.b.getCacheDir();
                                                if (cacheDir != null) {
                                                    krjVar.n = databasePath.getCanonicalPath().startsWith(cacheDir.getCanonicalPath());
                                                }
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("DB " + path + " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?");
                                    }
                                }
                                Set set = krjVar.h;
                                if (!set.isEmpty()) {
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it.next()).get();
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.isOpen()) {
                                                String path2 = sQLiteDatabase.getPath();
                                                throw new IllegalStateException("Open database reference to " + path2 + " already exists. Follow instructions in source to file a bug against TikTok.");
                                            }
                                        } else {
                                            it.remove();
                                        }
                                    }
                                }
                                try {
                                    try {
                                        a2 = krj.a(krjVar.b, databasePath, krjVar.g, krjVar.d, krjVar.e, krjVar.f);
                                    } catch (krf | krh | kri unused2) {
                                        a2 = krj.a(krjVar.b, databasePath, krjVar.g, krjVar.d, krjVar.e, krjVar.f);
                                    }
                                    krjVar.h.add(new WeakReference(a2));
                                    krjVar.b.registerComponentCallbacks(krjVar);
                                    return a2;
                                } catch (krh e) {
                                    ((ltd) ((ltd) ((ltd) krj.a.c()).i(e)).k("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "lambda$innerOpenDatabase$4", (char) 440, "AsyncSQLiteOpenHelper.java")).t("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                                    try {
                                        File file = new File(String.valueOf(databasePath.getPath()).concat("-wal"));
                                        File file2 = new File(String.valueOf(databasePath.getPath()).concat("-journal"));
                                        File file3 = new File(String.valueOf(databasePath.getPath()).concat("-shm"));
                                        if ((!file.exists() || file.delete()) && ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && databasePath.delete()))) {
                                            throw new krf("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e);
                                        }
                                        throw new krg(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()));
                                    } catch (Throwable th) {
                                        throw new krf("Recovery by deletion failed.", th);
                                    }
                                } catch (kri e2) {
                                    throw new krf("Probably-recoverable database upgrade failure.", e2);
                                }
                            }
                        }), this.j);
                    } catch (Exception e) {
                        J = kcu.J(e);
                    }
                    this.k = J;
                }
                mkoVar = this.k;
                ScheduledFuture scheduledFuture = this.t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            }
            mko L = kcu.L(mkoVar);
            if (lcqVar != null) {
                lcqVar.a(L);
            }
            return b(L, new kre(this, 1)).c(ldd.d(new kqy(this, 3)), mjl.a);
        } finally {
            if (lcqVar != null) {
                lcqVar.close();
            }
        }
    }

    public final void d() {
        if (this.l != 0 || this.k == null) {
            return;
        }
        if (this.s) {
            e();
            return;
        }
        this.t = ((gxm) this.c).schedule(new joq(this, 19), 60L, TimeUnit.SECONDS);
        if (this.n) {
            return;
        }
        kcu.U(this.k, new hyw(this, 16), this.j);
    }

    public final void e() {
        this.j.execute(new joq(this, 20));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.i) {
            this.s = i >= 40;
            d();
        }
    }
}
