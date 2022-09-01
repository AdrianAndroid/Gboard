package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zw  reason: default package */
/* loaded from: classes2.dex */
public final class zw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(View view, int i) {
        return view.requireViewById(i);
    }

    static void c(View view, final aab aabVar) {
        qv qvVar = (qv) view.getTag(R.id.f129430_resource_name_obfuscated_res_0x7f0b215f);
        if (qvVar == null) {
            qvVar = new qv();
            view.setTag(R.id.f129430_resource_name_obfuscated_res_0x7f0b215f, qvVar);
        }
        Objects.requireNonNull(aabVar);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: zv
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return aab.this.a();
            }
        };
        qvVar.put(aabVar, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    static void d(View view, aab aabVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        qv qvVar = (qv) view.getTag(R.id.f129430_resource_name_obfuscated_res_0x7f0b215f);
        if (qvVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) qvVar.get(aabVar)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(View view) {
        return view.isScreenReaderFocusable();
    }
}
