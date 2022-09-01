package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hwj  reason: default package */
/* loaded from: classes.dex */
public final class hwj implements hwe {
    public final idk a = ieh.j();
    public final gqa b;
    public final hwg c;
    public final hvt d;
    public final hwh e;
    public View f;
    public View g;
    public final hwi h;

    public hwj(Context context, hwi hwiVar, hwh hwhVar) {
        hwg hwgVar = new hwg(context);
        hvt hvtVar = new hvt(hwhVar);
        this.b = gqa.a(context);
        this.c = hwgVar;
        this.h = hwiVar;
        this.e = hwhVar;
        this.d = hvtVar;
    }

    @Override // defpackage.hwe
    public final void a() {
        this.b.g(R.string.f151730_resource_name_obfuscated_res_0x7f140233, new Object[0]);
        jdm jdmVar = this.h.f.t;
        if (jdmVar != null) {
            jdmVar.setVisibility(0);
        }
        hwh hwhVar = this.h.h;
        hwhVar.d.r(R.string.f162230_resource_name_obfuscated_res_0x7f140700, hwhVar.e);
        hwhVar.d.s(R.string.f162250_resource_name_obfuscated_res_0x7f140702, hwhVar.h);
        hwhVar.d.s(R.string.f162220_resource_name_obfuscated_res_0x7f1406ff, hwhVar.j);
        if (hwhVar.C()) {
            int i = hwhVar.l;
            hwhVar.m = i;
            hwhVar.n = hwhVar.z(i);
        } else {
            hwhVar.m = hwhVar.z(hwhVar.l);
            hwhVar.n = hwhVar.l;
        }
        hwhVar.d.s(R.string.f162240_resource_name_obfuscated_res_0x7f140701, hwhVar.m);
        hwhVar.d.s(R.string.f162260_resource_name_obfuscated_res_0x7f140703, hwhVar.n);
    }

    @Override // defpackage.hwe
    public final void c(int i, int i2) {
        hwi hwiVar = this.h;
        hwiVar.h.B(i, i2);
        hwiVar.f.m();
        hwiVar.a.f();
    }

    @Override // defpackage.hwe
    public final void d(int i, int i2, float f) {
        hwi hwiVar = this.h;
        hwh hwhVar = hwiVar.h;
        hwhVar.e = f * hwhVar.e;
        hwhVar.B(i, i2);
        hwiVar.f.o();
        hwiVar.f.m();
        hwiVar.a.f();
    }

    public final void e() {
        this.c.d();
    }

    public final void f() {
        hvt hvtVar = this.d;
        boolean C = hvtVar.b.C();
        boolean z = !C;
        hvtVar.b(hvtVar.c, z);
        hvtVar.b(hvtVar.d, C);
        hvt.a(hvtVar.c, z);
        hvt.a(hvtVar.d, C);
    }

    @Override // defpackage.hwe
    public final void b() {
        hwi hwiVar = this.h;
        hwh hwhVar = hwiVar.h;
        hwhVar.l = hwhVar.C() ? 0 : hwhVar.x(hwhVar.a);
        hwhVar.h = hwhVar.i;
        hwhVar.j = hwhVar.k;
        hwhVar.e = hwhVar.f;
        hwiVar.f.o();
        hwiVar.f.m();
        hwiVar.a.f();
    }
}
