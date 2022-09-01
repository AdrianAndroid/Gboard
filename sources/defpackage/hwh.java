package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hwh  reason: default package */
/* loaded from: classes.dex */
public final class hwh extends hun {
    private static final ltg o = ltg.j("com/google/android/libraries/inputmethod/keyboardmode/OneHandedKeyboardModeData");
    public final ino d;
    public float e;
    public final float f;
    public int g;
    public int h;
    public final int i;
    public int j;
    public final int k;
    public int l;
    public int m;
    public int n;
    private final int p;
    private final int q;
    private final Rect r = new Rect();
    private final int s;
    private final int t;
    private final int u;
    private int v;

    public hwh(Context context, htc htcVar) {
        super(context, htcVar);
        TypedArray typedArray;
        this.d = ino.M(context);
        Resources resources = context.getResources();
        this.p = Integer.parseInt(resources.getString(R.string.f160170_resource_name_obfuscated_res_0x7f14062e));
        this.q = Integer.parseInt(resources.getString(R.string.f160140_resource_name_obfuscated_res_0x7f14062b));
        this.t = context.getResources().getDimensionPixelSize(R.dimen.f41370_resource_name_obfuscated_res_0x7f0705cb);
        this.s = context.getResources().getDimensionPixelSize(R.dimen.f41330_resource_name_obfuscated_res_0x7f0705c5);
        this.u = context.getResources().getDimensionPixelSize(R.dimen.f41350_resource_name_obfuscated_res_0x7f0705c9);
        try {
            typedArray = context.getTheme().obtainStyledAttributes(hwl.c);
            try {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(6, 0);
                this.i = dimensionPixelSize;
                this.h = dimensionPixelSize;
                float f = typedArray.getFloat(7, 1.0f);
                this.f = f;
                this.e = f;
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(3, 0);
                this.k = dimensionPixelSize2;
                this.j = dimensionPixelSize2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                F(context, htcVar);
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    private final void F(Context context, htc htcVar) {
        G(context, htcVar);
        float m = this.d.m(R.string.f162230_resource_name_obfuscated_res_0x7f140700, -1.0f);
        if (m == -1.0f) {
            m = this.f;
        }
        this.e = m;
        int n = this.d.n(R.string.f162250_resource_name_obfuscated_res_0x7f140702, -1);
        if (n == -1) {
            n = this.i;
        }
        this.h = n;
        int n2 = this.d.n(R.string.f162220_resource_name_obfuscated_res_0x7f1406ff, -1);
        if (n2 == -1) {
            n2 = this.k;
        }
        this.j = n2;
        this.m = this.d.n(R.string.f162240_resource_name_obfuscated_res_0x7f140701, 0);
        this.n = this.d.n(R.string.f162260_resource_name_obfuscated_res_0x7f140703, x(context));
        int n3 = this.d.n(R.string.f162310_resource_name_obfuscated_res_0x7f140708, this.p);
        this.g = n3;
        this.l = n3 == this.q ? this.m : this.n;
    }

    private final void G(Context context, htc htcVar) {
        int d = (this.c - htcVar.d()) - htcVar.c();
        this.v = d - w(context);
        this.r.left = 0;
        this.r.top = d - this.s;
        this.r.right = gvv.f(context);
        this.r.bottom = d;
    }

    public final void A() {
        E(C() ? this.p : this.q);
    }

    public final boolean C() {
        return this.g == this.q;
    }

    public final boolean D(int i) {
        return i == this.q || i == this.p;
    }

    public final boolean E(int i) {
        if (!D(i)) {
            ((ltd) o.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardmode/OneHandedKeyboardModeData", "setOneHandedMode", 219, "OneHandedKeyboardModeData.java")).t("Invalid one handed mode!");
            return false;
        } else if (this.g == i) {
            return false;
        } else {
            this.g = i;
            this.l = C() ? this.m : this.n;
            this.d.s(R.string.f162310_resource_name_obfuscated_res_0x7f140708, i);
            this.d.u(R.string.f162210_resource_name_obfuscated_res_0x7f1406fe, String.valueOf(this.g));
            return true;
        }
    }

    @Override // defpackage.hun
    public final float a() {
        return this.e;
    }

    @Override // defpackage.hun
    public final int h() {
        return this.j;
    }

    @Override // defpackage.hun
    public final int k() {
        return this.t;
    }

    @Override // defpackage.hun
    public final int l() {
        return gvv.f(this.a);
    }

    @Override // defpackage.hun
    public final int n() {
        return this.l;
    }

    @Override // defpackage.hun
    public final int o() {
        return this.h + this.j;
    }

    @Override // defpackage.hun
    public final int p() {
        return this.v;
    }

    @Override // defpackage.hun
    public final Rect q() {
        G(this.a, this.b);
        return this.r;
    }

    @Override // defpackage.hun
    public final void s() {
        super.s();
        F(this.a, this.b);
    }

    @Override // defpackage.hun
    public final boolean u() {
        return true;
    }

    public final int x(Context context) {
        return (int) (gvv.f(context) * (1.0f - this.f));
    }

    public final int y() {
        return z(this.l);
    }

    public final int z(int i) {
        return Math.abs(((int) (gvv.f(this.a) * (1.0f - this.e))) - i);
    }

    public final void B(int i, int i2) {
        if (i2 >= 0) {
            int i3 = this.h;
            if (i2 > i3) {
                this.j -= i2 - i3;
                this.h = 0;
            } else {
                this.h = i3 - i2;
            }
        } else {
            int i4 = this.j;
            int i5 = this.u;
            if (i4 < i5) {
                int min = Math.min(i5, i4 - i2);
                this.j = min;
                this.h -= (i2 - i4) + min;
            } else {
                this.h -= i2;
            }
        }
        this.l += i;
        int y = y();
        if (C()) {
            if (y >= this.l) {
                return;
            }
        } else if (this.l >= y) {
            return;
        }
        this.l = y;
        if (C()) {
            this.m = y;
            this.n = z(y);
        } else {
            this.m = z(y);
            this.n = this.l;
        }
        A();
    }
}
