package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dgi  reason: default package */
/* loaded from: classes.dex */
public final class dgi {
    public float a;
    public float b;
    public float c;
    public final dgh d;

    public dgi(Context context) {
        this.d = new dgh(context);
    }

    public final float a(gpo gpoVar) {
        dgh dghVar = this.d;
        float f = gpoVar.d;
        float f2 = dghVar.d;
        if (f < f2) {
            dghVar.d = f;
            f2 = f;
        }
        float f3 = dghVar.e;
        if (f > f3) {
            dghVar.e = f;
            f3 = f;
        }
        int i = dghVar.c - 1;
        dghVar.c = i;
        float f4 = 1.0f;
        if (i == 0) {
            float f5 = dghVar.a;
            float f6 = (f5 == 0.0f && dghVar.b == 0.0f) ? 1.0f : 0.2f;
            float f7 = 1.0f - f6;
            dghVar.a = (f5 * f7) + (f2 * f6);
            dghVar.b = (f7 * dghVar.b) + (f6 * f3);
            dghVar.d = 1.0f;
            dghVar.e = 0.0f;
            dghVar.c = 500;
        }
        float f8 = dghVar.b;
        float f9 = dghVar.a;
        if (f8 == f9) {
            f4 = 0.7f;
        } else {
            float f10 = (f - f9) / (f8 - f9);
            if (f10 < 0.0f) {
                f4 = 0.0f;
            } else if (f10 <= 1.0f) {
                f4 = f10;
            }
        }
        float f11 = this.b;
        float f12 = this.a;
        float f13 = ((f11 - f12) * f4) + f12;
        float f14 = this.c;
        if (f14 >= 0.0f) {
            f4 = (f13 * 0.2f) + (f14 * 0.8f);
        }
        this.c = f4;
        return f4;
    }
}
