package com.google.android.libraries.sentenceexplorer;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GrammarChecker implements AutoCloseable {
    public long a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    static {
        System.loadLibrary("grammar-checker_jni");
    }

    public GrammarChecker(String str) {
        long nativeCreate = nativeCreate(str, null);
        this.a = nativeCreate;
        if (nativeCreate != 0) {
            return;
        }
        throw new IllegalArgumentException("Couldn't initialize grammar checker model from path.");
    }

    private native long nativeCreate(String str, byte[] bArr);

    private native byte[] nativeGetModelMetadata(long j);

    private native long nativeRelease(long j);

    public final kmq a() {
        try {
            return (kmq) nfm.w(kmq.c, nativeGetModelMetadata(this.a));
        } catch (ngd e) {
            throw new IllegalArgumentException("Failed to parse result from native code.", e);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b.compareAndSet(false, true)) {
            nativeRelease(this.a);
            this.a = 0L;
        }
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public native byte[] nativeSuggestCorrections(long j, byte[] bArr);
}
