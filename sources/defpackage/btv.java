package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: btv  reason: default package */
/* loaded from: classes.dex */
public final class btv extends did {
    private boolean b;
    private djd g;
    private int i;
    private final StringBuilder a = new StringBuilder();
    private int c = 26;
    private final List h = lre.F();

    @Override // defpackage.djf
    public final CharSequence a() {
        return this.a.toString();
    }

    @Override // defpackage.djf
    public final void c(dje djeVar) {
        if (this.i != 0) {
            if (this.c == 0) {
                this.a.append(" ");
                this.c = 26;
            }
            this.a.append(k(djeVar.f ? djeVar.a : djeVar.b));
            this.b = true;
            return;
        }
        this.h.add(djeVar.clone());
        if (this.g == null) {
            return;
        }
        int size = this.h.size();
        djd djdVar = this.g;
        if (size != djdVar.a) {
            return;
        }
        this.a.append(btu.a(j((String) djdVar.e), this.h));
        this.h.clear();
    }

    @Override // defpackage.djf
    public final void d() {
        this.a.setLength(0);
        this.b = false;
        this.c = 26;
    }

    @Override // defpackage.djf
    public final void g() {
        if (this.b) {
            this.a.append("'");
        }
    }

    @Override // defpackage.djf
    public final int m(int i, boolean z) {
        this.i = i;
        this.h.clear();
        this.g = null;
        if (i != 0) {
            return i != 1 ? 4 : 2;
        }
        return 3;
    }

    @Override // defpackage.djf
    public final void n(djc djcVar) {
        if (this.c == 0) {
            this.a.append(" ");
            this.c = 26;
        }
        this.a.append(i((String) djcVar.b));
        this.b = true;
    }

    @Override // defpackage.djf
    public final void o(djd djdVar) {
        if (this.c == 0 && djdVar.b == 0) {
            this.a.append(" ");
        }
        this.c = djdVar.c;
        this.g = djdVar;
    }
}
