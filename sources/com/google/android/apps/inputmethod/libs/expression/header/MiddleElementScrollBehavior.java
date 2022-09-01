package com.google.android.apps.inputmethod.libs.expression.header;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MiddleElementScrollBehavior extends tp {
    public boolean a = false;
    public int b = 0;
    private View c;

    public MiddleElementScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        RecyclerView recyclerView = (RecyclerView) view;
        if (this.c == null) {
            this.c = recyclerView;
        }
        if (!this.a) {
            coordinatorLayout.l(recyclerView, i);
            Iterator it = coordinatorLayout.b(recyclerView).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View view2 = (View) it.next();
                if (view2 instanceof LinearLayout) {
                    int measuredWidth = view2.getMeasuredWidth();
                    if (i == 1) {
                        measuredWidth = -measuredWidth;
                        i = 1;
                    }
                    recyclerView.setLeft(recyclerView.getLeft() + measuredWidth);
                    recyclerView.setRight(recyclerView.getRight() + measuredWidth);
                }
            }
            t(i == 1 ? this.b : -this.b);
        }
        return true;
    }

    @Override // defpackage.tp
    public final /* synthetic */ boolean k(View view, View view2) {
        RecyclerView recyclerView = (RecyclerView) view;
        return view2 instanceof LinearLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(int i) {
        View view = this.c;
        if (view != null) {
            aad.E(view, i);
        }
    }
}
