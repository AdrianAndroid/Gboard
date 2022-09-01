package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: ekx  reason: default package */
/* loaded from: classes.dex */
public class ekx extends ekt {
    public static final ltg ag = ltg.j("com/google/android/apps/inputmethod/libs/search/widget/AnimatedImageSidebarHolderView");

    public ekx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void aM() {
        aa(new ekw(this));
    }

    public final void aN() {
        aO((elc) null);
        aF();
        aa(null);
    }

    public final void aO(elc elcVar) {
        aP(elcVar, 1);
    }

    public final void aP(elc elcVar, int i) {
        ekw ekwVar = (ekw) this.l;
        if (ekwVar != null) {
            int G = ekwVar.G(i);
            ekwVar.g = i;
            elc elcVar2 = ekwVar.h;
            if (elcVar2 == elcVar) {
                return;
            }
            if (elcVar == null) {
                ekwVar.h = null;
                ekwVar.m(G);
            } else if (elcVar2 == null) {
                ekwVar.h = elcVar;
                ekwVar.hi(G);
            } else {
                ekwVar.h = elcVar;
                ekwVar.hg(G);
            }
        }
    }
}
