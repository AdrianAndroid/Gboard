package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ot  reason: default package */
/* loaded from: classes2.dex */
public final class ot extends di implements ma {
    private oo A;
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final on j;
    int k;
    public RecyclerView m;
    VelocityTracker o;
    public Rect q;
    public long r;
    aqq s;
    private float u;
    private float v;
    private int x;
    private List y;
    private List z;
    final List a = new ArrayList();
    private final float[] t = new float[2];
    public mo b = null;
    int i = -1;
    private int w = 0;
    public final List l = new ArrayList();
    public final Runnable n = new od(this, 2);
    View p = null;
    private final mc B = new ok(this);

    public ot(on onVar) {
        this.j = onVar;
    }

    private final void r(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private final void s() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private static boolean t(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int u(int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.e > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.v);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= this.u && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            float width = this.m.getWidth() * 0.5f;
            if ((i & i3) != 0 && Math.abs(this.e) > width) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private final int v(int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.f > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null && this.i >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.v);
                float xVelocity = this.o.getXVelocity(this.i);
                float yVelocity = this.o.getYVelocity(this.i);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && abs >= this.u && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            float height = this.m.getHeight() * 0.5f;
            if ((i & i3) != 0 && Math.abs(this.f) > height) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    @Override // defpackage.ma
    public final void a(View view) {
    }

    @Override // defpackage.ma
    public final void b(View view) {
        n(view);
        mo gB = this.m.gB(view);
        if (gB == null) {
            return;
        }
        mo moVar = this.b;
        if (moVar == null || gB != moVar) {
            k(gB, false);
            if (!this.a.remove(gB.a)) {
                return;
            }
            this.j.g(this.m, gB);
            return;
        }
        o(null, 0);
    }

    @Override // defpackage.di
    public final void e(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        rect.setEmpty();
    }

    @Override // defpackage.di
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            r(this.t);
            float[] fArr = this.t;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        on onVar = this.j;
        mo moVar = this.b;
        List list = this.l;
        int i = this.w;
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            oq oqVar = (oq) list.get(i2);
            float f4 = oqVar.d;
            float f5 = oqVar.f;
            if (f4 == f5) {
                oqVar.l = oqVar.h.a.getTranslationX();
            } else {
                oqVar.l = f4 + (oqVar.p * (f5 - f4));
            }
            float f6 = oqVar.e;
            float f7 = oqVar.g;
            if (f6 == f7) {
                oqVar.m = oqVar.h.a.getTranslationY();
            } else {
                oqVar.m = f6 + (oqVar.p * (f7 - f6));
            }
            int save = canvas.save();
            onVar.h(canvas, recyclerView, oqVar.h, oqVar.l, oqVar.m, oqVar.i, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (moVar != null) {
            int save2 = canvas.save();
            onVar.h(canvas, recyclerView, moVar, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.di
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            r(this.t);
        }
        mo moVar = this.b;
        List list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            oq oqVar = (oq) list.get(i);
            int save = canvas.save();
            mo moVar2 = oqVar.h;
            float f = oqVar.l;
            float f2 = oqVar.m;
            int i2 = oqVar.i;
            canvas.restoreToCount(save);
        }
        if (moVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            oq oqVar2 = (oq) list.get(size);
            if (!oqVar2.o) {
                z = true;
            } else if (!oqVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View h(MotionEvent motionEvent) {
        oq oqVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        mo moVar = this.b;
        if (moVar != null) {
            View view2 = moVar.a;
            if (t(view2, x, y, this.g + this.e, this.h + this.f)) {
                return view2;
            }
        }
        int size = this.l.size();
        do {
            size--;
            if (size >= 0) {
                oqVar = (oq) this.l.get(size);
                view = oqVar.h.a;
            } else {
                RecyclerView recyclerView = this.m;
                int a = recyclerView.h.a();
                while (true) {
                    a--;
                    if (a < 0) {
                        return null;
                    }
                    View e = recyclerView.h.e(a);
                    float translationX = e.getTranslationX();
                    float translationY = e.getTranslationY();
                    if (x >= e.getLeft() + translationX && x <= e.getRight() + translationX && y >= e.getTop() + translationY && y <= e.getBottom() + translationY) {
                        return e;
                    }
                }
            }
        } while (!t(view, x, y, oqVar.l, oqVar.m));
        return view;
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aB(this);
            this.m.W(this.B);
            List list = this.m.u;
            if (list != null) {
                list.remove(this);
            }
            int size = this.l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                oq oqVar = (oq) this.l.get(0);
                oqVar.a();
                this.j.g(this.m, oqVar.h);
            }
            this.l.clear();
            this.p = null;
            s();
            oo ooVar = this.A;
            if (ooVar != null) {
                ooVar.a = false;
                this.A = null;
            }
            if (this.s != null) {
                this.s = null;
            }
        }
        this.m = recyclerView;
        if (recyclerView == null) {
            return;
        }
        Resources resources = recyclerView.getResources();
        this.u = resources.getDimension(R.dimen.f36890_resource_name_obfuscated_res_0x7f070308);
        this.v = resources.getDimension(R.dimen.f36880_resource_name_obfuscated_res_0x7f070307);
        this.x = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
        this.m.ay(this);
        this.m.s(this.B);
        this.m.r(this);
        this.A = new oo(this);
        this.s = new aqq(this.m.getContext(), this.A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i, MotionEvent motionEvent, int i2) {
        int c;
        View h;
        if (this.b != null || i != 2 || this.w == 2 || !this.j.k()) {
            return;
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView.C == 1) {
            return;
        }
        ly lyVar = recyclerView.m;
        int i3 = this.i;
        mo moVar = null;
        if (i3 != -1) {
            int findPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(findPointerIndex);
            float f = this.c;
            float y = motionEvent.getY(findPointerIndex);
            float f2 = this.d;
            float abs = Math.abs(x - f);
            float abs2 = Math.abs(y - f2);
            float f3 = this.x;
            if ((abs >= f3 || abs2 >= f3) && ((abs <= abs2 || !lyVar.ae()) && ((abs2 <= abs || !lyVar.af()) && (h = h(motionEvent)) != null))) {
                moVar = this.m.gB(h);
            }
        }
        if (moVar == null || (c = (this.j.c(this.m, moVar) >> 8) & 255) == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f4 = x2 - this.c;
        float f5 = y2 - this.d;
        float abs3 = Math.abs(f4);
        float abs4 = Math.abs(f5);
        float f6 = this.x;
        if (abs3 < f6 && abs4 < f6) {
            return;
        }
        if (abs3 > abs4) {
            if (f4 < 0.0f && (c & 4) == 0) {
                return;
            }
            if (f4 > 0.0f && (c & 8) == 0) {
                return;
            }
        } else if (f5 < 0.0f && (c & 1) == 0) {
            return;
        } else {
            if (f5 > 0.0f && (c & 2) == 0) {
                return;
            }
        }
        this.f = 0.0f;
        this.e = 0.0f;
        this.i = motionEvent.getPointerId(0);
        o(moVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(mo moVar, boolean z) {
        oq oqVar;
        int size = this.l.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            oqVar = (oq) this.l.get(size);
        } while (oqVar.h != moVar);
        oqVar.n |= z;
        if (!oqVar.o) {
            oqVar.a();
        }
        this.l.remove(size);
    }

    public final void l(mo moVar) {
        List list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        if (!this.m.isLayoutRequested() && this.w == 2) {
            int i3 = (int) (this.g + this.e);
            int i4 = (int) (this.h + this.f);
            if (Math.abs(i4 - moVar.a.getTop()) < moVar.a.getHeight() * 0.5f && Math.abs(i3 - moVar.a.getLeft()) < moVar.a.getWidth() * 0.5f) {
                return;
            }
            List list2 = this.y;
            if (list2 == null) {
                this.y = new ArrayList();
                this.z = new ArrayList();
            } else {
                list2.clear();
                this.z.clear();
            }
            int round = Math.round(this.g + this.e);
            int round2 = Math.round(this.h + this.f);
            int width = moVar.a.getWidth() + round;
            int height = moVar.a.getHeight() + round2;
            int i5 = (round + width) / 2;
            int i6 = (round2 + height) / 2;
            ly lyVar = this.m.m;
            int as = lyVar.as();
            int i7 = 0;
            while (i7 < as) {
                View aE = lyVar.aE(i7);
                if (aE != moVar.a && aE.getBottom() >= round2 && aE.getTop() <= height && aE.getRight() >= round && aE.getLeft() <= width) {
                    mo gB = this.m.gB(aE);
                    int abs5 = Math.abs(i5 - ((aE.getLeft() + aE.getRight()) / 2));
                    int abs6 = Math.abs(i6 - ((aE.getTop() + aE.getBottom()) / 2));
                    int i8 = (abs5 * abs5) + (abs6 * abs6);
                    int size = this.y.size();
                    i = round;
                    i2 = round2;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size) {
                        int i11 = size;
                        if (i8 <= ((Integer) this.z.get(i9)).intValue()) {
                            break;
                        }
                        i10++;
                        i9++;
                        size = i11;
                    }
                    this.y.add(i10, gB);
                    this.z.add(i10, Integer.valueOf(i8));
                } else {
                    i = round;
                    i2 = round2;
                }
                i7++;
                round = i;
                round2 = i2;
            }
            List list3 = this.y;
            if (list3.size() == 0) {
                return;
            }
            int width2 = moVar.a.getWidth() + i3;
            int height2 = moVar.a.getHeight() + i4;
            int left2 = i3 - moVar.a.getLeft();
            int top2 = i4 - moVar.a.getTop();
            int size2 = list3.size();
            mo moVar2 = null;
            int i12 = -1;
            int i13 = 0;
            while (i13 < size2) {
                mo moVar3 = (mo) list3.get(i13);
                if (left2 <= 0 || (right = moVar3.a.getRight() - width2) >= 0) {
                    list = list3;
                } else {
                    list = list3;
                    if (moVar3.a.getRight() > moVar.a.getRight() && (abs4 = Math.abs(right)) > i12) {
                        i12 = abs4;
                        moVar2 = moVar3;
                    }
                }
                if (left2 < 0 && (left = moVar3.a.getLeft() - i3) > 0 && moVar3.a.getLeft() < moVar.a.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    i12 = abs3;
                    moVar2 = moVar3;
                }
                if (top2 < 0 && (top = moVar3.a.getTop() - i4) > 0 && moVar3.a.getTop() < moVar.a.getTop() && (abs2 = Math.abs(top)) > i12) {
                    i12 = abs2;
                    moVar2 = moVar3;
                }
                if (top2 > 0 && (bottom = moVar3.a.getBottom() - height2) < 0 && moVar3.a.getBottom() > moVar.a.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    i12 = abs;
                    moVar2 = moVar3;
                }
                i13++;
                list3 = list;
            }
            if (moVar2 == null) {
                this.y.clear();
                this.z.clear();
                return;
            }
            int a = moVar2.a();
            moVar.a();
            if (!this.j.m(this.m, moVar, moVar2)) {
                return;
            }
            RecyclerView recyclerView = this.m;
            ly lyVar2 = recyclerView.m;
            if (lyVar2 instanceof os) {
                ((os) lyVar2).ap(moVar.a, moVar2.a);
                return;
            }
            if (lyVar2.ae()) {
                if (ly.bz(moVar2.a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.Y(a);
                }
                if (ly.bA(moVar2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.Y(a);
                }
            }
            if (!lyVar2.af()) {
                return;
            }
            if (ly.bB(moVar2.a) <= recyclerView.getPaddingTop()) {
                recyclerView.Y(a);
            }
            if (ly.by(moVar2.a) < recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                return;
            }
            recyclerView.Y(a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0093, code lost:
        if (r0 <= 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.mo r20, int r21) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot.o(mo, int):void");
    }

    public final void p(mo moVar) {
        if (!this.j.j(this.m, moVar)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (moVar.a.getParent() != this.m) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            m();
            this.f = 0.0f;
            this.e = 0.0f;
            o(moVar, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.c;
        this.e = f;
        this.f = y - this.d;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.e = f;
        }
        if ((i & 8) == 0) {
            this.e = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if ((i & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }
}
