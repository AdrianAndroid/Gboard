package com.google.android.libraries.assistant.soda.s3client;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SodaTransportSession {
    private static final ltg a = ltg.j("com/google/android/libraries/assistant/soda/s3client/SodaTransportSession");
    private final SodaTransportFactory b;
    private gik c;

    public SodaTransportSession(SodaTransportFactory sodaTransportFactory) {
        this.b = sodaTransportFactory;
    }

    protected native void nativeHandleError(long j, String str);

    protected native void nativeHandleResponse(long j, byte[] bArr);

    protected native void nativeHandleState(long j, int i);

    public final void sendRequest(byte[] bArr) {
        if (this.c == null) {
            return;
        }
        try {
            nks nksVar = (nks) nfm.z(nks.f, bArr, nfb.b());
            this.c.b();
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/assistant/soda/s3client/SodaTransportSession", "sendRequest", 'Z', "SodaTransportSession.java")).t("S3Request parsing failed.");
        }
    }

    public final boolean start(long j, byte[] bArr) {
        if (j != 0) {
            try {
                nme nmeVar = (nme) nfm.z(nme.a, bArr, nfb.b());
                gik a2 = this.b.a();
                this.c = a2;
                if (a2 == null) {
                    return false;
                }
                return a2.c();
            } catch (Exception e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/assistant/soda/s3client/SodaTransportSession", "start", 'K', "SodaTransportSession.java")).t("SodaS3TransportConfig parsing failed.");
            }
        }
        return false;
    }

    public final void stop() {
        gik gikVar = this.c;
        if (gikVar == null) {
            return;
        }
        gikVar.a();
        this.c = null;
    }
}
