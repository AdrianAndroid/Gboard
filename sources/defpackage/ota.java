package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: ota  reason: default package */
/* loaded from: classes2.dex */
public final class ota implements ovp {
    public int a;
    public byte b;
    public int c;
    public int d;
    public short e;
    private final out f;
    private final /* synthetic */ int g;

    public ota(out outVar, int i) {
        this.g = i;
        this.f = outVar;
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.g != 0 ? this.f.a() : this.f.a();
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        int i;
        int f;
        int i2;
        int f2;
        if (this.g == 0) {
            do {
                int i3 = this.d;
                if (i3 == 0) {
                    this.f.B(this.e);
                    this.e = (short) 0;
                    if ((this.b & 4) != 0) {
                        return -1L;
                    }
                    i = this.c;
                    int b = otb.b(this.f);
                    this.d = b;
                    this.a = b;
                    byte d = (byte) (this.f.d() & 255);
                    this.b = (byte) (this.f.d() & 255);
                    if (otb.a.isLoggable(Level.FINE)) {
                        otb.a.logp(Level.FINE, "okhttp3.internal.http2.Http2Reader$ContinuationSource", "readContinuationHeader", osi.c(true, this.c, this.a, d, this.b));
                    }
                    f = this.f.f() & Integer.MAX_VALUE;
                    this.c = f;
                    if (d != 9) {
                        throw osi.a("%s != TYPE_CONTINUATION", Byte.valueOf(d));
                    }
                } else {
                    long b2 = this.f.b(ourVar, Math.min(8192L, i3));
                    if (b2 == -1) {
                        return -1L;
                    }
                    this.d = (int) (this.d - b2);
                    return b2;
                }
            } while (f == i);
            throw osi.a("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
        do {
            int i4 = this.d;
            if (i4 != 0) {
                long b3 = this.f.b(ourVar, Math.min(8192L, i4));
                if (b3 == -1) {
                    return -1L;
                }
                this.d -= (int) b3;
                return b3;
            }
            this.f.B(this.e);
            this.e = (short) 0;
            if ((this.b & 4) != 0) {
                return -1L;
            }
            i2 = this.c;
            int b4 = oho.b(this.f);
            this.d = b4;
            this.a = b4;
            byte d2 = (byte) (this.f.d() & 255);
            this.b = (byte) (this.f.d() & 255);
            if (oho.a.isLoggable(Level.FINE)) {
                oho.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", ohl.a(true, this.c, this.a, d2, this.b));
            }
            f2 = this.f.f() & Integer.MAX_VALUE;
            this.c = f2;
            if (d2 != 9) {
                throw oho.c("%s != TYPE_CONTINUATION", Byte.valueOf(d2));
            }
        } while (f2 == i2);
        throw oho.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }
}
