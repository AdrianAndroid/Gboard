package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jgr  reason: default package */
/* loaded from: classes.dex */
public final class jgr extends jez {
    final /* synthetic */ jgt a;

    public jgr(jgt jgtVar) {
        this.a = jgtVar;
    }

    @Override // defpackage.jez
    public final void k(jgq jgqVar) {
        if (((Boolean) this.a.b.get(jgqVar)).booleanValue()) {
            return;
        }
        this.a.b.put(jgqVar, true);
        jgt jgtVar = this.a;
        jgtVar.c++;
        jgtVar.a();
    }
}
