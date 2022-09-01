package com.google.audio.hearing.common;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OggOpusEncoder {
    private static final ltg b = ltg.j("com/google/audio/hearing/common/OggOpusEncoder");
    public long a = 0;

    static {
        try {
            System.loadLibrary("ogg_opus_encoder");
        } catch (UnsatisfiedLinkError e) {
            ((ltd) ((ltd) ((ltd) b.d()).i(e)).k("com/google/audio/hearing/common/OggOpusEncoder", "<clinit>", 'K', "OggOpusEncoder.java")).t("System did not find libogg_opus_encoder.so! Make sure your JVM explicitly loads this lib, particularly if you are on Android.");
        }
    }

    private native byte[] flush(long j);

    private native void free(long j);

    public final byte[] a() {
        long j = this.a;
        if (j != 0) {
            byte[] flush = flush(j);
            free(this.a);
            this.a = 0L;
            return flush;
        }
        ((ltd) ((ltd) b.c()).k("com/google/audio/hearing/common/OggOpusEncoder", "flushAndStop", 51, "OggOpusEncoder.java")).t("stop() called multiple times or without call to initialize()!");
        return new byte[0];
    }

    protected final void finalize() {
        super.finalize();
        if (this.a != 0) {
            ((ltd) ((ltd) b.c()).k("com/google/audio/hearing/common/OggOpusEncoder", "finalize", 60, "OggOpusEncoder.java")).t("Native OggOpusEncoder resources weren't cleaned up. You must call stop()!");
            free(this.a);
        }
    }

    public native long init(int i, int i2, int i3, boolean z);

    public native byte[] processAudioBytes(long j, byte[] bArr, int i, int i2);
}
