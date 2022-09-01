package defpackage;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: df  reason: default package */
/* loaded from: classes.dex */
public final class df implements fl {
    final /* synthetic */ dr a;
    private final fl b;

    public df(dr drVar, fl flVar) {
        this.a = drVar;
        this.b = flVar;
    }

    @Override // defpackage.fl
    public final void a(fm fmVar) {
        fp fpVar = (fp) this.b;
        fpVar.a.onDestroyActionMode(fpVar.e(fmVar));
        dr drVar = this.a;
        if (drVar.t != null) {
            drVar.m.getDecorView().removeCallbacks(this.a.u);
        }
        dr drVar2 = this.a;
        if (drVar2.s != null) {
            drVar2.I();
            dr drVar3 = this.a;
            aqq aq = aad.aq(drVar3.s);
            aq.j(0.0f);
            drVar3.N = aq;
            this.a.N.l(new de(this));
        }
        dr drVar4 = this.a;
        drVar4.r = null;
        aad.K(drVar4.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fl
    public final boolean b(fm fmVar, MenuItem menuItem) {
        fp fpVar = (fp) this.b;
        return fpVar.a.onActionItemClicked(fpVar.e(fmVar), new gu(fpVar.b, menuItem));
    }

    @Override // defpackage.fl
    public final boolean c(fm fmVar, Menu menu) {
        fp fpVar = (fp) this.b;
        return fpVar.a.onCreateActionMode(fpVar.e(fmVar), fpVar.f(menu));
    }

    @Override // defpackage.fl
    public final void d(fm fmVar, Menu menu) {
        aad.K(this.a.x);
        fp fpVar = (fp) this.b;
        fpVar.a.onPrepareActionMode(fpVar.e(fmVar), fpVar.f(menu));
    }
}
