package com.google.android.libraries.assistant.trainingcache.bindings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EkhoMaterializerImpl implements AutoCloseable {
    public final long a;
    public int b = 1;

    public EkhoMaterializerImpl(long j) {
        this.a = j;
    }

    private native void nativeClose(long j);

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b != 3) {
            nativeClose(this.a);
            this.b = 3;
        }
    }

    public native void nativeNext(long j, byte[][] bArr);

    public native void nativeStart(long j, String str, byte[] bArr, byte[] bArr2);
}
