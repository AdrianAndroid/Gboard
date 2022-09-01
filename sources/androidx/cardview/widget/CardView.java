package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final add f;
    private static final int[] g = {16842801};
    public static final gw e = new gw();

    public CardView(Context context) {
        this(context, null);
    }

    public final float a() {
        return gw.b(this.f);
    }

    public void c(ColorStateList colorStateList) {
        qg qgVar = (qg) this.f.a;
        qgVar.a(colorStateList);
        qgVar.invalidateSelf();
    }

    public void d(float f) {
        ((View) this.f.b).setElevation(f);
    }

    public void e(float f) {
        qg qgVar = (qg) this.f.a;
        if (f == qgVar.a) {
            return;
        }
        qgVar.a = f;
        qgVar.b(null);
        qgVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f8730_resource_name_obfuscated_res_0x7f0402ba);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        add addVar = new add(this);
        this.f = addVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qf.a, i, R.style.f191260_resource_name_obfuscated_res_0x7f1501bb);
        aad.L(this, context, qf.a, attributeSet, obtainStyledAttributes, i, R.style.f191260_resource_name_obfuscated_res_0x7f1501bb);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.f21290_resource_name_obfuscated_res_0x7f0600d0);
            } else {
                color = getResources().getColor(R.color.f21280_resource_name_obfuscated_res_0x7f0600cf);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        qg qgVar = new qg(valueOf, dimension);
        addVar.a = qgVar;
        ((CardView) addVar.b).setBackgroundDrawable(qgVar);
        View view = (View) addVar.b;
        view.setClipToOutline(true);
        view.setElevation(dimension2);
        Object obj = addVar.a;
        boolean c = addVar.c();
        boolean b = addVar.b();
        qg qgVar2 = (qg) obj;
        if (dimension3 != qgVar2.b || qgVar2.c != c || qgVar2.d != b) {
            qgVar2.b = dimension3;
            qgVar2.c = c;
            qgVar2.d = b;
            qgVar2.b(null);
            qgVar2.invalidateSelf();
        }
        gw.d(addVar);
    }
}
