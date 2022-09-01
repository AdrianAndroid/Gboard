package defpackage;

/* compiled from: PG */
/* renamed from: dsw  reason: default package */
/* loaded from: classes.dex */
public final class dsw {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private llw g;
    private byte h;

    public final dsx a() {
        if (this.h != 63 || this.g == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.h & 1) == 0) {
                sb.append(" connected");
            }
            if ((this.h & 2) == 0) {
                sb.append(" keyboardVisible");
            }
            if ((this.h & 4) == 0) {
                sb.append(" dictationEligible");
            }
            if ((this.h & 8) == 0) {
                sb.append(" currentFieldEligibilityUpToDate");
            }
            if ((this.h & 16) == 0) {
                sb.append(" dictating");
            }
            if ((this.h & 32) == 0) {
                sb.append(" keyboardTypeSupported");
            }
            if (this.g == null) {
                sb.append(" eligibilityByLanguageTag");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new dsx(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b(boolean z) {
        this.a = z;
        this.h = (byte) (this.h | 1);
    }

    public final void c(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 8);
    }

    public final void d(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 16);
    }

    public final void e(boolean z) {
        this.c = z;
        this.h = (byte) (this.h | 4);
    }

    public final void f(llw llwVar) {
        if (llwVar != null) {
            this.g = llwVar;
            return;
        }
        throw new NullPointerException("Null eligibilityByLanguageTag");
    }

    public final void g(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 32);
    }

    public final void h(boolean z) {
        this.b = z;
        this.h = (byte) (this.h | 2);
    }
}
