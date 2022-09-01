package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: are  reason: default package */
/* loaded from: classes.dex */
public final class are {
    private static final azp a = azp.k("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(arw arwVar) {
        int q = arwVar.q();
        int i = q - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) arwVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(xl.b(q)));
        }
        arwVar.h();
        float a2 = (float) arwVar.a();
        while (arwVar.o()) {
            arwVar.n();
        }
        arwVar.j();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(arw arwVar) {
        arwVar.h();
        int a2 = (int) (arwVar.a() * 255.0d);
        int a3 = (int) (arwVar.a() * 255.0d);
        int a4 = (int) (arwVar.a() * 255.0d);
        while (arwVar.o()) {
            arwVar.n();
        }
        arwVar.j();
        return Color.argb(255, a2, a3, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF c(arw arwVar, float f) {
        int q = arwVar.q() - 1;
        if (q == 0) {
            arwVar.h();
            float a2 = (float) arwVar.a();
            float a3 = (float) arwVar.a();
            while (arwVar.q() != 2) {
                arwVar.n();
            }
            arwVar.j();
            return new PointF(a2 * f, a3 * f);
        } else if (q != 2) {
            if (q == 6) {
                float a4 = (float) arwVar.a();
                float a5 = (float) arwVar.a();
                while (arwVar.o()) {
                    arwVar.n();
                }
                return new PointF(a4 * f, a5 * f);
            }
            throw new IllegalArgumentException("Unknown point starts with ".concat(xl.b(arwVar.q())));
        } else {
            arwVar.i();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (arwVar.o()) {
                int r = arwVar.r(a);
                if (r == 0) {
                    f2 = a(arwVar);
                } else if (r == 1) {
                    f3 = a(arwVar);
                } else {
                    arwVar.m();
                    arwVar.n();
                }
            }
            arwVar.k();
            return new PointF(f2 * f, f3 * f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List d(arw arwVar, float f) {
        ArrayList arrayList = new ArrayList();
        arwVar.h();
        while (arwVar.q() == 1) {
            arwVar.h();
            arrayList.add(c(arwVar, f));
            arwVar.j();
        }
        arwVar.j();
        return arrayList;
    }
}
