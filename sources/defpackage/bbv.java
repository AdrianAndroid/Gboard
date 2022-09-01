package defpackage;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bbv  reason: default package */
/* loaded from: classes.dex */
final class bbv extends MediaDataSource {
    final /* synthetic */ ByteBuffer a;

    public bbv(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.a.limit()) {
            return -1;
        }
        this.a.position((int) j);
        int min = Math.min(i2, this.a.remaining());
        this.a.get(bArr, i, min);
        return min;
    }
}
