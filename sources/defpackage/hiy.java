package defpackage;

import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: hiy  reason: default package */
/* loaded from: classes.dex */
public final class hiy implements mka {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public hiy(gwk gwkVar, String str, mko mkoVar, int i) {
        this.d = i;
        this.c = gwkVar;
        this.a = str;
        this.b = mkoVar;
    }

    public hiy(idn idnVar, jfc jfcVar, String str, int i) {
        this.d = i;
        this.c = idnVar;
        this.b = jfcVar;
        this.a = str;
    }

    public hiy(Level level, String str, leq leqVar, int i) {
        this.d = i;
        this.a = level;
        this.b = str;
        this.c = leqVar;
    }

    public hiy(Level level, String str, Object[] objArr, int i) {
        this.d = i;
        this.b = level;
        this.c = str;
        this.a = objArr;
    }

    private final void c() {
        synchronized (this.c) {
            if (((mko) ((gwk) this.c).b.get(this.a)) == this.b) {
                ((gwk) this.c).b.remove(this.a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [idn, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                c();
            } else if (i == 2) {
            } else {
                if (i == 3) {
                    if ((th instanceof CancellationException) || (th instanceof InterruptedException)) {
                        return;
                    }
                    ((ltd) ((ltd) hiz.a.a((Level) this.b).i(th)).k("com/google/android/libraries/inputmethod/future/FluentFuture$4", "onFailure", 567, "FluentFuture.java")).O((String) this.c, (Object[]) this.a);
                    return;
                }
                ?? r0 = this.c;
                if (!(th instanceof fka)) {
                    r0.b(jfc.SYNC_PREFERENCE_FAILURE);
                }
                ((ltd) ((ltd) ((ltd) jfb.b.d()).i(th)).k("com/google/android/libraries/inputmethod/workprofile/WorkProfileTimerProcessor$1", "onFailure", 72, "WorkProfileTimerProcessor.java")).G("%s failed: %s", this.b, this.a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [idn, java.lang.Object] */
    @Override // defpackage.mka
    public final void b(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((ltd) hiz.a.a((Level) this.a).k("com/google/android/libraries/inputmethod/future/FluentFuture$2", "onSuccess", 502, "FluentFuture.java")).w("%s", jdg.p((String) this.b, this.c.a(obj)));
        } else if (i == 1) {
            c();
        } else if (i == 2) {
            ((ltd) hiz.a.a((Level) this.b).k("com/google/android/libraries/inputmethod/future/FluentFuture$3", "onSuccess", 537, "FluentFuture.java")).O((String) this.c, (Object[]) this.a);
        } else if (i == 3) {
        } else {
            this.c.a();
        }
    }
}
