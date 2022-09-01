package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* renamed from: alk  reason: default package */
/* loaded from: classes.dex */
public final class alk extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public alk(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.g();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.g();
    }
}
