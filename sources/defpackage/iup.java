package defpackage;

import com.google.android.libraries.inputmethod.trainingcache.impls.nebulaematerializer.NebulaeMaterializerV2;

/* compiled from: PG */
/* renamed from: iup  reason: default package */
/* loaded from: classes.dex */
public final class iup {
    public static final iup a = a(0, ((Long) NebulaeMaterializerV2.a.c()).intValue(), false);
    public final int b;
    public final int c;
    public final boolean d;

    public iup() {
    }

    public iup(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static iup a(int i, int i2, boolean z) {
        return new iup(i, i2, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iup) {
            iup iupVar = (iup) obj;
            if (this.b == iupVar.b && this.c == iupVar.c && this.d == iupVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        return "ParsedCriteriaMetadata{exampleCountLimit=" + i + ", batchSize=" + i2 + ", shuffleBatch=" + z + "}";
    }
}
