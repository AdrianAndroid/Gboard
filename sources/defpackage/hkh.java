package defpackage;

import android.animation.Animator;
import com.google.android.apps.inputmethod.libs.hint.CentralizedHintManager;
import com.google.android.libraries.inputmethod.hint.banner.IBannerExtension;

/* compiled from: PG */
/* renamed from: hkh  reason: default package */
/* loaded from: classes.dex */
public final class hkh {
    public final hso a;
    public String b;
    public boolean c;
    public boolean d;
    public Animator e;
    public Animator f;
    public boolean g;
    public final llw h;
    public opu i;

    public hkh(hso hsoVar) {
        this.a = hsoVar;
        lls h = llw.h();
        h.a("extension_interface", IBannerExtension.class);
        h.a("activation_source", hfl.AUTOMATIC);
        h.a("activation_result_callback", new hkg(this, 0));
        h.a("banner_display_callback", new hkk() { // from class: hkc
            @Override // defpackage.hkk
            public final void a(String str) {
                hkh hkhVar = hkh.this;
                hkhVar.b = str;
                hkhVar.c = true;
            }
        });
        h.a("banner_dismiss_callback", new hkj() { // from class: hkd
            @Override // defpackage.hkj
            public final void a(String str) {
                opu opuVar;
                hkb hkbVar;
                hkh hkhVar = hkh.this;
                hkhVar.b = null;
                if (hkhVar.d || (opuVar = hkhVar.i) == null || (hkbVar = ((CentralizedHintManager) opuVar.a).a) == null) {
                    return;
                }
                hkbVar.b(str);
            }
        });
        h.a("banner_display_animator_provider", new hki(this) { // from class: hke
            public final /* synthetic */ hkh a;

            {
                this.a = this;
            }

            @Override // defpackage.hki
            public final Animator a() {
                return r2 != 0 ? this.a.e : this.a.f;
            }
        });
        h.a("banner_dismiss_animator_provider", new hki(this) { // from class: hke
            public final /* synthetic */ hkh a;

            {
                this.a = this;
            }

            @Override // defpackage.hki
            public final Animator a() {
                return r2 != 0 ? this.a.e : this.a.f;
            }
        });
        h.a("if_cancel_running_animator_provider", new hkl() { // from class: hkf
            @Override // defpackage.hkl
            public final boolean a() {
                return hkh.this.g;
            }
        });
        this.h = h.l();
    }
}
