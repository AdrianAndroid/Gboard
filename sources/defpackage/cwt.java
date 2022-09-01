package defpackage;

/* compiled from: PG */
/* renamed from: cwt  reason: default package */
/* loaded from: classes.dex */
public final class cwt {
    public static final cwt a;
    public final lfb b;
    public final lfb c;
    public final int d;

    static {
        ldu lduVar = ldu.a;
        a = a(1, lduVar, lduVar);
    }

    public cwt() {
    }

    public cwt(int i, lfb lfbVar, lfb lfbVar2) {
        this.d = i;
        this.b = lfbVar;
        this.c = lfbVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cwt a(int i, lfb lfbVar, lfb lfbVar2) {
        return new cwt(i, lfbVar, lfbVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwt) {
            cwt cwtVar = (cwt) obj;
            if (this.d == cwtVar.d && this.b.equals(cwtVar.b) && this.c.equals(cwtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        lxj.h(i);
        return ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String g = lxj.g(this.d);
        String obj = this.b.toString();
        String obj2 = this.c.toString();
        return "FeaturedStickerPacks{modelType=" + g + ", headerPackId=" + obj + ", browsePackIds=" + obj2 + "}";
    }
}
