package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: nwy  reason: default package */
/* loaded from: classes2.dex */
public abstract class nwy implements ofi {
    private InputStream a;
    protected final nwn b;
    protected final nry c;
    final int d;
    protected nxi e;
    protected ofg f;
    protected ofj g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private nww n = nww.UNINITIALIZED;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public nwy(nwn nwnVar, nry nryVar, int i) {
        this.b = nwnVar;
        this.c = nryVar;
        this.d = i;
    }

    private final void f(nvu nvuVar, nvu nvuVar2, boolean z) {
        if (!p()) {
            nww nwwVar = this.n;
            nww nwwVar2 = nww.UNINITIALIZED;
            m(nww.CLOSED);
            if (nwwVar != nwwVar2) {
                this.f.e(nvuVar2);
            }
            if (!z) {
                nwn nwnVar = this.b;
                int i = this.d;
                try {
                    nxj c = nxj.c();
                    c.a().writeInt(0);
                    nxp.H(c.a(), nxp.F(c.a(), nvuVar) | 8);
                    nwnVar.o(i, c);
                    c.close();
                } catch (nvv e) {
                    nwn.e.logp(Level.WARNING, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
                }
            }
            if (nwwVar != nwwVar2) {
                a(nvuVar2);
            }
            o();
        }
    }

    private final void q() {
        nwx nwxVar;
        if (this.i == 0) {
            for (int i = 0; i < this.j.size() && (nwxVar = (nwx) this.j.get(i)) != null; i++) {
                if (nwxVar.d) {
                    this.i = i + 1;
                    t();
                    return;
                }
            }
        }
    }

    private final boolean r() {
        return this.a != null || this.i > 0;
    }

    private final boolean s() {
        return this.k && this.h >= this.l;
    }

    private final void t() {
        jdg.u(this.f);
        this.f.g();
        this.f.h();
        this.o++;
    }

    protected abstract void a(nvu nvuVar);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    public abstract void d(int i, Parcel parcel);

    public boolean e() {
        return false;
    }

    public final void h(nvu nvuVar) {
        f(nvuVar, nvuVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(nvu nvuVar) {
        f(nvu.c, nvuVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void j() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            nww r1 = defpackage.nww.UNINITIALIZED
            nww r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L20
            if (r1 == r2) goto L17
            goto L72
        L17:
            ofj r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.k
            if (r1 == 0) goto L72
            goto L39
        L20:
            ofj r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.r
            if (r1 != 0) goto L72
            boolean r1 = r4.r()
            if (r1 == 0) goto L33
            int r1 = r4.p
            if (r1 == 0) goto L72
            goto L39
        L33:
            boolean r1 = r4.s()
            if (r1 == 0) goto L72
        L39:
            nww r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L4a
            if (r1 != r2) goto L44
            goto L65
        L44:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L4a:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.r()
            if (r1 == 0) goto L5c
            r4.r = r0
            ofj r1 = r4.g
            r1.d(r4)
            goto L8
        L5c:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            nww r1 = defpackage.nww.ALL_MESSAGES_DELIVERED
            r4.m(r1)
        L65:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            nww r1 = defpackage.nww.SUFFIX_DELIVERED
            r4.m(r1)
            r4.b()
            goto L8
        L72:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwy.j():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void k(Parcel parcel) {
        if (p()) {
            return;
        }
        try {
            int readInt = parcel.readInt();
            if (nxp.I(readInt, 8)) {
                nvu G = nxp.G(readInt, parcel);
                f(G, G, true);
                return;
            }
            int readInt2 = parcel.readInt();
            boolean I = nxp.I(readInt, 1);
            boolean I2 = nxp.I(readInt, 2);
            boolean I3 = nxp.I(readInt, 4);
            if (I) {
                c(readInt, parcel);
                m(nww.PREFIX_DELIVERED);
            }
            if (I2) {
                if ((readInt & 64) != 0) {
                    nwe nweVar = (nwe) this.c.c(nwn.h);
                    throw nvu.g.f("Parcelable messages not allowed").g();
                }
                int readInt3 = parcel.readInt();
                byte[] c = nwr.c(readInt3);
                if (readInt3 > 0) {
                    parcel.readByteArray(c);
                }
                int i = readInt & 128;
                boolean z = i == 0;
                if (this.j == null) {
                    if (this.o != 0 || i != 0 || readInt2 != this.h) {
                        this.j = new ArrayList(16);
                    } else {
                        jdg.F(this.a == null);
                        this.a = new nwq(c);
                        t();
                    }
                }
                nwx nwxVar = new nwx(c, readInt3, z);
                int i2 = readInt2 - this.h;
                if (i2 < this.j.size()) {
                    this.j.set(i2, nwxVar);
                    q();
                } else if (i2 > this.j.size()) {
                    do {
                        this.j.add(null);
                    } while (i2 > this.j.size());
                    this.j.add(nwxVar);
                } else {
                    this.j.add(nwxVar);
                    q();
                }
            }
            if (I3) {
                d(readInt, parcel);
                this.l = readInt2;
                this.k = true;
            }
            int i3 = this.h;
            if (readInt2 == i3) {
                ArrayList arrayList = this.j;
                if (arrayList == null) {
                    this.h = i3 + 1;
                } else if (!I2 && !I3) {
                    arrayList.remove(0);
                    this.h++;
                }
            }
            int dataSize = this.m + parcel.dataSize();
            this.m = dataSize;
            ofg ofgVar = this.f;
            if (ofgVar != null && dataSize != 0) {
                ofgVar.c(dataSize);
                this.f.i();
                this.m = 0;
            }
            j();
        } catch (nvv e) {
            h(e.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(nxi nxiVar, ofj ofjVar) {
        this.e = nxiVar;
        this.f = nxiVar.f;
        this.g = ofjVar;
        if (!p()) {
            m(nww.INITIALIZED);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(nww nwwVar) {
        nww nwwVar2 = this.n;
        nww nwwVar3 = nww.UNINITIALIZED;
        int ordinal = nwwVar.ordinal();
        boolean z = false;
        if (ordinal == 1) {
            if (nwwVar2 == nww.UNINITIALIZED) {
                z = true;
            }
            jdg.L(z, "%s -> %s", nwwVar2, nwwVar);
        } else if (ordinal == 2) {
            if (nwwVar2 == nww.INITIALIZED || nwwVar2 == nww.UNINITIALIZED) {
                z = true;
            }
            jdg.L(z, "%s -> %s", nwwVar2, nwwVar);
        } else if (ordinal == 3) {
            if (nwwVar2 == nww.PREFIX_DELIVERED) {
                z = true;
            }
            jdg.L(z, "%s -> %s", nwwVar2, nwwVar);
        } else if (ordinal == 4) {
            if (nwwVar2 == nww.ALL_MESSAGES_DELIVERED) {
                z = true;
            }
            jdg.L(z, "%s -> %s", nwwVar2, nwwVar);
        } else if (ordinal != 5) {
            throw new AssertionError();
        }
        this.n = nwwVar;
    }

    public final void n(int i) {
        this.p += i;
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.b.l(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p() {
        return this.n == nww.CLOSED;
    }

    public final synchronized String toString() {
        String simpleName;
        boolean z;
        String valueOf;
        boolean r;
        boolean z2;
        simpleName = getClass().getSimpleName();
        z = this.k;
        valueOf = String.valueOf(this.n);
        r = r();
        z2 = this.g != null;
        return simpleName + "[SfxA=" + z + "/De=" + valueOf + "/Msg=" + r + "/Lis=" + z2 + "]";
    }

    @Override // defpackage.ofi
    public final synchronized InputStream g() {
        nwq nwqVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (this.p <= 0 || !r()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                nwx nwxVar = (nwx) this.j.remove(0);
                int i2 = nwxVar.c;
                InputStream inputStream2 = nwxVar.a;
                nwqVar = new nwq(nwxVar.b);
            } else {
                byte[][] bArr = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr2 = ((nwx) this.j.remove(0)).b;
                    bArr[i4] = bArr2;
                    i3 += bArr2.length;
                }
                nwqVar = new nwq(bArr, i3);
            }
            this.h += i;
            q();
            inputStream = nwqVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (s() && !p()) {
                m(nww.ALL_MESSAGES_DELIVERED);
                j();
                return null;
            }
        }
        return inputStream;
    }
}
