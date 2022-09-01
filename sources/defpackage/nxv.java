package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: nxv  reason: default package */
/* loaded from: classes2.dex */
public abstract class nxv implements ofh {
    @Override // defpackage.ofh
    public final void d() {
        ocy ocyVar;
        ogn ognVar;
        if (((ocy) q()).f || (ognVar = (ocyVar = (ocy) q()).j) == null || ognVar.c <= 0) {
            return;
        }
        ocyVar.b(false, true);
    }

    @Override // defpackage.ofh
    public final void f() {
        nxu p = p();
        ocu ocuVar = p.d;
        ocuVar.a = p;
        p.a = ocuVar;
    }

    @Override // defpackage.ofh
    public final void g(int i) {
        nxu p = p();
        int i2 = oiw.a;
        dob dobVar = new dob(p, i, 13);
        synchronized (((oar) p).u) {
            dobVar.run();
        }
    }

    @Override // defpackage.ofh
    public final void h(nsj nsjVar) {
        ((ocy) q()).b = nsjVar;
    }

    @Override // defpackage.ofh
    public final void n(InputStream inputStream) {
        int a;
        try {
            if (!((ocy) q()).f) {
                oaj q = q();
                if (((ocy) q).f) {
                    throw new IllegalStateException("Framer already closed");
                }
                ((ocy) q).g++;
                ((ocy) q).h++;
                ((ocy) q).i = 0L;
                ((ocy) q).e.j();
                nsj nsjVar = ((ocy) q).b;
                nsi nsiVar = nsh.a;
                try {
                    try {
                        int available = inputStream.available();
                        if (available != 0 && nsjVar != nsiVar) {
                            ocv ocvVar = new ocv();
                            try {
                                a = ocy.a(inputStream, ocvVar);
                                ocvVar.close();
                                int i = ((ocy) q).a;
                                if (i >= 0 && a > i) {
                                    throw nvu.i.f(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(a), Integer.valueOf(((ocy) q).a))).h();
                                }
                                ((ocy) q).c(ocvVar, true);
                            } catch (Throwable th) {
                                ocvVar.close();
                                throw th;
                            }
                        } else if (available != -1) {
                            ((ocy) q).i = available;
                            int i2 = ((ocy) q).a;
                            if (i2 >= 0 && available > i2) {
                                throw nvu.i.f(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(available), Integer.valueOf(((ocy) q).a))).h();
                            }
                            ByteBuffer byteBuffer = (ByteBuffer) ((ocy) q).d.clear();
                            ((ocy) q).d.put((byte) 0).putInt(available);
                            if (((ocy) q).j == null) {
                                ((ocy) q).j = nxo.g(((ocy) q).d.position() + available);
                            }
                            ((ocy) q).d(((ocy) q).d.array(), 0, ((ocy) q).d.position());
                            a = ocy.a(inputStream, ((ocy) q).c);
                        } else {
                            ocv ocvVar2 = new ocv();
                            a = ocy.a(inputStream, ocvVar2);
                            int i3 = ((ocy) q).a;
                            if (i3 >= 0 && a > i3) {
                                throw nvu.i.f(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(a), Integer.valueOf(((ocy) q).a))).h();
                            }
                            ((ocy) q).c(ocvVar2, false);
                        }
                        if (available != -1 && a != available) {
                            throw nvu.k.f(String.format("Message length inaccurate %s != %s", Integer.valueOf(a), Integer.valueOf(available))).h();
                        }
                        ((ocy) q).e.l();
                        ((ocy) q).e.d(((ocy) q).i);
                        ((ocy) q).e.k();
                    } catch (RuntimeException e) {
                        throw nvu.k.f("Failed to frame message").e(e).h();
                    }
                } catch (IOException e2) {
                    throw nvu.k.f("Failed to frame message").e(e2).h();
                }
            }
        } finally {
            oao.f(inputStream);
        }
    }

    @Override // defpackage.ofh
    public boolean o() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract nxu p();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract oaj q();
}
