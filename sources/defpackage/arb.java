package defpackage;

import android.graphics.Color;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: arb  reason: default package */
/* loaded from: classes.dex */
public final class arb implements art {
    private int a;

    public arb(int i) {
        this.a = i;
    }

    @Override // defpackage.art
    public final /* bridge */ /* synthetic */ Object a(arw arwVar, float f) {
        int i;
        double d;
        ArrayList arrayList = new ArrayList();
        int q = arwVar.q();
        if (q == 1) {
            arwVar.h();
        }
        while (arwVar.o()) {
            arrayList.add(Float.valueOf((float) arwVar.a()));
        }
        if (q == 1) {
            arwVar.j();
        }
        int i2 = this.a;
        if (i2 == -1) {
            i2 = arrayList.size() / 4;
            this.a = i2;
        }
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = this.a * 4;
            if (i3 >= i) {
                break;
            }
            int i6 = i3 / 4;
            double floatValue = ((Float) arrayList.get(i3)).floatValue();
            int i7 = i3 % 4;
            if (i7 == 0) {
                if (i6 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i6 - 1] >= f2) {
                        fArr[i6] = f2 + 0.01f;
                    }
                }
                fArr[i6] = (float) floatValue;
            } else if (i7 == 1) {
                Double.isNaN(floatValue);
                i5 = (int) (floatValue * 255.0d);
            } else if (i7 == 2) {
                Double.isNaN(floatValue);
                i4 = (int) (floatValue * 255.0d);
            } else if (i7 == 3) {
                Double.isNaN(floatValue);
                iArr[i6] = Color.argb(255, i5, i4, (int) (floatValue * 255.0d));
            }
            i3++;
        }
        azp azpVar = new azp(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i8 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i8] = ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i8] = ((Float) arrayList.get(i)).floatValue();
                    i8++;
                }
                i++;
            }
            for (int i9 = 0; i9 < azpVar.j(); i9++) {
                int i10 = ((int[]) azpVar.a)[i9];
                double d2 = ((float[]) azpVar.b)[i9];
                int i11 = 1;
                while (true) {
                    if (i11 < size) {
                        int i12 = i11 - 1;
                        double d3 = dArr[i12];
                        double d4 = dArr[i11];
                        if (d4 >= d2) {
                            Double.isNaN(d2);
                            d = asc.a(dArr2[i12], dArr2[i11], asc.j((d2 - d3) / (d4 - d3)));
                            break;
                        }
                        i11++;
                    } else {
                        d = dArr2[size - 1];
                        break;
                    }
                }
                ((int[]) azpVar.a)[i9] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        return azpVar;
    }
}
