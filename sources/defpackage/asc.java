package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* renamed from: asc  reason: default package */
/* loaded from: classes.dex */
public final class asc {
    private static final PointF a = new PointF();

    public static double a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static float c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static int e(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static PointF f(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void g(apy apyVar, Path path) {
        path.reset();
        PointF pointF = apyVar.b;
        path.moveTo(pointF.x, pointF.y);
        a.set(pointF.x, pointF.y);
        for (int i = 0; i < apyVar.a.size(); i++) {
            fws fwsVar = (fws) apyVar.a.get(i);
            Object obj = fwsVar.a;
            Object obj2 = fwsVar.c;
            Object obj3 = fwsVar.b;
            PointF pointF2 = a;
            PointF pointF3 = (PointF) obj;
            if (!pointF3.equals(pointF2) || !((PointF) obj2).equals(obj3)) {
                PointF pointF4 = (PointF) obj2;
                PointF pointF5 = (PointF) obj3;
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                PointF pointF6 = (PointF) obj3;
                path.lineTo(pointF6.x, pointF6.y);
            }
            PointF pointF7 = (PointF) obj3;
            pointF2.set(pointF7.x, pointF7.y);
        }
        if (apyVar.c) {
            path.close();
        }
    }

    public static void h(aoz aozVar, int i, List list, aoz aozVar2, ant antVar) {
        if (aozVar.d(antVar.g(), i)) {
            list.add(aozVar2.b(antVar.g()).c(antVar));
        }
    }

    public static boolean i(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static double j(double d) {
        return Math.max(0.0d, Math.min(1.0d, d));
    }

    public static int k(int i) {
        return Math.max(0, Math.min(255, i));
    }
}
