package defpackage;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hxu  reason: default package */
/* loaded from: classes.dex */
public final class hxu extends BaseAdapter {
    private final Context b;
    private final int c;
    private hqt e;
    private final List f;
    private final List d = new ArrayList();
    public final ijj a = new ckp(this, 8);

    public hxu(Context context, int i, List list) {
        this.b = context;
        this.c = i;
        this.f = list;
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(hqr.b());
        this.d.addAll(this.f);
        this.e = hqp.b();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
