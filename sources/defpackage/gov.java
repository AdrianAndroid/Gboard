package defpackage;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: gov  reason: default package */
/* loaded from: classes.dex */
public final class gov implements Closeable {
    private final DataInputStream a;

    public gov(InputStream inputStream) {
        this.a = new DataInputStream(inputStream);
    }

    public final nkt a() {
        int readInt;
        do {
            readInt = this.a.readInt();
        } while (readInt == 0);
        if (readInt <= 0 || readInt > 4194304) {
            throw new IndexOutOfBoundsException("Wrong len " + readInt);
        }
        byte[] bArr = new byte[readInt];
        this.a.readFully(bArr);
        return (nkt) ((nfj) ((nfj) nkt.c.t()).cr(bArr, nfb.b())).cz();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
