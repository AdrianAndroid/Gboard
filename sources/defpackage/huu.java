package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.ViewOutlineProvider;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: huu  reason: default package */
/* loaded from: classes.dex */
public final class huu extends hun {
    private final ViewOutlineProvider A;
    private final String B;
    private final int C;
    private String D;
    public float h;
    public int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean o;
    public int p;
    public int q;
    public int r;
    private final float t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;
    private static final ltg s = ltg.j("com/google/android/libraries/inputmethod/keyboardmode/FloatingKeyboardModeData");
    public static final ice[] d = {ice.HEADER};
    public static final ice[] e = {ice.BODY};
    public final Rect g = new Rect();
    public final Rect n = new Rect();
    public final ino f = ino.L();

    public huu(Context context, htc htcVar, boolean z, String str) {
        super(context, htcVar);
        int d2;
        TypedArray typedArray;
        float f;
        this.D = "";
        this.o = z;
        this.B = str;
        this.D = B(context);
        Resources resources = context.getResources();
        this.v = context.getResources().getDimensionPixelSize(R.dimen.f34610_resource_name_obfuscated_res_0x7f0701b7);
        this.l = resources.getDimensionPixelSize(R.dimen.f34460_resource_name_obfuscated_res_0x7f0701a8);
        this.m = resources.getDimensionPixelSize(R.dimen.f34450_resource_name_obfuscated_res_0x7f0701a7);
        this.k = resources.getDimensionPixelSize(R.dimen.f34410_resource_name_obfuscated_res_0x7f0701a3);
        this.u = resources.getDimensionPixelSize(R.dimen.f34570_resource_name_obfuscated_res_0x7f0701b3);
        this.w = resources.getDimensionPixelSize(R.dimen.f34430_resource_name_obfuscated_res_0x7f0701a5);
        this.x = resources.getDimensionPixelSize(R.dimen.f34590_resource_name_obfuscated_res_0x7f0701b5);
        this.C = resources.getDimensionPixelSize(R.dimen.f34600_resource_name_obfuscated_res_0x7f0701b6);
        if (z) {
            d2 = resources.getDimensionPixelSize(R.dimen.f34620_resource_name_obfuscated_res_0x7f0701b8);
        } else {
            d2 = jam.d(context);
        }
        this.i = d2;
        this.y = resources.getDimensionPixelSize(R.dimen.f34560_resource_name_obfuscated_res_0x7f0701b2);
        this.z = resources.getDimensionPixelSize(R.dimen.f34530_resource_name_obfuscated_res_0x7f0701af);
        this.A = new hut(resources.getDimensionPixelSize(R.dimen.f34420_resource_name_obfuscated_res_0x7f0701a4));
        try {
            typedArray = context.getTheme().obtainStyledAttributes(hwl.a);
            try {
                this.j = typedArray.getDimensionPixelSize(9, 0);
                if (!z) {
                    f = typedArray.getFloat(11, 1.0f);
                } else {
                    f = typedArray.getFloat(12, 1.0f);
                }
                this.t = f;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                gvv.f(context);
                C(context, htcVar);
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

    private static String B(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i == 2) {
                return "_land_";
            }
            return "_undefined_" + i + "_";
        }
        return "";
    }

    private final void C(Context context, htc htcVar) {
        D(context, htcVar);
        float a = this.f.a(y(context, R.string.f161220_resource_name_obfuscated_res_0x7f14069a), -1.0f);
        if (a == -1.0f) {
            a = this.t;
        }
        this.h = a;
        A(context, htcVar);
        z(context);
    }

    private final void D(Context context, htc htcVar) {
        int w = w(context);
        this.g.left = 0;
        this.g.top = this.o ? -this.C : w + this.x + this.v;
        this.g.right = gvv.f(context);
        int d2 = (this.c - htcVar.d()) - Math.max(0, htcVar.c());
        this.g.bottom = d2 - x();
        this.p = d2 - this.g.top;
    }

    public final void A(Context context, htc htcVar) {
        float f;
        float a = this.f.a(y(context, R.string.f161240_resource_name_obfuscated_res_0x7f14069c), -1.0f);
        if (a != -1.0f) {
            int e2 = htcVar.e(d);
            int e3 = htcVar.e(e);
            if (e2 < 0 || e3 < 0) {
                ((ltd) ((ltd) s.d()).k("com/google/android/libraries/inputmethod/keyboardmode/FloatingKeyboardModeData", "calculateFloatingKeyboardHeight", 326, "FloatingKeyboardModeData.java")).t("The keyboard height is not available!");
                f = 0.0f;
            } else {
                float f2 = this.h;
                f = (e3 * f2) + (e2 * ((float) Math.sqrt(f2)));
            }
            int x = x();
            this.r = ((int) (a * (((this.p - f) - f()) - x))) + x;
            return;
        }
        this.r = this.j + this.k;
    }

    @Override // defpackage.hun
    public final float a() {
        return this.h;
    }

    @Override // defpackage.hun
    public final int b() {
        if (this.o) {
            return R.layout.f134720_resource_name_obfuscated_res_0x7f0e00b9;
        }
        return 0;
    }

    @Override // defpackage.hun
    public final int d() {
        return 0;
    }

    @Override // defpackage.hun
    public final int f() {
        if (this.o) {
            return this.z;
        }
        return 0;
    }

    @Override // defpackage.hun
    public final int h() {
        return this.k;
    }

    @Override // defpackage.hun
    public final int j() {
        if (this.o) {
            return this.y;
        }
        return 0;
    }

    @Override // defpackage.hun
    public final int k() {
        return this.u;
    }

    @Override // defpackage.hun
    public final int l() {
        return this.i;
    }

    @Override // defpackage.hun
    public final int m() {
        return this.v;
    }

    @Override // defpackage.hun
    public final int n() {
        return this.q;
    }

    @Override // defpackage.hun
    public final int o() {
        return this.r;
    }

    @Override // defpackage.hun
    public final int p() {
        return this.p;
    }

    @Override // defpackage.hun
    public final Rect q() {
        D(this.a, this.b);
        return this.g;
    }

    @Override // defpackage.hun
    public final ViewOutlineProvider r() {
        return this.o ? this.A : ViewOutlineProvider.BACKGROUND;
    }

    @Override // defpackage.hun
    public final void s() {
        super.s();
        this.D = B(this.a);
        C(this.a, this.b);
    }

    @Override // defpackage.hun
    public final boolean t() {
        return false;
    }

    @Override // defpackage.hun
    public final boolean u() {
        return !this.o;
    }

    @Override // defpackage.hun
    public final boolean v() {
        return true;
    }

    public final int x() {
        if (this.o) {
            return 0;
        }
        return this.w;
    }

    public final String y(Context context, int i) {
        String str = this.B;
        String str2 = this.D;
        String string = context.getString(i);
        return str + str2 + string;
    }

    public final void z(Context context) {
        int i = this.i;
        this.q = (int) (this.f.a(y(context, R.string.f161230_resource_name_obfuscated_res_0x7f14069b), 0.5f) * (gvv.f(context) - (i * this.h)));
    }
}
