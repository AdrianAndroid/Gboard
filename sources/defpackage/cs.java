package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* renamed from: cs  reason: default package */
/* loaded from: classes.dex */
final class cs extends ArrayAdapter {
    public cs(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, 16908308, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
