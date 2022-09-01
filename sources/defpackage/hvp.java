package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hvp  reason: default package */
/* loaded from: classes.dex */
public final class hvp implements hvw, hvj, hho, hvh, hwp {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/keyboardmode/KeyboardModeManager");
    public int b;
    public final hvx c;
    public final hwa d;
    public final hwi e;
    public final huv f;
    public final huv g;
    public final hwn h;
    public final hvf i;
    public final hvi j;
    public hvk k;
    public final irm l;
    public hsk o;
    public final hsw p;
    private int q;
    private final Context r;
    private final ino s;
    private final hvo u;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z = 0;
    public String m = "phone";
    public String n = "";
    private final idk t = ieh.j();
    private final lgb v = jdg.n(new hvm(0));

    public hvp(Context context, hvo hvoVar) {
        hvl hvlVar = new hvl(this);
        this.p = hvlVar;
        this.r = context;
        this.s = ino.M(context);
        this.u = hvoVar;
        hvx hvxVar = new hvx(context, this);
        this.c = hvxVar;
        this.d = new hwa(context, this, hvxVar);
        this.e = new hwi(context, this, hvxVar);
        this.f = new huv(context, this, hvxVar, false, this.n);
        this.g = new huv(context, this, hvxVar, true, this.n);
        this.h = new hwn(context, this, hvxVar);
        this.j = new hvi(context, this);
        this.i = hve.a(context.getApplicationContext());
        hvn hvnVar = new hvn(this);
        this.l = hvnVar;
        hvnVar.g(mjl.a);
        hvlVar.e(mjl.a);
    }

