package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.inline.InlineContentView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView;

/* compiled from: PG */
/* renamed from: coz  reason: default package */
/* loaded from: classes.dex */
public final class coz implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public coz(CoordinatorLayout coordinatorLayout, int i) {
        this.b = i;
        this.a = coordinatorLayout;
    }

    public coz(ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView, int i) {
        this.b = i;
        this.a = proactiveSuggestionsClippableHolderView;
    }

    public coz(cpa cpaVar, int i) {
        this.b = i;
        this.a = cpaVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
        int i = this.b;
        boolean z = true;
        if (i != 0) {
            if (i != 1 || (onHierarchyChangeListener = ((CoordinatorLayout) this.a).g) == null) {
                return;
            }
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        } else if (!(view instanceof ViewGroup)) {
        } else {
            int indexOfChild = ((ViewGroup) view).indexOfChild(view2);
            coq a = ((cpa) this.a).c.a(cox.a(indexOfChild));
            if (a == null) {
                ((ltd) cpa.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/EndAdapter$1", "onChildViewAdded", 47, "EndAdapter.java")).t("Element is null");
                return;
            }
            if (indexOfChild != ((cpa) this.a).b) {
                z = false;
            }
            cpa.a(view2, a, z);
            view2.setOnClickListener(((cpa) this.a).f);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (!(view2 instanceof InlineContentView)) {
                    return;
                }
                ((ProactiveSuggestionsClippableHolderView) this.a).b.add(view2);
                return;
            }
            ((CoordinatorLayout) this.a).k(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.a).g;
            if (onHierarchyChangeListener == null) {
                return;
            }
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
