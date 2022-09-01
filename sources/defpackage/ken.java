package defpackage;

/* compiled from: PG */
/* renamed from: ken  reason: default package */
/* loaded from: classes.dex */
public final class ken implements kco {
    public final String a;
    private final int b;

    public ken() {
    }

    public ken(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }

    @Override // defpackage.kco
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return this.b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ken)) {
            return false;
        }
        ken kenVar = (ken) obj;
        int i = this.b;
        int i2 = kenVar.b;
        if (i == 0) {
            throw null;
        }
        return i2 == 1 && this.a.equals(kenVar.a);
    }

    public final int hashCode() {
        kcp.b(this.b);
        return this.a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        int i = this.b;
        String str = this.a;
        return "ApplicationExitConfigurations{enablement=" + kcp.a(i) + ", reportingProcessShortName=" + str + "}";
    }
}
