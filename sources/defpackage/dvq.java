package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dvq  reason: default package */
/* loaded from: classes.dex */
public final class dvq implements dvl {
    public final dvt a = new dvt();

    @Override // defpackage.dvl
    public final void g() {
        this.a.a();
    }

    @Override // defpackage.dvl
    public final void h(Runnable runnable) {
        this.a.b(runnable);
    }

    @Override // defpackage.dvl
    public final void i() {
        this.a.d();
        grd.b(R.id.key_pos_header_power_key, "mic_ring");
    }

    @Override // defpackage.dvl
    public final void j(boolean z) {
        this.a.a = z;
    }

    @Override // defpackage.dvl
    public final void k(boolean z) {
        this.a.f(z);
    }

    @Override // defpackage.dvl
    public final void l(final Context context, final boolean z) {
        i();
        gqe a = gqh.a();
        lre.aJ(a);
        a.i("mic_ring");
        a.f(R.attr.f4200_resource_name_obfuscated_res_0x7f0400d4);
        a.b("layout", Integer.valueOf((int) R.layout.f145520_resource_name_obfuscated_res_0x7f0e0552));
        a.d = new gqg() { // from class: dvp
            @Override // defpackage.gqg
            public final void a(View view) {
                dvq dvqVar = dvq.this;
                Context context2 = context;
                boolean z2 = z;
                dvt dvtVar = dvqVar.a;
                if (dvtVar.j()) {
                    dvtVar.i((ViewGroup) view);
                } else {
                    dvtVar.g(context2, (ViewGroup) view, z2);
                }
            }
        };
        gqq.b(R.id.key_pos_header_power_key, a.a());
    }

    @Override // defpackage.dvl
    public final void m(int i) {
        this.a.h(i);
    }

    @Override // defpackage.dvl
    public final void n() {
        this.a.h(100);
    }
}
