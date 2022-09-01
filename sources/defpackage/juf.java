package defpackage;

/* compiled from: PG */
/* renamed from: juf  reason: default package */
/* loaded from: classes.dex */
public final class juf {
    private juc a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte g;

    public final jug a() {
        juc jucVar;
        if (this.g != 31 || (jucVar = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" packManifest");
            }
            if ((this.g & 1) == 0) {
                sb.append(" connectionConstraints");
            }
            if ((this.g & 2) == 0) {
                sb.append(" chargingConstraints");
            }
            if ((this.g & 4) == 0) {
                sb.append(" idleConstraints");
            }
            if ((this.g & 8) == 0) {
                sb.append(" batteryConstraints");
            }
            if ((this.g & 16) == 0) {
                sb.append(" schedulingFlags");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jtu(jucVar, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(int i) {
        this.e = i;
        this.g = (byte) (this.g | 8);
    }

    public final void c(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
    }

    public final void d(int i) {
        this.b = i;
        this.g = (byte) (this.g | 1);
    }

    public final void e(int i) {
        this.d = i;
        this.g = (byte) (this.g | 4);
    }

    public final void f(juc jucVar) {
        if (jucVar != null) {
            this.a = jucVar;
            return;
        }
        throw new NullPointerException("Null packManifest");
    }

    public final void g(int i) {
        this.f = i;
        this.g = (byte) (this.g | 16);
    }
}
