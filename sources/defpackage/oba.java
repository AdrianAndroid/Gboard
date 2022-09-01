package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oba  reason: default package */
/* loaded from: classes2.dex */
public final class oba extends oah {
    public final nyi a;
    private final nzf b;

    public oba(nzf nzfVar, nyi nyiVar) {
        this.b = nzfVar;
        this.a = nyiVar;
    }

    @Override // defpackage.oah
    protected final nzf a() {
        return this.b;
    }

    @Override // defpackage.oah, defpackage.nyx
    public final nyu m(nuq nuqVar, num numVar, nsa nsaVar, nxp[] nxpVarArr) {
        return new oaz(this, this.b.m(nuqVar, numVar, nsaVar, nxpVarArr));
    }
}
