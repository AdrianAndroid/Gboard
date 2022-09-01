package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.inputmethod.latin.R;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hwa  reason: default package */
/* loaded from: classes.dex */
public final class hwa extends hvk implements hho {
    private static final ltg j = ltg.j("com/google/android/libraries/inputmethod/keyboardmode/NormalModeController");
    public final hvz a;
    public int h;
    public iau i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwa(Context context, hvj hvjVar, hvx hvxVar) {
        super(context, hvjVar, hvxVar);
        hvz hvzVar = new hvz(context, hvjVar.c());
        this.a = hvzVar;
        this.i = hvjVar.d();
    }

    public static int d(Context context, iau iauVar, int i) {
        ((ltd) ((ltd) j.b()).k("com/google/android/libraries/inputmethod/keyboardmode/NormalModeController", "getKeyboardBodyViewHolderPaddingBottom", 111, "NormalModeController.java")).E("currentPrimeKeyboardType:%s systemPaddingBottom:%d", iauVar, i);
        if (iauVar != iau.SOFT) {
            return 0;
        }
        if (i != -1) {
            return i;
        }
        if (!jam.r(context)) {
            return (int) TypedValue.applyDimension(4, ((Double) hwq.e.c()).floatValue(), context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static int g(Context context) {
        if (jam.r(context)) {
            return n(context.getResources(), R.string.f175230_resource_name_obfuscated_res_0x7f140c59);
        }
        return n(context.getResources(), R.string.f175260_resource_name_obfuscated_res_0x7f140c5c);
    }

    private static int n(Resources resources, int i) {
        float b = jbt.b(resources, i, -1.0f);
        if (b < 0.0f) {
            return -1;
        }
        return (int) TypedValue.applyDimension(1, b, resources.getDisplayMetrics());
    }

    @Override // defpackage.hvk
    protected final int a() {
        return 0;
    }

    @Override // defpackage.hvk
    protected final int b() {
        return 0;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        if (set.contains(hwq.e) || set.contains(hwq.f)) {
            k();
        } else if (!set.contains(hwq.g)) {
        } else {
            l();
        }
    }

    public final void j() {
        this.h = g(this.b);
        k();
        l();
    }

    public final void k() {
        this.a.d = d(this.b, this.i, this.h);
        hvz hvzVar = this.a;
        int i = 0;
        if (!jam.r(this.b) && this.i == iau.SOFT) {
            i = (int) TypedValue.applyDimension(4, ((Double) hwq.f.c()).floatValue(), this.b.getResources().getDisplayMetrics());
        }
        hvzVar.e = i;
    }

    public final void l() {
        hvz hvzVar = this.a;
        int i = 0;
        if (hyq.i() && this.i == iau.SOFT && !jam.r(this.b) && hyq.h(this.b)) {
            i = (int) TypedValue.applyDimension(4, ((Double) hwq.g.c()).floatValue(), this.b.getResources().getDisplayMetrics());
        }
        hvzVar.f = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hvk
    public final hun m() {
        return this.a;
    }
}
