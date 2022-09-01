package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: edz  reason: default package */
/* loaded from: classes.dex */
public abstract class edz implements deq {
    final /* synthetic */ GifKeyboardM2 a;
    private final int b;
    private boolean c;

    public edz(GifKeyboardM2 gifKeyboardM2, int i) {
        this.a = gifKeyboardM2;
        this.b = i;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        edq edqVar = (edq) this.a.k.get(Integer.valueOf(CategoryViewPager.y(view).intValue()));
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
            ((ltd) GifKeyboardM2.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2$BasePageOwner", "fillPage", 1106, "GifKeyboardM2.java")).y("fillPage(): index %d out of range %d", i, a());
            return;
        }
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = (VerticalScrollAnimatedImageSidebarHolderView) aad.q(view, R.id.f52360_resource_name_obfuscated_res_0x7f0b007b);
        ViewGroup viewGroup = (ViewGroup) aad.q(view, R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        verticalScrollAnimatedImageSidebarHolderView.aL(this.a.n);
        verticalScrollAnimatedImageSidebarHolderView.aM();
        GifKeyboardM2 gifKeyboardM2 = this.a;
        ((ekt) verticalScrollAnimatedImageSidebarHolderView).W = new eef(gifKeyboardM2, gifKeyboardM2.g, 1);
        if (i != this.b || this.c) {
            return;
        }
        gifKeyboardM2.L(verticalScrollAnimatedImageSidebarHolderView, viewGroup, i);
        this.c = true;
    }

    @Override // defpackage.deq
    public final int e() {
        return R.layout.f134870_resource_name_obfuscated_res_0x7f0e00cd;
    }
}
