package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ope  reason: default package */
/* loaded from: classes2.dex */
public final class ope {
    public static final ope a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    String k;
    private final int l;
    private final boolean m;
    private final boolean n;

    static {
        opd opdVar = new opd();
        opdVar.a = true;
        a = opdVar.a();
        opd opdVar2 = new opd();
        opdVar2.d = true;
        opdVar2.b(Integer.MAX_VALUE, TimeUnit.SECONDS);
        opdVar2.a();
    }

    public ope(opd opdVar) {
        this.b = opdVar.a;
        this.c = false;
        this.d = opdVar.b;
        this.l = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = opdVar.c;
        this.i = -1;
        this.j = opdVar.d;
        this.m = false;
        this.n = false;
    }

    private ope(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.l = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.m = z7;
        this.n = z8;
        this.k = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ope a(defpackage.opx r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ope.a(opx):ope");
    }

    public final String toString() {
        String str = this.k;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b) {
                sb.append("no-cache, ");
            }
            if (this.c) {
                sb.append("no-store, ");
            }
            if (this.d != -1) {
                sb.append("max-age=");
                sb.append(this.d);
                sb.append(", ");
            }
            if (this.l != -1) {
                sb.append("s-maxage=");
                sb.append(this.l);
                sb.append(", ");
            }
            if (this.e) {
                sb.append("private, ");
            }
            if (this.f) {
                sb.append("public, ");
            }
            if (this.g) {
                sb.append("must-revalidate, ");
            }
            if (this.h != -1) {
                sb.append("max-stale=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.i != -1) {
                sb.append("min-fresh=");
                sb.append(this.i);
                sb.append(", ");
            }
            if (this.j) {
                sb.append("only-if-cached, ");
            }
            if (this.m) {
                sb.append("no-transform, ");
            }
            if (this.n) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.k = str;
        }
        return str;
    }
}
