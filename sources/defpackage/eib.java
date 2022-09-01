package defpackage;

/* compiled from: PG */
/* renamed from: eib  reason: default package */
/* loaded from: classes.dex */
public abstract class eib {
    public abstract cxc a();

    public abstract int b();

    public abstract cxc c();

    public abstract cxc d();

    public abstract cxc e();

    public final cxc f() {
        int b = b() - 1;
        if (b != 0) {
            if (b == 1) {
                return e();
            }
            return b != 2 ? c() : d();
        }
        return a();
    }
}
