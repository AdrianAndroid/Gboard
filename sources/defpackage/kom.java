package defpackage;

/* compiled from: PG */
/* renamed from: kom  reason: default package */
/* loaded from: classes.dex */
public final class kom {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public final jvn a() {
        boolean z = true;
        boolean z2 = this.b != null;
        if (this.d == null) {
            z = false;
        }
        jdg.G(z2 ^ z, "One of metadata or metadata table must set, but not both at the same time");
        return new jvn(this, null);
    }
}
