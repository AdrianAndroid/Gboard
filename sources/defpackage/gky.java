package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gky  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gky implements gnm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gky(blo bloVar, int i) {
        this.b = i;
        this.a = bloVar;
    }

    public /* synthetic */ gky(bnk bnkVar, int i) {
        this.b = i;
        this.a = bnkVar;
    }

    public /* synthetic */ gky(gme gmeVar, int i) {
        this.b = i;
        this.a = gmeVar;
    }

    public gky(gmg gmgVar, int i) {
        this.b = i;
        this.a = gmgVar;
    }

    public /* synthetic */ gky(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [blo, java.lang.Object] */
    @Override // defpackage.gnm
    public final void a() {
        long a;
        switch (this.b) {
            case 0:
                this.a.d(0L, 0L, lzv.r);
                return;
            case 1:
                Object obj = this.a;
                bnk bnkVar = (bnk) obj;
                if (bnkVar.a.isDone()) {
                    return;
                }
                ((mik) obj).n(new TimeoutException());
                bnkVar.a.cancel(true);
                return;
            case 2:
                this.a.run();
                return;
            case 3:
                this.a.run();
                return;
            case 4:
                this.a.run();
                return;
            case 5:
                gme gmeVar = (gme) this.a;
                gmd gmdVar = gmeVar.j;
                jdg.u(gmdVar);
                if (gmeVar.l) {
                    return;
                }
                if (!gmeVar.k) {
                    gmeVar.a(1000L);
                    return;
                }
                boolean z = gmeVar.m;
                boolean z2 = !z;
                long j = z2 ? gmeVar.d : gmeVar.e;
                if (gmeVar.i) {
                    a = SystemClock.elapsedRealtime() - ((blh) gmeVar.c).a;
                } else {
                    a = gmeVar.c.a();
                }
                if (!gmeVar.o && a >= gmeVar.g) {
                    gmeVar.b.a();
                    gmeVar.o = true;
                }
                if (a >= j) {
                    gmdVar.a(true != z ? 655371 : 655362);
                    return;
                }
                if (gmeVar.n) {
                    gmeVar.a(Math.min(j - a, 1000L));
                } else {
                    long j2 = gmeVar.f;
                    if (a >= j2) {
                        ((gmk) gmeVar.h).a.c(bnp.a);
                        gmeVar.n = true;
                        gmeVar.a(Math.min(j - a, 1000L));
                    } else {
                        gmeVar.a(Math.min(j2 - a, 1000L));
                    }
                }
                if (!z2) {
                    return;
                }
                glz glzVar = (glz) gmdVar;
                int i = glzVar.b.get();
                if (i == 1) {
                    UrlRequest urlRequest = glzVar.k;
                    jdg.u(urlRequest);
                    urlRequest.getStatus(new glx(glzVar));
                    return;
                }
                ((ltd) ((ltd) glz.a.d()).k("com/google/android/libraries/gsa/io/impl/MonitoredCronetRequest", "requestStatus", 170, "MonitoredCronetRequest.java")).u("Did not request status due to an unexpected state: %d", i);
                return;
            case 6:
                synchronized (this.a) {
                    long elapsedRealtime = ((gmg) this.a).e - SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 0) {
                        ((gmg) this.a).b.e(elapsedRealtime, this);
                    } else {
                        ((gmg) this.a).b();
                    }
                }
                return;
            default:
                this.a.run();
                return;
        }
    }
}
