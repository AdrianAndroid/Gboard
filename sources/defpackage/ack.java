package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* renamed from: ack  reason: default package */
/* loaded from: classes.dex */
public final class ack extends yd {
    @Override // defpackage.yd
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.b() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        abk.c(accessibilityEvent, nestedScrollView.getScrollX());
        abk.d(accessibilityEvent, nestedScrollView.b());
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        int b;
        super.b(view, abjVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        abjVar.h(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (b = nestedScrollView.b()) <= 0) {
            return;
        }
        abjVar.l(true);
        if (nestedScrollView.getScrollY() > 0) {
            abjVar.e(abi.c);
            abjVar.e(abi.g);
        }
        if (nestedScrollView.getScrollY() >= b) {
            return;
        }
        abjVar.e(abi.b);
        abjVar.e(abi.h);
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        if (super.h(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int max = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.s(max);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        int min = Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.b());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.s(min);
        return true;
    }
}
