package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zq  reason: default package */
/* loaded from: classes2.dex */
public final class zq implements View.OnApplyWindowInsetsListener {
    abc a = null;
    final /* synthetic */ View b;
    final /* synthetic */ yy c;

    public zq(View view, yy yyVar) {
        this.b = view;
        this.c = yyVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        abc n = abc.n(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            zr.i(windowInsets, this.b);
            if (n.equals(this.a)) {
                return this.c.a(view, n).e();
            }
        }
        this.a = n;
        abc a = this.c.a(view, n);
        if (Build.VERSION.SDK_INT >= 30) {
            return a.e();
        }
        aad.K(view);
        return a.e();
    }
}
