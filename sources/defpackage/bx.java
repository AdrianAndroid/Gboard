package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: bx  reason: default package */
/* loaded from: classes.dex */
final class bx extends bz {
    private final bn g;

    public bx(int i, int i2, bn bnVar, wq wqVar) {
        super(i, i2, bnVar.b, wqVar);
        this.g = bnVar;
    }

    @Override // defpackage.bz
    public final void a() {
        super.a();
        this.g.d();
    }

    @Override // defpackage.bz
    public final void b() {
        int i = this.f;
        if (i != 2) {
            if (i != 3) {
                return;
            }
            an anVar = this.g.b;
            View H = anVar.H();
            if (bi.S(2)) {
                StringBuilder sb = new StringBuilder("Clearing focus ");
                sb.append(H.findFocus());
                sb.append(" on view ");
                sb.append(H);
                sb.append(" for Fragment ");
                sb.append(anVar);
            }
            H.clearFocus();
            return;
        }
        an anVar2 = this.g.b;
        View findFocus = anVar2.O.findFocus();
        if (findFocus != null) {
            anVar2.aa(findFocus);
            if (bi.S(2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Saved focused view ");
                sb2.append(findFocus);
                sb2.append(" for Fragment ");
                sb2.append(anVar2);
            }
        }
        View H2 = this.a.H();
        if (H2.getParent() == null) {
            this.g.a();
            H2.setAlpha(0.0f);
        }
        if (H2.getAlpha() == 0.0f && H2.getVisibility() == 0) {
            H2.setVisibility(4);
        }
        ak akVar = anVar2.R;
        H2.setAlpha(akVar == null ? 1.0f : akVar.l);
    }
}