    private final hvk q(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.e;
            }
            if (i == 3) {
                return this.g;
            }
            if (i == 4) {
                return this.h;
            }
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardModeManager", "getKeyboardModeController", 322, "KeyboardModeManager.java")).u("Invalid keyboard mode: %s", i);
            return this.d;
        }
        return this.d;
    }

    private final String r(int i) {
        return String.valueOf(this.n).concat(String.valueOf(this.r.getString(i)));
    }

    private final void s(hvk hvkVar) {
        hvk hvkVar2 = this.k;
        if (hvkVar2 == hvkVar) {
            return;
        }
        if (hvkVar2 != null) {
            hvkVar2.e();
        }
        this.k = hvkVar;
        hvkVar.c();
    }

    private final void t() {
        hvi hviVar = this.j;
        int a2 = hvi.a(this.x, this.b == 4);
        hviVar.h = a2;
        hviVar.b(hviVar.c, a2);
    }

    @Override // defpackage.hvj, defpackage.hvh
    public final void b() {
        if (this.b != 3) {
            h(1, true);
            return;
        }
        int i = this.q;
        int i2 = 2;
        if (i == 2) {
            if (true != this.w) {
                i2 = 1;
            }
            h(i2, true);
            return;
        }
        int i3 = 4;
        if (i == 4) {
            if (true != this.x) {
                i3 = 1;
            }
            h(i3, true);
            return;
        }
        if (i == 3) {
            i = 1;
        }
        h(i, true);
    }

    @Override // defpackage.hvw, defpackage.hvj
    public final htc c() {
        return this.u.U();
    }

    @Override // defpackage.hvj
    public final iau d() {
        return this.u.W();
    }

    public final void e() {
        hwa hwaVar = this.d;
        hwaVar.h = hwa.g(hwaVar.b);
        hwaVar.k();
        hwaVar.l();
        hhq.p(hwaVar, hwq.e, hwq.f, hwq.g);
        hwaVar.f.i();
        f();
        int i = this.b;
        this.w = i == 2;
        this.x = i == 4;
        hhq.p(this, hwq.d, hwq.c, hwq.b);
        j();
    }

    public final void f() {
        this.b = hyq.f();
        this.q = this.s.b(r(R.string.f162300_resource_name_obfuscated_res_0x7f140707), 1);
        this.z = R.string.f161180_resource_name_obfuscated_res_0x7f140696;
        int i = this.b;
        if (i == 3) {
            i = this.s.al(r(R.string.f161180_resource_name_obfuscated_res_0x7f140696), false, false) ? 3 : this.q;
            this.b = i;
        }
        s(q(i));
        this.t.e(hvq.KEYBOARD_MODE_CHANGED, Integer.valueOf(this.b));
    }

    public final void g() {
        int i = this.r.getResources().getConfiguration().orientation;
        this.d.j();
        this.e.j();
        this.f.j();
        this.g.j();
        this.h.d();
        this.c.i();
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        m(true);
    }

    public final void h(int i, boolean z) {
        String valueOf;
        int i2 = this.b;
        if (i2 == i) {
            return;
        }
        this.q = i2;
        this.b = i;
        int i3 = this.z;
        if (i3 != 0) {
            this.s.f(r(i3), this.b == 3);
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardModeManager", "setKeyboardMode", 619, "KeyboardModeManager.java")).t("shouldFloatKeyboardPrefId is not assigned!");
        }
        if (this.w) {
            ino inoVar = this.s;
            String r = r(R.string.f162210_resource_name_obfuscated_res_0x7f1406fe);
            if (this.b != 2) {
                valueOf = this.r.getString(R.string.f160150_resource_name_obfuscated_res_0x7f14062c);
            } else {
                valueOf = String.valueOf(this.e.h.g);
            }
            inoVar.j(r, valueOf);
        }
        if (z) {
            l(this.b);
        }
        this.s.h(r(R.string.f162300_resource_name_obfuscated_res_0x7f140707), this.q);
        int i4 = this.b;
        if (i4 == 4) {
            if (this.q != 1) {
                i4 = 4;
            }
            s(q(this.b));
            j();
            this.t.e(hvq.KEYBOARD_MODE_CHANGED, Integer.valueOf(this.b));
        }
        if (i4 != 1 || this.q != 4) {
            this.u.aL((i4 == 3 || this.q == 3) ? false : true);
        }
        s(q(this.b));
        j();
        this.t.e(hvq.KEYBOARD_MODE_CHANGED, Integer.valueOf(this.b));
    }

    public final void i(int i, boolean z) {
        boolean k = this.e.k(i);
        if (!this.w || !k) {
            if (this.b != 2) {
                return;
            }
            h(1, z);
            return;
        }
        hwi hwiVar = this.e;
        if (hwiVar.h.E(i)) {
            hwiVar.g();
        }
        h(2, z);
    }

    public final void j() {
        boolean z = false;
        this.j.c(this.w, this.b == 2);
        hvi hviVar = this.j;
        if (this.b == 3) {
            z = true;
        }
        int a2 = hvi.a(true, z);
        hviVar.f = a2;
        hviVar.b(hviVar.a, a2);
        t();
    }

    public final void k() {
        if (this.s.al(r(this.z), false, false)) {
            h(3, false);
            return;
        }
        i(this.e.d(this.n), false);
        if (this.x && hyq.f() == 4) {
            h(4, false);
        } else if (this.b == 4) {
            h(1, false);
        }
        if (this.b != 3) {
            return;
        }
        b();
    }

    public final void l(int i) {
        this.s.h(hyq.l(this.m), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (((java.lang.Integer) r1).intValue() != (-1)) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(boolean r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvp.m(boolean):void");
    }

    public final void n(boolean z, boolean z2) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        if (z2) {
            k();
        }
        this.j.c(z, this.b == 2);
    }

    public final void o(boolean z, boolean z2) {
        boolean z3 = false;
        if (z && hyq.j()) {
            int dimensionPixelOffset = this.r.getResources().getDimensionPixelOffset(this.r.getResources().getConfiguration().orientation == 1 ? R.dimen.f42180_resource_name_obfuscated_res_0x7f070697 : R.dimen.f42170_resource_name_obfuscated_res_0x7f070696);
            float f = gvv.f(this.r);
            if (f != 0.0f) {
                float a2 = gvv.a(this.r, this.h.a.c());
                int g = jbt.g(this.r, R.attr.f4940_resource_name_obfuscated_res_0x7f040120);
                if (a2 + dimensionPixelOffset + dimensionPixelOffset + g + g < f) {
                    z3 = true;
                }
            }
        }
        if (this.x == z3) {
            return;
        }
        this.x = z3;
        if (z2) {
            k();
        }
        t();
    }

    @Override // defpackage.hvw
    public final hun p() {
        hvk hvkVar = this.k;
        return hvkVar != null ? hvkVar.m() : this.d.a;
    }
}
