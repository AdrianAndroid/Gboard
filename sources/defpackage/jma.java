package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;

/* compiled from: PG */
/* renamed from: jma  reason: default package */
/* loaded from: classes.dex */
public final class jma {
    public final Object a;
    public final Object b;

    public jma(Context context) {
        this.b = new kcy();
        this.a = context;
    }

    public jma(Context context, oiy oiyVar) {
        this.a = context;
        this.b = oiyVar;
    }

    public jma(String str, Class[] clsArr) {
        this.a = str;
        this.b = clsArr;
    }

    public jma(String str, Object[] objArr) {
        this.b = str;
        this.a = objArr;
    }

    public jma(ZipEntry zipEntry, String str) {
        this.a = zipEntry;
        this.b = str;
    }

    public jma(jhy jhyVar, jml jmlVar) {
        this.b = jhyVar;
        this.a = jmlVar;
    }

    public jma(jzm jzmVar, lfe lfeVar) {
        this.a = jzmVar;
        this.b = lfeVar;
    }

    public jma(mkr mkrVar, kqi kqiVar) {
        this.a = mkrVar;
        this.b = kqiVar;
    }

    public jma(oiy oiyVar, oiy oiyVar2) {
        this.a = oiyVar;
        this.b = oiyVar2;
    }

    public static void c() {
        if (!Thread.interrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    public final boolean a(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        Object[] objArr;
        try {
            Method method = packageManager.getClass().getMethod((String) this.a, (Class[]) this.b);
            Object obj = this.b;
            if (((Class[]) obj).length == 2) {
                if (((Class[]) obj)[0] == String.class && ((Class[]) obj)[1] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, iPackageStatsObserver};
                    method.invoke(packageManager, objArr);
                    return true;
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
            }
            if (((Class[]) obj)[0] == String.class && ((Class[]) obj)[1] == Integer.TYPE && ((Class[]) this.b)[2] == IPackageStatsObserver.class) {
                objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                method.invoke(packageManager, objArr);
                return true;
            }
            throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
        } catch (Error e) {
            e = e;
            ((ltd) ((ltd) kgq.a.b()).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 119, "PackageStatsCapture.java")).J("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.a, Arrays.asList((Object[]) this.b));
            return false;
        } catch (NoSuchMethodException unused) {
            ltg ltgVar = kgq.a;
            return false;
        } catch (Exception e2) {
            e = e2;
            ((ltd) ((ltd) kgq.a.b()).k("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 119, "PackageStatsCapture.java")).J("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.a, Arrays.asList((Object[]) this.b));
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    public final void b(ValueAnimator valueAnimator) {
        kvj kvjVar = new kvj();
        valueAnimator.addListener(this.b);
        ((ArrayList) this.a).add(kvjVar);
    }

    @SafeVarargs
    public final int d(String str, String... strArr) {
        c();
        lcq b = ldh.b("DELETE FROM " + str + " WHERE truncated_timestamp_millis >= ? AND truncated_timestamp_millis < ?", ldi.a);
        try {
            int delete = ((SQLiteDatabase) this.a).delete(str, "truncated_timestamp_millis >= ? AND truncated_timestamp_millis < ?", strArr);
            b.close();
            return delete;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                kxc.l(th, th2);
            }
            throw th;
        }
    }

    public final long e(String str, ContentValues contentValues) {
        c();
        lcq b = ldh.b("INSERT WITH ON CONFLICT ".concat(str), ldi.a);
        try {
            long insertWithOnConflict = ((SQLiteDatabase) this.a).insertWithOnConflict(str, null, contentValues, 4);
            b.close();
            return insertWithOnConflict;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                kxc.l(th, th2);
            }
            throw th;
        }
    }

    public final void f(jma jmaVar) {
        c();
        lcq b = ldh.b("execSQL: ".concat((String) jmaVar.b), ldi.a);
        try {
            Object obj = this.a;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            sQLiteDatabase.execSQL((String) jmaVar.b, (Object[]) jmaVar.a);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                kxc.l(th, th2);
            }
            throw th;
        }
    }

    public jma(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = new CancellationSignal();
    }

    public jma(byte[] bArr, byte[] bArr2) {
        this.b = new Rect();
        this.a = new Rect();
    }

    public jma(byte[] bArr) {
        this.a = new ArrayList();
        this.b = new kvc(this, null, null, null);
    }

    public jma() {
        this.b = new ArrayList();
        this.a = new ArrayList();
    }
}
