package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: ohn  reason: default package */
/* loaded from: classes2.dex */
public final class ohn implements ohg {
    public int a = 16384;
    private final ous b;
    private final our c;
    private final ohj d;
    private boolean e;

    public ohn(ous ousVar) {
        this.b = ousVar;
        our ourVar = new our();
        this.c = ourVar;
        this.d = new ohj(ourVar);
    }

    @Override // defpackage.ohg
    public final synchronized void a(ohq ohqVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((ohqVar.a & 32) != 0) {
            i = ((int[]) ohqVar.b)[5];
        }
        this.a = i;
        k(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    @Override // defpackage.ohg
    public final synchronized void b() {
        if (this.e) {
            throw new IOException("closed");
        }
        if (oho.a.isLoggable(Level.FINE)) {
            oho.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", oho.b.d()));
        }
        this.b.J(oho.b.n());
        this.b.flush();
    }

    @Override // defpackage.ohg
    public final synchronized void c(boolean z, int i, our ourVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 <= 0) {
            return;
        }
        this.b.ik(ourVar, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.ohg
    public final synchronized void d() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    @Override // defpackage.ohg
    public final synchronized void e(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.b.P(i);
        this.b.P(i2);
        this.b.flush();
    }

    @Override // defpackage.ohg
    public final synchronized void f(int i, ohf ohfVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (ohfVar.s == -1) {
            throw new IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        this.b.P(ohfVar.s);
        this.b.flush();
    }

    @Override // defpackage.ohg
    public final synchronized void g(ohq ohqVar) {
        int i;
        if (!this.e) {
            int i2 = 0;
            k(0, Integer.bitCount(ohqVar.a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (ohqVar.c(i2)) {
                    if (i2 == 4) {
                        i = i2;
                        i2 = 3;
                    } else {
                        i = 7;
                        if (i2 == 7) {
                            i2 = 4;
                        } else {
                            i = i2;
                        }
                    }
                    this.b.Q(i2);
                    this.b.P(ohqVar.a(i));
                    i2 = i;
                }
                i2++;
            }
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.ohg
    public final synchronized void h(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw oho.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        k(i, 4, (byte) 8, (byte) 0);
        this.b.P((int) j);
        this.b.flush();
    }

    @Override // defpackage.ohg
    public final synchronized void i(ohf ohfVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (ohfVar.s == -1) {
            throw oho.d("errorCode.httpCode == -1", new Object[0]);
        }
        k(0, 8, (byte) 7, (byte) 0);
        this.b.P(0);
        this.b.P(ohfVar.s);
        this.b.flush();
    }

    @Override // defpackage.ohg
    public final synchronized void j(int i, List list) {
        int i2;
        int i3;
        if (!this.e) {
            ohj ohjVar = this.d;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ohh ohhVar = (ohh) list.get(i4);
                ouu j = ohhVar.f.j();
                ouu ouuVar = ohhVar.g;
                Integer num = (Integer) ohk.c.get(j);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 >= 2 && i2 <= 7) {
                        if (ohk.b[i2 - 1].g.equals(ouuVar)) {
                            i3 = i2;
                        } else if (ohk.b[i2].g.equals(ouuVar)) {
                            i3 = i2;
                            i2++;
                        }
                    }
                    i3 = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i2 == -1) {
                    int i5 = ohjVar.d + 1;
                    while (true) {
                        ohh[] ohhVarArr = ohjVar.b;
                        if (i5 >= ohhVarArr.length) {
                            i2 = -1;
                            break;
                        }
                        if (ohhVarArr[i5].f.equals(j)) {
                            if (ohjVar.b[i5].g.equals(ouuVar)) {
                                int i6 = ohjVar.d;
                                int length = ohk.b.length;
                                i2 = (i5 - i6) + 61;
                                break;
                            } else if (i3 == -1) {
                                int i7 = ohjVar.d;
                                int length2 = ohk.b.length;
                                i3 = (i5 - i7) + 61;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    ohjVar.c(i2, 127, 128);
                } else if (i3 != -1) {
                    if (!j.l(ohk.a) || ohh.e.equals(j)) {
                        ohjVar.c(i3, 63, 64);
                        ohjVar.b(ouuVar);
                        ohjVar.a(ohhVar);
                    } else {
                        ohjVar.c(i3, 15, 0);
                        ohjVar.b(ouuVar);
                    }
                } else {
                    ohjVar.a.N(64);
                    ohjVar.b(j);
                    ohjVar.b(ouuVar);
                    ohjVar.a(ohhVar);
                }
            }
            long j2 = this.c.b;
            int min = (int) Math.min(this.a, j2);
            long j3 = min;
            k(i, min, (byte) 1, j2 == j3 ? (byte) 4 : (byte) 0);
            this.b.ik(this.c, j3);
            if (j2 > j3) {
                long j4 = j2 - j3;
                while (j4 > 0) {
                    int min2 = (int) Math.min(this.a, j4);
                    long j5 = min2;
                    j4 -= j5;
                    k(i, min2, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                    this.b.ik(this.c, j5);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    final void k(int i, int i2, byte b, byte b2) {
        if (oho.a.isLoggable(Level.FINE)) {
            oho.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", ohl.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                ous ousVar = this.b;
                ousVar.X((i2 >>> 16) & 255);
                ousVar.X((i2 >>> 8) & 255);
                ousVar.X(i2 & 255);
                this.b.X(b);
                this.b.X(b2);
                this.b.P(i & Integer.MAX_VALUE);
                return;
            }
            throw oho.d("reserved bit set: %s", Integer.valueOf(i));
        }
        throw oho.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
