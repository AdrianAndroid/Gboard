package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ktu  reason: default package */
/* loaded from: classes.dex */
public final class ktu extends cu {
    public Drawable b;
    private final Rect c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ktu(android.content.Context r12, int r13) {
        /*
            r11 = this;
            int r0 = s(r12)
            r1 = 0
            r2 = 2130969148(0x7f04023c, float:1.754697E38)
            r3 = 2132083561(0x7f150369, float:1.9807268E38)
            android.content.Context r4 = defpackage.kzb.a(r12, r1, r2, r3)
            if (r0 != 0) goto L12
            goto L18
        L12:
            po r5 = new po
            r5.<init>(r4, r0)
            r4 = r5
        L18:
            if (r13 != 0) goto L1e
            int r13 = s(r12)
        L1e:
            r11.<init>(r4, r13)
            android.content.Context r12 = r11.a()
            android.content.res.Resources$Theme r13 = r12.getTheme()
            r6 = 0
            int[] r7 = defpackage.ktv.a
            r8 = 2130969148(0x7f04023c, float:1.754697E38)
            r9 = 2132083561(0x7f150369, float:1.9807268E38)
            r0 = 0
            int[] r10 = new int[r0]
            r5 = r12
            android.content.res.TypedArray r4 = defpackage.kve.a(r5, r6, r7, r8, r9, r10)
            android.content.res.Resources r5 = r12.getResources()
            r6 = 2131166378(0x7f0704aa, float:1.7947E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r6 = 2
            int r5 = r4.getDimensionPixelSize(r6, r5)
            android.content.res.Resources r6 = r12.getResources()
            r7 = 2131166379(0x7f0704ab, float:1.7947002E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r7 = 3
            int r6 = r4.getDimensionPixelSize(r7, r6)
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131166377(0x7f0704a9, float:1.7946998E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 1
            int r7 = r4.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r9 = r12.getResources()
            r10 = 2131166376(0x7f0704a8, float:1.7946996E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r0 = r4.getDimensionPixelSize(r0, r9)
            r4.recycle()
            android.content.res.Resources r4 = r12.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.getLayoutDirection()
            if (r4 != r8) goto L8c
            r9 = r5
            goto L8d
        L8c:
            r9 = r7
        L8d:
            if (r4 != r8) goto L90
            r5 = r7
        L90:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r5, r6, r9, r0)
            r11.c = r4
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r4 = 2130969430(0x7f040356, float:1.7547542E38)
            android.util.TypedValue r0 = defpackage.kws.e(r12, r4, r0)
            int r0 = defpackage.kxc.i(r12, r0)
            kxe r4 = new kxe
            r4.<init>(r12, r1, r2, r3)
            r4.j(r12)
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r0)
            r4.l(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r12 < r0) goto Lef
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r13.resolveAttribute(r0, r12, r8)
            android.content.Context r13 = r11.a()
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r12.getDimension(r13)
            int r12 = r12.type
            r0 = 5
            if (r12 != r0) goto Lef
            r12 = 0
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 < 0) goto Lef
            kxd r12 = r4.a
            kxj r12 = r12.a
            kxj r12 = r12.d(r13)
            r4.ic(r12)
        Lef:
            r11.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktu.<init>(android.content.Context, int):void");
    }

    private static int s(Context context) {
        TypedValue d = kws.d(context, R.attr.f14530_resource_name_obfuscated_res_0x7f040560);
        if (d == null) {
            return 0;
        }
        return d.data;
    }

    @Override // defpackage.cu
    public final cv b() {
        cv b = super.b();
        Window window = b.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.b;
        if (drawable instanceof kxe) {
            ((kxe) drawable).k(aad.a(decorView));
        }
        Drawable drawable2 = this.b;
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ktt(b, this.c));
        return b;
    }

    public final void o(CharSequence charSequence) {
        super.g(charSequence);
    }

    public final void p(int i, DialogInterface.OnClickListener onClickListener) {
        super.l(R.string.f158090_resource_name_obfuscated_res_0x7f140505, onClickListener);
    }

    public final void q(int i, DialogInterface.OnClickListener onClickListener) {
        super.n(R.string.f158100_resource_name_obfuscated_res_0x7f140506, onClickListener);
    }

    public final void r(int i) {
        super.j(R.string.f158120_resource_name_obfuscated_res_0x7f140508);
    }
}
