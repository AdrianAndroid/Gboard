package defpackage;

/* compiled from: PG */
/* renamed from: jec  reason: default package */
/* loaded from: classes.dex */
public final class jec implements jeb {
    public int a;

    @Override // defpackage.jeb
    public final void a(int i, int i2) {
        int i3;
        if (i == 1) {
            i3 = 3;
        } else if (i2 == 0) {
            i3 = 0;
        } else if (i2 == i - 1) {
            this.a = 1;
            return;
        } else {
            i3 = 2;
        }
        this.a = i3;
    }

    public final String toString() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? "single" : "middle" : "last" : "first";
    }
}
