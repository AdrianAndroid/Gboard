package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: cro  reason: default package */
/* loaded from: classes.dex */
final class cro {
    public final File a;
    public final Boolean b;

    public cro(File file, Boolean bool) {
        if (file != null) {
            this.a = file;
            this.b = bool;
            return;
        }
        throw new NullPointerException("Null file");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cro) {
            cro croVar = (cro) obj;
            if (this.a.equals(croVar.a) && this.b.equals(croVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        Boolean bool = this.b;
        return "FileWithFallback{file=" + obj + ", usedFallback=" + bool + "}";
    }

    public cro() {
    }
}
