package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: epp  reason: default package */
/* loaded from: classes.dex */
public final class epp extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ epr a;

    public epp(epr eprVar) {
        this.a = eprVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.l = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        epr eprVar = this.a;
        if (eprVar.l) {
            eprVar.l = false;
            return false;
        }
        eprVar.f(eprVar.g + (-f), eprVar.h + (-f2));
        eprVar.e();
        return true;
    }
}
