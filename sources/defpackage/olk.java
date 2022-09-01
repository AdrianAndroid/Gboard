package defpackage;

/* compiled from: PG */
/* renamed from: olk  reason: default package */
/* loaded from: classes2.dex */
public class olk extends ole implements olj, oma {
    private final int e = 0;
    private final int f = 0;

    public olk(Object obj, Class cls) {
        super(obj, cls, "onGoneAnimationFinished", "onGoneAnimationFinished()V");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olk) {
            olk olkVar = (olk) obj;
            if (this.c.equals(olkVar.c) && this.d.equals(olkVar.d)) {
                int i = olkVar.f;
                int i2 = olkVar.e;
                if (oll.g(this.b, olkVar.b) && oll.g(e(), olkVar.e())) {
                    return true;
                }
            }
            return false;
        } else if (!(obj instanceof oma)) {
            return false;
        } else {
            return obj.equals(d());
        }
    }

    @Override // defpackage.olj
    public final int f() {
        return 0;
    }

    @Override // defpackage.ole
    protected final void h() {
        int i = olr.a;
    }

    public final int hashCode() {
        e();
        return (((e().hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        olx d = d();
        if (d != this) {
            return d.toString();
        }
        if ("<init>".equals(this.c)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.c + " (Kotlin reflection is not available)";
    }
}
