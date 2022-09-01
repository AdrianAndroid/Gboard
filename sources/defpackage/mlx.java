package defpackage;

import com.google.fcp.client.http.HttpClientForNative;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: mlx  reason: default package */
/* loaded from: classes.dex */
public final class mlx extends HttpClientForNative {
    public final opu a;
    private final mlu b;

    public mlx(mlu mluVar, opu opuVar, byte[] bArr, byte[] bArr2) {
        this.b = mluVar;
        this.a = opuVar;
    }

    @Override // com.google.fcp.client.http.HttpClientForNative, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.fcp.client.http.HttpClientForNative
    public final /* bridge */ /* synthetic */ HttpClientForNative.HttpRequestHandle enqueueRequest(final byte[] bArr) {
        return (mmc) this.b.a(new mlt() { // from class: mlv
            @Override // defpackage.mlt, java.util.concurrent.Callable
            public final Object call() {
                mlx mlxVar = mlx.this;
                byte[] bArr2 = bArr;
                try {
                    mme mmeVar = (mme) nfm.z(mme.e, bArr2, nfb.a());
                    jov jovVar = (jov) mlxVar.a.a;
                    mlu mluVar = jovVar.k;
                    ExecutorService executorService = jovVar.n;
                    mma mmaVar = jovVar.o;
                    jou jouVar = jovVar.p;
                    return new mmc(mmeVar, mluVar, executorService, mmaVar, jouVar.a, jouVar.b, jouVar.c, jouVar.d, jouVar.e, jouVar.f, jouVar.g, jouVar.h, jouVar.i);
                } catch (ngd e) {
                    throw new mlw("invalid JniHttpRequest", e);
                }
            }
        });
    }

    @Override // com.google.fcp.client.http.HttpClientForNative
    public final byte[] performRequests(Object[] objArr) {
        return (byte[]) this.b.a(new jor(objArr, 4));
    }
}
