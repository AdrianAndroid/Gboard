package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hoo  reason: default package */
/* loaded from: classes.dex */
public final class hoo {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionTooltip");
    public View c;
    public View d;
    public int[] e;
    public final View.OnLayoutChangeListener b = new huw(this, 1);
    private final int[] f = new int[2];

    public static void a() {
        hkp.b("inline_suggestion_tooltip", false);
    }

    public final void b(final Context context, View view, final int[] iArr, final Rect rect, Runnable runnable, String str, Runnable runnable2) {
        hky a2 = hlf.a();
        a2.p("inline_suggestion_tooltip");
        a2.m = 1;
        a2.s(R.layout.f135070_resource_name_obfuscated_res_0x7f0e00e6);
        a2.o(true);
        a2.m(context.getResources().getInteger(R.integer.f131640_resource_name_obfuscated_res_0x7f0c0060));
        a2.l(R.animator.f690_resource_name_obfuscated_res_0x7f020028);
        a2.h(R.animator.f700_resource_name_obfuscated_res_0x7f020029);
        a2.i(true);
        a2.a = new cfs(str, 4);
        a2.g(context.getString(R.string.f154280_resource_name_obfuscated_res_0x7f14035a));
        a2.c = view;
        a2.d = new hld() { // from class: hol
            @Override // defpackage.hld
            public final hlc a(View view2) {
                hoo hooVar = hoo.this;
                Context context2 = context;
                int[] iArr2 = iArr;
                Rect rect2 = rect;
                hooVar.c = view2;
                hooVar.d = view2.findViewById(R.id.f129980_resource_name_obfuscated_res_0x7f0b21ac);
                int maxWidth = ((AppCompatTextView) view2.findViewById(R.id.f130000_resource_name_obfuscated_res_0x7f0b21ae)).getMaxWidth();
                if (maxWidth <= 0) {
                    maxWidth = gvv.f(context2);
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                view2.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE), 0, layoutParams != null ? layoutParams.width : 0), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(gvv.d(context2), Integer.MIN_VALUE), 0, layoutParams != null ? layoutParams.height : 0));
                hooVar.c(iArr2);
                return hlc.a(0, iArr2[0], rect2 == null ? 0 : rect2.top - view2.getMeasuredHeight());
            }
        };
        a2.j = runnable;
        a2.i = new eii(this, runnable2, 10);
        hkq.b(a2.a());
    }

    public final void c(int[] iArr) {
        this.e = iArr;
        View view = this.c;
        if (view == null) {
            return;
        }
        if (view.getWidth() <= 0) {
            this.c.addOnLayoutChangeListener(this.b);
            return;
        }
        View view2 = this.d;
        if (view2 == null) {
            return;
        }
        int i = 0;
        int i2 = iArr[0];
        View view3 = this.c;
        if (view3 != null) {
            view3.getLocationOnScreen(this.f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            i = Math.max(view3.getPaddingLeft() + marginLayoutParams.leftMargin, Math.min(i2 - this.f[0], ((view3.getWidth() - view3.getPaddingRight()) - view2.getWidth()) - marginLayoutParams.rightMargin));
        }
        view2.setX(i);
    }
}
