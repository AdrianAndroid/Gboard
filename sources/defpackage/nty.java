package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: nty  reason: default package */
/* loaded from: classes2.dex */
public final class nty {
    public final List a;
    public final nry b;
    public final Object c;

    public nty(List list, nry nryVar, Object obj) {
        jdg.Q(list, "addresses");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        jdg.Q(nryVar, "attributes");
        this.b = nryVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nty)) {
            return false;
        }
        nty ntyVar = (nty) obj;
        return jdg.W(this.a, ntyVar.a) && jdg.W(this.b, ntyVar.b) && jdg.W(this.c, ntyVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("addresses", this.a);
        S.b("attributes", this.b);
        S.b("loadBalancingPolicyConfig", this.c);
        return S.toString();
    }
}
