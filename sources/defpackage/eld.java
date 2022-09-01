package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.widget.FixedColumnAnimatedImageSidebarHolderView;

/* compiled from: PG */
/* renamed from: eld  reason: default package */
/* loaded from: classes.dex */
public final class eld extends ekw {
    final /* synthetic */ FixedColumnAnimatedImageSidebarHolderView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eld(FixedColumnAnimatedImageSidebarHolderView fixedColumnAnimatedImageSidebarHolderView) {
        super(fixedColumnAnimatedImageSidebarHolderView);
        this.i = fixedColumnAnimatedImageSidebarHolderView;
    }

    @Override // defpackage.ekw, defpackage.eks, defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        mo d = super.d(viewGroup, i);
        View view = d.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = viewGroup.getMeasuredWidth() / this.i.ah;
        view.setLayoutParams(layoutParams);
        return d;
    }
}
