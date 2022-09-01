package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray a = new SparseArray();
    public ArrayList b = new ArrayList(4);
    protected sa c = new sa();
    private int i = 0;
    private int j = 0;
    private int k = Integer.MAX_VALUE;
    private int l = Integer.MAX_VALUE;
    protected boolean d = true;
    public int e = 257;
    public th f = null;
    private int m = -1;
    public HashMap g = new HashMap();
    private SparseArray n = new SparseArray();
    sz h = new sz(this, this);

    public ConstraintLayout(Context context) {
        super(context);
        g(null, 0, 0);
    }

    public static final sy f() {
        return new sy();
    }

    private final void g(AttributeSet attributeSet, int i, int i2) {
        sa saVar = this.c;
        saVar.ag = this;
        sz szVar = this.h;
        saVar.aG = szVar;
        saVar.a.g = szVar;
        this.a.put(getId(), this);
        this.f = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tl.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(17, this.j);
                } else if (index == 14) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(14, this.k);
                } else if (index == 15) {
                    this.l = obtainStyledAttributes.getDimensionPixelOffset(15, this.l);
                } else if (index == 113) {
                    this.e = obtainStyledAttributes.getInt(113, this.e);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            jc.d(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        th thVar = new th();
                        this.f = thVar;
                        thVar.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.U(this.e);
    }

    private final void h() {
        this.d = true;
    }

    private final void i() {
        int i;
        int i2;
        rz rzVar;
        rz rzVar2;
        rz rzVar3;
        rz rzVar4;
        sy syVar;
        rz rzVar5;
        int i3;
        int i4;
        float parseFloat;
        sd sdVar;
        rz b;
        String str;
        int d;
        rz rzVar6;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            rz b2 = b(getChildAt(i5));
            if (b2 != null) {
                b2.s();
            }
        }
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    Integer valueOf = Integer.valueOf(childAt.getId());
                    if (resourceName instanceof String) {
                        if (this.g == null) {
                            this.g = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        this.g.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, Integer.valueOf(valueOf.intValue()));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id = childAt.getId();
                    if (id == 0) {
                        rzVar6 = this.c;
                    } else {
                        View view = (View) this.a.get(id);
                        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                            onViewAdded(view);
                        }
                        if (view == this) {
                            rzVar6 = this.c;
                        } else {
                            rzVar6 = view == null ? null : ((sy) view.getLayoutParams()).ar;
                        }
                    }
                    rzVar6.ai = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.m != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getId() == this.m && (childAt2 instanceof ti)) {
                    ti tiVar = (ti) childAt2;
                    throw null;
                }
            }
        }
        th thVar = this.f;
        if (thVar != null) {
            thVar.l(this);
        }
        this.c.aI.clear();
        int size = this.b.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                sw swVar = (sw) this.b.get(i8);
                if (swVar.isInEditMode()) {
                    String str2 = swVar.f;
                    swVar.f = null;
                }
                sd sdVar2 = swVar.h;
                if (sdVar2 != null) {
                    sdVar2.as = 0;
                    Arrays.fill(sdVar2.ar, (Object) null);
                    for (int i9 = 0; i9 < swVar.d; i9++) {
                        int i10 = swVar.c[i9];
                        View a = a(i10);
                        if (a == null && (d = swVar.d(this, (str = (String) swVar.g.get(Integer.valueOf(i10))))) != 0) {
                            swVar.c[i9] = d;
                            swVar.g.put(Integer.valueOf(d), str);
                            a = a(d);
                        }
                        if (a != null && (b = b(a)) != (sdVar = swVar.h) && b != null) {
                            int i11 = sdVar.as;
                            rz[] rzVarArr = sdVar.ar;
                            int length = rzVarArr.length;
                            if (i11 + 1 > length) {
                                sdVar.ar = (rz[]) Arrays.copyOf(rzVarArr, length + length);
                            }
                            rz[] rzVarArr2 = sdVar.ar;
                            int i12 = sdVar.as;
                            rzVarArr2[i12] = b;
                            sdVar.as = i12 + 1;
                        }
                    }
                    sd sdVar3 = swVar.h;
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt3 = getChildAt(i13);
            if (childAt3 instanceof tj) {
                tj tjVar = (tj) childAt3;
                throw null;
            }
        }
        this.n.clear();
        this.n.put(0, this.c);
        this.n.put(getId(), this.c);
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt4 = getChildAt(i14);
            this.n.put(childAt4.getId(), b(childAt4));
        }
        int i15 = 0;
        while (i15 < childCount) {
            View childAt5 = getChildAt(i15);
            rz b3 = b(childAt5);
            if (b3 != null) {
                sy syVar2 = (sy) childAt5.getLayoutParams();
                sa saVar = this.c;
                saVar.aI.add(b3);
                rz rzVar7 = b3.U;
                if (rzVar7 != null) {
                    ((sg) rzVar7).Y(b3);
                }
                b3.U = saVar;
                SparseArray sparseArray = this.n;
                syVar2.a();
                syVar2.as = z;
                b3.ah = childAt5.getVisibility();
                boolean z2 = syVar2.af;
                b3.ag = childAt5;
                if (childAt5 instanceof sw) {
                    ((sw) childAt5).a(b3, this.c.c);
                }
                if (syVar2.ad) {
                    sc scVar = (sc) b3;
                    int i16 = syVar2.ao;
                    int i17 = syVar2.ap;
                    float f = syVar2.aq;
                    if (f != -1.0f) {
                        if (f > -1.0f) {
                            scVar.a = f;
                            scVar.b = -1;
                            scVar.c = -1;
                        }
                    } else if (i16 != -1) {
                        if (i16 >= 0) {
                            scVar.a = -1.0f;
                            scVar.b = i16;
                            scVar.c = -1;
                        }
                    } else if (i17 != -1 && i17 >= 0) {
                        scVar.a = -1.0f;
                        scVar.b = -1;
                        scVar.c = i17;
                    }
                } else {
                    int i18 = syVar2.ah;
                    int i19 = syVar2.ai;
                    int i20 = syVar2.aj;
                    int i21 = syVar2.ak;
                    int i22 = syVar2.al;
                    int i23 = syVar2.am;
                    float f2 = syVar2.an;
                    int i24 = syVar2.p;
                    if (i24 != -1) {
                        rz rzVar8 = (rz) sparseArray.get(i24);
                        if (rzVar8 != null) {
                            float f3 = syVar2.r;
                            b3.O(7, rzVar8, 7, syVar2.q, 0);
                            b3.E = f3;
                        }
                        syVar = syVar2;
                        rzVar5 = b3;
                    } else {
                        if (i18 != -1) {
                            rz rzVar9 = (rz) sparseArray.get(i18);
                            if (rzVar9 != null) {
                                i = i23;
                                i2 = i21;
                                b3.O(2, rzVar9, 2, syVar2.leftMargin, i22);
                            } else {
                                i = i23;
                                i2 = i21;
                            }
                        } else {
                            i = i23;
                            i2 = i21;
                            if (i19 != -1 && (rzVar = (rz) sparseArray.get(i19)) != null) {
                                b3.O(2, rzVar, 4, syVar2.leftMargin, i22);
                            }
                        }
                        if (i20 != -1) {
                            rz rzVar10 = (rz) sparseArray.get(i20);
                            if (rzVar10 != null) {
                                b3.O(4, rzVar10, 2, syVar2.rightMargin, i);
                            }
                        } else {
                            int i25 = i2;
                            if (i25 != -1 && (rzVar2 = (rz) sparseArray.get(i25)) != null) {
                                b3.O(4, rzVar2, 4, syVar2.rightMargin, i);
                            }
                        }
                        int i26 = syVar2.i;
                        if (i26 != -1) {
                            rz rzVar11 = (rz) sparseArray.get(i26);
                            if (rzVar11 != null) {
                                b3.O(3, rzVar11, 3, syVar2.topMargin, syVar2.x);
                            }
                        } else {
                            int i27 = syVar2.j;
                            if (i27 != -1 && (rzVar3 = (rz) sparseArray.get(i27)) != null) {
                                b3.O(3, rzVar3, 5, syVar2.topMargin, syVar2.x);
                            }
                        }
                        int i28 = syVar2.k;
                        if (i28 != -1) {
                            rz rzVar12 = (rz) sparseArray.get(i28);
                            if (rzVar12 != null) {
                                b3.O(5, rzVar12, 3, syVar2.bottomMargin, syVar2.z);
                            }
                        } else {
                            int i29 = syVar2.l;
                            if (i29 != -1 && (rzVar4 = (rz) sparseArray.get(i29)) != null) {
                                b3.O(5, rzVar4, 5, syVar2.bottomMargin, syVar2.z);
                            }
                        }
                        int i30 = syVar2.m;
                        if (i30 != -1) {
                            syVar = syVar2;
                            rzVar5 = b3;
                            j(b3, syVar2, sparseArray, i30, 6);
                        } else {
                            syVar = syVar2;
                            rzVar5 = b3;
                            int i31 = syVar.n;
                            if (i31 != -1) {
                                j(rzVar5, syVar, sparseArray, i31, 3);
                            } else {
                                int i32 = syVar.o;
                                if (i32 != -1) {
                                    j(rzVar5, syVar, sparseArray, i32, 5);
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            rzVar5.ae = f2;
                        }
                        float f4 = syVar.F;
                        if (f4 >= 0.0f) {
                            rzVar5.af = f4;
                        }
                    }
                    if (isInEditMode) {
                        int i33 = syVar.T;
                        if (i33 == -1) {
                            if (syVar.U != -1) {
                                i33 = -1;
                            }
                        }
                        int i34 = syVar.U;
                        rzVar5.Z = i33;
                        rzVar5.aa = i34;
                    }
                    if (!syVar.aa) {
                        if (syVar.width == -1) {
                            if (syVar.W) {
                                rzVar5.P(3);
                            } else {
                                rzVar5.P(4);
                            }
                            rzVar5.K(2).f = syVar.leftMargin;
                            rzVar5.K(4).f = syVar.rightMargin;
                        } else {
                            rzVar5.P(3);
                            rzVar5.C(0);
                        }
                    } else {
                        rzVar5.P(1);
                        rzVar5.C(syVar.width);
                        if (syVar.width == -2) {
                            rzVar5.P(2);
                        }
                    }
                    if (!syVar.ab) {
                        if (syVar.height == -1) {
                            if (syVar.X) {
                                rzVar5.Q(3);
                            } else {
                                rzVar5.Q(4);
                            }
                            rzVar5.K(3).f = syVar.topMargin;
                            rzVar5.K(5).f = syVar.bottomMargin;
                        } else {
                            rzVar5.Q(3);
                            rzVar5.x(0);
                        }
                    } else {
                        rzVar5.Q(1);
                        rzVar5.x(syVar.height);
                        if (syVar.height == -2) {
                            rzVar5.Q(2);
                        }
                    }
                    String str3 = syVar.G;
                    if (str3 == null || str3.length() == 0) {
                        rzVar5.X = 0.0f;
                    } else {
                        int length2 = str3.length();
                        int indexOf3 = str3.indexOf(44);
                        if (indexOf3 <= 0 || indexOf3 >= length2 - 1) {
                            i3 = 0;
                            i4 = -1;
                        } else {
                            String substring = str3.substring(0, indexOf3);
                            if (substring.equalsIgnoreCase("W")) {
                                i4 = 0;
                            } else {
                                i4 = substring.equalsIgnoreCase("H") ? 1 : -1;
                            }
                            i3 = indexOf3 + 1;
                        }
                        int indexOf4 = str3.indexOf(58);
                        if (indexOf4 < 0 || indexOf4 >= length2 - 1) {
                            String substring2 = str3.substring(i3);
                            if (substring2.length() > 0) {
                                parseFloat = Float.parseFloat(substring2);
                            }
                            parseFloat = 0.0f;
                        } else {
                            String substring3 = str3.substring(i3, indexOf4);
                            String substring4 = str3.substring(indexOf4 + 1);
                            if (substring3.length() > 0 && substring4.length() > 0) {
                                try {
                                    float parseFloat2 = Float.parseFloat(substring3);
                                    float parseFloat3 = Float.parseFloat(substring4);
                                    if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                        if (i4 == 1) {
                                            parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                        } else {
                                            parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                        }
                                    }
                                } catch (NumberFormatException unused2) {
                                }
                            }
                            parseFloat = 0.0f;
                        }
                        if (parseFloat > 0.0f) {
                            rzVar5.X = parseFloat;
                            rzVar5.Y = i4;
                        }
                    }
                    float f5 = syVar.H;
                    float[] fArr = rzVar5.al;
                    fArr[0] = f5;
                    fArr[1] = syVar.I;
                    rzVar5.aj = syVar.J;
                    rzVar5.ak = syVar.K;
                    int i35 = syVar.Z;
                    if (i35 >= 0 && i35 <= 3) {
                        rzVar5.r = i35;
                    }
                    int i36 = syVar.L;
                    int i37 = syVar.N;
                    int i38 = syVar.P;
                    float f6 = syVar.R;
                    rzVar5.s = i36;
                    rzVar5.v = i37;
                    if (i38 == Integer.MAX_VALUE) {
                        i38 = 0;
                    }
                    rzVar5.w = i38;
                    rzVar5.x = f6;
                    if (f6 > 0.0f && f6 < 1.0f && i36 == 0) {
                        rzVar5.s = 2;
                    }
                    int i39 = syVar.M;
                    int i40 = syVar.O;
                    int i41 = syVar.Q;
                    float f7 = syVar.S;
                    rzVar5.t = i39;
                    rzVar5.y = i40;
                    if (i41 == Integer.MAX_VALUE) {
                        i41 = 0;
                    }
                    rzVar5.z = i41;
                    rzVar5.A = f7;
                    if (f7 > 0.0f && f7 < 1.0f && i39 == 0) {
                        rzVar5.t = 2;
                    }
                    i15++;
                    z = false;
                }
            }
            i15++;
            z = false;
        }
    }

    private final void j(rz rzVar, sy syVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        rz rzVar2 = (rz) sparseArray.get(i);
        if (rzVar2 == null || view == null || !(view.getLayoutParams() instanceof sy)) {
            return;
        }
        syVar.ac = true;
        if (i2 == 6) {
            sy syVar2 = (sy) view.getLayoutParams();
            syVar2.ac = true;
            syVar2.ar.F = true;
        }
        rzVar.K(6).j(rzVar2.K(i2), syVar.D, syVar.C);
        rzVar.F = true;
        rzVar.K(3).d();
        rzVar.K(5).d();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final rz b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof sy) {
            return ((sy) view.getLayoutParams()).ar;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (!(view.getLayoutParams() instanceof sy)) {
            return null;
        }
        return ((sy) view.getLayoutParams()).ar;
    }

    public final void c(int i) {
        if (i == this.l) {
            return;
        }
        this.l = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof sy;
    }

    public final void d(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                sw swVar = (sw) this.b.get(i);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i4 + ((int) ((parseInt4 / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    protected final boolean e() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public final void forceLayout() {
        h();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return f();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new sy(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            sy syVar = (sy) childAt.getLayoutParams();
            rz rzVar = syVar.ar;
            if (childAt.getVisibility() == 8 && !syVar.ad && !syVar.ae) {
                boolean z2 = syVar.ag;
                if (!isInEditMode) {
                    continue;
                }
            }
            boolean z3 = syVar.af;
            int k = rzVar.k();
            int l = rzVar.l();
            childAt.layout(k, l, rzVar.j() + k, rzVar.h() + l);
            if (childAt instanceof tj) {
                tj tjVar = (tj) childAt;
                throw null;
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                sw swVar = (sw) this.b.get(i6);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        rz b = b(view);
        if ((view instanceof Guideline) && !(b instanceof sc)) {
            sy syVar = (sy) view.getLayoutParams();
            syVar.ar = new sc();
            syVar.ad = true;
            ((sc) syVar.ar).c(syVar.V);
        }
        if (view instanceof sw) {
            sw swVar = (sw) view;
            swVar.f();
            ((sy) view.getLayoutParams()).ae = true;
            if (!this.b.contains(swVar)) {
                this.b.add(swVar);
            }
        }
        this.a.put(view.getId(), view);
        this.d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(b(view));
        this.b.remove(view);
        this.d = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        h();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new sy(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        g(attributeSet, i, i2);
    }
}
