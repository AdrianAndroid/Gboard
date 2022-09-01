package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* renamed from: jdz  reason: default package */
/* loaded from: classes.dex */
public final class jdz extends ArrayAdapter {
    public jdz(Context context, int i, Object[] objArr) {
        super(context, i, 16908308, objArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof jeb) {
            ((jeb) view2).a(getCount(), i);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
