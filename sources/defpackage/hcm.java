package defpackage;

/* compiled from: PG */
/* renamed from: hcm  reason: default package */
/* loaded from: classes.dex */
public final class hcm {
    public final int a;

    public hcm() {
    }

    public hcm(int i) {
        this.a = i;
    }

    public static ozd a() {
        ozd ozdVar = new ozd();
        ozdVar.a = 1;
        return ozdVar;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcm)) {
            return false;
        }
        int i = this.a;
        if (i != ((hcm) obj).a) {
            z = false;
        }
        if (i == 0) {
            throw null;
        }
        return z;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i ^ 1000003;
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? "null" : "VERTICAL" : "HORIZONTAL";
        return "EmojiPickerHeaderOptions{layoutOrientation=" + str + "}";
    }
}
