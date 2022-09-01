package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: ntt  reason: default package */
/* loaded from: classes2.dex */
public final class ntt {
    public final List a;
    public final nry b;
    private final Object[][] c;

    public ntt(List list, nry nryVar, Object[][] objArr) {
        jdg.Q(list, "addresses are not set");
        this.a = list;
        jdg.Q(nryVar, "attrs");
        this.b = nryVar;
        this.c = objArr;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("addrs", this.a);
        S.b("attrs", this.b);
        S.b("customOptions", Arrays.deepToString(this.c));
        return S.toString();
    }
}
