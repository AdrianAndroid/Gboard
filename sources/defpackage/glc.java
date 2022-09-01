package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* renamed from: glc  reason: default package */
/* loaded from: classes.dex */
final class glc extends UploadDataProvider {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/io/impl/CronetAsyncDataProvider");
    glr b;
    public final gme c;
    public final blo d;
    public final blc e;
    private final boolean f;
    private final gnn g;

    public glc(glr glrVar, gme gmeVar, blo bloVar, boolean z, blc blcVar, gnn gnnVar) {
        this.b = glrVar;
        this.c = gmeVar;
        this.d = bloVar;
        this.f = z;
        this.e = blcVar;
        this.g = gnnVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.b.a();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        gme gmeVar = this.c;
        gmeVar.k = false;
        gmeVar.c.e();
        mko b = this.b.b();
        if (!b.isDone()) {
            b = bvq.f(b, 60L, TimeUnit.SECONDS, this.g);
        }
        this.g.a(b, new glb(this, byteBuffer, uploadDataSink));
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        if (!this.f || !this.b.e()) {
            uploadDataSink.onRewindError(new blb(656385));
            return;
        }
        this.b.c();
        this.b = this.b.d();
        uploadDataSink.onRewindSucceeded();
        lty ltyVar = luh.a;
    }
}
