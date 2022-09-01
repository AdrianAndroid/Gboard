package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: fdm  reason: default package */
/* loaded from: classes.dex */
public final class fdm implements AutoCloseable {
    public final InputStream a;
    public final fdi b;

    public fdm(fdi fdiVar) {
        this.b = fdiVar;
        this.a = fdiVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) fdn.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/MicrophoneInputStreamWrapper$MicrophoneDelegate", "close", (char) 157, "MicrophoneInputStreamWrapper.java")).t("Error closing MicrophoneDelegate");
        }
    }
}
