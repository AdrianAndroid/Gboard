package defpackage;

/* compiled from: PG */
/* renamed from: cuq  reason: default package */
/* loaded from: classes.dex */
public final class cuq {
    public final Object a;
    public lfb b = ldu.a;

    public cuq(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cuq) && this.a.equals(((cuq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
