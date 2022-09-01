package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: knd  reason: default package */
/* loaded from: classes.dex */
public final class knd extends InputStream implements InputStreamRetargetInterface {
    private static final ltg a = ltg.j("com/google/android/libraries/speech/encoding/AudioEncoderInputStream");
    private final InputStream b;
    private final int d;
    private final int e;
    private final String f;
    private final int g;
    private final ByteBuffer h;
    private final ByteBuffer i;
    private MediaCodec j;
    private ByteBuffer[] k;
    private ByteBuffer[] l;
    private boolean n;
    private boolean o;
    private int m = -1;
    private boolean p = false;
    private final int c = 2048;

    public knd(InputStream inputStream, String str, int i, int i2, int i3) {
        char c = 65535;
        this.b = inputStream;
        this.d = i;
        this.e = i3;
        this.f = str;
        if (str == null) {
            throw new IllegalArgumentException("Null mimetype provided");
        }
        switch (str.hashCode()) {
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 0;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 2;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.g = 0;
            this.i = ByteBuffer.wrap(new byte[7]);
        } else if (c == 1) {
            jdg.F(i == 16000);
            jdg.F(i3 == 1);
            this.g = 1;
            this.i = ByteBuffer.wrap("#!AMR-WB\n".getBytes());
        } else if (c == 2) {
            this.g = 2;
            ByteBuffer wrap = ByteBuffer.wrap(new byte[42]);
            this.i = wrap;
            jdg.F(wrap.remaining() >= 42);
            knf knfVar = new knf();
            knfVar.a(1716281667L, 32);
            knfVar.a(1L, 1);
            knfVar.a(0L, 7);
            knfVar.a(34L, 24);
            knfVar.a(16L, 16);
            knfVar.a(65535L, 16);
            knfVar.a(0L, 24);
            knfVar.a(0L, 24);
            knfVar.a(i, 20);
            knfVar.a(i3 - 1, 3);
            knfVar.a(15L, 5);
            knfVar.a(0L, 36);
            knfVar.a(0L, 64);
            knfVar.a(0L, 64);
            jdg.G(knfVar.a == 0, "Cannot convert to byte array if not byte aligned.");
            try {
                ((ByteArrayOutputStream) knfVar.b).flush();
                wrap.put(((ByteArrayOutputStream) knfVar.b).toByteArray());
                wrap.flip();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (c == 3) {
            this.g = 3;
            this.i = ByteBuffer.allocate(21).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            throw new IllegalArgumentException("Unsupported audio codec");
        }
        ByteBuffer wrap2 = ByteBuffer.wrap(new byte[2048]);
        this.h = wrap2;
        wrap2.position(2048);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("sample-rate", i);
        mediaFormat.setInteger("bitrate", i2);
        mediaFormat.setInteger("channel-count", i3);
        if (this.g == 2) {
            mediaFormat.setInteger("flac-compression-level", 5);
        }
        try {
            if (e(this.g)) {
                try {
                    try {
                        c(MediaCodec.createByCodecName("OMX.google.aac.encoder"), mediaFormat);
                        return;
                    } catch (IOException e2) {
                        throw new knj(e2);
                    }
                } catch (Exception unused) {
                    d(this.f, mediaFormat);
                    return;
                }
            }
            d(str, mediaFormat);
        } catch (IOException | IllegalArgumentException e3) {
            throw new RuntimeException("Failed to create codec mimeType: ".concat(String.valueOf(this.f)), e3);
        }
    }

    private final void a(boolean z) {
        MediaCodec mediaCodec = this.j;
        if (mediaCodec == null) {
            throw new knj();
        }
        if (z) {
            b(mediaCodec);
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = this.j.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer == -2) {
            MediaFormat outputFormat = this.j.getOutputFormat();
            jdg.F(this.d == outputFormat.getInteger("sample-rate"));
            jdg.F(this.e == outputFormat.getInteger("channel-count"));
            jdg.F(this.f.equals(outputFormat.getString("mime")));
            dequeueOutputBuffer = this.j.dequeueOutputBuffer(bufferInfo, 10000L);
        }
        jdg.F(dequeueOutputBuffer != -2);
        int i = 4;
        if ((bufferInfo.flags & 4) != 0) {
            int i2 = bufferInfo.size;
            this.o = true;
        }
        if (dequeueOutputBuffer == -1) {
            return;
        }
        if (dequeueOutputBuffer == -3) {
            this.l = this.j.getOutputBuffers();
        } else if (dequeueOutputBuffer == -1) {
        } else {
            if ((bufferInfo.flags & 2) != 0) {
                this.m = dequeueOutputBuffer;
                MediaCodec mediaCodec2 = this.j;
                if (mediaCodec2 == null) {
                    return;
                }
                b(mediaCodec2);
                return;
            }
            int i3 = bufferInfo.offset;
            int i4 = bufferInfo.size;
            this.m = dequeueOutputBuffer;
            int i5 = this.g;
            if (e(i5)) {
                this.i.clear();
                int i6 = this.d;
                int i7 = this.e;
                ByteBuffer byteBuffer = this.i;
                jdg.F(byteBuffer.remaining() >= 7);
                int i8 = 12;
                long e = kez.e(kez.e(kez.e(kez.e(kez.e(0L, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0);
                switch (i6) {
                    case 7350:
                        break;
                    case 8000:
                        i8 = 11;
                        break;
                    case 11025:
                        i8 = 10;
                        break;
                    case 12000:
                        i8 = 9;
                        break;
                    case 16000:
                        i8 = 8;
                        break;
                    case 22050:
                        i8 = 7;
                        break;
                    case 24000:
                        i8 = 6;
                        break;
                    case 32000:
                        i8 = 5;
                        break;
                    case 44100:
                        i8 = 4;
                        break;
                    case 48000:
                        i8 = 3;
                        break;
                    case 64000:
                        i8 = 2;
                        break;
                    case 88200:
                        i8 = 1;
                        break;
                    case 96000:
                        i8 = 0;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid sample rate: " + i6);
                }
                long e2 = kez.e(kez.e(e, 4, i8), 1, 0);
                switch (i7) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                    default:
                        throw new IllegalArgumentException("Invalid channel count: " + i7);
                    case 8:
                        i = 7;
                        break;
                }
                long e3 = kez.e(kez.e(kez.e(kez.e(kez.e(kez.e(kez.e(kez.e(e2, 3, i), 1, 0), 1, 0), 1, 0), 1, 0), 13, i4 + 7), 11, 2047), 2, 0);
                byteBuffer.put((byte) ((e3 >>> 48) & 255));
                byteBuffer.put((byte) ((e3 >>> 40) & 255));
                byteBuffer.put((byte) ((e3 >>> 32) & 255));
                byteBuffer.put((byte) ((e3 >>> 24) & 255));
                byteBuffer.put((byte) ((e3 >>> 16) & 255));
                byteBuffer.put((byte) ((e3 >>> 8) & 255));
                byteBuffer.put((byte) e3);
                this.i.flip();
            } else if (i5 == 3) {
                this.i.clear();
                if (!this.p) {
                    this.p = true;
                    int i9 = this.d;
                    int i10 = this.e;
                    ByteBuffer byteBuffer2 = this.i;
                    byteBuffer2.put("OpusHead".getBytes());
                    byteBuffer2.put((byte) 1);
                    byteBuffer2.put((byte) (i10 & 255));
                    byteBuffer2.putShort((short) 80);
                    byteBuffer2.putInt((int) (i9 & 4294967295L));
                    byteBuffer2.putShort((short) 0);
                    byteBuffer2.put((byte) 0);
                }
                ByteBuffer byteBuffer3 = this.i;
                if (i4 > 223) {
                    byteBuffer3.put((byte) ((i4 & 31) + 223));
                    byteBuffer3.put((byte) ((i4 >> 5) - 7));
                } else {
                    byteBuffer3.put((byte) i4);
                }
                this.i.flip();
            }
            ByteBuffer byteBuffer4 = this.l[dequeueOutputBuffer];
            byteBuffer4.clear();
            byteBuffer4.position(i3);
            byteBuffer4.limit(i3 + i4);
        }
    }

    private final void b(MediaCodec mediaCodec) {
        int i = this.m;
        if (i >= 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.m = -1;
        }
    }

    private final void d(String str, MediaFormat mediaFormat) {
        try {
            c(MediaCodec.createEncoderByType(str), mediaFormat);
        } catch (IOException e) {
            throw new knj(e);
        }
    }

    private static boolean e(int i) {
        return i == 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        lyq.a(this.b);
        MediaCodec mediaCodec = this.j;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.j.release();
            } catch (IllegalStateException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "close", (char) 203, "AudioEncoderInputStream.java")).t("MediaCodec has already been stopped or released.");
            }
            this.j = null;
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "close", 196, "AudioEncoderInputStream.java")).t("close() called when codec is already closed");
    }

