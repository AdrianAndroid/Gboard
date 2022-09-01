package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ckj  reason: default package */
/* loaded from: classes.dex */
public final class ckj implements cja {
    public static final ckj a;
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/TextCandidateData");
    public final mse c;
    public final boolean d;
    public final llp e;

    static {
        cki c = c();
        c.c(mse.p);
        c.d(llp.r(mse.p));
        a = c.b();
    }

    public ckj() {
    }

    public ckj(mse mseVar, boolean z, llp llpVar) {
        this.c = mseVar;
        this.d = z;
        this.e = llpVar;
    }

    public static cki c() {
        cki ckiVar = new cki();
        ckiVar.e(false);
        return ckiVar;
    }

    public static ckj d(Iterable iterable, boolean z) {
        llp i = llp.i(iterable);
        cki c = c();
        c.c((mse) i.get(0));
        c.d(i);
        c.e(z);
        return c.a();
    }

    private static hln g(hlk hlkVar, ckj ckjVar, int i, int i2, boolean z) {
        hlkVar.c();
        hlkVar.e = hlm.EXPRESSION;
        hlkVar.s = 5;
        String str = ckjVar.c.d;
        hlkVar.a = str;
        hlkVar.j = ckjVar;
        hlkVar.f = z;
        hlkVar.h = i;
        hlkVar.i = i2;
        hlkVar.c = "emoji ".concat(String.valueOf(str));
        return hlkVar.a();
    }

    @Override // defpackage.cci
    public final /* synthetic */ int a() {
        return ccg.a(this);
    }

    @Override // defpackage.cci
    public final mse b() {
        return this.c;
    }

    public final cki e() {
        return new cki(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckj) {
            ckj ckjVar = (ckj) obj;
            if (this.c.equals(ckjVar.c) && this.d == ckjVar.d && lre.I(this.e, ckjVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        int b = msc.b(this.c.c);
        if (b == 0) {
            b = 1;
        }
        int i = b - 1;
        if (i != 3) {
            if (i == 20) {
                return 3;
            }
            ltd ltdVar = (ltd) ((ltd) f.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/TextCandidateData", "contentType", 46, "TextCandidateData.java");
            int b2 = msc.b(this.c.c);
            if (b2 == 0) {
                b2 = 1;
            }
            ltdVar.u("%s is not a text candidate", b2 - 1);
            return 1;
        }
        return 2;
    }

    @Override // defpackage.cja
    public final boolean h() {
        return this.d;
    }

    @Override // defpackage.cja
    public final int k() {
        return this.e.size();
    }

    @Override // defpackage.cja
    public final int m() {
        return 2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf2 = String.valueOf(this.e);
        return "TextCandidateData{candidate=" + valueOf + ", isExpressionMoment=" + z + ", candidates=" + valueOf2 + "}";
    }

    public final int hashCode() {
        mse mseVar = this.c;
        int i = mseVar.cO;
        if (i == 0) {
            i = nhh.a.b(mseVar).b(mseVar);
            mseVar.cO = i;
        }
        return this.e.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003);
    }

    @Override // defpackage.cja
    public final hln l(Context context, hlk hlkVar, int i, int i2, boolean z) {
        int i3 = this.c.c;
        int b = msc.b(i3);
        int i4 = 1;
        if (b == 0) {
            b = 1;
        }
        int i5 = b - 1;
        if (i5 == 3) {
            if (this.e.size() <= 1 || !((Boolean) cit.t.c()).booleanValue()) {
                return g(hlkVar, this, i, i2, z);
            } else {
                hln[] hlnVarArr = new hln[this.e.size()];
                boolean booleanValue = ((Boolean) cit.v.c()).booleanValue();
                for (int i6 = 0; i6 < this.e.size(); i6++) {
                    int size = booleanValue ? (this.e.size() - i6) - 1 : i6;
                    cki e = e();
                    e.c((mse) this.e.get(size));
                    hlnVarArr[i6] = g(hlkVar, e.a(), i, i2 + i6, z);
                }
                hlkVar.c();
                hlkVar.e = hlm.EXPRESSION;
                hlkVar.s = 4;
                hlkVar.j = this;
                hlkVar.k = hlnVarArr;
                hlkVar.f = z;
                hlkVar.h = i;
                hlkVar.i = i2;
                String str = this.c.d;
                hlkVar.a = str;
                hlkVar.c = "emoji ".concat(String.valueOf(str));
                return hlkVar.a();
            }
        }
        if (i5 != 20) {
            int b2 = msc.b(i3);
            if (b2 != 0) {
                i4 = b2;
            }
            StringBuilder sb = new StringBuilder("Unsupported type ");
            sb.append(i4 - 1);
            throw new IllegalStateException(sb.toString());
        }
        hlkVar.c();
        hlkVar.e = hlm.EXPRESSION;
        hlkVar.s = 1;
        String str2 = this.c.d;
        hlkVar.a = str2;
        hlkVar.j = this;
        hlkVar.f = z;
        hlkVar.h = i;
        hlkVar.i = i2;
        hlkVar.c = str2;
        return hlkVar.a();
    }
}
