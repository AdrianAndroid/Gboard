package defpackage;

/* compiled from: PG */
/* renamed from: fps  reason: default package */
/* loaded from: classes.dex */
public final class fps {
    private final Object a;
    private final String b;

    public fps(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fps)) {
            return false;
        }
        fps fpsVar = (fps) obj;
        return this.a == fpsVar.a && this.b.equals(fpsVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
