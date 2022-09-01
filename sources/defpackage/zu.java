package defpackage;

import android.view.View;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: zu  reason: default package */
/* loaded from: classes2.dex */
final class zu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    static int b(View view) {
        return view.getNextClusterForwardId();
    }

    static View c(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    static void d(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    static void e(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    static void f(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, int i) {
        view.setImportantForAutofill(i);
    }

    static void h(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    static void i(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    static void j(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    static boolean k(View view) {
        return view.hasExplicitFocusable();
    }

    static boolean l(View view) {
        return view.isFocusedByDefault();
    }

    static boolean m(View view) {
        return view.isImportantForAutofill();
    }

    static boolean n(View view) {
        return view.isKeyboardNavigationCluster();
    }

    static boolean o(View view) {
        return view.restoreDefaultFocus();
    }
}
