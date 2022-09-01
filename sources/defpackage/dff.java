package defpackage;

/* compiled from: PG */
/* renamed from: dff  reason: default package */
/* loaded from: classes.dex */
final class dff extends alb {
    final /* synthetic */ dfh a;

    public dff(dfh dfhVar) {
        this.a = dfhVar;
    }

    @Override // defpackage.alb, defpackage.aky
    public final void a(int i) {
        dfh dfhVar = this.a;
        dfhVar.u = i;
        dfa dfaVar = dfhVar.I;
        if (dfaVar != null) {
            dfaVar.gs(dfhVar, i);
        }
    }

    @Override // defpackage.alb, defpackage.aky
    public final void b(int i, float f) {
        dfa dfaVar = this.a.I;
        if (dfaVar != null) {
            dfaVar.u(i, f);
        }
    }
}
