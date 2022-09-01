package defpackage;

/* compiled from: PG */
/* renamed from: bax  reason: default package */
/* loaded from: classes.dex */
final class bax extends bbb {
    @Override // defpackage.bbb
    public final float a(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, a.a(i, i2, i3, i4));
    }

    @Override // defpackage.bbb
    public final int b(int i, int i2, int i3, int i4) {
        if (a(i, i2, i3, i4) == 1.0f) {
            return 2;
        }
        return a.b(i, i2, i3, i4);
    }
}
