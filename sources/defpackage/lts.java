package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: lts  reason: default package */
/* loaded from: classes.dex */
final class lts {
    public final int a;
    public final TimeUnit b;
    public int c = -1;

    public lts(int i, TimeUnit timeUnit) {
        this.a = i;
        lxj.b(timeUnit, "time unit");
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lts) {
            lts ltsVar = (lts) obj;
            if (this.a == ltsVar.a && this.b == ltsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 37) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        sb.append(this.b);
        if (this.c > 0) {
            sb.append(" [skipped: ");
            sb.append(this.c);
            sb.append(']');
        }
        return sb.toString();
    }
}
