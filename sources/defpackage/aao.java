package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* renamed from: aao  reason: default package */
/* loaded from: classes.dex */
public final class aao {
    public static void a(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
