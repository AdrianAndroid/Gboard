package defpackage;

/* compiled from: PG */
/* renamed from: hef  reason: default package */
/* loaded from: classes.dex */
public final class hef implements AutoCloseable {
    public static final hef a = a(hee.a, kcu.I(), hjg.a(mjl.a, null, afp.STARTED, jam.b, llp.e(), llp.e(), llp.e()));
    public final hee b;
    private final mko c;
    private final hix d;

    public hef(hee heeVar, mko mkoVar, hix hixVar) {
        if (heeVar != null) {
            this.b = heeVar;
            this.c = mkoVar;
            this.d = hixVar;
            return;
        }
        throw new NullPointerException("Null drawParams");
    }

    public static hef a(hee heeVar, mko mkoVar, hix hixVar) {
        hixVar.c(mkoVar);
        return new hef(heeVar, mkoVar, hixVar);
    }

    public final boolean b() {
        return hji.e(this.c);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.cancel(true);
        this.d.close();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hef) {
            hef hefVar = (hef) obj;
            if (this.b.equals(hefVar.b) && this.c.equals(hefVar.c) && this.d.equals(hefVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String obj2 = this.c.toString();
        String obj3 = this.d.toString();
        return "DrawRequest{drawParams=" + obj + ", future=" + obj2 + ", callback=" + obj3 + "}";
    }

    public hef() {
    }
}
