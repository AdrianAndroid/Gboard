package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gjb  reason: default package */
/* loaded from: classes.dex */
public final class gjb {
    public final int a;
    public final int b;

    public gjb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gjb)) {
            return false;
        }
        gjb gjbVar = (gjb) obj;
        return this.a == gjbVar.a && this.b == gjbVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a, -2032180703, this.b});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return "java_hash=" + i + ",feature_hash=-2032180703,res=" + i2;
    }
}
