package defpackage;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: is  reason: default package */
/* loaded from: classes.dex */
public final class is {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!xu.b(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public static ss b(rz rzVar, int i, ArrayList arrayList, ss ssVar) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = rzVar.ao;
        } else {
            i2 = rzVar.ap;
        }
        if (i2 != -1 && (ssVar == null || i2 != ssVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                ss ssVar2 = (ss) arrayList.get(i4);
                if (ssVar2.c == i2) {
                    if (ssVar != null) {
                        ssVar.c(i, ssVar2);
                        arrayList.remove(ssVar);
                    }
                    ssVar = ssVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return ssVar;
        }
        if (ssVar == null) {
            if (rzVar instanceof sd) {
                sd sdVar = (sd) rzVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= sdVar.as) {
                        i3 = -1;
                        break;
                    }
                    rz rzVar2 = sdVar.ar[i5];
                    if (i != 0) {
                        i3 = rzVar2.ap;
                        if (i3 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i3 = rzVar2.ao;
                        if (i3 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i3 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        ss ssVar3 = (ss) arrayList.get(i6);
                        if (ssVar3.c == i3) {
                            ssVar = ssVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (ssVar == null) {
                ssVar = new ss(i);
            }
            arrayList.add(ssVar);
        }
        if (ssVar.d(rzVar)) {
            if (rzVar instanceof sc) {
                sc scVar = (sc) rzVar;
                scVar.d.c(scVar.ar == 0 ? 1 : 0, arrayList, ssVar);
            }
            if (i != 0) {
                rzVar.ap = ssVar.c;
                rzVar.K.c(1, arrayList, ssVar);
                rzVar.N.c(1, arrayList, ssVar);
                rzVar.M.c(1, arrayList, ssVar);
            } else {
                rzVar.ao = ssVar.c;
                rzVar.J.c(0, arrayList, ssVar);
                rzVar.L.c(0, arrayList, ssVar);
            }
            rzVar.Q.c(i, arrayList, ssVar);
        }
        return ssVar;
    }

    public static ss c(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ss ssVar = (ss) arrayList.get(i2);
            if (i == ssVar.c) {
                return ssVar;
            }
        }
        return null;
    }

    public static boolean d(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
