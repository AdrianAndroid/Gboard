package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: gjd  reason: default package */
/* loaded from: classes.dex */
public final class gjd {
    public final Context a;
    public final lfb b;
    public final lfb c;
    private final lfb d;

    public gjd() {
    }

    public gjd(Context context, lfb lfbVar, lfb lfbVar2, lfb lfbVar3) {
        this.a = context;
        this.d = lfbVar;
        this.b = lfbVar2;
        this.c = lfbVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjd) {
            gjd gjdVar = (gjd) obj;
            if (this.a.equals(gjdVar.a) && this.d.equals(gjdVar.d) && this.b.equals(gjdVar.b) && this.c.equals(gjdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        return "CollectionBasisContext{context=" + valueOf + ", accountNames=" + valueOf2 + ", stacktrace=" + valueOf3 + ", googlerOverridesCheckbox=false, executor=" + valueOf4 + "}";
    }
}
