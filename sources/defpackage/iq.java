package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: iq  reason: default package */
/* loaded from: classes.dex */
public final class iq {
    public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static mko b(rl rlVar) {
        rj rjVar = new rj();
        rn rnVar = new rn(rjVar);
        rjVar.b = rnVar;
        rjVar.a = rlVar.getClass();
        try {
            Object a = rlVar.a(rjVar);
            if (a != null) {
                rjVar.a = a;
            }
        } catch (Exception e) {
            rnVar.a(e);
        }
        return rnVar;
    }
}
