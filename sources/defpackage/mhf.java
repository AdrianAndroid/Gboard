package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mhf  reason: default package */
/* loaded from: classes.dex */
public final class mhf implements Serializable {
    public static final mhf a = new mhf(new long[0]);
    private final long[] b;
    private final int c;

    private mhf(long[] jArr) {
        int length = jArr.length;
        this.b = jArr;
        this.c = length;
    }

    public static mhf b(long j) {
        return new mhf(new long[]{j});
    }

    public final long a(int i) {
        jdg.N(i, this.c);
        return this.b[i];
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final long[] d() {
        return Arrays.copyOfRange(this.b, 0, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mhf)) {
            return false;
        }
        mhf mhfVar = (mhf) obj;
        if (this.c != mhfVar.c) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            if (a(i) != mhfVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + mhq.d(this.b[i2]);
        }
        return i;
    }

    Object readResolve() {
        return c() ? a : this;
    }

    public final String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.c * 5);
        sb.append('[');
        sb.append(this.b[0]);
        for (int i = 1; i < this.c; i++) {
            sb.append(", ");
            sb.append(this.b[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        return this.c < this.b.length ? new mhf(d()) : this;
    }
}
