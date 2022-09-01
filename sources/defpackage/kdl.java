package defpackage;

/* compiled from: PG */
/* renamed from: kdl  reason: default package */
/* loaded from: classes.dex */
public final class kdl {
    public String a;
    public onm b;
    public String c;
    public Long d;
    public kby e;
    private boolean f;
    private oos g;
    private boolean h;
    private byte i;

    public final kdm a() {
        oos oosVar;
        if (this.i != 3 || (oosVar = this.g) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.i & 1) == 0) {
                sb.append(" isEventNameConstant");
            }
            if (this.g == null) {
                sb.append(" metric");
            }
            if ((this.i & 2) == 0) {
                sb.append(" isUnsampled");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new kdm(this.a, this.f, oosVar, this.b, this.c, this.d, this.h, this.e);
    }

    public final void b(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 1);
    }

    public final void c(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 2);
    }

    public final void d(oos oosVar) {
        if (oosVar != null) {
            this.g = oosVar;
            return;
        }
        throw new NullPointerException("Null metric");
    }
}
