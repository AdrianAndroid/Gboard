package defpackage;

import android.widget.AbsListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lf  reason: default package */
/* loaded from: classes.dex */
public final class lf implements AbsListView.OnScrollListener {
    final /* synthetic */ lg a;

    public lf(lg lgVar) {
        this.a = lgVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.a.w() || this.a.q.getContentView() == null) {
            return;
        }
        lg lgVar = this.a;
        lgVar.o.removeCallbacks(lgVar.r);
        this.a.r.run();
    }
}
