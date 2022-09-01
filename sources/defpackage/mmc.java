package defpackage;

import com.google.fcp.client.http.HttpClientForNative;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: mmc  reason: default package */
/* loaded from: classes2.dex */
public final class mmc extends HttpClientForNative.HttpRequestHandle {
    public final mme a;
    public final mma b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Future j;
    private final mlu p;
    private final ExecutorService q;
    private final int r;
    private final int s;
    private final double t;
    public Runnable i = mkm.a;
    public int o = 1;
    private volatile long u = 0;
    public volatile long k = 0;
    public volatile long l = 0;
    public volatile long m = 0;
    public volatile boolean n = false;

    public mmc(mme mmeVar, mlu mluVar, ExecutorService executorService, mma mmaVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, double d) {
        this.a = mmeVar;
        this.p = mluVar;
        this.q = executorService;
        this.b = mmaVar;
        this.r = i;
        this.s = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.t = d;
    }

    private final void m(boolean z) {
        if (z) {
            return;
        }
        this.o = 4;
        throw new mlz();
    }

    public final String a(String str) {
        for (mmd mmdVar : this.a.c) {
            if (jdg.Z(str, mmdVar.a)) {
                return mmdVar.b;
            }
        }
        return null;
    }

    public final synchronized void b() {
        if (this.o == 4) {
            throw new mlz();
        }
    }

