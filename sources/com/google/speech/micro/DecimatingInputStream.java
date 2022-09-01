package com.google.speech.micro;

import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DecimatingInputStream extends InputStream implements InputStreamRetargetInterface {
    private int inputBufferWritePos;

    private static native void nativeClose(long j);

    private static native int nativeGetExtraSamplesNeededInInput(long j);

    private static native long nativeNew(int i, int i2, int i3);

    private native int nativeProcess(long j, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        nativeClose(0L);
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        throw null;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        throw null;
    }
}
