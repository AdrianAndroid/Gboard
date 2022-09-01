package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: knc  reason: default package */
/* loaded from: classes.dex */
public final class knc extends InputStream implements InputStreamRetargetInterface {
    private final MediaCodec.BufferInfo a;
    private InputStream b;
    private MediaCodec c;
    private boolean d;
    private boolean e;
    private final byte[] f = new byte[320];
    private int g = 0;
    private int h = 0;
    private final byte[] i = new byte[1];

    public knc(InputStream inputStream) {
        this.b = inputStream;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/3gpp");
        mediaFormat.setInteger("sample-rate", 8000);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("bitrate", 12200);
        try {
            try {
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/3gpp");
                this.c = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.c.start();
            } catch (Exception e) {
                MediaCodec mediaCodec = this.c;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                this.c = null;
                throw e;
            }
        } finally {
            this.a = new MediaCodec.BufferInfo();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            InputStream inputStream = this.b;
            if (inputStream != null) {
                inputStream.close();
            }
            this.b = null;
            try {
                MediaCodec mediaCodec = this.c;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.b = null;
            try {
                MediaCodec mediaCodec2 = this.c;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected final void finalize() {
        MediaCodec mediaCodec = this.c;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.i, 0, 1) == 1) {
            return this.i[0] & 255;
        }
        return -1;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int dequeueInputBuffer;
        if (this.c != null) {
            if (this.h >= this.g && !this.d) {
                this.h = 0;
                this.g = 0;
                while (!this.e && (dequeueInputBuffer = this.c.dequeueInputBuffer(0L)) >= 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 320) {
                            break;
                        }
                        int read = this.b.read(this.f, i3, 320 - i3);
                        if (read == -1) {
                            this.e = true;
                            break;
                        }
                        i3 += read;
                    }
                    this.c.getInputBuffer(dequeueInputBuffer).put(this.f, 0, i3);
                    this.c.queueInputBuffer(dequeueInputBuffer, 0, i3, 0L, true != this.e ? 0 : 4);
                }
                int dequeueOutputBuffer = this.c.dequeueOutputBuffer(this.a, 0L);
                if (dequeueOutputBuffer >= 0) {
                    this.g = this.a.size;
                    this.c.getOutputBuffer(dequeueOutputBuffer).get(this.f, 0, this.g);
                    this.c.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.a.flags & 4) != 0) {
                        this.d = true;
                    }
                }
            }
            int i4 = this.h;
            int i5 = this.g;
            if (i4 >= i5) {
                return (!this.e || !this.d) ? 0 : -1;
            }
            int i6 = i5 - i4;
            if (i2 <= i6) {
                i6 = i2;
            }
            System.arraycopy(this.f, i4, bArr, i, i6);
            this.h += i6;
            return i6;
        }
        throw new IllegalStateException("not open");
    }
}
