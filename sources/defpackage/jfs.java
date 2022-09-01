package defpackage;

/* compiled from: PG */
/* renamed from: jfs  reason: default package */
/* loaded from: classes.dex */
final class jfs extends irm {
    final /* synthetic */ jft a;

    public jfs(jft jftVar) {
        this.a = jftVar;
    }

    @Override // defpackage.irm
    public final void d(String str) {
        String l = hyq.l(str);
        if (!l.equals(this.a.a)) {
            jft jftVar = this.a;
            jftVar.a = l;
            jftVar.i();
        }
    }
}
