package defpackage;

/* compiled from: PG */
/* renamed from: jqi  reason: default package */
/* loaded from: classes.dex */
public final class jqi {
    public boolean a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;

    public jqi() {
    }

    public jqi(byte[] bArr) {
        ldu lduVar = ldu.a;
        this.d = lduVar;
        this.c = lduVar;
        this.e = lduVar;
    }

    public final jqj a() {
        Object obj = this.c;
        if (obj != null) {
            this.d = ((llk) obj).g();
        } else if (this.d == null) {
            this.d = llp.q();
        }
        if (this.b != 1) {
            throw new IllegalStateException("Missing required properties: isLastBatch");
        }
        return new jpc((llp) this.d, this.a, (byte[]) this.e);
    }

    public final llk b() {
        if (this.c == null) {
            this.c = llp.e();
        }
        return (llk) this.c;
    }

    public final void c(jug jugVar) {
        b().h(jugVar);
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void e(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 1);
    }

    public final gsn f() {
        if (this.c == null) {
            Object obj = this.d;
            if (obj == null) {
                this.c = gso.a();
            } else {
                gsn a = gso.a();
                gso gsoVar = (gso) obj;
                a.c(gsoVar.a);
                a.b(gsoVar.b);
                this.c = a;
                this.d = null;
            }
        }
        return (gsn) this.c;
    }
}
