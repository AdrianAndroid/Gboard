package defpackage;

import com.google.audio.hearing.common.OggOpusEncoder;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: kni  reason: default package */
/* loaded from: classes.dex */
public final class kni extends InputStream implements InputStreamRetargetInterface {
    public static final ltg a = ltg.j("com/google/android/libraries/speech/encoding/OggOpusInputStream");
    public static boolean b = false;
    private final InputStream c;
    private long f;
    private final OggOpusEncoder g;
    private final ldm h;
    private final ldl i;
    private boolean e = false;
    private final int d = 2048;

    public kni(InputStream inputStream, int i, int i2, int i3) {
        ldl ldlVar;
        this.c = inputStream;
        if (!b) {
            a();
        }
        OggOpusEncoder oggOpusEncoder = new OggOpusEncoder();
        this.g = oggOpusEncoder;
        if (oggOpusEncoder.a != 0) {
            oggOpusEncoder.a();
        }
        oggOpusEncoder.a = oggOpusEncoder.init(i3, i2, i, true);
        ldm ldmVar = new ldm(i2 * 8);
        this.h = ldmVar;
        synchronized (ldmVar.e) {
            ldlVar = new ldl(ldmVar);
            ldmVar.e.add(ldlVar);
        }
        this.i = ldlVar;
    }

    private static void a() {
        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/speech/encoding/OggOpusInputStream", "checkNativeOggOpusInstall", 63, "OggOpusInputStream.java")).t("Native lib ogg_opus_encoder has not been explicitly loaded! Relying on System.loadLibrary() is unsafe on Android: attempts to use encoder may crash. Please call #initNativeOggOpusLib in the process before instantiating OggOpusInputStream.");
        try {
            System.loadLibrary("ogg_opus_encoder");
        } catch (UnsatisfiedLinkError e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/speech/encoding/OggOpusInputStream", "checkNativeOggOpusInstall", 'G', "OggOpusInputStream.java")).t("Implicit load of libogg_opus_encoder.so failed and OggOpusInputStream will crash! Please call #maybeInitNativeOggOpusLib() before instantiating OggOpusInputStream.");
        }
    }

    private final void b(byte[] bArr) {
        ldm ldmVar = this.h;
        int length = bArr.length;
        if (!ldmVar.b(bArr, length)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/speech/encoding/OggOpusInputStream", "enqueueEncodedBytes", 103, "OggOpusInputStream.java")).u("OggOpus-encoded bytes are not being read quickly enough! Up to %s encoded bytes may be discarded.", length);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
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
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[this.d]);
        if (!this.e) {
            try {
                int read = this.c.read(wrap.array());
                if (read == -1) {
                    this.e = true;
                    b(this.g.a());
                } else {
                    this.f += read;
                    OggOpusEncoder oggOpusEncoder = this.g;
                    b(oggOpusEncoder.processAudioBytes(oggOpusEncoder.a, wrap.array(), 0, wrap.array().length));
                }
            } catch (IOException e) {
                b(this.g.a());
                throw e;
            }
        }
        int min = Math.min(i2, this.i.a());
        if (!this.e || min != 0) {
            ldl ldlVar = this.i;
            ldm ldmVar = ldlVar.a;
            long j = ldmVar.d - ldlVar.c;
            long j2 = ldmVar.c;
            if (j > j2) {
                long j3 = j - min;
                ldlVar.b((int) (j3 % j2));
                ldlVar.c += j3;
                ((ltd) ((ltd) ldm.a.c()).k("com/google/audio/hearing/common/CircularByteBuffer", "internalRead", 197, "CircularByteBuffer.java")).t("We lost data before this read!");
            }
            if (min != 0) {
                if (min >= 0 && min <= ldlVar.a()) {
                    int i3 = ldlVar.b;
                    int i4 = ldmVar.c;
                    int i5 = (i3 + min) % i4;
                    if (i3 < i5) {
                        System.arraycopy(ldmVar.b, i3, bArr, i, i5 - i3);
                    } else {
                        System.arraycopy(ldmVar.b, i3, bArr, i, i4 - i3);
                        int i6 = ldmVar.c;
                        int i7 = ldlVar.b;
                        System.arraycopy(ldmVar.b, 0, bArr, (i + i6) - i7, min - (i6 - i7));
                    }
                }
                return min;
            }
            ldlVar.b(min);
            ldlVar.c += min;
            return min;
        }
        return -1;
    }
}
