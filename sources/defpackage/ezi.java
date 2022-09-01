package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: ezi  reason: default package */
/* loaded from: classes.dex */
public final class ezi implements eyx {
    private static final iay u = new iay(-10079, null, "source");
    private static final iay v = new iay(-10079, null, "target");
    public final Context a;
    public ezn b;
    public boolean c;
    public boolean d;
    public View e;
    public View f;
    public View g;
    public View h;
    public View i;
    public View j;
    public SoftKeyView k;
    public SoftKeyView l;
    public SoftKeyView m;
    public SoftKeyView n;
    public SoftKeyView o;
    public AppCompatTextView p;
    public AppCompatTextView q;
    public AppCompatEditText r;
    public View s;
    public FrameLayout t;
    private final String w;
    private final String x;

    public ezi(Context context) {
        this.a = context;
        this.d = jam.t(context);
        this.w = context.getString(R.string.f176860_resource_name_obfuscated_res_0x7f140d01);
        this.x = context.getString(R.string.f176890_resource_name_obfuscated_res_0x7f140d04);
    }

    private static void d(View view, String str, String str2, boolean z) {
        String format = String.format(str2, str);
        if (!((Boolean) ezg.d.c()).booleanValue()) {
            if (view == null) {
                return;
            }
            view.setContentDescription(format);
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
            if (appCompatTextView == null) {
                return;
            }
            appCompatTextView.setText(str);
        } else if (!(view instanceof SoftKeyView)) {
        } else {
            ico d = ict.d();
            d.f(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745, str);
            d.n = R.layout.f146910_resource_name_obfuscated_res_0x7f0e05f6;
            iaj c = ial.c();
            c.b = iah.PRESS;
            iay[] iayVarArr = new iay[1];
            iayVarArr[0] = z ? u : v;
            c.c = iayVarArr;
            d.p(c.b());
            d.h = format;
            d.x = true;
            ((SoftKeyView) view).n(d.c());
        }
    }

    private static void e(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public final void a() {
        String c = this.b.b.c();
        d(this.l, c, this.w, true);
        d(this.n, c, this.w, true);
        String c2 = this.b.c.c();
        d(this.m, c2, this.x, false);
        d(this.o, c2, this.x, false);
        boolean g = this.b.g();
        SoftKeyView softKeyView = this.k;
        if (softKeyView != null) {
            softKeyView.setEnabled(g);
            ((ImageView) this.k.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265)).setAlpha(true != g ? 0.5f : 1.0f);
        }
    }

    public final void b() {
        View view;
        boolean booleanValue = ((Boolean) ezg.d.c()).booleanValue();
        int i = 0;
        boolean z = this.c && this.d;
        View view2 = this.e;
        if (view2 != null) {
            view2.setActivated(booleanValue || z);
            AppCompatTextView appCompatTextView = this.p;
            if (appCompatTextView != null) {
                appCompatTextView.setActivated(z);
            }
            AppCompatTextView appCompatTextView2 = this.q;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setActivated(z);
            }
            if (!jam.r(this.a) && (view = this.f) != null) {
                view.setVisibility((z || booleanValue) ? 0 : 8);
            }
            View view3 = this.g;
            if (view3 != null) {
                view3.setVisibility((booleanValue || !z) ? 8 : 0);
            }
            View view4 = this.h;
            if (view4 != null) {
                if (true != booleanValue) {
                    i = 8;
                }
                view4.setVisibility(i);
            }
            AppCompatEditText appCompatEditText = this.r;
            if (appCompatEditText != null) {
                appCompatEditText.setCursorVisible(this.c);
                AppCompatEditText appCompatEditText2 = this.r;
                int i2 = 5;
                if (booleanValue && !z) {
                    i2 = 4;
                }
                appCompatEditText2.setTextAlignment(i2);
            }
            View view5 = this.s;
            if (view5 == null) {
                return;
            }
            view5.setActivated(this.c);
        }
    }

    public final void c() {
        AppCompatTextView appCompatTextView;
        String string;
        if (this.e != null) {
            if (this.d) {
                e(this.r, 0);
                e(this.i, 8);
                return;
            }
            e(this.r, 8);
            e(this.i, 0);
            View view = this.i;
            if (view == null || (appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f130180_resource_name_obfuscated_res_0x7f0b21c9)) == null) {
                return;
            }
            if (jam.t(this.a)) {
                string = this.a.getString(R.string.f176760_resource_name_obfuscated_res_0x7f140cf7);
            } else {
                string = this.a.getString(R.string.f176820_resource_name_obfuscated_res_0x7f140cfd);
            }
            appCompatTextView.setText(string);
        }
    }
}
