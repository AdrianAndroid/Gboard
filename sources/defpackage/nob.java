package defpackage;

import android.media.AudioRecord;
import android.util.Log;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: nob  reason: default package */
/* loaded from: classes2.dex */
public class nob extends InputStream implements InputStreamRetargetInterface {
    private AudioRecord a;
    public volatile boolean d = false;

    public nob() {
        AudioRecord audioRecord = new AudioRecord(6, 16000, 16, 2, Math.max(AudioRecord.getMinBufferSize(16000, 16, 2), 32000));
        this.a = audioRecord;
        if (audioRecord.getState() != 1) {
            this.a.release();
            throw new IOException("not open");
        }
        this.a.startRecording();
        if (this.a.getRecordingState() != 3) {
            throw new IOException("couldn't start recording");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            AudioRecord audioRecord = this.a;
            if (audioRecord != null) {
                audioRecord.stop();
                this.a.release();
                this.a = null;
                this.d = true;
            }
        }
    }

    protected final void finalize() {
        close();
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new IOException("not implemented");
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        while (true) {
            if (this.d) {
                break;
            }
            synchronized (this) {
                AudioRecord audioRecord = this.a;
                if (audioRecord == null) {
                    break;
                }
                int read = audioRecord.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                if (read < 0) {
                    if (read == -3) {
                        Log.e("MicrophoneInputStream", "ERROR_INVALID_OPERATION");
                    } else if (read == -2) {
                        Log.e("MicrophoneInputStream", "ERROR_BAD_VALUE");
                    }
                }
            }
        }
        close();
        return -1;
    }
}
