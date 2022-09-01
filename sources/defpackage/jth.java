package defpackage;

/* compiled from: PG */
/* renamed from: jth  reason: default package */
/* loaded from: classes.dex */
public final class jth {
    public boolean a;
    public String b;
    public byte c;
    private llk d;
    private llp e;
    private llk f;
    private llp g;
    private int h;
    private boolean i;
    private boolean j;

    public final jtm a() {
        llk llkVar = this.d;
        if (llkVar != null) {
            this.e = llkVar.g();
        } else if (this.e == null) {
            this.e = llp.q();
        }
        llk llkVar2 = this.f;
        if (llkVar2 != null) {
            this.g = llkVar2.g();
        } else if (this.g == null) {
            this.g = llp.q();
        }
        if (this.c != Byte.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" minWidth");
            }
            if ((this.c & 2) == 0) {
                sb.append(" maxWidth");
            }
            if ((this.c & 4) == 0) {
                sb.append(" showColumnNames");
            }
            if ((this.c & 8) == 0) {
                sb.append(" useEllipsis");
            }
            if ((this.c & 16) == 0) {
                sb.append(" isMultiline");
            }
            if ((this.c & 32) == 0) {
                sb.append(" headerBorder");
            }
            if ((this.c & 64) == 0) {
                sb.append(" hideEmptyColumns");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jrm(this.e, this.g, this.h, this.a, this.b, this.i, this.j);
    }

    public final void b(jtj jtjVar) {
        if (this.d == null) {
            this.d = llp.e();
        }
        this.d.h(jtjVar);
    }

    public final void c(Object... objArr) {
        if (this.f == null) {
            this.f = llp.e();
        }
        this.f.h(lre.D(objArr));
    }

    public final void d(boolean z) {
        this.j = z;
        this.c = (byte) (this.c | 64);
    }

    public final void e(boolean z) {
        this.i = z;
        this.c = (byte) (this.c | 16);
    }

    public final void f(int i) {
        this.h = i;
        this.c = (byte) (this.c | 2);
    }
}
