package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: exu  reason: default package */
/* loaded from: classes.dex */
public final class exu {
    public final File a;
    public final File b;
    public final String c;

    public exu() {
    }

    public exu(File file, File file2, String str) {
        this.a = file;
        this.b = file2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exu) {
            exu exuVar = (exu) obj;
            if (this.a.equals(exuVar.a) && this.b.equals(exuVar.b) && this.c.equals(exuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        String str = this.c;
        return "EligibilityInfo{speechPack=" + obj + ", taskPlan=" + obj2 + ", suffix=" + str + "}";
    }
}
