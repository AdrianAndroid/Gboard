package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: owo  reason: default package */
/* loaded from: classes2.dex */
public final class owo extends owi {
    private final String b;
    private final ExecutorService c;

    public owo(owj owjVar) {
        int i = owjVar.b;
        i = i == 20 ? 9 : i;
        this.b = owjVar.a;
        this.c = new ThreadPoolExecutor(10, 20, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new owm(i));
    }

    @Override // defpackage.owi
    public final oxe a(String str, UrlRequest.Callback callback, Executor executor, boolean z, boolean z2, int i, boolean z3, int i2) {
        return new oxa(callback, this.c, executor, str, this.b, z, z2, i, z3, i2);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new own();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getEffectiveConnectionType() {
        return 0;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getHttpRttMs() {
        return -1;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getTransportRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "CronetHttpURLConnection/".concat("105.0.5135.3@".concat("db15ca68"));
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // defpackage.owi, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    /* renamed from: newUrlRequestBuilder */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo92newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return super.mo92newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return url.openConnection();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.c.shutdown();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }
}
