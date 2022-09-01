package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: nze  reason: default package */
/* loaded from: classes2.dex */
public final class nze extends nxs {
    private static final nzc b = new nza(1);
    private static final nzc c = new nza(0);
    private static final nzc d = new nza(2);
    private static final nzc e = new nza(3);
    private static final nzd f = new nzb();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public nze() {
        this.g = new ArrayDeque();
    }

    private final int m(nzd nzdVar, int i, Object obj, int i2) {
        a(i);
        if (!this.g.isEmpty()) {
            p();
        }
        while (i > 0 && !this.g.isEmpty()) {
            odg odgVar = (odg) this.g.peek();
            int min = Math.min(i, odgVar.f());
            i2 = nzdVar.a(odgVar, min, obj, i2);
            i -= min;
            this.a -= min;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(nzc nzcVar, int i, Object obj, int i2) {
        try {
            return m(nzcVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (this.i) {
            this.h.add((odg) this.g.remove());
            odg odgVar = (odg) this.g.peek();
            if (odgVar == null) {
                return;
            }
            odgVar.b();
            return;
        }
        ((odg) this.g.remove()).close();
    }

    private final void p() {
        if (((odg) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.nxs, defpackage.odg
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        odg odgVar = (odg) this.g.peek();
        if (odgVar != null) {
            int f2 = odgVar.f();
            odgVar.c();
            this.a += odgVar.f() - f2;
        }
        while (true) {
            odg odgVar2 = (odg) this.h.pollLast();
            if (odgVar2 == null) {
                return;
            }
            odgVar2.c();
            this.g.addFirst(odgVar2);
            this.a += odgVar2.f();
        }
    }

    @Override // defpackage.nxs, defpackage.odg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.g.isEmpty()) {
            ((odg) this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((odg) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.nxs, defpackage.odg
    public final boolean d() {
        for (odg odgVar : this.g) {
            if (!odgVar.d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.odg
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.odg
    public final int f() {
        return this.a;
    }

    @Override // defpackage.odg
    public final odg g(int i) {
        odg odgVar;
        int i2;
        odg odgVar2;
        if (i <= 0) {
            return odj.a;
        }
        a(i);
        this.a -= i;
        nze nzeVar = null;
        nze nzeVar2 = null;
        while (true) {
            odg odgVar3 = (odg) this.g.peek();
            int f2 = odgVar3.f();
            if (f2 > i) {
                odgVar2 = odgVar3.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    odgVar = odgVar3.g(f2);
                    o();
                } else {
                    odgVar = (odg) this.g.poll();
                }
                odg odgVar4 = odgVar;
                i2 = i - f2;
                odgVar2 = odgVar4;
            }
            if (nzeVar == null) {
                nzeVar = odgVar2;
            } else {
                if (nzeVar2 == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(this.g.size() + 2, 16);
                    }
                    nzeVar2 = new nze(i3);
                    nzeVar2.h(nzeVar);
                    nzeVar = nzeVar2;
                }
                nzeVar2.h(odgVar2);
            }
            if (i2 <= 0) {
                return nzeVar;
            }
            i = i2;
        }
    }

    public final void h(odg odgVar) {
        boolean z = this.i && this.g.isEmpty();
        if (!(odgVar instanceof nze)) {
            this.g.add(odgVar);
            this.a += odgVar.f();
        } else {
            nze nzeVar = (nze) odgVar;
            while (!nzeVar.g.isEmpty()) {
                this.g.add((odg) nzeVar.g.remove());
            }
            this.a += nzeVar.a;
            nzeVar.a = 0;
            nzeVar.close();
        }
        if (z) {
            ((odg) this.g.peek()).b();
        }
    }

    @Override // defpackage.odg
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.odg
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.odg
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.odg
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public nze(int i) {
        this.g = new ArrayDeque(i);
    }

    @Override // defpackage.nxs, defpackage.odg
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((odg) this.h.remove()).close();
        }
        this.i = true;
        odg odgVar = (odg) this.g.peek();
        if (odgVar != null) {
            odgVar.b();
        }
    }
}
