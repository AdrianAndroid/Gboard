package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dwt  reason: default package */
/* loaded from: classes.dex */
public final class dwt {
    public final String a;
    public final boolean b;
    public final Runnable c;
    public final int d;

    public dwt() {
    }

    public dwt(String str, boolean z, int i, Runnable runnable) {
        this.a = str;
        this.b = z;
        this.d = i;
        this.c = runnable;
    }

    public static dws a() {
        return new dws();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwt) {
            dwt dwtVar = (dwt) obj;
            if (this.a.equals(dwtVar.a) && this.b == dwtVar.b) {
                int i = this.d;
                int i2 = dwtVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(dwtVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        int i = this.d;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        int i = this.d;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DOWNLOAD_IN_PROGRESS" : "DOWNLOAD_REQUIRED" : "AVAILABLE" : "NOT_AVAILABLE";
        String valueOf = String.valueOf(this.c);
        return "LanguagePickerEntry{title=" + str + ", isSelected=" + z + ", status=" + str2 + ", onSelected=" + valueOf + "}";
    }
}