    public final synchronized void finalize() {
        if (this.j != null) {
            close();
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/speech/encoding/AudioEncoderInputStream", "finalize", 433, "AudioEncoderInputStream.java")).t("No one closed");
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
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
        int i3;
        int i4;
        int i5 = 0;
        boolean z = this.n && !this.h.hasRemaining();
        while (!z && !this.n && ((i4 = this.m) == -1 || !this.l[i4].hasRemaining())) {
            MediaCodec mediaCodec = this.j;
            if (mediaCodec != null) {
                b(mediaCodec);
                synchronized (this) {
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                    if (dequeueInputBuffer != -1) {
                        ByteBuffer byteBuffer = this.k[dequeueInputBuffer];
                        byteBuffer.clear();
                        byteBuffer.position(0);
                        jdg.F(byteBuffer.hasRemaining());
                        while (byteBuffer.position() < this.c && byteBuffer.hasRemaining() && !this.n) {
                            if (this.h.hasRemaining()) {
                                int l = mhq.l(this.h.remaining(), byteBuffer.remaining(), this.c - byteBuffer.position());
                                byteBuffer.put(this.h.array(), this.h.position(), l);
                                ByteBuffer byteBuffer2 = this.h;
                                byteBuffer2.position(byteBuffer2.position() + l);
                            } else {
                                int read = this.b.read(this.h.array());
                                if (read == -1) {
                                    break;
                                }
                                this.h.position(0);
                                this.h.limit(read);
                            }
                        }
                        if (byteBuffer.position() > 0) {
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, byteBuffer.position(), 0L, 0);
                        } else {
                            this.n = true;
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        }
                    }
                }
                a(false);
            } else {
                throw new knj();
            }
        }
        if (this.n && ((i3 = this.m) == -1 || !this.l[i3].hasRemaining())) {
            if (this.o) {
                return -1;
            }
            a(true);
            int i6 = this.m;
            if (i6 == -1 || !this.l[i6].hasRemaining()) {
                return 0;
            }
        }
        if (this.i.hasRemaining()) {
            i5 = Math.min(i2, this.i.remaining());
            this.i.get(bArr, i, i5);
            i += i5;
            i2 -= i5;
        }
        ByteBuffer byteBuffer3 = this.l[this.m];
        jdg.F(byteBuffer3.hasRemaining());
        int min = Math.min(i2, byteBuffer3.remaining());
        byteBuffer3.get(bArr, i, min);
        return min + i5;
    }

    private final synchronized void c(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        try {
            this.j = mediaCodec;
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.j.start();
            this.k = this.j.getInputBuffers();
            this.l = this.j.getOutputBuffers();
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not create codec", e);
        }
    }
}
