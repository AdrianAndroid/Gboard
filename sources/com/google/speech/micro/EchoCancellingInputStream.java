package com.google.speech.micro;

import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EchoCancellingInputStream extends InputStream implements InputStreamRetargetInterface {
    private int alignmentIndex;
    private boolean latched;
    private int mixedInputBufferWritePos;
    private int referenceInputBufferWritePos;

    private static native void nativeClose(long j);

    private native int nativeFlush(long j, byte[] bArr, int i, int i2);

    private static native int nativeGetIdealOutputSize(long j);

    private static native long nativeNew(byte[] bArr, int i);

    private native int nativeProcess(long j, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4);

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
