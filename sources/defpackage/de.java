package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: de  reason: default package */
/* loaded from: classes.dex */
final class de extends aan {
    final /* synthetic */ df a;

    public de(df dfVar) {
        this.a = dfVar;
    }

    @Override // defpackage.aan, defpackage.aam
    public final void a() {
        this.a.a.s.setVisibility(8);
        dr drVar = this.a.a;
        PopupWindow popupWindow = drVar.t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (drVar.s.getParent() instanceof View) {
            aad.K((View) this.a.a.s.getParent());
        }
        this.a.a.s.i();
        this.a.a.N.l(null);
        dr drVar2 = this.a.a;
        drVar2.N = null;
        aad.K(drVar2.x);
    }
}
