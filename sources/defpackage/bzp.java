package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzp  reason: default package */
/* loaded from: classes.dex */
public final class bzp implements miy {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ bzr c;

    public bzp(bzr bzrVar, String str, int i) {
        this.c = bzrVar;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.miy
    public final /* bridge */ /* synthetic */ mko a(Object obj) {
        Void r4 = (Void) obj;
        jqx jqxVar = (jqx) this.c.k.get();
        String str = this.a;
        int i = this.b;
        jqxVar.j();
        return kcu.K(jqxVar.a(str, i, "getSuperpackManifest"));
    }
}
