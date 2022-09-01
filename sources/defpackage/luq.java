package defpackage;

/* compiled from: PG */
/* renamed from: luq  reason: default package */
/* loaded from: classes.dex */
public final class luq extends lur {
    public static final luq a = new luq();

    private luq() {
    }

    @Override // defpackage.lur
    public final int b() {
        return 0;
    }

    @Override // defpackage.lur
    public final lty c(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.lur
    public final Object d(lty ltyVar) {
        return null;
    }

    @Override // defpackage.lur
    public final Object e(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }
}
