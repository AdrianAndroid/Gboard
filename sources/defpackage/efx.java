package defpackage;

/* compiled from: PG */
/* renamed from: efx  reason: default package */
/* loaded from: classes.dex */
public abstract class efx {
    public abstract cxc a();

    public abstract int b();

    public abstract cxc c();

    public abstract String d();

    public final cxc e() {
        int b = b() - 1;
        if (b != 0) {
            if (b == 1) {
                return c();
            }
            throw new IllegalStateException("Bitmoji Category Item should be either bitmoji category or contextual category.");
        }
        return a();
    }
}
