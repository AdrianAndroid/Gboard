package defpackage;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: aqy  reason: default package */
/* loaded from: classes.dex */
public final class aqy implements art {
    private final /* synthetic */ int g;
    public static final aqy f = new aqy(5);
    public static final aqy e = new aqy(4);
    public static final aqy d = new aqy(3);
    public static final aqy c = new aqy(2);
    public static final aqy b = new aqy(1);
    public static final aqy a = new aqy(0);

    private aqy(int i) {
        this.g = i;
    }

    @Override // defpackage.art
    public final /* synthetic */ Object a(arw arwVar, float f2) {
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                int q = arwVar.q();
                if (q == 1) {
                    arwVar.h();
                }
                double a2 = arwVar.a();
                double a3 = arwVar.a();
                double a4 = arwVar.a();
                double a5 = arwVar.q() == 7 ? arwVar.a() : 1.0d;
                if (q == 1) {
                    arwVar.j();
                }
                if (a2 <= 1.0d && a3 <= 1.0d && a4 <= 1.0d) {
                    a2 *= 255.0d;
                    a3 *= 255.0d;
                    a4 *= 255.0d;
                    if (a5 <= 1.0d) {
                        a5 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) a5, (int) a2, (int) a3, (int) a4));
            } else if (i == 2) {
                return Integer.valueOf(Math.round(are.a(arwVar) * f2));
            } else {
                if (i == 3) {
                    return are.c(arwVar, f2);
                }
                if (i == 4) {
                    int q2 = arwVar.q();
                    if (q2 == 1) {
                        return are.c(arwVar, f2);
                    }
                    if (q2 == 3) {
                        return are.c(arwVar, f2);
                    }
                    if (q2 == 7) {
                        PointF pointF = new PointF(((float) arwVar.a()) * f2, ((float) arwVar.a()) * f2);
                        while (arwVar.o()) {
                            arwVar.n();
                        }
                        return pointF;
                    }
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(xl.b(q2)));
                }
                int q3 = arwVar.q();
                if (q3 == 1) {
                    arwVar.h();
                }
                float a6 = (float) arwVar.a();
                float a7 = (float) arwVar.a();
                while (arwVar.o()) {
                    arwVar.n();
                }
                if (q3 == 1) {
                    arwVar.j();
                }
                return new ask((a6 / 100.0f) * f2, (a7 / 100.0f) * f2);
            }
        }
        return Float.valueOf(are.a(arwVar) * f2);
    }
}
