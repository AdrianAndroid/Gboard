package com.google.android.apps.inputmethod.libs.framework.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InputView extends FrameLayout {
    public static final hhl a = hhq.a("filter_obscured_touch", false);
    public static final gzy b = new gzy("Draw event");
    private static final gzy f = new gzy("Touch event");
    public KeyboardViewHolder d;
    public Rect e;
    private KeyboardViewHolder j;
    private KeyboardViewHolder k;
    private hsr l;
    private final hhk m;
    private final Matrix g = new Matrix();
    private boolean h = true;
    public int c = 0;
    private int i = -1;

    public InputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bvl bvlVar = new bvl(this, 11);
        this.m = bvlVar;
        setImportantForAccessibility(1);
        setOutlineProvider(new dcw());
        hhl hhlVar = a;
        setFilterTouchesWhenObscured(((Boolean) hhlVar.c()).booleanValue());
        hhlVar.e(bvlVar);
    }

    public static InputView a(Context context, hsr hsrVar) {
        InputView inputView = (InputView) View.inflate(context, R.layout.f135040_resource_name_obfuscated_res_0x7f0e00e3, null);
        inputView.l = hsrVar;
        return inputView;
    }

    public final KeyboardViewHolder b(ice iceVar) {
        ice iceVar2 = ice.HEADER;
        int ordinal = iceVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.k;
            }
            return null;
        }
        return this.j;
    }

    public final void c(boolean z) {
        if (this.h != z) {
            this.h = z;
            View findViewById = findViewById(R.id.f57530_resource_name_obfuscated_res_0x7f0b0429);
            if (findViewById != null) {
                findViewById.setVisibility(true != z ? 0 : 8);
            }
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hsr hsrVar = this.l;
        if (hsrVar != null && hsrVar.a) {
            hsrVar.b = true;
        }
        b.a("dispatchDraw(<canvas>)");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        hsr hsrVar = this.l;
        if (hsrVar != null && hsrVar.a) {
            hsrVar.c = true;
        }
        gzy gzyVar = f;
        int action = motionEvent.getAction();
        gzyVar.e("dispatchTouchEvent(action=" + action + ")");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.k = (KeyboardViewHolder) findViewById(R.id.f58150_resource_name_obfuscated_res_0x7f0b0469);
        this.j = (KeyboardViewHolder) findViewById(R.id.keyboard_header_view_holder);
        this.d = (KeyboardViewHolder) findViewById(R.id.f54740_resource_name_obfuscated_res_0x7f0b01c2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b.d("onLayout(%b, %d, %d, %d, %d)", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b.c("onMeasure(%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
        int measuredHeight = getMeasuredHeight();
        if (!this.h && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.getSize(i2));
        }
        if (this.c != measuredHeight) {
            this.c = measuredHeight;
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        KeyboardViewHolder keyboardViewHolder;
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        Rect rect = this.e;
        boolean z = false;
        if (rect != null && rect.contains((int) motionEvent.getX(actionIndex), (int) motionEvent.getY(actionIndex))) {
            z = true;
        }
        if (((actionMasked == 0 && z) || this.i == pointerId) && (keyboardViewHolder = this.k) != null && keyboardViewHolder.isShown()) {
            jdy.c(this.g, this, this.k);
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.transform(this.g);
            boolean dispatchTouchEvent = this.k.dispatchTouchEvent(obtain);
            obtain.recycle();
            if (actionMasked == 0) {
                this.i = pointerId;
            } else if (actionMasked == 1) {
                this.i = -1;
            }
            return dispatchTouchEvent;
        }
        return super.onTouchEvent(motionEvent);
    }
}
