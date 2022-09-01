package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: mb  reason: default package */
/* loaded from: classes.dex */
public abstract class mb {
    public RecyclerView a;
    public final dz b = new ni(this);

    public abstract View c(ly lyVar);

    public abstract int[] d(ly lyVar, View view);

    public final void f() {
        ly lyVar;
        View c;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (lyVar = recyclerView.m) == null || (c = c(lyVar)) == null) {
            return;
        }
        int[] d = d(lyVar, c);
        int i = 0;
        int i2 = d[0];
        if (i2 != 0) {
            i = i2;
        } else if (d[1] == 0) {
            return;
        }
        this.a.ad(i, d[1]);
    }
}
