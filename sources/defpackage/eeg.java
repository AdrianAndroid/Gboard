package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eeg  reason: default package */
/* loaded from: classes.dex */
abstract class eeg implements deq {
    final /* synthetic */ GifKeyboardTablet a;
    private final int b;
    private boolean c;

    public eeg(GifKeyboardTablet gifKeyboardTablet, int i) {
        this.a = gifKeyboardTablet;
        this.b = i;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        edq edqVar = (edq) this.a.j.get(Integer.valueOf(CategoryViewPager.y(view).intValue()));
        if (edqVar != null) {
            edqVar.e();
        }
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = (VerticalScrollAnimatedImageSidebarHolderView) aad.q(view, R.id.f52360_resource_name_obfuscated_res_0x7f0b007b);
        verticalScrollAnimatedImageSidebarHolderView.aL(null);
        verticalScrollAnimatedImageSidebarHolderView.gI();
        ((ekt) verticalScrollAnimatedImageSidebarHolderView).W = null;
        verticalScrollAnimatedImageSidebarHolderView.aN();
        ViewGroup viewGroup = (ViewGroup) aad.q(view, R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
    }

    @Override // defpackage.deq
    public final void d(View view, int i) {
        if (i < 0 || i >= a()) {
            ((ltd) GifKeyboardTablet.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardTablet$BasePageOwner", "fillPage", 1017, "GifKeyboardTablet.java")).y("fillPage(): index %d out of range %d", i, a());
            return;
        }
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = (VerticalScrollAnimatedImageSidebarHolderView) aad.q(view, R.id.f52360_resource_name_obfuscated_res_0x7f0b007b);
        ViewGroup viewGroup = (ViewGroup) aad.q(view, R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        verticalScrollAnimatedImageSidebarHolderView.aL(this.a.n);
        verticalScrollAnimatedImageSidebarHolderView.aM();
        GifKeyboardTablet gifKeyboardTablet = this.a;
        ((ekt) verticalScrollAnimatedImageSidebarHolderView).W = new eef(gifKeyboardTablet, gifKeyboardTablet.f, 0);
        if (i != this.b || this.c) {
            return;
        }
        gifKeyboardTablet.K(verticalScrollAnimatedImageSidebarHolderView, viewGroup, i);
        this.c = true;
    }

    @Override // defpackage.deq
    public final int e() {
        return jam.r(this.a.u) ? R.layout.f134870_resource_name_obfuscated_res_0x7f0e00cd : R.layout.f134880_resource_name_obfuscated_res_0x7f0e00ce;
    }
}
