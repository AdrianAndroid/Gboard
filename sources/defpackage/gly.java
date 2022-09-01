package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gly  reason: default package */
/* loaded from: classes.dex */
public final class gly extends UrlRequest.Callback {
    final /* synthetic */ glz a;

    public gly(glz glzVar) {
        this.a = glzVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        glz glzVar = this.a;
        glzVar.c(glzVar.b.get() == 3, "Unexpected onCancelled() call.");
        glz glzVar2 = this.a;
        ByteBuffer byteBuffer = glzVar2.l;
        if (byteBuffer != null) {
            glzVar2.e.c(byteBuffer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFailed(org.chromium.net.UrlRequest r8, org.chromium.net.UrlResponseInfo r9, org.chromium.net.CronetException r10) {
        /*
            r7 = this;
            glz r8 = r7.a
            if (r10 == 0) goto L6
            r9 = 1
            goto L7
        L6:
            r9 = 0
        L7:
            java.lang.String r0 = "Failure without an exception."
            r8.c(r9, r0)
            boolean r8 = r10 instanceof org.chromium.net.NetworkException
            if (r8 == 0) goto Lb3
            r8 = r10
            org.chromium.net.NetworkException r8 = (org.chromium.net.NetworkException) r8
            int r9 = r8.getCronetInternalErrorCode()
            if (r9 == 0) goto Lb3
            int r8 = r8.getCronetInternalErrorCode()
            r9 = 660000(0xa1220, float:9.24857E-40)
            int r8 = r9 - r8
            java.lang.String r0 = "CronetEngineProvider.java"
            java.lang.String r1 = "com/google/android/libraries/gsa/io/impl/CronetEngineProvider"
            java.lang.String r2 = "CronetEngineProvider"
            if (r8 <= r9) goto L2f
            r9 = 662000(0xa19f0, float:9.2766E-40)
            if (r8 < r9) goto L52
        L2f:
            ltg r9 = defpackage.gle.a
            ltv r9 = r9.d()
            lty r3 = defpackage.luh.a
            ltv r9 = r9.h(r3, r2)
            ltd r9 = (defpackage.ltd) r9
            java.lang.String r3 = "gsaErrorForCronetInternalErrorCode"
            r4 = 67
            ltv r9 = r9.k(r1, r3, r4, r0)
            ltd r9 = (defpackage.ltd) r9
            java.lang.String r3 = "Cronet error code for a native error out of range: %d"
            r9.u(r3, r8)
            defpackage.bnh.a()
            r8 = 656390(0xa0406, float:9.19798E-40)
        L52:
            boolean r9 = r10 instanceof org.chromium.net.QuicException
            if (r9 == 0) goto Lc6
            r9 = r10
            org.chromium.net.QuicException r9 = (org.chromium.net.QuicException) r9
            int r9 = r9.getQuicDetailedErrorCode()
            blb r3 = new blb
            java.lang.String r4 = "gsaErrorForQuicProtocolErrorCode"
            if (r9 != 0) goto L82
            ltg r9 = defpackage.gle.a
            ltv r9 = r9.d()
            lty r5 = defpackage.luh.a
            ltv r9 = r9.h(r5, r2)
            ltd r9 = (defpackage.ltd) r9
            r2 = 77
            ltv r9 = r9.k(r1, r4, r2, r0)
            ltd r9 = (defpackage.ltd) r9
            java.lang.String r0 = "Error code for a QUIC protocol, no error provided."
            r9.t(r0)
            r9 = 656398(0xa040e, float:9.1981E-40)
            goto Lae
        L82:
            r5 = 670000(0xa3930, float:9.3887E-40)
            int r9 = r9 + r5
            if (r9 <= r5) goto L8d
            r5 = 672000(0xa4100, float:9.41673E-40)
            if (r9 < r5) goto Lae
        L8d:
            ltg r5 = defpackage.gle.a
            ltv r5 = r5.d()
            lty r6 = defpackage.luh.a
            ltv r2 = r5.h(r6, r2)
            ltd r2 = (defpackage.ltd) r2
            r5 = 83
            ltv r0 = r2.k(r1, r4, r5, r0)
            ltd r0 = (defpackage.ltd) r0
            java.lang.String r1 = "Error code for a QUIC protocol error out of range: %d"
            r0.u(r1, r9)
            defpackage.bnh.a()
            r9 = 656397(0xa040d, float:9.19808E-40)
        Lae:
            r3.<init>(r10, r9)
            r10 = r3
            goto Lc6
        Lb3:
            java.lang.Throwable r8 = r10.getCause()
            boolean r8 = r8 instanceof defpackage.blb
            if (r8 == 0) goto Lc3
            java.lang.Throwable r10 = r10.getCause()
            r8 = 656391(0xa0407, float:9.198E-40)
            goto Lc6
        Lc3:
            r8 = 656392(0xa0408, float:9.19801E-40)
        Lc6:
            glz r9 = r7.a
            r9.b(r8, r10)
            glz r8 = r7.a
            java.nio.ByteBuffer r9 = r8.l
            if (r9 == 0) goto Ld6
            bll r8 = r8.e
            r8.c(r9)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gly.onFailed(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo, org.chromium.net.CronetException):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ((blh) this.a.f).d += byteBuffer.position();
        glz glzVar = this.a;
        glzVar.l = null;
        if (glzVar.b.get() == 2) {
            gme gmeVar = this.a.i;
            gmeVar.k = false;
            gmeVar.c.e();
            glz glzVar2 = this.a;
            glzVar2.c(glzVar2.g.isDone(), "Data received before headers");
            gld gldVar = this.a.j;
            lty ltyVar = luh.a;
            synchronized (gldVar.a) {
                if (gldVar.e) {
                    gldVar.c.d(byteBuffer);
                    return;
                }
                jdg.F(!gldVar.d);
                jdg.F(!gldVar.f);
                gldVar.b.f(gldVar.c.a(byteBuffer));
                gldVar.d = true;
                gldVar.f();
                return;
            }
        }
        this.a.e.d(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        glz glzVar = this.a;
        if (glzVar.c.i) {
            if (glzVar.b.get() != 1) {
                ((ltd) ((ltd) glz.a.b()).k("com/google/android/libraries/gsa/io/impl/MonitoredCronetRequest$RequestListener", "onRedirectReceived", 216, "MonitoredCronetRequest.java")).t("Redirect ignored. Request likely already cancelled or timed out.");
                return;
            }
            gme gmeVar = this.a.i;
            jdg.F(!gmeVar.m);
            jdg.u(gmeVar.j);
            gmeVar.c.e();
            gmeVar.k = true;
            urlRequest.followRedirect();
        } else if (!glzVar.b.compareAndSet(1, 3)) {
            ((ltd) ((ltd) glz.a.b()).k("com/google/android/libraries/gsa/io/impl/MonitoredCronetRequest$RequestListener", "onRedirectReceived", 230, "MonitoredCronetRequest.java")).t("Redirect ignored. Request likely already cancelled or timed out.");
        } else {
            this.a.i.c();
            nwo d = glz.d(urlResponseInfo);
            jdg.F(d.c());
            glz glzVar2 = this.a;
            glzVar2.c(glzVar2.g.c(d), "Could not set future.");
            this.a.f.g(d);
            this.a.j.g(blj.a);
            this.a.f.b();
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.a.b.compareAndSet(1, 2)) {
            gme gmeVar = this.a.i;
            gmeVar.k = false;
            gmeVar.c.e();
            gmeVar.m = true;
            nwo d = glz.d(urlResponseInfo);
            glz glzVar = this.a;
            glzVar.c(glzVar.g.c(d), "Could not set future.");
            this.a.f.g(d);
            gld gldVar = this.a.j;
            lty ltyVar = luh.a;
            synchronized (gldVar.a) {
                if (gldVar.e) {
                    return;
                }
                jdg.F(!gldVar.d);
                jdg.F(!gldVar.f);
                gldVar.d = true;
                gldVar.f();
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.a.b.compareAndSet(2, 3)) {
            this.a.i.c();
            glz glzVar = this.a;
            glzVar.c(glzVar.g.isDone(), "Success before receiving headers");
            this.a.j.g(blj.a);
            this.a.f.b();
        }
        glz glzVar2 = this.a;
        ByteBuffer byteBuffer = glzVar2.l;
        if (byteBuffer != null) {
            glzVar2.e.c(byteBuffer);
        }
    }
}
