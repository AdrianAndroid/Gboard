package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mhe  reason: default package */
/* loaded from: classes.dex */
public final class mhe implements Serializable {
    public static final mhe a = new mhe(new int[0]);
    public final int b;
    private final int[] c;

    private mhe(int[] iArr) {
        this(iArr, iArr.length);
    }

    public mhe(int[] iArr, int i) {
        this.c = iArr;
        this.b = i;
    }

    public static mhd b(int i) {
        jdg.y(i >= 0, "Invalid initialCapacity: %s", i);
        return new mhd(i);
    }

    public final int a(int i) {
        jdg.N(i, this.b);
        return this.c[i];
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mhe)) {
            return false;
        }
        mhe mheVar = (mhe) obj;
        if (this.b != mheVar.b) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            if (a(i) != mheVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.c[i2];
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
        StringBuilder sb = new StringBuilder(this.b * 5);
        sb.append('[');
        sb.append(this.c[0]);
        for (int i = 1; i < this.b; i++) {
            sb.append(", ");
            sb.append(this.c[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int i = this.b;
        int[] iArr = this.c;
        return i < iArr.length ? new mhe(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
