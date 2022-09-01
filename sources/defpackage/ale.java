package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* renamed from: ale  reason: default package */
/* loaded from: classes.dex */
public final class ale implements yy {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public ale(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.yy
    public final abc a(View view, abc abcVar) {
        aau aarVar;
        abc y = aad.y(view, abcVar);
        if (y.r()) {
            return y;
        }
        Rect rect = this.b;
        rect.left = y.b();
        rect.top = y.d();
        rect.right = y.c();
        rect.bottom = y.a();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            abc w = aad.w(this.a.getChildAt(i), y);
            rect.left = Math.min(w.b(), rect.left);
            rect.top = Math.min(w.d(), rect.top);
            rect.right = Math.min(w.c(), rect.right);
            rect.bottom = Math.min(w.a(), rect.bottom);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            aarVar = new aat(y);
        } else if (Build.VERSION.SDK_INT >= 29) {
            aarVar = new aas(y);
        } else {
            aarVar = new aar(y);
        }
        aarVar.c(vq.c(rect));
        return aarVar.a();
    }
}
