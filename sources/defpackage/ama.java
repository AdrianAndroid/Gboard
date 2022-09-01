package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* renamed from: ama  reason: default package */
/* loaded from: classes.dex */
public final class ama extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    public ama(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutManager
    public final void W(ml mlVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        int i = viewPager2.k;
        if (i == -1) {
            super.W(mlVar, iArr);
            return;
        }
        int b = viewPager2.b() * i;
        iArr[0] = b;
        iArr[1] = b;
    }

    @Override // defpackage.ly
    public final boolean bg(me meVar, ml mlVar, int i, Bundle bundle) {
        if (this.a.m.q(i)) {
            this.a.m.u(i);
            return false;
        }
        return super.bg(meVar, mlVar, i, bundle);
    }

    @Override // defpackage.ly
    public final boolean bh(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.ly
    public final void q(me meVar, ml mlVar, abj abjVar) {
        super.q(meVar, mlVar, abjVar);
        this.a.m.h(abjVar);
    }

    @Override // defpackage.ly
    public final void r(me meVar, ml mlVar, View view, abj abjVar) {
        this.a.m.i(view, abjVar);
    }
}
