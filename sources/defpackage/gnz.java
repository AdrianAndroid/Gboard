package defpackage;

import java.net.URL;
import java.util.Locale;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: gnz  reason: default package */
/* loaded from: classes.dex */
abstract class gnz extends bnl {
    protected volatile boolean a = false;
    private volatile Future b;

    /* JADX INFO: Access modifiers changed from: protected */
    public gnz(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final bmi d(mox moxVar, String str, int i) {
        bmh a = bmi.a();
        a.b = new URL(String.valueOf(moxVar.b).concat(String.valueOf(str)));
        a.g = false;
        a.h = 14;
        for (int i2 = 0; i2 < moxVar.c.size(); i2++) {
            String str2 = (String) moxVar.c.get(i2);
            String str3 = (String) moxVar.d.get(i2);
            jdg.u(str2);
            jdg.u(str3);
            if (bmi.d.contains(str2.toLowerCase(Locale.US))) {
                for (bme bmeVar : a.c) {
                    if (bmeVar.a.equalsIgnoreCase(str2)) {
                        ((ltd) ((ltd) bmi.a.d()).k("com/google/android/apps/gsa/shared/io/HttpRequestData$Builder", "addHeader", 491, "HttpRequestData.java")).w("Header %s already set!", str2);
                        throw new IllegalStateException();
                    }
                }
                continue;
            }
            a.c.add(new bme(str2, str3));
        }
        a.l = 3;
        a.h = i;
        return a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        Future future = this.b;
        if (Thread.interrupted() || this.a || (future != null && future.isDone())) {
            throw new InterruptedException();
        }
    }

    public final void c() {
        this.a = true;
        Future future = this.b;
        if (future != null) {
            future.cancel(true);
        }
    }

    protected abstract void e();

    /* JADX WARN: Type inference failed for: r3v2, types: [mkr, java.lang.Object] */
    public final void f(fxa fxaVar) {
        try {
            this.b = fxaVar.a.hR(this, null);
            if (!this.a) {
                return;
            }
            this.b.cancel(true);
        } catch (Throwable th) {
            if (this.a) {
                this.b.cancel(true);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e();
        } catch (InterruptedException unused) {
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) goc.a.d()).i(e)).k("com/google/android/libraries/gsa/s3/PairHttpConnection$Connection", "run", 368, "PairHttpConnection.java")).w("Connection [%s] failed unexpectedly.", this);
            throw e;
        }
    }
}
