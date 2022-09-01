package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
@Deprecated
/* renamed from: goi  reason: default package */
/* loaded from: classes.dex */
public final class goi extends InputStream implements InputStreamRetargetInterface {
    private static final ltg g = ltg.j("com/google/android/libraries/gsa/s3/lib/MicrophoneInputStream");
    private static final AtomicInteger h = new AtomicInteger();
    protected final Context a;
    protected final int b;
    protected final int c;
    protected final int d;
    protected AudioRecord f;
    private boolean k;
    protected final Object e = new Object();
    private boolean i = false;
    private boolean j = false;

    public goi(Context context, int i, int i2, int i3) {
        this.a = context;
        this.b = i;
        this.d = i3;
        this.c = Math.max(AudioRecord.getMinBufferSize(i, i3, 2), i2);
        h.getAndIncrement();
    }

    private final int a() {
        int mode = ((AudioManager) this.a.getSystemService("audio")).getMode();
        return (mode == 2 || mode == 3) ? 393246 : 393222;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            AudioRecord audioRecord = this.f;
            if (audioRecord != null && !this.k) {
                audioRecord.stop();
                audioRecord.release();
                ((ltd) ((ltd) g.b()).k("com/google/android/libraries/gsa/s3/lib/MicrophoneInputStream", "close", 337, "MicrophoneInputStream.java")).w("mic_close %s", this);
                this.k = true;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final String toString() {
        return " SR : " + this.b + " CC : " + this.d + " SO : 6";
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return read(bArr, 0, bArr.length);
        } catch (IOException e) {
            throw new blb(e, 393263);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        synchronized (this.e) {
            if (this.k) {
                return -1;
            }
            AudioRecord audioRecord = this.f;
            if (this.i && audioRecord == null) {
                throw new blb("AudioRecord failed to initialize.", 393220);
            }
            if (!this.j || audioRecord == null) {
                ltg ltgVar = g;
                ((ltd) ((ltd) ltgVar.b()).k("com/google/android/libraries/gsa/s3/lib/MicrophoneInputStream", "ensureStartedLocked", 189, "MicrophoneInputStream.java")).w("mic_starting %s", this);
                if (!this.i) {
                    try {
                        audioRecord = new AudioRecord(6, this.b, this.d, 2, this.c);
                    } catch (IllegalArgumentException e) {
                        ((ltd) ((ltd) ((ltd) g.c()).i(e)).k("com/google/android/libraries/gsa/s3/lib/MicrophoneInputStream", "createAudioRecord", (char) 170, "MicrophoneInputStream.java")).t("Failed to initialize AudioRecord");
                    }
                    if (audioRecord.getState() != 1) {
                        ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/gsa/s3/lib/MicrophoneInputStream", "createAudioRecord", 160, "MicrophoneInputStream.java")).t("Failed to initialize AudioRecord");
                        audioRecord.release();
                        audioRecord = null;
                    }
                    this.f = audioRecord;
                    this.i = true;
                }
                if (audioRecord == null) {
                    throw new blb("AudioRecord failed to initialize.", 393220);
                }
                try {
                    AudioRecord audioRecord2 = this.f;
                    if (audioRecord2 != null) {
                        audioRecord2.startRecording();
                    }
                    int recordingState = audioRecord.getRecordingState();
                    if (recordingState != 3) {
                        throw new blb("couldn't start recording, state is:" + recordingState, a());
                    }
                    this.j = true;
                    ((ltd) ((ltd) g.b()).k("com/google/android/libraries/gsa/s3/lib/MicrophoneInputStream", "ensureStartedLocked", 230, "MicrophoneInputStream.java")).w("mic_started %s", this);
                } catch (IllegalStateException e2) {
                    throw new blb("couldn't start recording", e2, a());
                }
            }
            int read = audioRecord.read(bArr, i, i2);
            synchronized (this.e) {
                if (this.k) {
                    return -1;
                }
                if (read >= -1) {
                    return read;
                }
                if (read == -3) {
                    throw new blb("not open", 393221);
                }
                if (read == -2) {
                    throw new blb("Bad offset/length arguments for buffer", 393218);
                }
                throw new blb("Unexpected error code: " + read, 393223);
            }
        }
    }
}
