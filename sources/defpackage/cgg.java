package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cgg  reason: default package */
/* loaded from: classes.dex */
public final class cgg implements cge {
    public final cgl a = new cgl();
    public ViewGroup b;

    @Override // defpackage.cge
    public final void a() {
        this.a.b();
        grd.b(R.id.key_pos_header_power_key, "pinned_action");
    }

    @Override // defpackage.cge
    public final void b(final View view) {
        if (this.b == null) {
            gqe a = gqh.a();
            a.i("pinned_action");
            a.d = new gqg() { // from class: cgf
                @Override // defpackage.gqg
                public final void a(View view2) {
                    cgg cggVar = cgg.this;
                    View view3 = view;
                    cggVar.b = (ViewGroup) view2;
                    cggVar.a.d(cggVar.b);
                    cggVar.a.f(view3);
                }
            };
            a.e = new cmq(this, 1);
            a.b("layout", Integer.valueOf((int) R.layout.f144780_resource_name_obfuscated_res_0x7f0e0504));
            gqq.b(R.id.key_pos_header_power_key, a.a());
            return;
        }
        this.a.f(view);
    }

    @Override // defpackage.cge
    public final void c() {
        grd.b(R.id.key_pos_header_power_key, "pinned_action");
    }
}
