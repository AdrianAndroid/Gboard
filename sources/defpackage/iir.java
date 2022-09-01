package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* renamed from: iir  reason: default package */
/* loaded from: classes.dex */
public final class iir extends UrlRequest.Callback {
    private static final int a = (int) gvu.KIBIBYTES.b(32);
    private final rj b;
    private final iif c;
    private final nel d = nem.s();
    private final jpv e;

    public iir(rj rjVar, iif iifVar, jpv jpvVar, byte[] bArr) {
        this.b = rjVar;
        this.c = iifVar;
        this.e = jpvVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            rj rjVar = this.b;
            rjVar.d = true;
            rn rnVar = rjVar.b;
            if (rnVar != null && rnVar.b.cancel(true)) {
                rjVar.b();
            }
        } finally {
            gvt.a(this.d);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        Map map;
        try {
            rj rjVar = this.b;
            jpv jpvVar = this.e;
            iii a2 = iij.a();
            boolean z = false;
            a2.c(urlResponseInfo != null ? urlResponseInfo.getHttpStatusCode() : 0);
            a2.e(false);
            if (urlResponseInfo != null) {
                map = urlResponseInfo.getAllHeaders();
            } else {
                map = lrq.b;
            }
            a2.g(map);
            if (urlResponseInfo != null && urlResponseInfo.wasCached()) {
                z = true;
            }
            a2.d(z);
            a2.a = iio.a(cronetException);
            rjVar.c(jpvVar.a(a2));
            if (urlResponseInfo != null) {
                urlResponseInfo.getReceivedByteCount();
            }
        } finally {
            gvt.a(this.d);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.clear();
        this.d.write(bArr, 0, remaining);
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int i;
        List list = (List) urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null || list.isEmpty()) {
            i = a;
        } else {
            Long g = mhq.g((String) list.get(0));
            if (g == null || g.longValue() < 0) {
                i = a;
            } else if (g.longValue() > 2147483647L) {
                new StringBuilder("Cannot buffer entire response for content-length: ").append(g);
                throw new IOException("Cannot buffer entire response for content-length: ".concat(g.toString()));
            } else {
                i = Math.max(g.intValue(), 1);
            }
        }
        urlRequest.read(ByteBuffer.allocateDirect(i));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        opz o;
        List<String> list;
        try {
            opq opqVar = this.c.a;
            if (opqVar != null && (o = opz.o(urlResponseInfo.getUrl())) != null && (list = (List) urlResponseInfo.getAllHeaders().get("Set-Cookie")) != null && !list.isEmpty()) {
                llk f = llp.f(list.size());
                for (String str : list) {
                    opo b = opo.b(o, str);
                    if (b != null) {
                        f.h(b);
                    }
                }
                llp g = f.g();
                if (!g.isEmpty()) {
                    opqVar.b(g);
                }
            }
            rj rjVar = this.b;
            jpv jpvVar = this.e;
            iii a2 = iij.a();
            a2.c(urlResponseInfo.getHttpStatusCode());
            boolean z = false;
            if (urlResponseInfo.getHttpStatusCode() >= 200 && urlResponseInfo.getHttpStatusCode() < 300) {
                z = true;
            }
            a2.e(z);
            a2.g(urlResponseInfo.getAllHeaders());
            a2.d(urlResponseInfo.wasCached());
            a2.b(this.d.b());
            rjVar.c(jpvVar.a(a2));
            urlResponseInfo.getReceivedByteCount();
        } finally {
            gvt.a(this.d);
        }
    }
}
