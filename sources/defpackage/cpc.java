package defpackage;

/* compiled from: PG */
/* renamed from: cpc  reason: default package */
/* loaded from: classes.dex */
public final class cpc {
    public byte a;
    public int b;
    private boolean c;
    private boolean d;
    private int e;

    public final cpd a() {
        int i;
        if (this.a != 15 || (i = this.b) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                sb.append(" viewState");
            }
            if ((this.a & 1) == 0) {
                sb.append(" lastElementHalfVisible");
            }
            if ((this.a & 2) == 0) {
                sb.append(" scrollableStartElement");
            }
            if ((this.a & 4) == 0) {
                sb.append(" scrollToInitialMiddleIndex");
            }
            if ((this.a & 8) == 0) {
                sb.append(" maxIndexForOpenSearchBox");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cpd(i, this.c, this.d, this.e);
    }

    public final void b(int i) {
        this.e = i;
        this.a = (byte) (this.a | 8);
    }

    public final void c(boolean z) {
        this.d = z;
        this.a = (byte) (this.a | 4);
    }

    public final void d(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 2);
    }
}
