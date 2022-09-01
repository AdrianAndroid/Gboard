package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* renamed from: owe  reason: default package */
/* loaded from: classes2.dex */
public final class owe extends UploadDataProvider {
    private final ByteBuffer a;

    public owe(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        if (byteBuffer.remaining() >= this.a.remaining()) {
            byteBuffer.put(this.a);
        } else {
            int limit = this.a.limit();
            ByteBuffer byteBuffer2 = this.a;
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(this.a);
            this.a.limit(limit);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
