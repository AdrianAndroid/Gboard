package defpackage;

/* compiled from: PG */
/* renamed from: oij  reason: default package */
/* loaded from: classes2.dex */
public final class oij extends ohy {
    final nvl a;
    volatile boolean b;
    public boolean c;
    private final boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public oij() {
    }

    public oij(nvl nvlVar, boolean z) {
        this.c = true;
        this.f = false;
        this.g = false;
        this.a = nvlVar;
        this.d = z;
    }

    @Override // defpackage.oin
    public final void a() {
        this.a.a(nvu.b, new num());
        this.g = true;
    }

    @Override // defpackage.oin
    public final void b(Throwable th) {
        num a = nvu.a(th);
        if (a == null) {
            a = new num();
        }
        this.a.a(nvu.d(th), a);
        this.f = true;
    }

    @Override // defpackage.oin
    public final void c(Object obj) {
        if (!this.b || !this.d) {
            jdg.G(!this.f, "Stream was terminated by error, no further calls are allowed");
            jdg.G(!this.g, "Stream is already completed, no further calls are allowed");
            if (!this.e) {
                nvl nvlVar = this.a;
                num numVar = new num();
                oek oekVar = (oek) nvlVar;
                oix oixVar = oekVar.c;
                int i = oiw.a;
                try {
                    jdg.G(!((oek) nvlVar).h, "sendHeaders has already been called");
                    jdg.G(!((oek) nvlVar).i, "call is closed");
                    numVar.d(oao.g);
                    numVar.d(oao.c);
                    if (((oek) nvlVar).j == null) {
                        ((oek) nvlVar).j = nsh.a;
                    } else {
                        byte[] bArr = ((oek) nvlVar).e;
                        if (bArr != null) {
                            Iterable i2 = oao.k.i(new String(bArr, oao.a));
                            nsj nsjVar = ((oek) nvlVar).j;
                            if (!oao.l(i2)) {
                                ((oek) nvlVar).j = nsh.a;
                            }
                        } else {
                            ((oek) nvlVar).j = nsh.a;
                        }
                    }
                    nuj nujVar = oao.c;
                    nsj nsjVar2 = ((oek) nvlVar).j;
                    numVar.f(nujVar, "identity");
                    ((oek) nvlVar).a.h(((oek) nvlVar).j);
                    numVar.d(oao.d);
                    byte[] bArr2 = ((oek) nvlVar).f.c;
                    if (bArr2.length != 0) {
                        numVar.f(oao.d, bArr2);
                    }
                    ((oek) nvlVar).h = true;
                    ((oek) nvlVar).a.j(numVar);
                    oix oixVar2 = oekVar.c;
                    this.e = true;
                } finally {
                }
            }
            nvl nvlVar2 = this.a;
            oix oixVar3 = ((oek) nvlVar2).c;
            int i3 = oiw.a;
            try {
                ((oek) nvlVar2).c(obj);
                return;
            } finally {
            }
        }
        throw nvu.c.f("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception").h();
    }
}
