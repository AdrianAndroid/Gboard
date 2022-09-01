package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: PG */
/* renamed from: orj  reason: default package */
/* loaded from: classes2.dex */
public final class orj {
    public final oou a;
    public oqo b;
    public final opk c;
    public final opf d;
    public final opv e;
    public final orh f;
    public int g;
    public orf h;
    public boolean i;
    public boolean j;
    public boolean k;
    public orn l;
    public otj m;
    private final Object n;

    public orj(opk opkVar, oou oouVar, opf opfVar, opv opvVar, Object obj) {
        this.c = opkVar;
        this.a = oouVar;
        this.d = opfVar;
        this.e = opvVar;
        this.f = new orh(oouVar, h(), null);
        this.n = obj;
    }

    public final Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.l = null;
        }
        if (z2) {
            this.j = true;
        }
        orf orfVar = this.h;
        if (orfVar != null) {
            if (z) {
                orfVar.j = true;
            }
            if (this.l != null) {
                return null;
            }
            if (!this.j && !orfVar.j) {
                return null;
            }
            int size = orfVar.m.size();
            for (int i = 0; i < size; i++) {
                if (((Reference) orfVar.m.get(i)).get() == this) {
                    orfVar.m.remove(i);
                    if (this.h.m.isEmpty()) {
                        this.h.n = System.nanoTime();
                        opk opkVar = this.c;
                        orf orfVar2 = this.h;
                        if (orfVar2.j || opkVar.b == 0) {
                            opkVar.e.remove(orfVar2);
                            socket = this.h.d;
                            this.h = null;
                            return socket;
                        }
                        opkVar.notifyAll();
                    }
                    socket = null;
                    this.h = null;
                    return socket;
                }
            }
            throw new IllegalStateException();
        }
        return null;
    }

    public final synchronized orf b() {
        return this.h;
    }

    public final void c(orf orfVar, boolean z) {
        if (this.h != null) {
            throw new IllegalStateException();
        }
        this.h = orfVar;
        this.i = z;
        orfVar.m.add(new ori(this, this.n));
    }

    public final void d() {
        Socket a;
        synchronized (this.c) {
            a = a(true, false, false);
        }
        oqs.s(a);
    }

    public final void e() {
        orf orfVar;
        Socket a;
        synchronized (this.c) {
            orfVar = this.h;
            a = a(false, true, false);
            if (this.h != null) {
                orfVar = null;
            }
        }
        oqs.s(a);
        if (orfVar != null) {
            ((oqh) this.d).d(null);
        }
    }

    public final void f(IOException iOException) {
        boolean z;
        Socket a;
        synchronized (this.c) {
            if (iOException instanceof otk) {
                int i = ((otk) iOException).a;
                if (i == 8) {
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 1) {
                        this.b = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (i != 9) {
                        this.b = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                orf orfVar = this.h;
                if (orfVar != null && (!orfVar.g() || (iOException instanceof osd))) {
                    if (orfVar.k == 0) {
                        oqo oqoVar = this.b;
                        if (oqoVar != null && iOException != null) {
                            orh orhVar = this.f;
                            if (oqoVar.b.type() != Proxy.Type.DIRECT) {
                                Object obj = orhVar.b;
                                ((oou) obj).g.connectFailed(((oou) obj).a.i(), oqoVar.b.address(), iOException);
                            }
                            ((mlu) orhVar.f).A(oqoVar);
                        }
                        this.b = null;
                    }
                    z = true;
                }
                z = false;
            }
            a = a(z, false, true);
        }
        oqs.s(a);
    }

    public final void g(boolean z, orn ornVar, IOException iOException) {
        Socket a;
        boolean z2;
        synchronized (this.c) {
            if (ornVar != null) {
                if (ornVar == this.l) {
                    if (!z) {
                        this.h.k++;
                    }
                    a = a(z, false, true);
                    z2 = this.j;
                }
            }
            throw new IllegalStateException("expected " + String.valueOf(this.l) + " but was " + String.valueOf(ornVar));
        }
        oqs.s(a);
        if (iOException != null) {
            ((oqh) this.d).d(iOException);
        } else if (!z2) {
        } else {
            ((oqh) this.d).d(null);
        }
    }

    public final mlu h() {
        return this.c.g;
    }

    public final String toString() {
        orf b = b();
        return b != null ? b.toString() : this.a.toString();
    }
}
