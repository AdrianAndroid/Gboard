package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aie  reason: default package */
/* loaded from: classes.dex */
public final class aie extends di {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ aih d;

    public aie(aih aihVar) {
        this.d = aihVar;
    }

    private final boolean h(View view, RecyclerView recyclerView) {
        mo gB = recyclerView.gB(view);
        if (!(gB instanceof ais) || !((ais) gB).v) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        mo gB2 = recyclerView.gB(recyclerView.getChildAt(indexOfChild + 1));
        return (gB2 instanceof ais) && ((ais) gB2).u;
    }

    @Override // defpackage.di
    public final void e(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        if (h(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.di
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (h(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
