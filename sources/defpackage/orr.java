package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: orr  reason: default package */
/* loaded from: classes2.dex */
public final class orr {
    public final orj a;
    public final orn b;
    public final orf c;
    public final oqi d;
    public final opf e;
    public final opv f;
    public final int g;
    public final int h;
    public final int i;
    private final List j;
    private final int k;
    private int l;

    public orr(List list, orj orjVar, orn ornVar, orf orfVar, int i, oqi oqiVar, opf opfVar, opv opvVar, int i2, int i3, int i4) {
        this.j = list;
        this.c = orfVar;
        this.a = orjVar;
        this.b = ornVar;
        this.k = i;
        this.d = oqiVar;
        this.e = opfVar;
        this.f = opvVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public final oql a(oqi oqiVar) {
        return b(oqiVar, this.a, this.b, this.c);
    }

    public final oql b(oqi oqiVar, orj orjVar, orn ornVar, orf orfVar) {
        if (this.k >= this.j.size()) {
            throw new AssertionError();
        }
        this.l++;
        if (this.b != null && !this.c.h(oqiVar.a)) {
            throw new IllegalStateException("network interceptor " + String.valueOf(this.j.get(this.k - 1)) + " must retain the same host and port");
        }
        if (this.b == null || this.l <= 1) {
            List list = this.j;
            int i = this.k;
            orr orrVar = new orr(list, orjVar, ornVar, orfVar, i + 1, oqiVar, this.e, this.f, this.g, this.h, this.i);
            oqa oqaVar = (oqa) list.get(i);
            oql a = oqaVar.a(orrVar);
            if (ornVar == null || this.k + 1 >= this.j.size() || orrVar.l == 1) {
                if (a.g != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + String.valueOf(oqaVar) + " returned a response with no body");
            }
            throw new IllegalStateException("network interceptor " + String.valueOf(oqaVar) + " must call proceed() exactly once");
        }
        throw new IllegalStateException("network interceptor " + String.valueOf(this.j.get(this.k - 1)) + " must call proceed() exactly once");
    }
}
