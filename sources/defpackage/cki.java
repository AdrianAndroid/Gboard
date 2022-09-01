package defpackage;

/* compiled from: PG */
/* renamed from: cki  reason: default package */
/* loaded from: classes.dex */
public final class cki {
    private mse a;
    private boolean b;
    private llp c;
    private byte d;

    public cki() {
    }

    public cki(ckj ckjVar) {
        this.a = ckjVar.c;
        this.b = ckjVar.d;
        this.c = ckjVar.e;
        this.d = (byte) 1;
    }

    public final ckj a() {
        int b;
        ckj b2 = b();
        int i = 1;
        dau.i(!b2.e.isEmpty(), "Candidates is empty");
        int i2 = b2.c.c;
        int b3 = msc.b(i2);
        boolean z = (b3 != 0 && b3 == 4) || ((b = msc.b(i2)) != 0 && b == 21);
        Object[] objArr = new Object[1];
        int b4 = msc.b(i2);
        if (b4 != 0) {
            i = b4;
        }
        objArr[0] = Integer.valueOf(i - 1);
        dau.j(z, "Candidate type is invalid: %s", objArr);
        return b2;
    }

    public final ckj b() {
        if (this.d != 1 || this.a == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" candidate");
            }
            if (this.d == 0) {
                sb.append(" isExpressionMoment");
            }
            if (this.c == null) {
                sb.append(" candidates");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ckj(this.a, this.b, this.c);
    }

    public final void c(mse mseVar) {
        if (mseVar != null) {
            this.a = mseVar;
            return;
        }
        throw new NullPointerException("Null candidate");
    }

    public final void d(llp llpVar) {
        if (llpVar != null) {
            this.c = llpVar;
            return;
        }
        throw new NullPointerException("Null candidates");
    }

    public final void e(boolean z) {
        this.b = z;
        this.d = (byte) 1;
    }
}
