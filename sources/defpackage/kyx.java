package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kyx  reason: default package */
/* loaded from: classes.dex */
public final class kyx extends hz {
    public final lg a;
    public final int b;
    public final ColorStateList c;
    private final AccessibilityManager d;
    private final Rect e = new Rect();
    private final int f;

    public kyx(Context context, AttributeSet attributeSet) {
        super(kzb.a(context, attributeSet, R.attr.f7930_resource_name_obfuscated_res_0x7f040258, 0), attributeSet, R.attr.f7930_resource_name_obfuscated_res_0x7f040258);
        Context context2 = getContext();
        TypedArray a = kve.a(context2, attributeSet, kyy.a, R.attr.f7930_resource_name_obfuscated_res_0x7f040258, R.style.f203460_resource_name_obfuscated_res_0x7f1507f9, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = a.getResourceId(2, R.layout.f143550_resource_name_obfuscated_res_0x7f0e046f);
        this.f = resourceId;
        a.getDimensionPixelOffset(1, R.dimen.f40220_resource_name_obfuscated_res_0x7f070505);
        this.b = a.getColor(3, 0);
        this.c = kws.b(context2, a, 4);
        this.d = (AccessibilityManager) context2.getSystemService("accessibility");
        lg lgVar = new lg(context2, null, R.attr.f14100_resource_name_obfuscated_res_0x7f040531);
        this.a = lgVar;
        lgVar.y();
        lgVar.l = this;
        lgVar.x();
        lgVar.e(getAdapter());
        lgVar.m = new kna(this, 2);
        if (a.hasValue(5)) {
            setAdapter(new kyw(this, getContext(), resourceId, getResources().getStringArray(a.getResourceId(5, 0))));
        }
        a.recycle();
    }

    private final kyz d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof kyz) {
                return (kyz) parent;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        if (d() != null) {
            throw null;
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (d() == null) {
            return;
        }
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            kyz d = d();
            int i3 = 0;
            if (adapter == null || d == null) {
                setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
            int min = Math.min(adapter.getCount(), Math.max(0, this.a.o()) + 15);
            int max = Math.max(0, min - 15);
            View view = null;
            int i4 = 0;
            while (max < min) {
                int itemViewType = adapter.getItemViewType(max);
                int i5 = itemViewType != i3 ? itemViewType : i3;
                if (itemViewType != i3) {
                    view = null;
                }
                view = adapter.getView(max, view, d);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i4 = Math.max(i4, view.getMeasuredWidth());
                max++;
                i3 = i5;
            }
            Drawable c = this.a.c();
            if (c != null) {
                c.getPadding(this.e);
                int i6 = this.e.left;
                int i7 = this.e.right;
            }
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.n = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        if (d() == null) {
            return;
        }
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.a.s();
        }
    }
}
