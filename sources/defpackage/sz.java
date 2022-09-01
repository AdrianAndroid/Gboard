package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* renamed from: sz  reason: default package */
/* loaded from: classes2.dex */
public final class sz {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public sz(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            return false;
        }
        return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
    }

    public final void a(rz rzVar, sh shVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int baseline;
        int max;
        int max2;
        int i;
        int i2;
        int i3;
        if (rzVar == null) {
            return;
        }
        if (rzVar.ah == 8) {
            shVar.c = 0;
            shVar.d = 0;
            shVar.e = 0;
        } else if (rzVar.U == null) {
        } else {
            int i4 = shVar.i;
            int i5 = shVar.j;
            int i6 = shVar.a;
            int i7 = shVar.b;
            int i8 = this.b + this.c;
            int i9 = this.d;
            Object obj = rzVar.ag;
            int i10 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i10 == 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i10 == 1) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
            } else if (i10 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
                int i11 = rzVar.s;
                int i12 = shVar.h;
                if (i12 == 1 || i12 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int h = rzVar.h();
                    if (shVar.h == 2 || i11 != 1 || measuredHeight == h || (obj instanceof tj) || rzVar.e()) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(rzVar.j(), 1073741824);
                    }
                }
            } else if (i10 != 3) {
                makeMeasureSpec = 0;
            } else {
                int i13 = this.f;
                ry ryVar = rzVar.J;
                int i14 = ryVar != null ? ryVar.f : 0;
                ry ryVar2 = rzVar.L;
                if (ryVar2 != null) {
                    i14 += ryVar2.f;
                }
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i9 + i14, -1);
            }
            int i15 = i5 - 1;
            if (i5 != 0) {
                if (i15 == 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else if (i15 == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                } else if (i15 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                    int i16 = rzVar.t;
                    int i17 = shVar.h;
                    if (i17 == 1 || i17 == 2) {
                        int measuredWidth = ((View) obj).getMeasuredWidth();
                        int j = rzVar.j();
                        if (shVar.h == 2 || i16 != 1 || measuredWidth == j || (obj instanceof tj) || rzVar.f()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(rzVar.h(), 1073741824);
                        }
                    }
                } else if (i15 != 3) {
                    makeMeasureSpec2 = 0;
                } else {
                    int i18 = this.g;
                    int i19 = rzVar.J != null ? rzVar.K.f : 0;
                    if (rzVar.L != null) {
                        i19 += rzVar.M.f;
                    }
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i8 + i19, -1);
                }
                rz rzVar2 = rzVar.U;
                if (rzVar2 != null && se.b(this.h.e, 256)) {
                    View view = (View) obj;
                    if (view.getMeasuredWidth() == rzVar.j() && view.getMeasuredWidth() < rzVar2.j() && view.getMeasuredHeight() == rzVar.h() && view.getMeasuredHeight() < rzVar2.h() && view.getBaseline() == rzVar.ab && !rzVar.J() && b(rzVar.H, makeMeasureSpec, rzVar.j()) && b(rzVar.I, makeMeasureSpec2, rzVar.h())) {
                        shVar.c = rzVar.j();
                        shVar.d = rzVar.h();
                        shVar.e = rzVar.ab;
                        return;
                    }
                }
                boolean z = i5 == 4 || i5 == 1;
                boolean z2 = i4 == 4 || i4 == 1;
                boolean z3 = i4 == 3 && rzVar.X > 0.0f;
                boolean z4 = i5 == 3 && rzVar.X > 0.0f;
                if (obj == null) {
                    return;
                }
                View view2 = (View) obj;
                sy syVar = (sy) view2.getLayoutParams();
                int i20 = shVar.h;
                if (i20 != 1 && i20 != 2 && i4 == 3 && rzVar.s == 0 && i5 == 3 && rzVar.t == 0) {
                    i2 = -1;
                    baseline = 0;
                    max = 0;
                    max2 = 0;
                } else if (!(obj instanceof tm) || !(rzVar instanceof sf)) {
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    rzVar.z(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                    int i21 = rzVar.v;
                    max = i21 > 0 ? Math.max(i21, measuredWidth2) : measuredWidth2;
                    int i22 = rzVar.w;
                    if (i22 > 0) {
                        max = Math.min(i22, max);
                    }
                    int i23 = rzVar.y;
                    max2 = i23 > 0 ? Math.max(i23, measuredHeight2) : measuredHeight2;
                    int i24 = rzVar.z;
                    if (i24 > 0) {
                        max2 = Math.min(i24, max2);
                    }
                    if (!se.b(this.h.e, 1)) {
                        if (z3 && z) {
                            max = (int) ((max2 * rzVar.X) + 0.5f);
                        } else if (z4 && z2) {
                            max2 = (int) ((max / rzVar.X) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != max || measuredHeight2 != max2) {
                        if (measuredWidth2 != max) {
                            i = 1073741824;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        } else {
                            i = 1073741824;
                        }
                        if (measuredHeight2 != max2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, i);
                        }
                        view2.measure(makeMeasureSpec, makeMeasureSpec2);
                        rzVar.z(makeMeasureSpec, makeMeasureSpec2);
                        max = view2.getMeasuredWidth();
                        max2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                    }
                    i2 = -1;
                } else {
                    sf sfVar = (sf) rzVar;
                    tm tmVar = (tm) obj;
                    throw null;
                }
                boolean z5 = baseline != i2;
                shVar.g = (max == shVar.a && max2 == shVar.b) ? false : true;
                boolean z6 = z5 | syVar.ac;
                if (z6) {
                    if (baseline == -1) {
                        i3 = -1;
                        shVar.c = max;
                        shVar.d = max2;
                        shVar.f = z6;
                        shVar.e = i3;
                        return;
                    } else if (rzVar.ab != baseline) {
                        shVar.g = true;
                    }
                }
                i3 = baseline;
                shVar.c = max;
                shVar.d = max2;
                shVar.f = z6;
                shVar.e = i3;
                return;
            }
            throw null;
        }
    }
}
