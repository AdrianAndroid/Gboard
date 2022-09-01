package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jls  reason: default package */
/* loaded from: classes.dex */
public final class jls {
    public final Object a;
    public final Object b;

    public jls(Context context, iyg iygVar) {
        this.a = context;
        this.b = iygVar;
    }

    public jls(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public jls(iws iwsVar, iwq iwqVar) {
        this.b = iwsVar;
        this.a = iwqVar;
    }

    public jls(Executor executor, byte[] bArr) {
        this.b = new ArrayDeque(1);
        this.a = executor;
    }

    public jls(jvr jvrVar, jru jruVar) {
        this.b = jvrVar;
        this.a = jruVar;
    }

    public jls(byte[] bArr, byte[] bArr2) {
        this.b = bArr;
        this.a = bArr2;
    }

    public static final boolean d(File file, long j, long j2) {
        if (file.exists()) {
            return j < 0 || j2 == j;
        }
        return false;
    }

    public static jls e() {
        return f(mjl.a);
    }

    public static jls f(Executor executor) {
        return new jls(executor);
    }

    public static void l(ContentProviderClient contentProviderClient) {
        if (contentProviderClient == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            contentProviderClient.close();
        } else {
            contentProviderClient.release();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(jnf jnfVar) {
        synchronized (this.a) {
            Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
            while (it.hasNext()) {
                this.b.execute(new idx(jnfVar, it.next(), 18));
            }
        }
    }

    public final boolean b() {
        return ((CopyOnWriteArrayList) this.a).isEmpty();
    }

    public final void c(Object obj) {
        ((CopyOnWriteArrayList) this.a).add(obj);
    }

    public final jfp g(int i) {
        jfp jfpVar = (jfp) ((SparseArray) this.b).get(i);
        if (jfpVar != null) {
            return jfpVar;
        }
        throw new NoSuchElementException("Invalid ConditionMatcherProvider: " + i);
    }

    public final void h(jfp jfpVar) {
        ((SparseArray) this.b).put(jfpVar.d(), jfpVar);
    }

    public final File i(String str) {
        File filesDir = ((Context) this.a).getFilesDir();
        File file = new File(filesDir, str);
        if (!file.getAbsolutePath().startsWith(filesDir.getAbsolutePath()) || !file.exists()) {
            return null;
        }
        return file;
    }

    public final ContentProviderClient j(Uri uri) {
        RuntimeException runtimeException;
        ContentProviderClient contentProviderClient;
        String authority = uri.getAuthority();
        try {
            contentProviderClient = ((ContentResolver) this.a).acquireUnstableContentProviderClient(uri);
            runtimeException = null;
        } catch (RuntimeException e) {
            runtimeException = e;
            contentProviderClient = null;
        }
        if (contentProviderClient != null) {
            return contentProviderClient;
        }
        if (authority != null) {
            if (((PackageManager) this.b).resolveContentProvider(authority, Build.VERSION.SDK_INT >= 24 ? 786944 : 0) == null) {
                throw new ird(authority, runtimeException);
            }
            throw new irg(authority, runtimeException);
        }
        throw new ird(null, runtimeException);
    }

    public final InputStream k(Uri uri, CancellationSignal cancellationSignal) {
        if (!"content".equals(uri.getScheme())) {
            throw new IllegalArgumentException(String.valueOf(String.valueOf(uri)).concat(" does not have content scheme"));
        }
        ContentProviderClient j = j(uri);
        try {
            AssetFileDescriptor openTypedAssetFileDescriptor = j.openTypedAssetFileDescriptor(uri, "*/*", null, cancellationSignal);
            if (openTypedAssetFileDescriptor == null) {
                l(j);
                throw new irf("AssetFileDescriptor is null for ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                return new ira(openTypedAssetFileDescriptor.createInputStream(), j);
            } catch (IOException e) {
                gvt.a(openTypedAssetFileDescriptor);
                l(j);
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Failed to create InputStream for ".concat(String.valueOf(String.valueOf(uri))));
                fileNotFoundException.initCause(e);
                throw fileNotFoundException;
            }
        } catch (RemoteException e2) {
            e = e2;
            l(j);
            throw new irb("Failed to open file descriptor for ".concat(String.valueOf(String.valueOf(uri))), e);
        } catch (FileNotFoundException e3) {
            l(j);
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            l(j);
            throw new irb("Failed to open file descriptor for ".concat(String.valueOf(String.valueOf(uri))), e);
        }
    }

    public final irh m(Uri uri) {
        ContentProviderClient j = j(uri);
        try {
            Cursor query = j.query(uri, null, null, null, null, null);
            if (query == null) {
                l(j);
                throw new ire("Null cursor returned from query for ".concat(String.valueOf(String.valueOf(uri))));
            }
            return new irh(query, j);
        } catch (RemoteException e) {
            e = e;
            l(j);
            throw new irb("Query failed for ".concat(String.valueOf(String.valueOf(uri))), e);
        } catch (Error e2) {
            l(j);
            throw e2;
        } catch (RuntimeException e3) {
            e = e3;
            l(j);
            throw new irb("Query failed for ".concat(String.valueOf(String.valueOf(uri))), e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final String n(int i) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return (String) ConcurrentMap.EL.computeIfAbsent(this.a, Integer.valueOf(i), new chd(this, 13, null, null, null));
            }
            Object obj = this.a;
            Integer valueOf = Integer.valueOf(i);
            String str = (String) ((ConcurrentHashMap) obj).get(valueOf);
            if (str != null) {
                return str;
            }
            String string = ((Resources) this.b).getString(i);
            ((ConcurrentHashMap) this.a).putIfAbsent(valueOf, string);
            return string;
        } catch (Resources.NotFoundException | NullPointerException e) {
            ((luc) ((luc) ((luc) hin.a.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/PreferenceKeyCache", "get", 37, "PreferenceKeyCache.java")).u("Failed to get key name from id %d: ", i);
            return "";
        }
    }

    public final void o(Class cls, ijg ijgVar) {
        synchronized (this.b) {
            if (ijgVar.a()) {
                ((ArrayDeque) this.b).clear();
            }
            ((ArrayDeque) this.b).offerLast(new ijk(cls, ijgVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void p(ijj ijjVar) {
        this.a.execute(new idx(this, ijjVar, 7, null, null, null, null));
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [mks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, oiy] */
    public final synchronized iqx q(ngt ngtVar) {
        iqx iqxVar;
        iqxVar = (iqx) this.b.get("expression-history.db");
        if (iqxVar == null) {
            Context b = jlx.b();
            Object obj = this.a;
            iqxVar = new iqx(b, new jma((oiy) ((fws) obj).c, (oiy) ((fws) obj).b), ((boe) ((fws) obj).a).a, ngtVar, null, null, null, null);
            this.b.put("expression-history.db", iqxVar);
        } else if (!ngtVar.equals(iqxVar.c)) {
            throw new IllegalArgumentException("Attempted to change SQL schema for expression-history.db");
        }
        return iqxVar;
    }

    public jls(Resources resources) {
        this.a = new ConcurrentHashMap();
        this.b = resources;
    }

    public jls(fws fwsVar, byte[] bArr) {
        this.b = new qo();
        this.a = fwsVar;
    }

    public jls(Context context, byte[] bArr, byte[] bArr2) {
        this.a = context.getContentResolver();
        this.b = context.getPackageManager();
    }

    public jls(String str, PersistableBundle persistableBundle) {
        Parcel parcel;
        PersistableBundle persistableBundle2;
        this.b = str;
        if (Build.VERSION.SDK_INT > 26) {
            persistableBundle2 = persistableBundle.deepCopy();
        } else {
            try {
                parcel = Parcel.obtain();
                try {
                    persistableBundle.writeToParcel(parcel, 0);
                    parcel.setDataPosition(0);
                    PersistableBundle persistableBundle3 = (PersistableBundle) PersistableBundle.CREATOR.createFromParcel(parcel);
                    if (parcel != null) {
                        parcel.recycle();
                    }
                    persistableBundle2 = persistableBundle3;
                } catch (Throwable th) {
                    th = th;
                    if (parcel != null) {
                        parcel.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcel = null;
            }
        }
        this.a = persistableBundle2;
    }

    public jls(Context context, byte[] bArr) {
        isr isrVar = new isr(context);
        this.a = isrVar;
        this.b = llp.s(new isx(context), isrVar);
    }

    public jls(Context context) {
        this.b = new SparseArray();
        this.a = context;
    }

    public jls(String str, llw llwVar) {
        this.b = str;
        jfq[] jfqVarArr = {new jfr(llwVar)};
        lls h = llw.h();
        for (int i = 0; i <= 0; i++) {
            jfq jfqVar = jfqVarArr[i];
            String[] b = jfqVar.b();
            for (int i2 = 0; i2 < 3; i2++) {
                h.a(b[i2], jfqVar);
            }
        }
        this.a = h.l();
    }

    public jls(lfb lfbVar, lgb lgbVar) {
        this.a = lfbVar;
        this.b = jdg.n(lgbVar);
    }

    protected jls(Executor executor) {
        this.a = new CopyOnWriteArrayList();
        this.b = executor;
    }
}
