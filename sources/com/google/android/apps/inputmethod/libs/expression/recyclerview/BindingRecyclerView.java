package com.google.android.apps.inputmethod.libs.expression.recyclerview;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BindingRecyclerView extends RecyclerView {
    private final List S = new ArrayList();

    public BindingRecyclerView(Context context) {
        super(context);
    }

    public final cuj a() {
        ls lsVar = this.l;
        if (lsVar instanceof cuj) {
            return (cuj) lsVar;
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void aC(dz dzVar) {
        super.aC(dzVar);
        if (dzVar instanceof cuk) {
            cuk cukVar = (cuk) dzVar;
            if (!this.S.remove(dzVar)) {
                return;
            }
            cukVar.e();
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void aa(ls lsVar) {
        ku ksVar;
        ly lyVar = this.m;
        if (lyVar instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) lyVar;
            if (lsVar instanceof cuj) {
                ksVar = new cul((cuj) lsVar, gridLayoutManager);
            } else {
                ksVar = new ks();
            }
            gridLayoutManager.g = ksVar;
        }
        super.aa(lsVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ab(ly lyVar) {
        cuj a;
        if ((lyVar instanceof GridLayoutManager) && (a = a()) != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) lyVar;
            gridLayoutManager.g = new cul(a, gridLayoutManager);
        }
        super.ab(lyVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void az(dz dzVar) {
        super.az(dzVar);
        if (dzVar instanceof cuk) {
            cuk cukVar = (cuk) dzVar;
            this.S.add(cukVar);
            cukVar.d(this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void gI() {
        super.gI();
        for (cuk cukVar : this.S) {
            cukVar.e();
        }
        this.S.clear();
    }

    public BindingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BindingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
