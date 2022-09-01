package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kk  reason: default package */
/* loaded from: classes.dex */
public class kk extends ListView {
    public boolean a;
    public az b;
    private final Rect c = new Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private ki i;
    private final boolean j;
    private boolean k;
    private acc l;

    public kk(Context context, boolean z) {
        super(context, null, R.attr.f11080_resource_name_obfuscated_res_0x7f0403d3);
        this.j = z;
        setCacheColorHint(0);
    }

    private final void c(boolean z) {
        ki kiVar = this.i;
        if (kiVar != null) {
            kiVar.a = z;
        }
    }

    private final void d() {
        Drawable selector = getSelector();
        if (selector == null || !this.k || !isPressed()) {
            return;
        }
        selector.setState(getDrawableState());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.a(android.view.MotionEvent, int):boolean");
    }

    public final int b(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        int i5 = 0;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            int i6 = itemViewType != i5 ? itemViewType : i5;
            if (itemViewType != i5) {
                view = null;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i4 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
            i4++;
            i5 = i6;
        }
        return i3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.b != null) {
            return;
        }
        super.drawableStateChanged();
        c(true);
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.j && this.a) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.b == null) {
                az azVar = new az(this, 10);
                this.b = azVar;
                ((kk) azVar.a).post(azVar);
            }
            actionMasked = 10;
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT < 30 || !kg.a) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        kg.a(this, pointToPosition, childAt);
                    }
                }
                d();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        az azVar = this.b;
        if (azVar != null) {
            kk kkVar = (kk) azVar.a;
            kkVar.b = null;
            kkVar.removeCallbacks(azVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        ki kiVar = drawable != null ? new ki(drawable) : null;
        this.i = kiVar;
        super.setSelector(kiVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
