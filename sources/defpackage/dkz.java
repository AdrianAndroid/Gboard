package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: dkz  reason: default package */
/* loaded from: classes.dex */
public final class dkz extends BaseAdapter {
    final /* synthetic */ dla a;

    public dkz(dla dlaVar) {
        this.a = dlaVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.i.a();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return Integer.valueOf(this.a.i.b(i));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LinearLayout dkyVar;
        if (view != null) {
            dkyVar = (LinearLayout) view;
        } else {
            dkyVar = new dky(this.a.getContext());
            dkyVar.setOrientation(0);
            dkyVar.setBackgroundResource(jbt.j(this.a.getContext(), this.a.a));
            dkyVar.setMinimumHeight(this.a.e);
            dkyVar.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            dkyVar.setAccessibilityDelegate(new View.AccessibilityDelegate());
        }
        dkyVar.setMinimumHeight(this.a.e);
        int b = this.a.i.b(i);
        int c = this.a.i.c(i) + b;
        while (b < c) {
            hln hlnVar = (hln) this.a.g.get(b);
            int i2 = b + 1;
            boolean z = true;
            boolean z2 = i2 == c && (this.a.b == 0 || i > 0);
            dla dlaVar = this.a;
            SoftKeyView g = dlaVar.f.g(dlaVar.getChildCount(), hlnVar);
            g.o();
            this.a.f.l(g, false, z2);
            if (b != this.a.h) {
                z = false;
            }
            g.setSelected(z);
            dkyVar.addView(g, new LinearLayout.LayoutParams(((Integer) this.a.i.e.get(b)).intValue(), -1));
            b = i2;
        }
        return dkyVar;
    }
}
