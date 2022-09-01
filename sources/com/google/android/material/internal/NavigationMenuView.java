package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements hb {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // defpackage.hb
    public final void a(gm gmVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ab(new LinearLayoutManager(1));
    }
}
