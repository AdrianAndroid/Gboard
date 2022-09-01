package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* renamed from: ofs  reason: default package */
/* loaded from: classes2.dex */
public final class ofs implements ovn {
    public final oft c;
    public ovn f;
    public Socket g;
    public int h;
    public int i;
    private final oei j;
    private boolean l;
    public final Object a = new Object();
    public final our b = new our();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public ofs(oei oeiVar, oft oftVar) {
        jdg.Q(oeiVar, "executor");
        this.j = oeiVar;
        this.c = oftVar;
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return ovr.h;
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new obv(this, 15));
    }

    @Override // defpackage.ovn, java.io.Flushable
    public final void flush() {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = oiw.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new ofq(this));
        }
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = oiw.a;
        synchronized (this.a) {
            this.b.ik(ourVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && this.b.g() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (z) {
                try {
                    this.g.close();
                    return;
                } catch (IOException e) {
                    this.c.a(e);
                    return;
                }
            }
            this.j.execute(new ofp(this));
        }
    }
}
