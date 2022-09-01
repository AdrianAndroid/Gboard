package defpackage;

/* compiled from: PG */
/* renamed from: ngj  reason: default package */
/* loaded from: classes2.dex */
public class ngj {
    protected volatile ngz a;
    public volatile nem b;

    static {
        nfb.a();
    }

    public final nem a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = nem.b;
            } else {
                this.b = this.a.n();
            }
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngj)) {
            return false;
        }
        ngj ngjVar = (ngj) obj;
        ngz ngzVar = this.a;
        ngz ngzVar2 = ngjVar.a;
        if (ngzVar == null && ngzVar2 == null) {
            return a().equals(ngjVar.a());
        }
        if (ngzVar != null && ngzVar2 != null) {
            return ngzVar.equals(ngzVar2);
        }
        if (ngzVar != null) {
            return ngzVar.equals(ngjVar.b(ngzVar.cB()));
        }
        return b(ngzVar2.cB()).equals(ngzVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final ngz b(ngz ngzVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = ngzVar;
                        this.b = nem.b;
                    } catch (ngd unused) {
                        this.a = ngzVar;
                        this.b = nem.b;
                    }
                }
            }
        }
        return this.a;
    }
}
