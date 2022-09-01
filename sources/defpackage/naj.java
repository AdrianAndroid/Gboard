package defpackage;

/* compiled from: PG */
/* renamed from: naj  reason: default package */
/* loaded from: classes2.dex */
public final class naj implements nap, nao {
    private final String a;

    public naj(String str) {
        oll.e(str, "name");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof naj) && oll.g(this.a, ((naj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "CaptureVariable(name=" + str + ")";
    }
}
