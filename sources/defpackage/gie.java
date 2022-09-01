package defpackage;

/* compiled from: PG */
/* renamed from: gie  reason: default package */
/* loaded from: classes.dex */
public final class gie {
    public final nln a;
    private final lfb b;
    private final lfb c;

    public gie() {
    }

    public gie(nln nlnVar, lfb lfbVar, lfb lfbVar2) {
        this.a = nlnVar;
        this.b = lfbVar;
        this.c = lfbVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gie) {
            gie gieVar = (gie) obj;
            if (this.a.equals(gieVar.a) && this.b.equals(gieVar.b) && this.c.equals(gieVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        nln nlnVar = this.a;
        int i = nlnVar.cO;
        if (i == 0) {
            i = nhh.a.b(nlnVar).b(nlnVar);
            nlnVar.cO = i;
        }
        return ((((i ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return "SodaInitParams{sodaCoreConfig=" + valueOf + ", sodaTransportFactory=" + valueOf2 + ", sodaDataProvider=" + valueOf3 + "}";
    }
}
