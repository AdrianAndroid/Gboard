package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: kyw  reason: default package */
/* loaded from: classes.dex */
final class kyw extends ArrayAdapter {
    final /* synthetic */ kyx a;
    private final ColorStateList b;
    private final ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyw(kyx kyxVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        ColorStateList colorStateList;
        this.a = kyxVar;
        ColorStateList colorStateList2 = null;
        if (!b()) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{kyxVar.c.getColorForState(iArr, 0), 0});
        }
        this.c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{vo.c(kyxVar.c.getColorForState(iArr3, 0), kyxVar.b), vo.c(kyxVar.c.getColorForState(iArr2, 0), kyxVar.b), kyxVar.b});
        }
        this.b = colorStateList2;
    }

    private final boolean a() {
        return this.a.b != 0;
    }

    private final boolean b() {
        return this.a.c != null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            RippleDrawable rippleDrawable = null;
            if (this.a.getText().toString().contentEquals(textView.getText()) && a()) {
                ColorDrawable colorDrawable = new ColorDrawable(this.a.b);
                if (this.c != null) {
                    wf.g(colorDrawable, this.b);
                    rippleDrawable = new RippleDrawable(this.c, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            aad.O(textView, rippleDrawable);
        }
        return view2;
    }
}
