package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* renamed from: huv  reason: default package */
/* loaded from: classes.dex */
public final class huv extends hvk implements huz {
    public huu a;
    private final hva h;
    private final boolean i;
    private String j;
    private boolean k;

    public huv(Context context, hvj hvjVar, hvx hvxVar, boolean z, String str) {
        super(context, hvjVar, hvxVar);
        this.i = z;
        this.j = str;
        this.a = new huu(context, hvjVar.c(), z, str);
        this.h = new hva(context, this);
    }

    private final int n() {
        if (this.i) {
            return R.id.f64420_resource_name_obfuscated_res_0x7f0b06f6;
        }
        return 0;
    }

    @Override // defpackage.hvk
    protected final int a() {
        return R.string.f166320_resource_name_obfuscated_res_0x7f1408ce;
    }

    @Override // defpackage.hvk
    protected final int b() {
        return R.string.f151720_resource_name_obfuscated_res_0x7f140232;
    }

    @Override // defpackage.hvk
    public final void c() {
        int d;
        huu huuVar = this.a;
        boolean k = hyq.k(this.b);
        if (!huuVar.o || k) {
            d = jam.d(huuVar.a);
        } else {
            d = huuVar.a.getResources().getDimensionPixelSize(R.dimen.f34620_resource_name_obfuscated_res_0x7f0701b8);
        }
        huuVar.i = d;
        huuVar.A(huuVar.a, huuVar.b);
        huuVar.z(huuVar.a);
        super.c();
        this.k = true;
        if (this.g != null) {
            this.h.j();
            this.h.l(n());
        }
    }

    public final void d(hvf hvfVar) {
        huu huuVar = this.a;
        if (hvfVar.c()) {
            if (!jam.r(huuVar.a)) {
                huuVar.r = huuVar.j + huuVar.k;
                return;
            }
            hvfVar.a(huuVar.n);
            int i = huuVar.g.right - huuVar.n.right;
            float f = huuVar.i * huuVar.h;
            if (i >= huuVar.n.left) {
                huuVar.q = (int) Math.min(huuVar.g.right - f, huuVar.n.right + ((i - f) * 0.5f));
                return;
            } else {
                huuVar.q = (int) (Math.max(huuVar.n.left - f, 0.0f) * 0.5f);
                return;
            }
        }
        huuVar.A(huuVar.a, huuVar.b);
        huuVar.z(huuVar.a);
    }

    @Override // defpackage.hvk
    public final void e() {
        super.e();
        this.k = false;
        this.h.l(0);
        this.h.e();
        this.h.f(true);
    }

    @Override // defpackage.hvk
    public final void f() {
        super.f();
        this.h.h();
    }

    public final void g(String str) {
        if (str.equals(this.j)) {
            return;
        }
        this.j = str;
        this.a = new huu(this.b, this.d.c(), this.i, this.j);
    }

    @Override // defpackage.hvk
    public final void h() {
        this.h.e();
        this.h.f(false);
    }

    @Override // defpackage.hvk
    public final void i() {
        super.i();
        this.h.h();
    }

    public final void j() {
        this.a.s();
    }

    public final void l(imn imnVar) {
        hva hvaVar = this.h;
        hvaVar.n = imnVar;
        hvaVar.f.p = imnVar;
    }

    @Override // defpackage.hvk
    public final /* synthetic */ hun m() {
        return this.a;
    }

    public final void k(View view) {
        this.g = view;
        hva hvaVar = this.h;
        if (hvaVar.j != view) {
            hvaVar.j = view;
            LinearLayout linearLayout = hvaVar.k;
            if (linearLayout != null) {
                linearLayout.removeOnLayoutChangeListener(hvaVar.i);
            }
            hvaVar.k = view != null ? (LinearLayout) view.findViewById(R.id.keyboard_holder) : null;
            hvaVar.m = view != null ? (KeyboardViewHolder) view.findViewById(R.id.keyboard_header_view_holder) : null;
            hvaVar.l = view != null ? (KeyboardViewHolder) view.findViewById(R.id.f54740_resource_name_obfuscated_res_0x7f0b01c2) : null;
            hvaVar.f.c();
            hvaVar.d();
            if (hvaVar.o != null) {
                hvaVar.o = null;
            }
        }
        if (this.k) {
            this.h.l(n());
        }
    }
}
