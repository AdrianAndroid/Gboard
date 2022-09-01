package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atv  reason: default package */
/* loaded from: classes.dex */
public final class atv implements bcz {
    final /* synthetic */ atw a;
    private final bdq b;

    public atv(atw atwVar, bdq bdqVar) {
        this.a = atwVar;
        this.b = bdqVar;
    }

    @Override // defpackage.bcz
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                bdq bdqVar = this.b;
                for (bep bepVar : bgj.h(bdqVar.a)) {
                    if (!bepVar.l() && !bepVar.k()) {
                        bepVar.c();
                        if (!bdqVar.c) {
                            bepVar.b();
                        } else {
                            bdqVar.b.add(bepVar);
                        }
                    }
                }
            }
        }
    }
}
