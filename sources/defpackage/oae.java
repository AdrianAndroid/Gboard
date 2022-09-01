package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oae  reason: default package */
/* loaded from: classes2.dex */
public final class oae implements nyx {
    final nvu a;
    private final nyv b;

    public oae(nvu nvuVar, nyv nyvVar) {
        jdg.w(!nvuVar.k(), "error must not be OK");
        this.a = nvuVar;
        this.b = nyvVar;
    }

    @Override // defpackage.ntr
    public final ntm c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // defpackage.nyx
    public final nyu m(nuq nuqVar, num numVar, nsa nsaVar, nxp[] nxpVarArr) {
        return new oad(this.a, this.b, nxpVarArr, null, null, null);
    }
}
