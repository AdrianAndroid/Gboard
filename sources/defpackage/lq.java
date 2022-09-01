package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* renamed from: lq  reason: default package */
/* loaded from: classes.dex */
public final class lq extends mk {
    final /* synthetic */ lr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(lr lrVar, Context context) {
        super(context);
        this.a = lrVar;
    }

    @Override // defpackage.mk
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mk
    public final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.mk
    protected final void c(View view, mi miVar) {
        lr lrVar = this.a;
        int[] d = lrVar.d(lrVar.a.m, view);
        int i = d[0];
        int i2 = d[1];
        int h = h(Math.max(Math.abs(i), Math.abs(i2)));
        if (h > 0) {
            miVar.b(i, i2, h, this.j);
        }
    }
}
