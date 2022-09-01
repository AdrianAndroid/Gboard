package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: elp  reason: default package */
/* loaded from: classes.dex */
public final class elp extends ekw {
    final /* synthetic */ VerticalScrollAnimatedImageSidebarHolderView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elp(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView) {
        super(verticalScrollAnimatedImageSidebarHolderView);
        this.i = verticalScrollAnimatedImageSidebarHolderView;
    }

    @Override // defpackage.ekw
    protected final int E() {
        return R.layout.f146980_resource_name_obfuscated_res_0x7f0e0607;
    }

    @Override // defpackage.ekw, defpackage.eks, defpackage.ls
    public final void o(mo moVar, int i) {
        super.o(moVar, i);
        if (F(i)) {
            ViewGroup.LayoutParams layoutParams = moVar.a.getLayoutParams();
            if (!(layoutParams instanceof nk)) {
                return;
            }
            ((nk) layoutParams).b = this.i.ah;
        }
    }
}
