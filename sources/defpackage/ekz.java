package defpackage;

import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;

/* compiled from: PG */
/* renamed from: ekz  reason: default package */
/* loaded from: classes.dex */
public final class ekz extends alm {
    final /* synthetic */ ela a;
    final /* synthetic */ CategoryViewPager b;

    public ekz(CategoryViewPager categoryViewPager, ela elaVar) {
        this.b = categoryViewPager;
        this.a = elaVar;
    }

    @Override // defpackage.alm, defpackage.alj
    public final void a(int i) {
        if (i == 1) {
            this.b.k = 4;
        }
    }

    @Override // defpackage.alm, defpackage.alj
    public final void c(int i) {
        CategoryViewPager categoryViewPager = this.b;
        categoryViewPager.i = i;
        categoryViewPager.A(this.a, i, true);
    }
}
