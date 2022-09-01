package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.hint.banner.IBannerExtension;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hko  reason: default package */
/* loaded from: classes.dex */
public final class hko implements IBannerExtension {
    private boolean a;
    private hga b;
    private Map c;

    public static void g(View view) {
        view.setVisibility(8);
    }

    private final hga l() {
        hga hgaVar = this.b;
        if (hgaVar != null) {
            return hgaVar;
        }
        throw new IllegalStateException("Delegate is null! Openable extensions must not be interacted with unless they have a non-null delegate.");
    }

    @Override // defpackage.hfz
    public final hsy B() {
        return null;
    }

    @Override // defpackage.hfz
    public final void I() {
        f();
    }

    @Override // defpackage.hfz
    public final void N(Map map, hfl hflVar) {
        if (map != null) {
            this.c = map;
            View view = (View) d("banner_view", View.class);
            String str = (String) d("banner_id", String.class);
            view.setVisibility(0);
            l().N(view);
            l().O(!((Boolean) d("hide_header_view", Boolean.class)).booleanValue());
            Animator a = ((hki) d("banner_display_animator_provider", hki.class)).a();
            if (a != null) {
                a.setTarget(view);
                a.start();
            }
            ((hkk) d("banner_display_callback", hkk.class)).a(str);
            this.a = true;
            return;
        }
        throw new IllegalArgumentException("openExtensionView(): paramsToOpen should not be null.");
    }

    @Override // defpackage.hfz
    public final void O() {
    }

    @Override // defpackage.hfz
    public final void P(hga hgaVar) {
        this.b = hgaVar;
    }

    @Override // defpackage.hfz
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // defpackage.hfz
    public final boolean T(boolean z) {
        return false;
    }

    @Override // defpackage.hfz
    public final void W(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        return false;
    }

    final Object d(String str, Class cls) {
        Map map = this.c;
        if (map == null) {
            throw new IllegalArgumentException("getNonNull(): paramsToOpen should not be null.");
        }
        Object obj = map.get(str);
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException("getNonNull(): null or type mismatch for ".concat(str));
        }
        return cls.cast(obj);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    public final void f() {
        if (this.a) {
            View view = (View) d("banner_view", View.class);
            Animator a = ((hki) d("banner_display_animator_provider", hki.class)).a();
            Animator a2 = ((hki) d("banner_dismiss_animator_provider", hki.class)).a();
            if (a2 != null) {
                a2.addListener(new hkm(view));
            }
            if (a != null && a.isRunning()) {
                if (((hkl) d("if_cancel_running_animator_provider", hkl.class)).a()) {
                    a.end();
                } else {
                    a.addListener(new hkn(view, a2));
                    this.a = false;
                    ((hkj) d("banner_dismiss_callback", hkj.class)).a((String) d("banner_id", String.class));
                    this.c = null;
                    l().O(true);
                }
            }
            if (a2 != null) {
                a2.start();
            } else {
                g(view);
            }
            this.a = false;
            ((hkj) d("banner_dismiss_callback", hkj.class)).a((String) d("banner_id", String.class));
            this.c = null;
            l().O(true);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "BannerExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
        f();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        f();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        N(map, hflVar);
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final void q() {
    }

    @Override // defpackage.hfz
    public final void v() {
    }
}
