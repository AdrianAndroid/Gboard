package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: arg  reason: default package */
/* loaded from: classes.dex */
public final class arg {
    static final azp a = azp.k("k");

    public static List a(arw arwVar, amp ampVar, float f, art artVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (arwVar.q() == 6) {
            ampVar.d("Lottie doesn't support expressions.");
            return arrayList;
        }
        arwVar.i();
        while (arwVar.o()) {
            if (arwVar.r(a) == 0) {
                if (arwVar.q() == 1) {
                    arwVar.h();
                    if (arwVar.q() != 7) {
                        while (arwVar.o()) {
                            arrayList.add(arf.a(arwVar, ampVar, f, artVar, true, z));
                        }
                    } else {
                        arrayList.add(arf.a(arwVar, ampVar, f, artVar, false, z));
                    }
                    arwVar.j();
                } else {
                    arrayList.add(arf.a(arwVar, ampVar, f, artVar, false, z));
                }
            } else {
                arwVar.n();
            }
        }
        arwVar.k();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            asi asiVar = (asi) list.get(i2);
            i2++;
            asi asiVar2 = (asi) list.get(i2);
            asiVar.h = Float.valueOf(asiVar2.g);
            if (asiVar.c == null && (obj = asiVar2.b) != null) {
                asiVar.c = obj;
                if (asiVar instanceof aon) {
                    ((aon) asiVar).a();
                }
            }
        }
        asi asiVar3 = (asi) list.get(i);
        if ((asiVar3.b == null || asiVar3.c == null) && list.size() > 1) {
            list.remove(asiVar3);
        }
    }
}
