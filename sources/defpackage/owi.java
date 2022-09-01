package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: owi  reason: default package */
/* loaded from: classes2.dex */
public abstract class owi extends ExperimentalCronetEngine {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract oxe a(String str, UrlRequest.Callback callback, Executor executor, boolean z, boolean z2, int i, boolean z3, int i2);

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    /* renamed from: newUrlRequestBuilder */
    public final ExperimentalUrlRequest.Builder mo92newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new oxf(str, callback, executor, this);
    }
}
