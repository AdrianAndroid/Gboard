package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ark  reason: default package */
/* loaded from: classes.dex */
public final class ark {
    private static final azp a = azp.k("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static apv a(arw arwVar, amp ampVar) {
        boolean z = false;
        String str = null;
        ape apeVar = null;
        apo apoVar = null;
        ape apeVar2 = null;
        ape apeVar3 = null;
        ape apeVar4 = null;
        ape apeVar5 = null;
        ape apeVar6 = null;
        int i = 0;
        boolean z2 = false;
        while (arwVar.o()) {
            switch (arwVar.r(a)) {
                case 0:
                    str = arwVar.g();
                    break;
                case 1:
                    int b = arwVar.b();
                    char c = 2;
                    int[] iArr = {1, 2};
                    for (int i2 = z; i2 < c; i2++) {
                        i = iArr[i2];
                        if (i == 0) {
                            throw null;
                        }
                        if (i == b) {
                            break;
                        } else {
                            c = 2;
                        }
                    }
                    z = false;
                    i = 0;
                    continue;
                case 2:
                    apeVar = xk.f(arwVar, ampVar, z);
                    continue;
                case 3:
                    apoVar = aqs.b(arwVar, ampVar);
                    continue;
                case 4:
                    apeVar2 = xk.f(arwVar, ampVar, z);
                    continue;
                case 5:
                    apeVar4 = xk.e(arwVar, ampVar);
                    continue;
                case 6:
                    apeVar6 = xk.f(arwVar, ampVar, z);
                    continue;
                case 7:
                    apeVar3 = xk.e(arwVar, ampVar);
                    continue;
                case 8:
                    apeVar5 = xk.f(arwVar, ampVar, z);
                    continue;
                case 9:
                    z2 = arwVar.p();
                    continue;
                default:
                    arwVar.m();
                    arwVar.n();
                    break;
            }
            z = false;
        }
        return new apv(str, i, apeVar, apoVar, apeVar2, apeVar3, apeVar4, apeVar5, apeVar6, z2);
    }
}
