package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gmn  reason: default package */
/* loaded from: classes.dex */
final class gmn {
    static final gmn a = new gmn(-1, -1);
    static final gmn b = new gmn(-2, -2);
    public final int c;
    public final int d;

    public gmn(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmn)) {
            return false;
        }
        gmn gmnVar = (gmn) obj;
        return this.c == gmnVar.c && this.d == gmnVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
