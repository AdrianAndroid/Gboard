package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: btz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class btz implements View.OnHoverListener {
    private final /* synthetic */ int f;
    public static final /* synthetic */ btz e = new btz(5);
    public static final /* synthetic */ btz d = new btz(3);
    public static final /* synthetic */ btz c = new btz(2);
    public static final /* synthetic */ btz b = new btz(1);
    public static final /* synthetic */ btz a = new btz(0);

    public /* synthetic */ btz(int i) {
        this.f = i;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i = this.f;
        if (i == 3) {
            ltg ltgVar = dxm.a;
            return true;
        } else if (i != 4) {
            if (i != 5) {
                return true;
            }
            lug lugVar = hvx.a;
            return true;
        } else if (motionEvent.getAction() != 10) {
            return false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x < 0.0f || x >= view.getWidth() || y < 0.0f || y >= view.getHeight()) {
                return false;
            }
            view.performClick();
            return false;
        }
    }
}
