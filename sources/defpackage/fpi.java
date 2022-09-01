package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: fpi  reason: default package */
/* loaded from: classes.dex */
public final class fpi implements fql {
    public final fnw a;
    public final Cfor b;
    public final /* synthetic */ fpj e;
    public frg f = null;
    public Set c = null;
    public boolean d = false;

    public fpi(fpj fpjVar, fnw fnwVar, Cfor cfor) {
        this.e = fpjVar;
        this.a = fnwVar;
        this.b = cfor;
    }

    @Override // defpackage.fql
    public final void a(fmt fmtVar) {
        this.e.m.post(new elr(this, fmtVar, 20));
    }

    public final void b(fmt fmtVar) {
        fpg fpgVar = (fpg) this.e.j.get(this.b);
        if (fpgVar != null) {
            fyb.aA(fpgVar.i.m);
            fnw fnwVar = fpgVar.b;
            String name = fnwVar.getClass().getName();
            String valueOf = String.valueOf(fmtVar);
            fnwVar.f("onSignInFailed for " + name + " with " + valueOf);
            fpgVar.i(fmtVar);
        }
    }

    public final void c() {
        frg frgVar;
        if (!this.d || (frgVar = this.f) == null) {
            return;
        }
        this.a.s(frgVar, this.c);
    }
}
