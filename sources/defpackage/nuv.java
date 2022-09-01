package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: nuv  reason: default package */
/* loaded from: classes2.dex */
public final class nuv {
    public final List a;
    public final nry b;
    public final nus c;

    public nuv(List list, nry nryVar, nus nusVar) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        jdg.Q(nryVar, "attributes");
        this.b = nryVar;
        this.c = nusVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nuv)) {
            return false;
        }
        nuv nuvVar = (nuv) obj;
        return jdg.W(this.a, nuvVar.a) && jdg.W(this.b, nuvVar.b) && jdg.W(this.c, nuvVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("addresses", this.a);
        S.b("attributes", this.b);
        S.b("serviceConfig", this.c);
        return S.toString();
    }
}
