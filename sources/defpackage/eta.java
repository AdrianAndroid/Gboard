package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: eta  reason: default package */
/* loaded from: classes.dex */
final class eta extends di {
    private final int a;

    public eta(int i) {
        this.a = i;
    }

    @Override // defpackage.di
    public final void e(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        int i = this.a;
        rect.set(i, i, i, i);
    }
}
