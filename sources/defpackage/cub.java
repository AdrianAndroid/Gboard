package defpackage;

import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cub  reason: default package */
/* loaded from: classes.dex */
final class cub {
    public final File a;
    public final int b;
    public final Locale c;

    public cub(File file, int i, Locale locale) {
        this.a = file;
        this.b = i;
        if (locale != null) {
            this.c = locale;
            return;
        }
        throw new NullPointerException("Null locale");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cub) {
            cub cubVar = (cub) obj;
            if (this.a.equals(cubVar.a) && this.b == cubVar.b && this.c.equals(cubVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String obj = this.c.toString();
        return "VersionedPackFile{packFile=" + valueOf + ", manifestVersion=" + i + ", locale=" + obj + "}";
    }

    public cub() {
    }
}
