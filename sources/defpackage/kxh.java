package defpackage;

/* compiled from: PG */
/* renamed from: kxh  reason: default package */
/* loaded from: classes.dex */
public final class kxh extends kxc {
    @Override // defpackage.kxc
    public final void a(kxt kxtVar, float f, float f2) {
        kxtVar.f(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        kxp kxpVar = new kxp(0.0f, 0.0f, f3, f3);
        kxpVar.e = 180.0f;
        kxpVar.f = 90.0f;
        kxtVar.f.add(kxpVar);
        kxtVar.b(new kxn(kxpVar), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        kxtVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        kxtVar.c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
