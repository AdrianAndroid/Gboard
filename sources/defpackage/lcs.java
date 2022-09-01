package defpackage;

/* compiled from: PG */
/* renamed from: lcs  reason: default package */
/* loaded from: classes.dex */
public class lcs {
    public final qv c;
    public boolean d = false;
    public final lcs b = null;

    public lcs(qv qvVar) {
        this.c = qvVar;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("Already frozen");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (lcs lcsVar = this; lcsVar != null; lcsVar = null) {
            for (int i = 0; i < lcsVar.c.d; i++) {
                sb.append(this.c.f(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
