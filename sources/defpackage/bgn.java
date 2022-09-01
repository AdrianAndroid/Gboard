package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgn  reason: default package */
/* loaded from: classes.dex */
public final class bgn implements xx {
    private final bgm a;
    private final bgp b;
    private final xx c;

    public bgn(xx xxVar, bgm bgmVar, bgp bgpVar) {
        this.c = xxVar;
        this.a = bgmVar;
        this.b = bgpVar;
    }

    @Override // defpackage.xx
    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
        }
        if (a instanceof bgo) {
            ((bgo) a).f().a = false;
        }
        return a;
    }

    @Override // defpackage.xx
    public final boolean b(Object obj) {
        if (obj instanceof bgo) {
            ((bgo) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
