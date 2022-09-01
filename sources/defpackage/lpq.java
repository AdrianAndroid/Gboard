package defpackage;

/* compiled from: PG */
/* renamed from: lpq  reason: default package */
/* loaded from: classes.dex */
final class lpq extends lpa implements lpy {
    public volatile lpz d = lqc.a;

    public lpq(Object obj, int i, lpq lpqVar) {
        super(obj, i, lpqVar);
    }

    @Override // defpackage.lpg
    public final Object d() {
        return this.d.get();
    }

    @Override // defpackage.lpy
    public final lpz e() {
        return this.d;
    }
}
