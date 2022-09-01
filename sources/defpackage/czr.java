package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: czr  reason: default package */
/* loaded from: classes.dex */
public final class czr {
    private String a;
    private llp b;
    private int c;
    private int d;
    private float e;
    private float f;
    private byte g;

    public czr() {
    }

    public czr(czs czsVar) {
        this.a = czsVar.a;
        this.b = czsVar.b;
        this.c = czsVar.c;
        this.d = czsVar.d;
        this.e = czsVar.e;
        this.f = czsVar.f;
        this.g = (byte) 15;
    }

    public final czs a() {
        String str;
        llp llpVar;
        if (this.g != 15 || (str = this.a) == null || (llpVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" animationFile");
            }
            if (this.b == null) {
                sb.append(" lines");
            }
            if ((this.g & 1) == 0) {
                sb.append(" width");
            }
            if ((this.g & 2) == 0) {
                sb.append(" height");
            }
            if ((this.g & 4) == 0) {
                sb.append(" startPercent");
            }
            if ((this.g & 8) == 0) {
                sb.append(" stopPercent");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        czs czsVar = new czs(str, llpVar, this.c, this.d, this.e, this.f);
        if (czsVar.b.isEmpty()) {
            throw new IllegalStateException("lines is empty");
        }
        return czsVar;
    }

    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null animationFile");
    }

    public final void c(int i) {
        this.d = i;
        this.g = (byte) (this.g | 2);
    }

    public final void d(List list) {
        this.b = llp.o(list);
    }

    public final void e(float f) {
        this.e = f;
        this.g = (byte) (this.g | 4);
    }

    public final void f(float f) {
        this.f = f;
        this.g = (byte) (this.g | 8);
    }

    public final void g(int i) {
        this.c = i;
        this.g = (byte) (this.g | 1);
    }
}
