package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: bgu  reason: default package */
/* loaded from: classes.dex */
public final class bgu {
    public List a = null;
    public int b = 0;

    public final int a() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final bgv b(int i) {
        return (bgv) this.a.get(i);
    }

    public final void c() {
        this.b += 100;
    }

    public final boolean d() {
        List list = this.a;
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (bgv bgvVar : this.a) {
            sb.append(bgvVar);
            sb.append(' ');
        }
        sb.append('(');
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
