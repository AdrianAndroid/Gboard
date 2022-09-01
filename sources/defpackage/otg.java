package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: otg  reason: default package */
/* loaded from: classes2.dex */
public final class otg implements Closeable {
    private static final Logger c = Logger.getLogger(osi.class.getName());
    public int a = 16384;
    final osg b;
    private final ous d;
    private final our e;
    private boolean f;

    public otg(ous ousVar) {
        this.d = ousVar;
        our ourVar = new our();
        this.e = ourVar;
        this.b = new osg(ourVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(defpackage.otj r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L57
            int r0 = r3.a     // Catch: java.lang.Throwable -> L5f
            int r1 = r4.a     // Catch: java.lang.Throwable -> L5f
            r1 = r1 & 32
            if (r1 == 0) goto L14
            java.lang.Object r0 = r4.b     // Catch: java.lang.Throwable -> L5f
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L5f
            r1 = 5
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L5f
        L14:
            r3.a = r0     // Catch: java.lang.Throwable -> L5f
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L5f
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L4b
            osg r0 = r3.b     // Catch: java.lang.Throwable -> L5f
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L5f
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L5f
            int r1 = r0.d     // Catch: java.lang.Throwable -> L5f
            if (r1 != r4) goto L2f
            goto L4b
        L2f:
            if (r4 >= r1) goto L39
            int r1 = r0.b     // Catch: java.lang.Throwable -> L5f
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L5f
            r0.b = r1     // Catch: java.lang.Throwable -> L5f
        L39:
            r0.c = r2     // Catch: java.lang.Throwable -> L5f
            r0.d = r4     // Catch: java.lang.Throwable -> L5f
            int r1 = r0.h     // Catch: java.lang.Throwable -> L5f
            if (r4 >= r1) goto L4b
            if (r4 != 0) goto L47
            r0.a()     // Catch: java.lang.Throwable -> L5f
            goto L4b
        L47:
            int r1 = r1 - r4
            r0.e(r1)     // Catch: java.lang.Throwable -> L5f
        L4b:
            r4 = 4
            r0 = 0
            r3.e(r0, r0, r4, r2)     // Catch: java.lang.Throwable -> L5f
            ous r4 = r3.d     // Catch: java.lang.Throwable -> L5f
            r4.flush()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r3)
            return
        L57:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            throw r4     // Catch: java.lang.Throwable -> L5f
        L5f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otg.a(otj):void");
    }

    public final synchronized void b() {
        if (this.f) {
            throw new IOException("closed");
        }
        Logger logger = c;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "okhttp3.internal.http2.Http2Writer", "connectionPreface", oqs.i(">> CONNECTION %s", osi.a.d()));
        }
        this.d.J(osi.a.n());
        this.d.flush();
    }

    public final synchronized void c(boolean z, int i, our ourVar, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        e(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 <= 0) {
            return;
        }
        this.d.ik(ourVar, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        this.d.close();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.d.flush();
    }

    public final void e(int i, int i2, byte b, byte b2) {
        Logger logger = c;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "okhttp3.internal.http2.Http2Writer", "frameHeader", osi.c(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) != 0) {
                throw osi.b("reserved bit set: %s", Integer.valueOf(i));
            }
            ous ousVar = this.d;
            ousVar.X((i2 >>> 16) & 255);
            ousVar.X((i2 >>> 8) & 255);
            ousVar.X(i2 & 255);
            this.d.X(b);
            this.d.X(b2);
            this.d.P(i & Integer.MAX_VALUE);
            return;
        }
        throw osi.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final synchronized void f(otj otjVar) {
        int i;
        if (!this.f) {
            int i2 = 0;
            e(0, Integer.bitCount(otjVar.a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (otjVar.d(i2)) {
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
                    this.d.Q(i2);
                    this.d.P(otjVar.a(i));
                    i2 = i;
                }
                i2++;
            }
            this.d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw osi.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        e(i, 4, (byte) 8, (byte) 0);
        this.d.P((int) j);
        this.d.flush();
    }

    public final synchronized void h(int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        e(i, 4, (byte) 3, (byte) 0);
        this.d.P(i2 - 1);
        this.d.flush();
    }

    public final synchronized void i(int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        e(0, 8, (byte) 7, (byte) 0);
        this.d.P(i);
        this.d.P(i2 - 1);
        this.d.flush();
    }

    public final synchronized void j(boolean z, int i, List list) {
        int i2;
        int i3;
        if (!this.f) {
            osg osgVar = this.b;
            if (osgVar.c) {
                int i4 = osgVar.b;
                if (i4 < osgVar.d) {
                    osgVar.d(i4, 31, 32);
                }
                osgVar.c = false;
                osgVar.b = Integer.MAX_VALUE;
                osgVar.d(osgVar.d, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                ose oseVar = (ose) list.get(i5);
                ouu j = oseVar.g.j();
                ouu ouuVar = oseVar.h;
                Integer num = (Integer) osh.b.get(j);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (oqs.t(osh.a[i2 - 1].h, ouuVar)) {
                            i3 = i2;
                        } else if (oqs.t(osh.a[i2].h, ouuVar)) {
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
                    int i6 = osgVar.f + 1;
                    int length = osgVar.e.length;
                    while (true) {
                        if (i6 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (oqs.t(osgVar.e[i6].g, j)) {
                            if (oqs.t(osgVar.e[i6].h, ouuVar)) {
                                int i7 = osgVar.f;
                                int length2 = osh.a.length;
                                i2 = (i6 - i7) + 61;
                                break;
                            } else if (i3 == -1) {
                                int i8 = osgVar.f;
                                int length3 = osh.a.length;
                                i3 = (i6 - i8) + 61;
                            }
                        }
                        i6++;
                    }
                }
                if (i2 != -1) {
                    osgVar.d(i2, 127, 128);
                } else if (i3 == -1) {
                    osgVar.a.N(64);
                    osgVar.c(j);
                    osgVar.c(ouuVar);
                    osgVar.b(oseVar);
                } else if (!j.l(ose.a) || ose.f.equals(j)) {
                    osgVar.d(i3, 63, 64);
                    osgVar.c(ouuVar);
                    osgVar.b(oseVar);
                } else {
                    osgVar.d(i3, 15, 0);
                    osgVar.c(ouuVar);
                }
            }
            long j2 = this.e.b;
            int min = (int) Math.min(this.a, j2);
            long j3 = min;
            int i9 = j2 == j3 ? 4 : 0;
            if (z) {
                i9 |= 1;
            }
            e(i, min, (byte) 1, (byte) i9);
            this.d.ik(this.e, j3);
            if (j2 > j3) {
                long j4 = j2 - j3;
                while (j4 > 0) {
                    int min2 = (int) Math.min(this.a, j4);
                    long j5 = min2;
                    j4 -= j5;
                    e(i, min2, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                    this.d.ik(this.e, j5);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        e(0, 8, (byte) 6, (byte) 1);
        this.d.P(i);
        this.d.P(i2);
        this.d.flush();
    }
}
