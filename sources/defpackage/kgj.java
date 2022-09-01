package defpackage;

/* compiled from: PG */
/* renamed from: kgj  reason: default package */
/* loaded from: classes.dex */
public final class kgj implements kco {
    private final lfb a;
    private final lfb b;
    private final int c;

    public kgj() {
    }

    public kgj(lfb lfbVar, lfb lfbVar2) {
        this.c = 1;
        this.a = lfbVar;
        this.b = lfbVar2;
    }

    @Override // defpackage.kco
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgj)) {
            return false;
        }
        kgj kgjVar = (kgj) obj;
        int i = this.c;
        int i2 = kgjVar.c;
        if (i == 0) {
            throw null;
        }
        return i2 == 1 && this.a.equals(kgjVar.a) && this.b.equals(kgjVar.b);
    }

    public final int hashCode() {
        kcp.b(this.c);
        return 395873938;
    }

    public final String toString() {
        int i = this.c;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return "StartupConfigurations{enablement=" + kcp.a(i) + ", metricExtensionProvider=" + valueOf + ", customTimestampProvider=" + valueOf2 + "}";
    }
}
