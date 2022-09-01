package defpackage;

/* compiled from: PG */
/* renamed from: cok  reason: default package */
/* loaded from: classes.dex */
public final class cok {
    public final int a;
    public final String b;

    public cok(int i, String str) {
        this.a = i;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static cok a(int i) {
        return new cok(i, "");
    }

    public static cok b(String str) {
        return new cok(-10004, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cok) {
            cok cokVar = (cok) obj;
            if (this.a == cokVar.a && this.b.equals(cokVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        return "CallbackInfo{eventCode=" + i + ", payload=" + str + "}";
    }

    public cok() {
    }
}
