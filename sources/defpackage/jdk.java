package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: jdk  reason: default package */
/* loaded from: classes.dex */
public final class jdk extends FrameLayout {
    public opu a;

    public jdk(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        opu opuVar = this.a;
        if (opuVar != null) {
            Object obj = opuVar.a;
            if (i == 0) {
                ilu iluVar = (ilu) obj;
                iluVar.n = SystemClock.uptimeMillis();
                if (iluVar.l <= 0) {
                    return;
                }
                ieh.j().g(idv.USER_ACTION_TO_POPUP_SHOWN, iluVar.n - iluVar.l);
                iluVar.l = 0L;
                return;
            }
            ilu iluVar2 = (ilu) obj;
            iluVar2.n = 0L;
            if (iluVar2.m <= 0) {
                return;
            }
            ieh.j().g(idv.USER_ACTION_TO_POPUP_HIDDEN, SystemClock.uptimeMillis() - iluVar2.m);
            iluVar2.m = 0L;
        }
    }
}
