package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: deb  reason: default package */
/* loaded from: classes.dex */
public class deb {
    private static final ltg k = ltg.j("com/google/android/apps/inputmethod/libs/framework/keyboard/widget/CandidateViewBuilder");
    public final ico a;
    public final Context b;
    public final dec c;
    public final xx d;
    public int e;
    public float f;
    public float g;
    public jdr h;
    public gqc i;
    public int[] j;
    private final iaj l;
    private int m;
    private final String n;
    private final String o;

    public deb(Context context, dec decVar) {
        this(context, decVar, null);
    }

    private final int c(int i) {
        return jbt.j(this.b, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(hln hlnVar, boolean z) {
        return this.c.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f8, code lost:
        if (android.text.TextUtils.isEmpty(r11) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.ico r17, defpackage.iaj r18, int r19, defpackage.hln r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deb.b(ico, iaj, int, hln, boolean):void");
    }

    public final ict d(int i, hln hlnVar) {
        return e(i, hlnVar, false);
    }

    public final ict e(int i, hln hlnVar, boolean z) {
        this.a.v();
        b(this.a, this.l, i, hlnVar, z);
        return this.a.c();
    }

    public final SoftKeyView f() {
        SoftKeyView softKeyView = new SoftKeyView(this.b);
        i(softKeyView);
        softKeyView.setFocusableInTouchMode(true);
        softKeyView.setSelected(false);
        softKeyView.setPressed(false);
        softKeyView.setBackgroundResource(c(this.c.k));
        softKeyView.setPadding(0, 0, 0, 0);
        softKeyView.j(this.h);
        softKeyView.i(this.i);
        h(softKeyView);
        return softKeyView;
    }

    public final SoftKeyView g(int i, hln hlnVar) {
        SoftKeyView softKeyView = (SoftKeyView) this.d.a();
        if (softKeyView == null) {
            softKeyView = f();
        }
        softKeyView.setPadding(0, 0, 0, 0);
        i(softKeyView);
        softKeyView.setBackgroundResource(c(this.c.k));
        h(softKeyView);
        softKeyView.n(d(i, hlnVar));
        softKeyView.setSelected(false);
        softKeyView.setPressed(false);
        softKeyView.j(this.h);
        softKeyView.i(this.i);
        return softKeyView;
    }

    public final void h(SoftKeyView softKeyView) {
        softKeyView.k(this.g * this.f);
    }

    public final void i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new LinearLayout.LayoutParams(this.m, this.e));
            return;
        }
        layoutParams.width = this.m;
        layoutParams.height = this.e;
        view.requestLayout();
    }

    public final void j(int i) {
        gyc.b.hP(new amh(this, i, 2));
    }

    public final void k(SoftKeyView softKeyView) {
        this.d.b(softKeyView);
    }

    public final void l(SoftKeyView softKeyView, boolean z, boolean z2) {
        AppCompatTextView appCompatTextView;
        int i = 8;
        if (this.j != null && (appCompatTextView = (AppCompatTextView) softKeyView.findViewById(R.id.f65240_resource_name_obfuscated_res_0x7f0b0749)) != null) {
            appCompatTextView.setVisibility(true != z ? 8 : 0);
        }
        softKeyView.setBackgroundResource(c(z2 ? this.c.l : this.c.k));
        View findViewById = softKeyView.findViewById(R.id.f52790_resource_name_obfuscated_res_0x7f0b00d0);
        if (findViewById != null) {
            if (true != z2) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }

    public deb(Context context, dec decVar, String str) {
        this(context, decVar, str, 30, 10);
    }

    public deb(Context context, dec decVar, String str, int i, int i2) {
        this.a = ict.d();
        this.l = ial.c();
        this.m = -2;
        this.e = -1;
        this.f = 1.0f;
        this.g = 1.0f;
        hjg.q();
        this.b = context;
        this.c = decVar;
        this.n = str;
        this.d = new xy(i);
        j(i2);
        this.o = context.getString(R.string.f156120_resource_name_obfuscated_res_0x7f140418);
    }
}
