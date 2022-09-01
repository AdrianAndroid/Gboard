package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* renamed from: glz  reason: default package */
/* loaded from: classes.dex */
public final class glz implements gmd {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/io/impl/MonitoredCronetRequest");
    final bmi c;
    final glr d;
    public final bll e;
    public final blo f;
    public final gme i;
    public gld j;
    public UrlRequest k;
    public ByteBuffer l;
    private final blc m;
    public final AtomicInteger b = new AtomicInteger(1);
    public final mld g = mld.e();
    public final UrlRequest.Callback h = new gly(this);

    public glz(bmi bmiVar, glr glrVar, bll bllVar, blo bloVar, gme gmeVar, blc blcVar) {
        this.c = bmiVar;
        this.d = glrVar;
        this.e = bllVar;
        this.f = bloVar;
        this.i = gmeVar;
        this.m = blcVar;
    }

    public static nwo d(UrlResponseInfo urlResponseInfo) {
        return new nwo(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getNegotiatedProtocol(), urlResponseInfo.getAllHeaders());
    }

    @Override // defpackage.gmd
    public final void a(int i) {
        b(i, null);
    }

    public final void b(int i, Throwable th) {
        int andSet = this.b.getAndSet(3);
        if (andSet != 3) {
            blb blbVar = th != null ? new blb(th, i) : new blb(i);
            if (andSet == 1) {
                c(this.g.n(blbVar), "Unexpectedly unable to set the response data future.");
            }
            this.d.c();
            this.j.g(new blj(blbVar));
            this.i.c();
            UrlRequest urlRequest = this.k;
            jdg.u(urlRequest);
            urlRequest.cancel();
            this.f.c(blbVar);
        }
    }

    public final void c(boolean z, String str) {
        if (!z) {
            IllegalStateException illegalStateException = new IllegalStateException(str);
            b(656389, illegalStateException);
            ((ltd) ((ltd) ((ltd) a.c()).i(illegalStateException)).k("com/google/android/libraries/gsa/io/impl/MonitoredCronetRequest", "verifyState", (char) 338, "MonitoredCronetRequest.java")).t("Unexpected state");
        }
    }
}