    @Override // com.google.fcp.client.http.HttpClientForNative.HttpRequestHandle, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p.b(new kvl(this, 11));
    }

    public final synchronized void d(String str, Exception exc) {
        int i;
        int i2 = this.o;
        this.o = 4;
        if (exc instanceof SocketTimeoutException) {
            i = 6;
        } else {
            i = exc instanceof mmb ? 5 : 16;
        }
        l(i, String.format("%s (%s)", str, exc), i2);
    }

    public final synchronized void e(byte[] bArr, int i) {
        b();
        m(HttpClientForNative.onResponseBody(this.nativeHandle, bArr, i));
    }

    public final synchronized void f(long j) {
        if (this.o == 4) {
            return;
        }
        if (this.h && j > -1) {
            this.m = j;
        }
        this.o = 4;
        HttpClientForNative.onResponseCompleted(this.nativeHandle);
    }

    public final synchronized void g(byte[] bArr) {
        b();
        this.o = 3;
        m(HttpClientForNative.onResponseStarted(this.nativeHandle, bArr));
    }

    @Override // com.google.fcp.client.http.HttpClientForNative.HttpRequestHandle
    public final byte[] getTotalSentReceivedBytes() {
        double d = this.n ? this.t : 1.0d;
        nfh t = mmg.c.t();
        double d2 = this.u;
        Double.isNaN(d2);
        long j = ((long) (d2 * d)) + this.k;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mmg) t.b).a = j;
        double d3 = this.l;
        Double.isNaN(d3);
        long j2 = ((long) (d3 * d)) + this.m;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mmg) t.b).b = j2;
        return ((mmg) t.cz()).q();
    }

    public final synchronized void h(byte[] bArr, long j, int[] iArr) {
        b();
        m(HttpClientForNative.readRequestBody(this.nativeHandle, bArr, j, iArr));
    }

    public final synchronized void i() {
        if (this.o != 1) {
            throw new IllegalStateException("must not call perform() more than once");
        }
        this.o = 2;
        this.j = this.q.submit(new Runnable() { // from class: mly
            /* JADX WARN: Removed duplicated region for block: B:152:0x0383  */
            /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:158:0x037a  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x0072 A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #5 {all -> 0x0089, blocks: (B:227:0x0052, B:229:0x0059, B:203:0x005d, B:204:0x0061, B:212:0x0069, B:206:0x0072, B:208:0x0076, B:209:0x007e, B:202:0x005b), top: B:226:0x0052 }] */
            /* JADX WARN: Removed duplicated region for block: B:211:0x0069 A[EDGE_INSN: B:211:0x0069->B:212:0x0069 ?: BREAK  , SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:214:0x006e A[Catch: IOException -> 0x0097, mlz -> 0x034f, all -> 0x0375, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0097, blocks: (B:199:0x0047, B:214:0x006e, B:219:0x0096, B:225:0x0093), top: B:198:0x0047 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 913
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mly.run():void");
            }
        });
    }

    public final void j() {
        Future future;
        synchronized (this) {
            future = this.j;
            if (future == null) {
                throw new IllegalStateException("must not call waitForCompletion() before perform()");
            }
        }
        try {
            future.get();
        } catch (InterruptedException e) {
            throw new mlw("unexpected interruption", e);
        } catch (CancellationException unused) {
        } catch (ExecutionException e2) {
            throw new mlw("unexpected exception", e2);
        }
    }

    public final synchronized boolean k() {
        return this.o == 4;
    }

    public final void l(int i, String str, int i2) {
        nfh t = njq.c.t();
        int i3 = i - 2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        njq njqVar = (njq) t.b;
        njqVar.a = i3;
        str.getClass();
        njqVar.b = str;
        byte[] q = ((njq) t.cz()).q();
        int i4 = i2 - 1;
        if (i2 != 0) {
            if (i4 == 1) {
                HttpClientForNative.onResponseError(this.nativeHandle, q);
                return;
            } else if (i4 != 2) {
                return;
            } else {
                HttpClientForNative.onResponseBodyError(this.nativeHandle, q);
                return;
            }
        }
        throw null;
    }

    public final void c(HttpURLConnection httpURLConnection, long j, String str) {
        String str2;
        int i = this.a.b;
        int p = msc.p(i);
        if (p == 0) {
            p = 1;
        }
        switch (p - 2) {
            case 1:
                str2 = "HEAD";
                break;
            case 2:
                str2 = "GET";
                break;
            case 3:
                str2 = "POST";
                break;
            case 4:
                str2 = "PUT";
                break;
            case 5:
                str2 = "PATCH";
                break;
            case 6:
                str2 = "DELETE";
                break;
            default:
                Object[] objArr = new Object[1];
                int p2 = msc.p(i);
                if (p2 == 0) {
                    p2 = 1;
                }
                if (p2 == 1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                objArr[0] = Integer.valueOf(p2 - 2);
                throw new mlw(String.format("unexpected method: %s", objArr));
        }
        try {
            httpURLConnection.setRequestMethod(str2);
            for (mmd mmdVar : this.a.c) {
                httpURLConnection.addRequestProperty(mmdVar.a, mmdVar.b);
            }
            boolean z = this.g;
            if (z && str == null) {
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            } else if (!z && str != null) {
                throw new mmb("cannot support Accept-Encoding header");
            }
            int i2 = this.r;
            if (i2 >= 0) {
                httpURLConnection.setConnectTimeout(i2);
            }
            int i3 = this.s;
            if (i3 >= 0) {
                httpURLConnection.setReadTimeout(i3);
            }
            httpURLConnection.setDoInput(true);
            if (this.a.d) {
                httpURLConnection.setDoOutput(true);
                if (j >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(j);
                } else {
                    httpURLConnection.setChunkedStreamingMode(this.c);
                }
            } else if (j > 0) {
                throw new mmb("Content-Length > 0 but no request body available");
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            if (CookieHandler.getDefault() == null) {
                if (!this.h) {
                    return;
                }
                this.u += str2.length() + 1 + this.a.a.length() + 11;
                for (mmd mmdVar2 : this.a.c) {
                    this.u += mmdVar2.a.length() + 2 + mmdVar2.b.length() + 2;
                }
                this.u += 2;
                return;
            }
            throw new IllegalStateException("must not set a CookieHandler");
        } catch (ProtocolException e) {
            throw new mlw("unexpected ProtocolException", e);
        }
    }
}
