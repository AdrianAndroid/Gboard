package defpackage;

/* compiled from: PG */
/* renamed from: gfk  reason: default package */
/* loaded from: classes.dex */
public final class gfk implements foi {
    public final gfh a;

    public gfk(gfh gfhVar) {
        this.a = gfhVar;
    }

    public final String toString() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.a.a != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
