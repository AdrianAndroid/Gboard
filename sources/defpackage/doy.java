package defpackage;

import android.graphics.PointF;
import android.util.SparseArray;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: doy  reason: default package */
/* loaded from: classes.dex */
public final class doy {
    public static final PointF a = new PointF(-1.0f, -1.0f);
    public boolean b;
    public boolean c;
    public doi g;
    public final SparseArray f = new SparseArray();
    public dox d = null;
    public final idk e = ieh.j();

    public static final int b(SoftKeyView softKeyView) {
        iay e = softKeyView.e();
        if (e == null) {
            return 3;
        }
        int i = e.c;
        if (e.d != iax.DECODE && !dox.b(softKeyView) && i != -10043 && ((i > 54 || i < 29) && (i > 16 || i < 7))) {
            return 3;
        }
        return dox.b(softKeyView) ? 2 : 1;
    }

    public final void a(SoftKeyboardView softKeyboardView) {
        if (softKeyboardView == null) {
            this.d = null;
            return;
        }
        this.b = ((Boolean) doa.cs.c()).booleanValue();
        this.c = ((Boolean) doa.ct.c()).booleanValue();
        this.d = new dox(softKeyboardView.f());
    }
}
