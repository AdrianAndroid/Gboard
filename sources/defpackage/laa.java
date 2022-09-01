package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: laa  reason: default package */
/* loaded from: classes.dex */
final class laa {
    public final File a;
    public final String b;

    public laa(File file, String str) {
        if (file != null) {
            this.a = file;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof laa) {
            laa laaVar = (laa) obj;
            if (this.a.equals(laaVar.a) && this.b.equals(laaVar.b)) {
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
        String str = this.b;
        return "SplitFileInfo{splitFile=" + obj + ", splitId=" + str + "}";
    }

    public laa() {
    }
}
