package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private final kyz d() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof kyz) {
                return (kyz) parent;
            }
        }
        return null;
    }

    private final boolean e(kyz kyzVar) {
        return kyzVar != null && this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        kyz d = d();
        if (!e(d) || rect == null) {
            return;
        }
        d.getFocusedRect(this.a);
        rect.bottom = this.a.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        kyz d = d();
        if (e(d)) {
            return d.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        if (d() != null) {
            throw null;
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (d() == null) {
            return;
        }
        throw null;
    }

    @Override // android.support.v7.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null || editorInfo.hintText != null) {
            return onCreateInputConnection;
        }
        if (d() != null) {
            throw null;
        }
        editorInfo.hintText = null;
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        kyz d = d();
        if (!e(d) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.a.set(rect.left, rect.top, rect.right, rect.bottom + (d.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.a);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f11150_resource_name_obfuscated_res_0x7f0403dc);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(kzb.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a = kve.a(context, attributeSet, kyy.b, i, R.style.f204010_resource_name_obfuscated_res_0x7f150849, new int[0]);
        this.b = a.getBoolean(0, false);
        a.recycle();
    }
}
