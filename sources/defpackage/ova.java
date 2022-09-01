package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ova  reason: default package */
/* loaded from: classes2.dex */
public final class ova implements ovp {
    private final InputStream a;
    private final ovr b;

    public ova(InputStream inputStream, ovr ovrVar) {
        oll.e(inputStream, "input");
        this.a = inputStream;
        this.b = ovrVar;
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.b;
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        try {
            this.b.g();
            ovk v = ourVar.v(1);
            int read = this.a.read(v.a, v.c, (int) Math.min(j, 8192 - v.c));
            if (read == -1) {
                if (v.b != v.c) {
                    return -1L;
                }
                ourVar.a = v.a();
                ovl.b(v);
                return -1L;
            }
            v.c += read;
            long j2 = read;
            ourVar.b += j2;
            return j2;
        } catch (AssertionError e) {
            if (ovb.h(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        InputStream inputStream = this.a;
        return "source(" + inputStream + ")";
    }
}
