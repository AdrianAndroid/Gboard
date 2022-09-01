package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jdo  reason: default package */
/* loaded from: classes.dex */
public class jdo extends ScrollView implements jda {
    private int a;
    private int b;
    private LinearLayout c;
    private jdr d;
    private gqc e;
    private float f;
    private int g;
    private int h;
    private final List i;
    private ict[] j;
    private final GestureDetector k;
    private final jdn l;

    public jdo(Context context) {
        this(context, null);
    }

    private final void a() {
        ict[] ictVarArr = this.j;
        int length = ictVarArr != null ? ictVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            ((SoftKeyView) this.i.get(i)).setVisibility(0);
            ((SoftKeyView) this.i.get(i)).getLayoutParams().height = this.h;
        }
        int i2 = this.b;
        if (i2 > 0 && length == i2) {
            int i3 = length - 1;
            ((SoftKeyView) this.i.get(i3)).getLayoutParams().height = this.g - (this.h * i3);
        }
        while (length < this.i.size()) {
            ((SoftKeyView) this.i.get(length)).setVisibility(8);
            length++;
        }
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.d = jdrVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (x < 0.0f || x >= getWidth() || y < 0.0f || y >= getHeight()) {
            return false;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public void gw(ict[] ictVarArr) {
        SoftKeyView softKeyView;
        if (this.j != ictVarArr) {
            if (ictVarArr != null && ictVarArr.length > this.b) {
                awakenScrollBars();
            }
            scrollTo(0, 0);
            this.j = ictVarArr;
            if (ictVarArr != null) {
                if (ictVarArr.length > this.i.size()) {
                    int length = this.j.length - this.i.size();
                    for (int i = 0; i < length; i++) {
                        if (this.a != 0) {
                            softKeyView = (SoftKeyView) View.inflate(getContext(), this.a, null);
                        } else {
                            softKeyView = new SoftKeyView(getContext());
                        }
                        softKeyView.o();
                        softKeyView.j(this.d);
                        softKeyView.i(this.e);
                        softKeyView.k(this.f);
                        this.i.add(softKeyView);
                        this.c.addView(softKeyView, new LinearLayout.LayoutParams(-1, 0));
                    }
                }
                for (int i2 = 0; i2 < this.j.length; i2++) {
                    ((SoftKeyView) this.i.get(i2)).n(this.j[i2]);
                }
            }
            a();
            invalidate();
        }
    }

    @Override // defpackage.jda
    public final boolean i(int i, ict ictVar) {
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 0) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.c = linearLayout;
            linearLayout.setOrientation(1);
            addView(this.c, new LinearLayout.LayoutParams(-1, -1));
            return;
        }
        throw new IllegalArgumentException("SoftKeyListHolderScrollView layout error!");
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (size != this.g) {
            this.g = size;
            int i3 = this.b;
            if (i3 != 0) {
                this.h = size / i3;
            }
            a();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.k.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && this.l.a) {
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.e = gqcVar;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.f = f * f2;
    }

    public jdo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        this.f = 1.0f;
        this.i = new ArrayList();
        jdn jdnVar = new jdn();
        this.l = jdnVar;
        if (attributeSet != null) {
            this.a = attributeSet.getAttributeResourceValue(null, "softkey_view_layout_id", this.a);
            this.b = jgd.d(context, attributeSet, null, "default_sub_view_count", this.b);
        }
        this.k = new GestureDetector(context, jdnVar);
    }
}
