package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: fdn  reason: default package */
/* loaded from: classes.dex */
public final class fdn implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper");
    public static volatile fdn b;
    private final AtomicReference c = new AtomicReference();
    private volatile byte[] d;

    public final synchronized void a() {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper", "shutdown", 101, "MicrophoneInputStreamWrapper.java")).t("shutdown()");
        if (((fdm) this.c.get()) != null) {
            ((ltd) ((ltd) ltgVar.c()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper", "shutdown", 104, "MicrophoneInputStreamWrapper.java")).t("Closing the mic in shutdown(). This is uncommon.");
            close();
        }
    }

    public final synchronized void b() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper", "stopListening", 81, "MicrophoneInputStreamWrapper.java")).t("stopListening()");
        fdm fdmVar = (fdm) this.c.get();
        if (fdmVar != null) {
            fdmVar.b.d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized InputStream c(boolean z) {
        InputStream inputStream;
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper", "startListening", 53, "MicrophoneInputStreamWrapper.java")).t("startListening()");
        if (this.c.get() != null) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper", "startListening", 56, "MicrophoneInputStreamWrapper.java")).t("Closing the mic from the previous session.");
            close();
        }
        try {
            fdm fdmVar = new fdm(new fdi(z));
            this.c.set(fdmVar);
            inputStream = fdmVar.a;
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper", "startListening", 'B', "MicrophoneInputStreamWrapper.java")).t("Unable to get the microphone input stream.");
            inputStream = null;
        }
        return inputStream;
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        byte[] bArr;
        byte[] bArr2;
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper", "close", 91, "MicrophoneInputStreamWrapper.java")).t("close()");
        fdm fdmVar = (fdm) this.c.getAndSet(null);
        if (fdmVar != null) {
            fdmVar.close();
            fdi fdiVar = fdmVar.b;
            if (!fdiVar.a) {
                bArr2 = new byte[0];
            } else {
                synchronized (fdiVar.b) {
                    bArr = new byte[fdiVar.c];
                    int i = 0;
                    for (int i2 = 0; i2 < fdiVar.b.size(); i2++) {
                        byte[] bArr3 = (byte[]) fdiVar.b.get(i2);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr, i, length);
                        i += length;
                    }
                }
                bArr2 = bArr;
            }
            this.d = bArr2;
        }
    }
}
