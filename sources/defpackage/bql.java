package defpackage;

import android.widget.LinearLayout;
import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: bql  reason: default package */
/* loaded from: classes.dex */
public final class bql extends LinearLayout {
    public final deb a;
    public final int b;
    public final llp c;
    public int d = 0;

    public bql(deb debVar, int i, int i2) {
        super(debVar.b);
        this.a = debVar;
        this.b = i;
        llk f = llp.f(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            SoftKeyView f2 = debVar.f();
            f2.setVisibility(8);
            f2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            addView(f2);
            f.h(f2);
        }
        this.c = f.g();
    }

    public static void a(hln hlnVar) {
        Object obj = hlnVar.j;
        if ((obj instanceof ckj) && ((ckj) obj).d) {
            ieh.j().e(ctd.EXPRESSION_HEADER_EMOJI_SHOWN, new Object[0]);
        }
    }

    public final void b() {
        this.d = 0;
        setVisibility(4);
        llp llpVar = this.c;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            SoftKeyView softKeyView = (SoftKeyView) llpVar.get(i2);
            if (softKeyView.getVisibility() == 0) {
                LatinFixedCountCandidatesHolderView.o(softKeyView);
            }
        }
    }
}
