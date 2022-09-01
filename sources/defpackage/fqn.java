package defpackage;

/* compiled from: PG */
/* renamed from: fqn  reason: default package */
/* loaded from: classes.dex */
public final class fqn implements fql {
    final /* synthetic */ fqq a;

    public fqn(fqq fqqVar) {
        this.a = fqqVar;
    }

    @Override // defpackage.fql
    public final void a(fmt fmtVar) {
        if (fmtVar.b()) {
            fqq fqqVar = this.a;
            fqqVar.s(null, fqqVar.x());
            return;
        }
        opu opuVar = this.a.q;
        if (opuVar == null) {
            return;
        }
        opuVar.s(fmtVar);
    }
}
