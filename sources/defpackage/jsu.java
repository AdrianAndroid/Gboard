package defpackage;

/* compiled from: PG */
/* renamed from: jsu  reason: default package */
/* loaded from: classes.dex */
public final class jsu {
    public String a;
    public String b;
    public llk c;
    public llp d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private jsq j;
    private byte k;

    public final jsv a() {
        jsq jsqVar;
        llk llkVar = this.c;
        if (llkVar != null) {
            this.d = llkVar.g();
        } else if (this.d == null) {
            this.d = llp.q();
        }
        if (this.k != 31 || (jsqVar = this.j) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.k & 1) == 0) {
                sb.append(" connectionConstraints");
            }
            if ((this.k & 2) == 0) {
                sb.append(" chargingConstraints");
            }
            if ((this.k & 4) == 0) {
                sb.append(" idleConstraints");
            }
            if ((this.k & 8) == 0) {
                sb.append(" batteryConstraints");
            }
            if ((this.k & 16) == 0) {
                sb.append(" schedulingFlags");
            }
            if (this.j == null) {
                sb.append(" extras");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jrj(this.a, this.b, this.e, this.f, this.g, this.h, this.i, this.d, jsqVar);
    }

    public final void b(int i) {
        this.h = i;
        this.k = (byte) (this.k | 8);
    }

    public final void c(int i) {
        this.f = i;
        this.k = (byte) (this.k | 2);
    }

    public final void d(int i) {
        this.e = i;
        this.k = (byte) (this.k | 1);
    }

    public final void e(jsq jsqVar) {
        if (jsqVar != null) {
            this.j = jsqVar;
            return;
        }
        throw new NullPointerException("Null extras");
    }

    public final void f(int i) {
        this.g = i;
        this.k = (byte) (this.k | 4);
    }

    public final void g(int i) {
        this.i = i;
        this.k = (byte) (this.k | 16);
    }
}
