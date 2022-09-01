package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arj  reason: default package */
/* loaded from: classes.dex */
public final class arj {
    private static final azp a = azp.k("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static apu a(arw arwVar) {
        int i = 0;
        boolean z = false;
        while (arwVar.o()) {
            int r = arwVar.r(a);
            if (r == 0) {
                arwVar.g();
            } else if (r == 1) {
                int b = arwVar.b();
                if (b != 1) {
                    if (b == 2) {
                        i = 2;
                    } else if (b == 3) {
                        i = 3;
                    } else if (b == 4) {
                        i = 4;
                    } else if (b == 5) {
                        i = 5;
                    }
                }
                i = 1;
            } else if (r == 2) {
                z = arwVar.p();
            } else {
                arwVar.m();
                arwVar.n();
            }
        }
        return new apu(i, z);
    }
}
