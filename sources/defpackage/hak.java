package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* renamed from: hak  reason: default package */
/* loaded from: classes.dex */
public final class hak implements yy {
    private final /* synthetic */ int c;
    public static final hak b = new hak(1);
    public static final hak a = new hak(0);

    public hak(int i) {
        this.c = i;
    }

    @Override // defpackage.yy
    public final abc a(View view, abc abcVar) {
        aau aarVar;
        if (this.c == 0) {
            oll.e(view, "view");
            vq f = abcVar.f(7);
            view.setPadding(f.b, view.getPaddingTop(), f.d, view.getPaddingBottom());
            if (Build.VERSION.SDK_INT >= 30) {
                aarVar = new aat(abcVar);
            } else if (Build.VERSION.SDK_INT >= 29) {
                aarVar = new aas(abcVar);
            } else {
                aarVar = new aar(abcVar);
            }
            aarVar.g(7, vq.d(0, f.c, 0, f.e));
            return aarVar.a();
        }
        oll.e(view, "view");
        if (hqs.h(view)) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), abcVar.f(7).e);
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        }
        return abc.a;
    }
}
