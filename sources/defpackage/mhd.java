package defpackage;

/* compiled from: PG */
/* renamed from: mhd  reason: default package */
/* loaded from: classes.dex */
public final class mhd {
    public int a;
    public Object b;

    public mhd() {
    }

    public mhd(int i) {
        this.a = 0;
        this.b = new int[i];
    }

    public mhd(byte[] bArr) {
        this.a = 3;
    }

    public mhd(byte[] bArr, byte[] bArr2) {
    }

    public final kct a() {
        Object obj;
        int i = this.a;
        if (i == 0 || (obj = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" enablement");
            }
            if (this.b == null) {
                sb.append(" metricExtensionProvider");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new kct(i, (kcs) obj);
    }

    public final void b(boolean z) {
        this.a = true != z ? 2 : 3;
    }

    public final dzu c() {
        Object obj;
        int i = this.a;
        if (i == 0 || (obj = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" event");
            }
            if (this.b == null) {
                sb.append(" queries");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new dzh(i, (dat) obj);
    }

    public final void d(dat datVar) {
        if (datVar != null) {
            this.b = datVar;
            return;
        }
        throw new NullPointerException("Null queries");
    }
}
