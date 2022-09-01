package defpackage;

/* compiled from: PG */
/* renamed from: bzm  reason: default package */
/* loaded from: classes.dex */
public final class bzm implements miy {
    public final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ jsv c;
    public final /* synthetic */ bzr d;

    public bzm(bzr bzrVar, String str, int i, jsv jsvVar) {
        this.d = bzrVar;
        this.a = str;
        this.b = i;
        this.c = jsvVar;
    }

    @Override // defpackage.miy
    public final /* bridge */ /* synthetic */ mko a(Object obj) {
        Void r3 = (Void) obj;
        mko e = ((jqx) this.d.k.get()).e(jtr.c(this.a, this.b), this.c);
        kcu.U(e, new buo(this, 3), this.d.i);
        return e;
    }
}
