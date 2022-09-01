package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: esh  reason: default package */
/* loaded from: classes.dex */
public final class esh implements eqs {
    private final Resources a;
    private final /* synthetic */ int b;

    public esh(Resources resources, int i) {
        this.b = i;
        this.a = resources;
    }

    private final float b(SparseArray sparseArray, euu euuVar, float f) {
        eut i = era.i(sparseArray, euuVar);
        if (i != null) {
            f = (float) i.i;
        }
        return TypedValue.applyDimension(1, f, this.a.getDisplayMetrics());
    }

    private static int c(float f) {
        if (f <= 0.0f) {
            return 0;
        }
        return Math.max(1, (int) f);
    }

    @Override // defpackage.eqs
    public final /* synthetic */ eqr a(SparseArray sparseArray) {
        ColorStateList a;
        int i = this.b;
        if (i == 0) {
            eut i2 = era.i(sparseArray, euu.ANDROID_ELEVATION);
            if (i2 != null) {
                return new esn(TypedValue.applyDimension(1, (float) i2.i, this.a.getDisplayMetrics()), 1);
            }
            return null;
        } else if (i == 1) {
            eut i3 = era.i(sparseArray, euu.BACKGROUND_SHAPE);
            int i4 = (i3 == null || !"rectangle".equals(i3.c)) ? 0 : 1;
            eqq eqqVar = (eqq) sparseArray.get(1);
            eqq eqqVar2 = (eqq) sparseArray.get(3);
            eqq eqqVar3 = (eqq) sparseArray.get(36);
            eqq eqqVar4 = (eqq) sparseArray.get(30);
            if (i4 == 0 && eqqVar == null && eqqVar2 == null) {
                return null;
            }
            eut i5 = era.i(sparseArray, euu.BACKGROUND_CORNER_RADIUS);
            float f = i5 == null ? 0.0f : (float) i5.i;
            float b = b(sparseArray, euu.BACKGROUND_CORNER_RADIUS_TOP_LEFT, f);
            float b2 = b(sparseArray, euu.BACKGROUND_CORNER_RADIUS_TOP_RIGHT, f);
            float b3 = b(sparseArray, euu.BACKGROUND_CORNER_RADIUS_BOTTOM_LEFT, f);
            float b4 = b(sparseArray, euu.BACKGROUND_CORNER_RADIUS_BOTTOM_RIGHT, f);
            Resources resources = this.a;
            Rect rect = new Rect();
            rect.left = (int) eyh.f(resources, sparseArray, euu.PADDING_LEFT);
            rect.top = (int) eyh.f(resources, sparseArray, euu.PADDING_TOP);
            rect.right = (int) eyh.f(resources, sparseArray, euu.PADDING_RIGHT);
            rect.bottom = (int) eyh.f(resources, sparseArray, euu.PADDING_BOTTOM);
            RectF rectF = new RectF();
            rectF.left = eyh.e(sparseArray, euu.PADDING_RATIO_LEFT, 1.0f);
            rectF.top = eyh.e(sparseArray, euu.PADDING_RATIO_TOP, 1.0f);
            rectF.right = eyh.e(sparseArray, euu.PADDING_RATIO_RIGHT, 1.0f);
            rectF.bottom = eyh.e(sparseArray, euu.PADDING_RATIO_BOTTOM, 1.0f);
            int c = c(b(sparseArray, euu.ELEVATION, 0.0f));
            int c2 = c(b(sparseArray, euu.EDGE_WIDTH, 0.0f));
            float b5 = b(sparseArray, euu.BACKGROUND_MAX_WIDTH, -1.0f);
            float b6 = b(sparseArray, euu.BACKGROUND_MAX_HEIGHT, -1.0f);
            if (eqqVar != null || eqqVar2 != null) {
                a = eqq.a(eqqVar, eqqVar2);
            } else {
                a = ColorStateList.valueOf(-16777216);
            }
            ColorStateList b7 = eqq.b(eqqVar4);
            ColorStateList c3 = eqq.c(eqqVar3, ese.b);
            eqq[] eqqVarArr = {eqqVar, eqqVar2, eqqVar3, eqqVar4};
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int i6 = 0;
            for (int i7 = 4; i6 < i7; i7 = 4) {
                eqq eqqVar5 = eqqVarArr[i6];
                if (eqqVar5 != null) {
                    Iterator it = eqqVar5.a.iterator();
                    while (it.hasNext()) {
                        int[] iArr = (int[]) ((ewj) it.next()).b;
                        int length = iArr.length;
                        eqq[] eqqVarArr2 = eqqVarArr;
                        if (length == 1) {
                            sparseBooleanArray.append(iArr[0], true);
                        } else if (length != 0) {
                            ((ltd) ((ltd) ese.a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/PropertyBackgroundShape$Factory", "extractAvailableStateSpecs", 575, "PropertyBackgroundShape.java")).w("Multiple state is not supported: %s", Arrays.toString(iArr));
                            eqqVarArr = eqqVarArr2;
                            it = it;
                            b6 = b6;
                            c = c;
                        }
                        eqqVarArr = eqqVarArr2;
                    }
                }
                i6++;
                eqqVarArr = eqqVarArr;
                b6 = b6;
                c = c;
            }
            float f2 = b6;
            int i8 = c;
            int i9 = 1;
            int size = sparseBooleanArray.size() + 1;
            int[][] iArr2 = new int[size];
            int i10 = 0;
            while (i10 < sparseBooleanArray.size()) {
                int[] iArr3 = new int[i9];
                iArr3[0] = sparseBooleanArray.keyAt(i10);
                iArr2[i10] = iArr3;
                i10++;
                i9 = 1;
            }
            iArr2[size - 1] = new int[0];
            return new ese(i4, a, b7, c3, b, b2, b3, b4, rect, rectF, i8, c2, b5, f2, iArr2);
        } else {
            eut i11 = era.i(sparseArray, euu.TEXT_SIZE);
            if (i11 != null) {
                return new esn(era.a(i11, this.a), 0);
            }
            return null;
        }
    }
}
