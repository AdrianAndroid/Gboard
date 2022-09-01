package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ok  reason: default package */
/* loaded from: classes2.dex */
public final class ok implements mc {
    final /* synthetic */ ot a;

    public ok(ot otVar) {
        this.a = otVar;
    }

    @Override // defpackage.mc
    public final void h(boolean z) {
        if (!z) {
            return;
        }
        this.a.o(null, 0);
    }

    @Override // defpackage.mc
    public final boolean n(MotionEvent motionEvent) {
        int findPointerIndex;
        this.a.s.o(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        oq oqVar = null;
        if (actionMasked == 0) {
            this.a.i = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            this.a.m();
            ot otVar = this.a;
            if (otVar.b == null) {
                if (!otVar.l.isEmpty()) {
                    View h = otVar.h(motionEvent);
                    int size = otVar.l.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        oq oqVar2 = (oq) otVar.l.get(size);
                        if (oqVar2.h.a == h) {
                            oqVar = oqVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (oqVar != null) {
                    ot otVar2 = this.a;
                    otVar2.c -= oqVar.l;
                    otVar2.d -= oqVar.m;
                    otVar2.k(oqVar.h, true);
                    if (this.a.a.remove(oqVar.h.a)) {
                        ot otVar3 = this.a;
                        otVar3.j.g(otVar3.m, oqVar.h);
                    }
                    this.a.o(oqVar.h, oqVar.i);
                    ot otVar4 = this.a;
                    otVar4.q(motionEvent, otVar4.k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            ot otVar5 = this.a;
            otVar5.i = -1;
            otVar5.o(null, 0);
        } else {
            int i = this.a.i;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                this.a.j(actionMasked, motionEvent, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.a.b != null;
    }

    @Override // defpackage.mc
    public final void o(MotionEvent motionEvent) {
        this.a.s.o(motionEvent);
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.a.i == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(this.a.i);
        if (findPointerIndex >= 0) {
            this.a.j(actionMasked, motionEvent, findPointerIndex);
        }
        ot otVar = this.a;
        mo moVar = otVar.b;
        if (moVar == null) {
            return;
        }
        int i = 0;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex < 0) {
                    return;
                }
                otVar.q(motionEvent, otVar.k, findPointerIndex);
                this.a.l(moVar);
                ot otVar2 = this.a;
                otVar2.m.removeCallbacks(otVar2.n);
                this.a.n.run();
                this.a.m.invalidate();
                return;
            } else if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                ot otVar3 = this.a;
                if (pointerId != otVar3.i) {
                    return;
                }
                if (actionIndex == 0) {
                    i = 1;
                }
                otVar3.i = motionEvent.getPointerId(i);
                ot otVar4 = this.a;
                otVar4.q(motionEvent, otVar4.k, actionIndex);
                return;
            } else {
                VelocityTracker velocityTracker2 = otVar.o;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
        }
        this.a.o(null, 0);
        this.a.i = -1;
    }
}
