package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* renamed from: hun  reason: default package */
/* loaded from: classes.dex */
public class hun {
    protected final Context a;
    protected final htc b;
    protected int c;

    public hun(Context context, htc htcVar) {
        this.a = context;
        this.b = htcVar;
        this.c = gvv.e(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int w(Context context) {
        Resources resources = context.getResources();
        int b = jbi.b(context, "status_bar_height", "dimen", "android", false);
        if (b != 0) {
            return resources.getDimensionPixelSize(b);
        }
        return 0;
    }

    public /* synthetic */ float a() {
        return 1.0f;
    }

    public /* synthetic */ int b() {
        return 0;
    }

    public /* synthetic */ int c() {
        return 0;
    }

    public /* synthetic */ int d() {
        return 255;
    }

    public final int e() {
        return this.b.c() + this.b.d();
    }

    public /* synthetic */ int f() {
        return 0;
    }

    public /* synthetic */ int g() {
        return 0;
    }

    public /* synthetic */ int h() {
        return 0;
    }

    public /* synthetic */ int i() {
        return 0;
    }

    public /* synthetic */ int j() {
        return 0;
    }

    public /* synthetic */ int k() {
        return 0;
    }

    public /* synthetic */ int l() {
        return -1;
    }

    public /* synthetic */ int m() {
        return 0;
    }

    public /* synthetic */ int n() {
        return 0;
    }

    public /* synthetic */ int o() {
        return 0;
    }

    public /* synthetic */ int p() {
        return 0;
    }

    public /* synthetic */ Rect q() {
        return null;
    }

    public /* synthetic */ ViewOutlineProvider r() {
        return ViewOutlineProvider.BACKGROUND;
    }

    public void s() {
        this.c = gvv.e(this.a);
    }

    public /* synthetic */ boolean t() {
        return true;
    }

    public /* synthetic */ boolean u() {
        return false;
    }

    public /* synthetic */ boolean v() {
        return false;
    }
}
