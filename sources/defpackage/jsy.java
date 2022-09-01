package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: jsy  reason: default package */
/* loaded from: classes.dex */
public final class jsy {
    public byte a;
    public Object b;
    private boolean c;

    public final jsz a() {
        Object obj;
        if (this.a != 1 || (obj = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" constraints");
            }
            if (this.a == 0) {
                sb.append(" runInForeground");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jrl((jsx) obj, this.c);
    }

    public final void b(boolean z) {
        this.c = z;
        this.a = (byte) 1;
    }

    public final jjh c() {
        if (this.b == null) {
            this.b = lrr.a;
        }
        if (this.a != 1) {
            throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
        }
        return new jjh(this.c, (lmz) this.b);
    }

    public final void d(boolean z) {
        this.c = z;
        this.a = (byte) 1;
    }

    public final void e(Set set) {
        this.b = lmz.p(set);
    }

    public final jbu f() {
        if (this.a != 3 || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.a & 1) == 0) {
                sb.append(" noCapitalization");
            }
            if ((this.a & 2) == 0) {
                sb.append(" noPunctuation");
            }
            if (this.b == null) {
                sb.append(" supportedKeycodes");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jbu(this.c, (lmz) this.b);
    }

    public final void g(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 2);
    }

    public final void h(lmz lmzVar) {
        if (lmzVar != null) {
            this.b = lmzVar;
            return;
        }
        throw new NullPointerException("Null supportedKeycodes");
    }
}
