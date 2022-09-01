package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nth  reason: default package */
/* loaded from: classes2.dex */
public final class nth {
    public final String a;
    public final ntg b;
    public final long c;
    public final ntr d = null;
    public final ntr e;

    public nth(String str, ntg ntgVar, long j, ntr ntrVar) {
        this.a = str;
        jdg.Q(ntgVar, "severity");
        this.b = ntgVar;
        this.c = j;
        this.e = ntrVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nth) {
            nth nthVar = (nth) obj;
            if (jdg.W(this.a, nthVar.a) && jdg.W(this.b, nthVar.b) && this.c == nthVar.c) {
                ntr ntrVar = nthVar.d;
                if (jdg.W(null, null) && jdg.W(this.e, nthVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("description", this.a);
        S.b("severity", this.b);
        S.g("timestampNanos", this.c);
        S.b("channelRef", null);
        S.b("subchannelRef", this.e);
        return S.toString();
    }
}
