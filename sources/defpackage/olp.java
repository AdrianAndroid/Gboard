package defpackage;

/* compiled from: PG */
/* renamed from: olp  reason: default package */
/* loaded from: classes2.dex */
public abstract class olp extends ole implements ome {
    public olp() {
        Object obj = ole.a;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olp) {
            olp olpVar = (olp) obj;
            return e().equals(olpVar.e()) && this.c.equals(olpVar.c) && this.d.equals(olpVar.d) && oll.g(this.b, olpVar.b);
        } else if (!(obj instanceof ome)) {
            return false;
        } else {
            return obj.equals(d());
        }
    }

    public final int hashCode() {
        return (((e().hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ome i() {
        olx d = d();
        if (d != this) {
            return (ome) d;
        }
        throw new oke();
    }

    public final String toString() {
        olx d = d();
        if (d != this) {
            return d.toString();
        }
        return "property " + this.c + " (Kotlin reflection is not available)";
    }

    public olp(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2);
    }
}
