package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import java.lang.Thread;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hym  reason: default package */
/* loaded from: classes.dex */
public final class hym implements Thread.UncaughtExceptionHandler, gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler");
    public final Context b;
    public final SharedPreferences c;
    public final idk e;
    private final hyl g;
    public final mks d = gxo.c(11);
    private final Thread.UncaughtExceptionHandler f = Thread.getDefaultUncaughtExceptionHandler();

    public hym(Context context, SharedPreferences sharedPreferences, hyl hylVar, idk idkVar) {
        this.b = context;
        this.c = sharedPreferences;
        this.g = hylVar;
        this.e = idkVar;
        gzt.a.a(this);
    }

    static final void b(int i) {
        Runtime.getRuntime().exit(i);
    }

    public final void a() {
        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler", "clearSignatureCheckSecurityExceptionState", 267, "UncaughtExceptionHandler.java")).t("clear signature check security exception state");
        hjk.c = false;
        SharedPreferences.Editor edit = this.c.edit();
        edit.remove("disable_gmscore");
        edit.remove("signature_check_gms_version");
        edit.remove("signature_check_security_exception_crash");
        edit.apply();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.c.getBoolean("disable_gmscore", false);
        printer.println("disable_gmscore = " + z2);
        int i = this.c.getInt("signature_check_gms_version", 0);
        printer.println("signature_check_gms_version = " + i);
        printer.println("signature_check_security_exception_crash = ".concat(String.valueOf(this.c.getString("signature_check_security_exception_crash", ""))));
        byte[] a2 = jbj.a(this.b);
        if (a2 != null) {
            printer.println("package_signature_digest = ".concat(lyk.f.i(a2)));
        } else {
            printer.println("package_signature_digest is null");
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "UncaughtExceptionHandler";
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        hyd hydVar;
        int i;
        String message;
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof SecurityException) && (message = th2.getMessage()) != null && (message.startsWith("Signature check failed for") || message.startsWith("GoogleCertificatesRslt: debug cert rejected"))) {
                if (this.c.getBoolean("disable_gmscore", false)) {
                    ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler", "handleSignatureCheckSecurityException", 241, "UncaughtExceptionHandler.java")).t("there's code using GmsCore without guard");
                }
                Context context = this.b;
                fmx fmxVar = fmx.a;
                int a2 = fnn.a(context);
                String string = this.c.getString("signature_check_security_exception_crash", "");
                int b = gva.b();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(b));
                String[] split = TextUtils.split(string, ",");
                for (int i2 = 0; i2 < split.length && arrayList.size() < 2; i2++) {
                    b--;
                    try {
                        if (Integer.parseInt(split[i2]) != b) {
                            break;
                        }
                        arrayList.add(Integer.valueOf(b));
                    } catch (NumberFormatException unused) {
                    }
                }
                boolean z = arrayList.size() >= 2;
                String join = TextUtils.join(",", arrayList);
                SharedPreferences.Editor edit = this.c.edit();
                if (z) {
                    edit.putBoolean("disable_gmscore", true);
                    edit.putInt("signature_check_gms_version", a2);
                }
                edit.putString("signature_check_security_exception_crash", join);
                edit.commit();
                ((ltd) ((ltd) ((ltd) a.c()).i(th)).k("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler", "handleSignatureCheckSecurityException", 256, "UncaughtExceptionHandler.java")).A("Signature check SecurityException raised %d times, disableGmsCore: %s", arrayList.size(), z);
                b(0);
                return;
            }
        }
        boolean z2 = thread == Looper.getMainLooper().getThread();
        hyl hylVar = this.g;
        try {
            nfh t = hyb.l.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar = (hyb) t.b;
            boolean z3 = true;
            hybVar.a |= 1;
            hybVar.b = z2;
            if (th instanceof Error) {
                hydVar = hyd.JAVA_ERROR;
            } else if (th instanceof OutOfMemoryError) {
                hydVar = hyd.JAVA_OUT_OF_MEMORY;
            } else {
                hydVar = hyd.JAVA_DEFAULT_EXCEPTION;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar2 = (hyb) t.b;
            hybVar2.g = hydVar.h;
            hybVar2.a |= 32;
            long currentTimeMillis = System.currentTimeMillis();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar3 = (hyb) t.b;
            hybVar3.a |= 4;
            hybVar3.d = currentTimeMillis;
            boolean b2 = jai.b.b();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar4 = (hyb) t.b;
            hybVar4.a = 2 | hybVar4.a;
            hybVar4.c = b2;
            if (((hyh) hylVar).h <= 0) {
                z3 = false;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyb hybVar5 = (hyb) t.b;
            hybVar5.a |= 16;
            hybVar5.f = z3;
            boolean z4 = ((hyh) hylVar).j;
            if (t.c) {
                t.cD();
                i = 0;
                t.c = false;
            } else {
                i = 0;
            }
            hyb hybVar6 = (hyb) t.b;
            int i3 = hybVar6.a | 256;
            hybVar6.a = i3;
            hybVar6.j = z4;
            int i4 = ((hyh) hylVar).g;
            hybVar6.a = i3 | 512;
            hybVar6.k = i4;
            t.cW(th.toString());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (i < length) {
                t.cW(stackTrace[i].toString());
                i++;
            }
            ((hyh) hylVar).d((hyb) t.cz());
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) hyh.a.c()).i(e)).k("com/google/android/libraries/inputmethod/lethe/CrashProtector", "persistJavaCrash", (char) 295, "CrashProtector.java")).t("Failed to persist java crash.");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        ((ltd) ((ltd) ((ltd) a.c()).i(th)).k("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler", "uncaughtException", 189, "UncaughtExceptionHandler.java")).F("Got uncaught exception in %s, thread id: %d", thread, thread.getId());
        b(-1);
    }
}
