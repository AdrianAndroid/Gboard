package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzn  reason: default package */
/* loaded from: classes.dex */
public final class bzn implements miy {
    final /* synthetic */ String a;
    final /* synthetic */ jsq b;
    final /* synthetic */ bzr c;

    public bzn(bzr bzrVar, String str, jsq jsqVar) {
        this.c = bzrVar;
        this.a = str;
        this.b = jsqVar;
    }

    @Override // defpackage.miy
    public final /* bridge */ /* synthetic */ mko a(Object obj) {
        Void r3 = (Void) obj;
        mko f = ((jqx) this.c.k.get()).f(this.a, this.b);
        this.c.q(f, this.a);
        return f;
    }
}
