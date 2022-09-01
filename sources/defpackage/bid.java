package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: bid  reason: default package */
/* loaded from: classes.dex */
public final class bid implements Cloneable {
    public Float A;
    public bin B;
    public Float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public long a = 0;
    public bin b;
    public Float c;
    public bin d;
    public Float e;
    public bho f;
    public Float g;
    public bho[] h;
    public bho i;
    public Float j;
    public bhf k;
    public List l;
    public bho m;
    public Integer n;
    public Boolean o;
    public bhc p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Boolean u;
    public bin v;
    public Float w;
    public String x;
    public String y;
    public bin z;

    public static bid a() {
        bid bidVar = new bid();
        bidVar.a = -1L;
        bidVar.b = bhf.a;
        bidVar.D = 1;
        Float valueOf = Float.valueOf(1.0f);
        bidVar.c = valueOf;
        bidVar.d = null;
        bidVar.e = valueOf;
        bidVar.f = new bho(1.0f);
        bidVar.E = 1;
        bidVar.F = 1;
        bidVar.g = Float.valueOf(4.0f);
        bidVar.h = null;
        bidVar.i = new bho(0.0f);
        bidVar.j = valueOf;
        bidVar.k = bhf.a;
        bidVar.l = null;
        bidVar.m = new bho(12.0f, 7);
        bidVar.n = 400;
        bidVar.G = 1;
        bidVar.H = 1;
        bidVar.I = 1;
        bidVar.J = 1;
        bidVar.o = true;
        bidVar.p = null;
        bidVar.q = null;
        bidVar.r = null;
        bidVar.s = null;
        bidVar.t = Boolean.TRUE;
        bidVar.u = Boolean.TRUE;
        bidVar.v = bhf.a;
        bidVar.w = valueOf;
        bidVar.x = null;
        bidVar.K = 1;
        bidVar.y = null;
        bidVar.z = null;
        bidVar.A = valueOf;
        bidVar.B = null;
        bidVar.C = valueOf;
        bidVar.L = 1;
        return bidVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object clone() {
        try {
            bid bidVar = (bid) super.clone();
            bho[] bhoVarArr = this.h;
            if (bhoVarArr != null) {
                bidVar.h = (bho[]) bhoVarArr.clone();
            }
            return bidVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
