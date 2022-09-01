package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yb  reason: default package */
/* loaded from: classes2.dex */
public final class yb extends View.AccessibilityDelegate {
    final yd a;

    public yb(yd ydVar) {
        this.a = ydVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        aqq i = this.a.i(view);
        if (i != null) {
            return (AccessibilityNodeProvider) i.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        abj b = abj.b(accessibilityNodeInfo);
        Boolean bool = (Boolean) aad.u().d(view);
        boolean z = true;
        boolean z2 = bool != null && bool.booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            b.b.setScreenReaderFocusable(z2);
        } else {
            b.f(1, z2);
        }
        Boolean bool2 = (Boolean) aad.t().d(view);
        if (bool2 == null || !bool2.booleanValue()) {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            b.b.setHeading(z);
        } else {
            b.f(2, z);
        }
        CharSequence z3 = aad.z(view);
        if (Build.VERSION.SDK_INT >= 28) {
            b.b.setPaneTitle(z3);
        } else {
            b.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", z3);
        }
        CharSequence charSequence = (CharSequence) aad.v().d(view);
        if (li.d()) {
            b.b.setStateDescription(charSequence);
        } else {
            b.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.b(view, b);
        CharSequence text = accessibilityNodeInfo.getText();
        if (Build.VERSION.SDK_INT < 26) {
            b.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            b.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            b.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            b.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray n = abj.n(view);
            if (n != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < n.size(); i2++) {
                    if (((WeakReference) n.valueAt(i2)).get() == null) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    n.remove(((Integer) arrayList.get(i3)).intValue());
                }
            }
            ClickableSpan[] m = abj.m(text);
            if (m != null && m.length > 0) {
                b.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.f51650_resource_name_obfuscated_res_0x7f0b001a);
                SparseArray n2 = abj.n(view);
                if (n2 == null) {
                    n2 = new SparseArray();
                    view.setTag(R.id.f129330_resource_name_obfuscated_res_0x7f0b2154, n2);
                }
                for (int i4 = 0; i4 < m.length; i4++) {
                    ClickableSpan clickableSpan = m[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 < n2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) n2.valueAt(i5)).get())) {
                                i = n2.keyAt(i5);
                                break;
                            }
                            i5++;
                        } else {
                            i = abj.a;
                            abj.a = i + 1;
                            break;
                        }
                    }
                    n2.put(i, new WeakReference(m[i4]));
                    ClickableSpan clickableSpan2 = m[i4];
                    Spanned spanned = (Spanned) text;
                    b.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    b.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    b.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    b.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List l = yd.l(view);
        for (int i6 = 0; i6 < l.size(); i6++) {
            b.e((abi) l.get(i6));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.h(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.d(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }
}
