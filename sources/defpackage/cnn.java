package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: cnn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cnn implements View.OnTouchListener {
    private final /* synthetic */ int f;
    public static final /* synthetic */ cnn e = new cnn(4);
    public static final /* synthetic */ cnn d = new cnn(3);
    public static final /* synthetic */ cnn c = new cnn(2);
    public static final /* synthetic */ cnn b = new cnn(1);
    public static final /* synthetic */ cnn a = new cnn(0);

    public /* synthetic */ cnn(int i) {
        this.f = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f;
        if (i == 0) {
            Interpolator interpolator = cny.a;
            if (motionEvent.getAction() == 1) {
                view.performClick();
            }
            return true;
        } else if (i != 2) {
            if (i == 4 && motionEvent.getAction() == 1) {
                view.performClick();
            }
            return true;
        } else {
            ltg ltgVar = dxm.a;
            return true;
        }
    }
}
