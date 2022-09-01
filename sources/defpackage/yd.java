package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: yd  reason: default package */
/* loaded from: classes2.dex */
public class yd {
    private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate b;
    public final View.AccessibilityDelegate c;

    public yd() {
        this(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List l(View view) {
        List list = (List) view.getTag(R.id.f129320_resource_name_obfuscated_res_0x7f0b2153);
        return list == null ? Collections.emptyList() : list;
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, abj abjVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, abjVar.b);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, int i) {
        this.b.sendAccessibilityEvent(view, i);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean f(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List l = l(view);
        int i2 = 0;
        while (true) {
            if (i2 >= l.size()) {
                break;
            }
            abi abiVar = (abi) l.get(i2);
            if (abiVar.a() != i) {
                i2++;
            } else if (abiVar.l != null) {
                Class cls = abiVar.k;
                if (cls != null) {
                    try {
                        ud udVar = (ud) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        Class cls2 = abiVar.k;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                    }
                }
                z = abiVar.l.a(view);
            }
        }
        z = false;
        if (!z) {
            z = yc.b(this.b, view, i, bundle);
        }
        if (z || i != R.id.f51650_resource_name_obfuscated_res_0x7f0b001a || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.f129330_resource_name_obfuscated_res_0x7f0b2154);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        ClickableSpan[] m = abj.m(view.createAccessibilityNodeInfo().getText());
        for (int i4 = 0; m != null && i4 < m.length; i4++) {
            if (clickableSpan.equals(m[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public aqq i(View view) {
        AccessibilityNodeProvider a2 = yc.a(this.b, view);
        if (a2 != null) {
            return new aqq(a2, (byte[]) null);
        }
        return null;
    }

    public yd(View.AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.c = new yb(this);
    }
}
