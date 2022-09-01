package defpackage;

import j$.util.Comparator;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: czj  reason: default package */
/* loaded from: classes.dex */
public final class czj {
    public final AtomicReference c = new AtomicReference(null);
    private final Comparator e = Comparator.CC.comparingInt(drv.b);
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache");
    private static final lfy d = lfy.c(' ').b().h();
    public static final czj b = new czj();

    private czj() {
    }

    private static int d(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size() - 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            size += ((String) it.next()).length();
        }
        return size;
    }

    private static boolean e(List list, int i, int i2) {
        return i >= 0 && i2 <= list.size() && i < i2;
    }

    public final lfb a() {
        return lfb.f((czo) this.c.get());
    }

    public final llp b(String str, lmz lmzVar, Random random) {
        idn idnVar;
        lsz lszVar;
        lfb g;
        llp llpVar;
        String str2 = str;
        if (lmzVar == null || lmzVar.isEmpty()) {
            return llp.q();
        }
        czo czoVar = (czo) this.c.get();
        if (czoVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "getDynamicArtParamsInternal", 164, "DynamicArtAnimationCache.java")).t("Dynamic art information is null");
            return llp.q();
        }
        idn a2 = ieh.j().a(ctg.DYNAMIC_ART_STICKER_SELECTION);
        ArrayList arrayList = new ArrayList();
        lsz it = lmzVar.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            czl czlVar = (czl) czoVar.c.get(str3);
            if (czlVar != null) {
                czo czoVar2 = czoVar;
                if (((Long) czu.d.c()).longValue() == 1) {
                    llp llpVar2 = czlVar.d;
                    List k = d.k(str2);
                    if (k.isEmpty()) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "createLessLineBreakingQuery", 210, "DynamicArtAnimationCache.java")).t("non meaningful query");
                        g = ldu.a;
                    } else if (!llpVar2.isEmpty()) {
                        lrl lrlVar = (lrl) llpVar2;
                        llk f = llp.f(lrlVar.c);
                        int i = lrlVar.c;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 >= i) {
                                idnVar = a2;
                                lszVar = it;
                                break;
                            }
                            czq czqVar = (czq) llpVar2.get(i2);
                            lszVar = it;
                            ArrayList arrayList2 = new ArrayList();
                            llp llpVar3 = llpVar2;
                            int i4 = i;
                            int i5 = 0;
                            while (true) {
                                if (i3 >= k.size()) {
                                    idnVar = a2;
                                    break;
                                }
                                String str4 = (String) k.get(i3);
                                idnVar = a2;
                                int length = i5 + str4.length() + (!arrayList2.isEmpty());
                                if (length > czqVar.c) {
                                    break;
                                }
                                arrayList2.add(str4);
                                i3++;
                                i5 = length;
                                a2 = idnVar;
                            }
                            if (i5 < czqVar.b) {
                                i3 -= arrayList2.size();
                                arrayList2.clear();
                            }
                            if (!arrayList2.isEmpty()) {
                                f.h(czn.a.f(arrayList2));
                                i2++;
                                it = lszVar;
                                llpVar2 = llpVar3;
                                i = i4;
                                a2 = idnVar;
                            } else {
                                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "createLessLineBreakingQuery", 250, "DynamicArtAnimationCache.java")).t("contains meaningless line");
                                break;
                            }
                        }
                        g = i3 == k.size() ? lfb.g(f.g()) : ldu.a;
                    } else {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "createLessLineBreakingQuery", 215, "DynamicArtAnimationCache.java")).t("no line information");
                        g = ldu.a;
                    }
                    idnVar = a2;
                    lszVar = it;
                } else {
                    idnVar = a2;
                    lszVar = it;
                    llp llpVar4 = czlVar.d;
                    List k2 = d.k(str2);
                    if (k2.isEmpty()) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "createMoreLineBreakingQuery", 286, "DynamicArtAnimationCache.java")).t("non meaningful query");
                        g = ldu.a;
                    } else if (llpVar4.isEmpty()) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "createMoreLineBreakingQuery", 291, "DynamicArtAnimationCache.java")).t("no line information");
                        g = ldu.a;
                    } else {
                        int size = k2.size();
                        lrl lrlVar2 = (lrl) llpVar4;
                        int i6 = lrlVar2.c;
                        int size2 = k2.size();
                        int i7 = 0;
                        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i6, size2);
                        for (int i8 = 0; i8 < i6; i8++) {
                            Arrays.fill(iArr[i8], 0, size2, -1);
                        }
                        String str5 = (String) k2.get(0);
                        if (str5.length() >= ((czq) llpVar4.get(0)).b && str5.length() <= ((czq) llpVar4.get(0)).c) {
                            iArr[0][0] = -100;
                        }
                        int i9 = 1;
                        while (i9 < size2) {
                            int i10 = i9 + 1;
                            int d2 = d(k2.subList(i7, i10));
                            if (d2 < ((czq) llpVar4.get(i7)).b || d2 > ((czq) llpVar4.get(0)).c) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                iArr[0][i9] = -100;
                            }
                            i9 = i10;
                        }
                        for (int i11 = 1; i11 < i6; i11++) {
                            int i12 = 1;
                            while (i12 < size) {
                                ArrayList arrayList3 = new ArrayList();
                                int i13 = i11 - 1;
                                if (i13 >= 0) {
                                    int i14 = i12 - 1;
                                    while (i14 >= 0) {
                                        int i15 = i13;
                                        if (iArr[i13][i14] != -1) {
                                            arrayList3.add(Integer.valueOf(i14));
                                        }
                                        i14--;
                                        i13 = i15;
                                    }
                                }
                                Iterator it2 = arrayList3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        llpVar = llpVar4;
                                        break;
                                    }
                                    int intValue = ((Integer) it2.next()).intValue();
                                    int i16 = intValue + 1;
                                    Iterator it3 = it2;
                                    int i17 = i12 + 1;
                                    if (e(k2, i16, i17)) {
                                        int d3 = d(k2.subList(i16, i17));
                                        czq czqVar2 = (czq) llpVar4.get(i11);
                                        llpVar = llpVar4;
                                        if (d3 >= czqVar2.b && d3 <= czqVar2.c) {
                                            iArr[i11][i12] = intValue;
                                            break;
                                        }
                                        it2 = it3;
                                        llpVar4 = llpVar;
                                    } else {
                                        it2 = it3;
                                    }
                                }
                                i12++;
                                llpVar4 = llpVar;
                            }
                        }
                        ArrayDeque arrayDeque = new ArrayDeque();
                        int i18 = i6 - 1;
                        int i19 = size - 1;
                        if (iArr[i18][i19] == -1) {
                            g = ldu.a;
                        } else {
                            while (i18 >= 0) {
                                arrayDeque.addFirst(Integer.valueOf(i19));
                                int i20 = iArr[i18][i19];
                                if (i20 == -1) {
                                    if (i18 != 0) {
                                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "createMoreLineBreakingQuery", 341, "DynamicArtAnimationCache.java")).t("Chain is broken while finding the valid end words.");
                                        arrayDeque.clear();
                                    }
                                    i18 = -1;
                                } else {
                                    i18--;
                                    i19 = i20;
                                }
                            }
                            if (arrayDeque.isEmpty()) {
                                g = ldu.a;
                            } else {
                                llk f2 = llp.f(lrlVar2.c);
                                int i21 = 0;
                                while (!arrayDeque.isEmpty()) {
                                    int intValue2 = ((Integer) arrayDeque.removeFirst()).intValue() + 1;
                                    if (!e(k2, i21, intValue2)) {
                                        break;
                                    }
                                    f2.h(czn.a.f(k2.subList(i21, intValue2)));
                                    i21 = intValue2;
                                }
                                if (i21 != size) {
                                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "createMoreLineBreakingQuery", 372, "DynamicArtAnimationCache.java")).t("Fail to achieve the final word while creating the final result");
                                    g = ldu.a;
                                } else {
                                    g = lfb.g(f2.g());
                                }
                            }
                        }
                    }
                }
                if (g.e()) {
                    czr b2 = czs.b();
                    b2.d((List) g.a());
                    b2.b(str3);
                    arrayList.add(b2.a());
                }
                str2 = str;
                czoVar = czoVar2;
                it = lszVar;
                a2 = idnVar;
            } else {
                str2 = str;
            }
        }
        Collections.shuffle(arrayList, random);
        Collections.sort(arrayList, this.e);
        Collections.reverse(arrayList);
        a2.a();
        return llp.o(arrayList);
    }

    public final lmz c(int i, String str) {
        czo czoVar = (czo) this.c.get();
        if (czoVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "getMatchedTemplateFileNames", 117, "DynamicArtAnimationCache.java")).t("Dynamic art information is null");
            return lrr.a;
        } else if (i == 18) {
            return czoVar.e.d(str);
        } else {
            if (i != 31 && i != 33) {
                return null;
            }
            return czoVar.f.d(str);
        }
    }
}
