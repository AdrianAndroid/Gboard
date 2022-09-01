package defpackage;

/* compiled from: PG */
/* renamed from: com  reason: default package */
/* loaded from: classes.dex */
public final class com {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public com() {
    }

    public com(int i, int i2, String str, int i3, int i4) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = i3;
        this.e = i4;
    }

    public static czp a() {
        czp czpVar = new czp();
        czpVar.b = 2;
        czpVar.h(0);
        czpVar.g("");
        return czpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com) {
            com comVar = (com) obj;
            if (this.a == comVar.a) {
                int i = this.d;
                int i2 = comVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(comVar.b) && this.c == comVar.c) {
                    int i3 = this.e;
                    int i4 = comVar.e;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        int i2 = this.d;
        if (i2 != 0) {
            int hashCode = (((((i ^ i2) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
            int i3 = this.e;
            if (i3 == 0) {
                throw null;
            }
            return hashCode ^ i3;
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.d;
        String str = "null";
        String str2 = i2 != 1 ? i2 != 2 ? str : "SELECTABLE_UNDERLINE" : "SEARCH_BOX_ICON";
        String str3 = this.b;
        int i3 = this.c;
        int i4 = this.e;
        if (i4 == 1) {
            str = "SMALL";
        } else if (i4 == 2) {
            str = "MEDIUM";
        } else if (i4 == 3) {
            str = "LARGE";
        }
        return "ImageResourceInfo{drawableId=" + i + ", displayType=" + str2 + ", contentDescription=" + str3 + ", contentDescriptionId=" + i3 + ", size=" + str + "}";
    }
}
