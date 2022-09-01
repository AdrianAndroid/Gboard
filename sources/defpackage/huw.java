package defpackage;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* renamed from: huw  reason: default package */
/* loaded from: classes.dex */
public final class huw implements View.OnLayoutChangeListener {
    final /* synthetic */ Object a;
    private int b;
    private final /* synthetic */ int c;

    public huw(hoo hooVar, int i) {
        this.c = i;
        this.a = hooVar;
    }

    public huw(hva hvaVar, int i) {
        this.c = i;
        this.a = hvaVar;
    }

    public huw(imo imoVar, int i) {
        this.c = i;
        this.a = imoVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        int i9 = this.c;
        if (i9 == 0) {
            LinearLayout linearLayout = ((hva) this.a).k;
            if (linearLayout == null) {
                return;
            }
            int i10 = this.b;
            int height = linearLayout.getHeight();
            this.b = height;
            if ((i10 != 0 && i8 - i6 != 0) || height <= 0) {
                return;
            }
            ((hva) this.a).h();
            hva hvaVar = (hva) this.a;
            if (hvaVar.r) {
                hvaVar.j();
            }
            hva hvaVar2 = (hva) this.a;
            LinearLayout linearLayout2 = hvaVar2.k;
            if (linearLayout2 == null) {
                return;
            }
            linearLayout2.removeOnLayoutChangeListener(hvaVar2.i);
        } else if (i9 != 1) {
            int paddingBottom = view.getPaddingBottom();
            if (this.b == paddingBottom || (view2 = ((imo) this.a).n) == null) {
                return;
            }
            view2.setPadding(view2.getPaddingLeft(), ((imo) this.a).n.getPaddingTop(), ((imo) this.a).n.getPaddingRight(), paddingBottom);
            this.b = paddingBottom;
        } else {
            View view3 = ((hoo) this.a).c;
            if (view3 == null) {
                return;
            }
            int i11 = this.b;
            int height2 = view3.getHeight();
            this.b = height2;
            if ((i11 != 0 && i8 - i6 != 0) || height2 <= 0) {
                return;
            }
            hoo hooVar = (hoo) this.a;
            hooVar.c(hooVar.e);
            hoo hooVar2 = (hoo) this.a;
            View view4 = hooVar2.c;
            if (view4 == null) {
                return;
            }
            view4.removeOnLayoutChangeListener(hooVar2.b);
        }
    }
}
