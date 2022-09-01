package defpackage;

/* compiled from: PG */
/* renamed from: lpa  reason: default package */
/* loaded from: classes.dex */
abstract class lpa implements lpg {
    final Object a;
    final int b;
    final lpg c;

    public lpa(Object obj, int i, lpg lpgVar) {
        this.a = obj;
        this.b = i;
        this.c = lpgVar;
    }

    @Override // defpackage.lpg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.lpg
    public final lpg b() {
        return this.c;
    }

    @Override // defpackage.lpg
    public final Object c() {
        return this.a;
    }
}
