package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, gl, hb {
    private static final int[] a = {16842964, 16843049};
    private gm b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // defpackage.hb
    public final void a(gm gmVar) {
        this.b = gmVar;
    }

    @Override // defpackage.gl
    public final boolean b(go goVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((go) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        gkn w = gkn.w(context, attributeSet, a, i, 0);
        if (w.t(0)) {
            setBackgroundDrawable(w.n(0));
        }
        if (w.t(1)) {
            setDivider(w.n(1));
        }
        w.r();
    }
}
