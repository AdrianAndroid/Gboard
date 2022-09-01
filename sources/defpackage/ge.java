package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.inputmethod.libs.languageselection.preference.KeyboardLayoutListPreference;

/* compiled from: PG */
/* renamed from: ge  reason: default package */
/* loaded from: classes.dex */
public final class ge implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ge(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public ge(KeyboardLayoutListPreference keyboardLayoutListPreference, int i) {
        this.b = i;
        this.a = keyboardLayoutListPreference;
    }

    public ge(dxa dxaVar, int i) {
        this.b = i;
        this.a = dxaVar;
    }

    public ge(gg ggVar, int i) {
        this.b = i;
        this.a = ggVar;
    }

    public ge(gsh gshVar, int i) {
        this.b = i;
        this.a = gshVar;
    }

    public ge(hf hfVar, int i) {
        this.b = i;
        this.a = hfVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.b;
        if (i == 1) {
            ((View) this.a).removeOnAttachStateChangeListener(this);
            aad.K((View) this.a);
        } else if (i != 3 || !(view instanceof RecyclerView)) {
        } else {
            ((KeyboardLayoutListPreference) this.a).l((RecyclerView) view);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i == 0) {
            ViewTreeObserver viewTreeObserver = ((gg) this.a).e;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ((gg) this.a).e = view.getViewTreeObserver();
                }
                gg ggVar = (gg) this.a;
                ggVar.e.removeGlobalOnLayoutListener(ggVar.c);
            }
            view.removeOnAttachStateChangeListener(this);
        } else if (i == 1) {
        } else {
            if (i == 2) {
                ViewTreeObserver viewTreeObserver2 = ((hf) this.a).d;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ((hf) this.a).d = view.getViewTreeObserver();
                    }
                    hf hfVar = (hf) this.a;
                    hfVar.d.removeGlobalOnLayoutListener(hfVar.b);
                }
                view.removeOnAttachStateChangeListener(this);
            } else if (i != 3) {
                if (i == 4) {
                    kki.i(new dvd(this, 10, null), ((Long) dsu.t.c()).longValue());
                } else {
                    ((gsh) this.a).b();
                }
            } else {
                view.removeOnAttachStateChangeListener(this);
                KeyboardLayoutListPreference keyboardLayoutListPreference = (KeyboardLayoutListPreference) this.a;
                RecyclerView recyclerView = keyboardLayoutListPreference.a;
                if (recyclerView != view) {
                    return;
                }
                keyboardLayoutListPreference.c = recyclerView.m.R();
                ((KeyboardLayoutListPreference) this.a).a = null;
            }
        }
    }
}
