package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jyh  reason: default package */
/* loaded from: classes.dex */
public final class jyh {
    public final jyj a;
    public final jyi b;
    public long c = 0;

    private jyh(jyj jyjVar, jyi jyiVar) {
        this.a = jyjVar;
        this.b = jyiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jyh a(jyj jyjVar, jyi jyiVar) {
        return new jyh(jyjVar, jyiVar);
    }

    public final void b(jsz jszVar, Object obj) {
        ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "finishJob", 158, "DownloadJob.java")).F("<==== Finishing job %s, %d ms. elapsed since start", jszVar, SystemClock.elapsedRealtime() - this.c);
        jsf.a("scheduling").b(jszVar.toString(), "jf", new Object[0]);
        this.b.a(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(final jsz jszVar, final boolean z, final Object obj) {
        ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStartJob", 42, "DownloadJob.java")).w("====> Starting job %s", jszVar);
        jyj jyjVar = this.a;
        final jzm jzmVar = jyjVar.a;
        final jux juxVar = jyjVar.e;
        mks mksVar = jyjVar.c;
        this.c = SystemClock.elapsedRealtime();
        jsf.a("scheduling").b(jszVar.toString(), "scheduled", new Object[0]);
        jsf.a("scheduling").a(jszVar.toString(), "job", new Object[0]);
        lvw.A(mhu.h(mksVar.hQ(new Callable() { // from class: jyf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                jzj jzjVar;
                jyh jyhVar = jyh.this;
                jsz jszVar2 = jszVar;
                boolean z2 = z;
                Object obj2 = obj;
                jzm jzmVar2 = jzmVar;
                jux juxVar2 = juxVar;
                lug lugVar = jsh.a;
                SystemClock.elapsedRealtime();
                if (z2) {
                    epv epvVar = new epv(jyhVar, jszVar2, obj2, 18);
                    jzi jziVar = new jzi();
                    jyj jyjVar2 = jyhVar.a;
                    jziVar.a = jyjVar2.a;
                    jziVar.c = jyjVar2.c;
                    jziVar.b = jyjVar2.e;
                    jziVar.d = jyjVar2.b;
                    jziVar.e = jszVar2;
                    jziVar.f = epvVar;
                    jziVar.g = jyjVar2.d;
                    jzj jzjVar2 = new jzj(jziVar);
                    jyhVar.b.b(obj2);
                    jzjVar = jzjVar2;
                } else {
                    jzjVar = null;
                }
                jzg.e(jzmVar2, juxVar2, jzjVar, System.currentTimeMillis(), "job start");
                return null;
            }
        }), Throwable.class, new jkd(this, z, jszVar, obj, 2), mksVar), new jyg(this, z, jszVar, obj, 0), mksVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map, java.lang.Object] */
    public final void d(jsz jszVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStopJob", 126, "DownloadJob.java")).F("<<<<< Stopping job %s, %d ms. elapsed since start", jszVar, elapsedRealtime);
        jrz a = jsf.a("scheduling");
        a.f(2);
        a.c(jszVar.toString(), "je", Long.valueOf(elapsedRealtime));
        synchronized (jzg.a) {
            khv khvVar = jzg.c;
            khvVar.c.remove(jszVar);
            for (jyc jycVar : khvVar.a(jszVar)) {
                jycVar.b(jxy.JOB_STOPPED, (jls) khvVar.a);
            }
        }
    }
}
