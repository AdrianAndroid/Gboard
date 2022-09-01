package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: exk  reason: default package */
/* loaded from: classes.dex */
final class exk {
    public final File a;
    public final File b;
    public final File c;

    public exk() {
    }

    public exk(File file, File file2, File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exk) {
            exk exkVar = (exk) obj;
            if (this.a.equals(exkVar.a) && this.b.equals(exkVar.b) && this.c.equals(exkVar.c)) {
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
        String obj3 = this.c.toString();
        return "EligibilityInfo{speechPack=" + obj + ", taskPlan=" + obj2 + ", personalizationDir=" + obj3 + "}";
    }
}
