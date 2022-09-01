package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eeb  reason: default package */
/* loaded from: classes.dex */
public class eeb implements edo {
    final /* synthetic */ GifKeyboardM2 a;

    public eeb(GifKeyboardM2 gifKeyboardM2) {
        this.a = gifKeyboardM2;
    }

    @Override // defpackage.edo
    public final void a(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup, edp edpVar) {
        Runnable runnable;
        int i;
        this.a.O();
        if (this.a.P() && !verticalScrollAnimatedImageSidebarHolderView.aJ()) {
            verticalScrollAnimatedImageSidebarHolderView.setVisibility(8);
            viewGroup.setVisibility(0);
            edp edpVar2 = edp.NO_NETWORK;
            int ordinal = edpVar.ordinal();
            int i2 = R.string.f152920_resource_name_obfuscated_res_0x7f1402af;
            int i3 = R.drawable.quantum_gm_ic_cloud_off_vd_theme_24;
            int i4 = 2;
            if (ordinal == 0) {
                runnable = this.a.i;
                i = R.string.f152930_resource_name_obfuscated_res_0x7f1402b0;
            } else if (ordinal == 1) {
                runnable = this.a.i;
                i = R.string.f152740_resource_name_obfuscated_res_0x7f14029d;
            } else if (ordinal == 2) {
                runnable = this.a.i;
                i = R.string.f152980_resource_name_obfuscated_res_0x7f1402b5;
            } else if (ordinal == 3) {
                i = d();
                i3 = R.drawable.f49120_resource_name_obfuscated_res_0x7f080294;
                runnable = null;
                i2 = 0;
                i4 = 1;
            } else {
                ((ltd) GifKeyboardM2.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2$GifCallback", "onErrorInternal", 709, "GifKeyboardM2.java")).w("ErrorState enum switch statement fell to default case for %s, this should never happen.", edpVar);
                return;
            }
            if (e()) {
                this.a.b.e(ctd.GIF_IMAGE_SEARCH_FAILED, new Object[0]);
            }
            cnf a = cng.a();
            a.e(i4);
            a.g(i3);
            a.f(i);
            a.d(i2);
            a.a = runnable;
            a.a().b(this.a.u, viewGroup);
        }
    }

    @Override // defpackage.edo
    public final void b(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup) {
        if (!this.a.P() || verticalScrollAnimatedImageSidebarHolderView.aJ()) {
            return;
        }
        this.a.N(true);
        verticalScrollAnimatedImageSidebarHolderView.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    @Override // defpackage.edo
    public final void c(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup, llp llpVar) {
        this.a.O();
        if (!this.a.P()) {
            return;
        }
        verticalScrollAnimatedImageSidebarHolderView.setVisibility(0);
        viewGroup.setVisibility(8);
        verticalScrollAnimatedImageSidebarHolderView.aE(llpVar);
    }

    public int d() {
        return R.string.f159000_resource_name_obfuscated_res_0x7f14058d;
    }

    public boolean e() {
        return true;
    }
}
