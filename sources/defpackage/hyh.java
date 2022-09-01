package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Printer;
import j$.time.Duration;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hyh  reason: default package */
/* loaded from: classes.dex */
public final class hyh implements hyl, gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/lethe/CrashProtector");
    static final long b = Duration.ofMinutes(5).toMillis();
    public final Context c;
    public final SharedPreferences d;
    public final idk e;
    public final hye f;
    public final int g = gva.b();
    public volatile long h;
    public volatile boolean i;
    public volatile boolean j;
    public final gjz k;
    private hym l;
    private final hyo m;

    public hyh(Context context, SharedPreferences sharedPreferences, gjz gjzVar, idk idkVar, byte[] bArr) {
        hyg hygVar = new hyg(this);
        this.m = hygVar;
        this.c = context;
        this.k = gjzVar;
        this.d = sharedPreferences;
        this.e = idkVar;
        this.f = new hye(context, sharedPreferences, idkVar, jan.b);
        ijl.b().h(hygVar, hyp.class, mjl.a);
        gzt.a.a(this);
    }

    public final TreeSet a() {
        return this.f.e;
    }

    public final void b() {
        this.i = false;
        this.h = 0L;
        this.j = false;
    }

    public final void c() {
        try {
            hym hymVar = new hym(this.c, this.d, this, this.e);
            this.l = hymVar;
            if (!gva.d()) {
                boolean z = hymVar.c.getBoolean("disable_gmscore", false);
                if (z) {
                    int i = hymVar.c.getInt("signature_check_gms_version", 0);
                    Context context = hymVar.b;
                    fmx fmxVar = fmx.a;
                    if (i != fnn.a(context)) {
                    }
                }
                hjk.c = z;
                if (z) {
                    ((ltd) ((ltd) hym.a.d()).k("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler", "init", 113, "UncaughtExceptionHandler.java")).t("detect signature check security exception raised, GmsCore is disabled");
                }
                hymVar.d.a(new hyk(hymVar), 10L, TimeUnit.MINUTES);
                Thread.setDefaultUncaughtExceptionHandler(hymVar);
            }
            hymVar.a();
            Thread.setDefaultUncaughtExceptionHandler(hymVar);
        } catch (NoSuchMethodError e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/lethe/CrashProtector", "installUncaughtExceptionHandler", (char) 259, "CrashProtector.java")).t("Failed to create UncaughtExceptionHandler");
        }
    }

    public final void d(hyb hybVar) {
        hye hyeVar = this.f;
        hyeVar.c(hybVar);
        hyeVar.d();
        hyd b2 = hyd.b(hybVar.g);
        if (b2 == null) {
            b2 = hyd.JAVA_DEFAULT_EXCEPTION;
        }
        if (!hyf.a(b2)) {
            idk idkVar = hyeVar.c;
            hyi hyiVar = hyi.c;
            Object[] objArr = new Object[1];
            hyd b3 = hyd.b(hybVar.g);
            if (b3 == null) {
                b3 = hyd.JAVA_DEFAULT_EXCEPTION;
            }
            objArr[0] = b3;
            idkVar.e(hyiVar, objArr);
        }
        if (hybVar.f) {
            idk idkVar2 = hyeVar.c;
            hyi hyiVar2 = hyi.b;
            Object[] objArr2 = new Object[1];
            hyd b4 = hyd.b(hybVar.g);
            if (b4 == null) {
                b4 = hyd.JAVA_DEFAULT_EXCEPTION;
            }
            objArr2[0] = b4;
            idkVar2.e(hyiVar2, objArr2);
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        long j = this.h;
        printer.println("shouldSkipExperimentFlags: " + j);
        boolean z2 = this.i;
        printer.println("enableDecoderRecoveryMode: " + z2);
        boolean z3 = this.j;
        printer.println("clearCacheDir: " + z3);
    }

    public final boolean e(String str, int i) {
        long j = this.d.getLong(str, -1L);
        return j != -1 && ((long) i) == j + 1;
    }

    public final boolean f(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < j) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/lethe/CrashProtector", "isValidCrashTime", 480, "CrashProtector.java")).v("Invalid timestamp: %s, which is larger than current.", j);
            return false;
        }
        long j2 = currentTimeMillis - j;
        if (j2 <= b) {
            return true;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/lethe/CrashProtector", "isValidCrashTime", 485, "CrashProtector.java")).B("Invalid timestamp: %s, which is %s minutes ago.", j, Duration.ofMillis(j2).toMinutes());
        return false;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CrashProtector";
    }
}
