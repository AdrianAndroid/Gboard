package defpackage;

/* compiled from: PG */
/* renamed from: aqx  reason: default package */
/* loaded from: classes.dex */
public final class aqx implements art {
    public static final aqx a = new aqx();
    private static final azp b = azp.k("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private aqx() {
    }

    @Override // defpackage.art
    public final /* bridge */ /* synthetic */ Object a(arw arwVar, float f) {
        arwVar.i();
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 3;
        int i2 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (arwVar.o()) {
            switch (arwVar.r(b)) {
                case 0:
                    str = arwVar.g();
                    break;
                case 1:
                    str2 = arwVar.g();
                    break;
                case 2:
                    f2 = (float) arwVar.a();
                    break;
                case 3:
                    int b2 = arwVar.b();
                    if (b2 <= 2 && b2 >= 0) {
                        i = new int[]{1, 2, 3}[b2];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    i2 = arwVar.b();
                    break;
                case 5:
                    f3 = (float) arwVar.a();
                    break;
                case 6:
                    f4 = (float) arwVar.a();
                    break;
                case 7:
                    i3 = are.b(arwVar);
                    break;
                case 8:
                    i4 = are.b(arwVar);
                    break;
                case 9:
                    f5 = (float) arwVar.a();
                    break;
                case 10:
                    z = arwVar.p();
                    break;
                default:
                    arwVar.m();
                    arwVar.n();
                    break;
            }
        }
        arwVar.k();
        return new aox(str, str2, f2, i, i2, f3, f4, i3, i4, f5, z);
    }
}
