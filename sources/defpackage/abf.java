package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* renamed from: abf  reason: default package */
/* loaded from: classes.dex */
public final class abf extends uc {
    final WindowInsetsController a;
    protected final Window b;

    public abf(Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        new qv();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.uc
    public final void e(boolean z) {
        if (z) {
            View decorView = this.b.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            this.a.setSystemBarsAppearance(8, 8);
            return;
        }
        View decorView2 = this.b.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        this.a.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.uc
    public final boolean f() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }
}
