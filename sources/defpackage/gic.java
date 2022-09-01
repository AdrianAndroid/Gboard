package defpackage;

import com.google.android.libraries.assistant.soda.Soda;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: gic  reason: default package */
/* loaded from: classes.dex */
public final class gic {
    public static final ltg a = ltg.j("com/google/android/libraries/assistant/soda/SodaAudioPusher");
    public final mkr b;
    public final Soda c;
    public final int d;
    public final int e;
    public mld f;
    public final Object g = new Object();
    public mko h;
    public mld i;

    public gic(mkr mkrVar, Soda soda, int i, int i2) {
        this.b = mkrVar;
        this.c = soda;
        this.d = i2;
        this.e = i;
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/SodaAudioPusher", "<init>", 62, "SodaAudioPusher.java")).y("channelCount %d, sampleRate %d", i2, i);
    }

    public static void b(Soda soda, InputStream inputStream, mld mldVar, int i) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/SodaAudioPusher", "runPushLoop", 159, "SodaAudioPusher.java")).t("Starting to push audio to Soda");
        byte[] bArr = new byte[i];
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        ByteBuffer.allocateDirect(16);
        if (i == 0) {
            mldVar.n(new RuntimeException("Invalid audio buffer size for reading"));
            c(soda, allocateDirect, mldVar);
        }
        while (!mldVar.isCancelled()) {
            try {
                allocateDirect.clear();
                int read = inputStream.read(bArr, 0, i);
                if (read < 0) {
                    break;
                } else if (read > 0) {
                    allocateDirect.put(bArr, 0, read);
                    soda.d(allocateDirect, read);
                }
            } catch (IOException | UnsupportedOperationException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/assistant/soda/SodaAudioPusher", "runPushLoop", (char) 205, "SodaAudioPusher.java")).t("Failed to push audio to Soda");
                mldVar.n(e);
            }
        }
        c(soda, allocateDirect, mldVar);
    }

    private static void c(Soda soda, ByteBuffer byteBuffer, mld mldVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/SodaAudioPusher", "endPushingAudioToSoda", 141, "SodaAudioPusher.java")).t("Sending end of audio to Soda.");
        try {
            soda.d(byteBuffer, 0);
        } catch (IllegalStateException e) {
            mldVar.n(e);
        }
    }

    public final void a() {
        synchronized (this.g) {
            mld mldVar = this.i;
            if (mldVar != null) {
                mldVar.c(null);
            }
            this.h = null;
        }
    }
}
