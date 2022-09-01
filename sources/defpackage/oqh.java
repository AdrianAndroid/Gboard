package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: oqh  reason: default package */
/* loaded from: classes2.dex */
public final class oqh implements opf {
    final oqd a;
    final ort b;
    final oup c;
    public final oqi d;
    private opv e;
    private boolean f;

    private oqh(oqd oqdVar, oqi oqiVar) {
        this.a = oqdVar;
        this.d = oqiVar;
        this.b = new ort(oqdVar);
        oqf oqfVar = new oqf(this);
        this.c = oqfVar;
        oqfVar.f(0L, TimeUnit.MILLISECONDS);
    }

    public static oqh g(oqd oqdVar, oqi oqiVar) {
        oqh oqhVar = new oqh(oqdVar, oqiVar);
        oqhVar.e = (opv) oqdVar.z.a;
        return oqhVar;
    }

    private final void h() {
        this.b.b = otu.c.k();
    }

    @Override // defpackage.opf
    public final oql a() {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        h();
        this.c.e();
        try {
            try {
                this.a.c.b(this);
                return f();
            } catch (IOException e) {
                throw d(e);
            }
        } finally {
            this.a.c.d(this);
        }
    }

    @Override // defpackage.opf
    public final void b() {
        orn ornVar;
        orf orfVar;
        ort ortVar = this.b;
        ortVar.c = true;
        orj orjVar = ortVar.a;
        if (orjVar != null) {
            synchronized (orjVar.c) {
                orjVar.k = true;
                ornVar = orjVar.l;
                orfVar = orjVar.h;
            }
            if (ornVar != null) {
                ornVar.d();
            } else if (orfVar == null) {
            } else {
                orfVar.a();
            }
        }
    }

    @Override // defpackage.opf
    public final void c(opg opgVar) {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        h();
        opr oprVar = this.a.c;
        oqg oqgVar = new oqg(this, opgVar);
        synchronized (oprVar) {
            oprVar.b.add(oqgVar);
        }
        oprVar.e();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return g(this.a, this.d);
    }

    public final IOException d(IOException iOException) {
        if (!oix.h(this.c)) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String e() {
        opy m = this.d.a.m("/...");
        m.b = opz.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        m.c = opz.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return m.c().e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final oql f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.g);
        arrayList.add(this.b);
        arrayList.add(new ork(this.a.j));
        opc opcVar = this.a.k;
        arrayList.add(new oqu(opcVar != null ? opcVar.d : null, null));
        arrayList.add(new ord(this.a));
        arrayList.addAll(this.a.h);
        arrayList.add(new orm(0));
        oqi oqiVar = this.d;
        opv opvVar = this.e;
        oqd oqdVar = this.a;
        return new orr(arrayList, null, null, null, 0, oqiVar, this, opvVar, oqdVar.w, oqdVar.x, oqdVar.y).a(oqiVar);
    }
}
