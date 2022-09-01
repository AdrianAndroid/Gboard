package defpackage;

/* compiled from: PG */
/* renamed from: agy  reason: default package */
/* loaded from: classes.dex */
public final class agy extends agm {
    public static final agn a = new agx(0);
    public final qw b = new qw();
    public boolean c = false;

    public final void a() {
        this.c = false;
    }

    public final agv b() {
        return (agv) this.b.d(54321);
    }

    @Override // defpackage.agm
    public final void c() {
        int b = this.b.b();
        for (int i = 0; i < b; i++) {
            ((agv) this.b.e(i)).k();
        }
        qw qwVar = this.b;
        int i2 = qwVar.e;
        Object[] objArr = qwVar.d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        qwVar.e = 0;
        qwVar.b = false;
    }
}
