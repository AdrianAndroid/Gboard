package defpackage;

/* compiled from: PG */
/* renamed from: dvi  reason: default package */
/* loaded from: classes.dex */
public final class dvi {
    public int a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;
    private byte g;

    public dvi() {
    }

    public dvi(dvj dvjVar) {
        this.b = dvjVar.b;
        this.c = dvjVar.c;
        this.d = dvjVar.d;
        this.e = dvjVar.e;
        this.f = dvjVar.f;
        this.a = dvjVar.g;
        this.g = (byte) 3;
    }

    public final dvj a() {
        if (this.g != 3 || this.b == null || this.c == null || this.d == null || this.a == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" textBefore");
            }
            if (this.c == null) {
                sb.append(" textToReplace");
            }
            if (this.d == null) {
                sb.append(" textAfter");
            }
            if ((this.g & 1) == 0) {
                sb.append(" replaceComposing");
            }
            if ((this.g & 2) == 0) {
                sb.append(" acceptsUndo");
            }
            if (this.a == 0) {
                sb.append(" formattingType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new dvj(this.b, this.c, this.d, this.e, this.f, this.a);
    }

    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 2);
    }

    public final void c(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 1);
    }

    public final void d(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null textAfter");
    }

    public final void e(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null textBefore");
    }

    public final void f(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null textToReplace");
    }
}
