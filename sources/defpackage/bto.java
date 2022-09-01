package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: bto  reason: default package */
/* loaded from: classes.dex */
public final class bto {
    private static final lug j = hin.a;
    private static final lfy k = lfy.c(',');
    private static final lfy l = lfy.f(Pattern.compile("\\s+"));
    public SparseIntArray a;
    public String[] b;
    public int[] c;
    String[] d;
    String[] e;
    String[] f;
    String[] g;
    public int[] h;
    public int[] i;

    public bto(InputStream inputStream, InputStream inputStream2, InputStream inputStream3) {
        Iterator it;
        SortedMap sortedMap;
        int i;
        Object obj;
        String[] strArr;
        String str;
        SortedMap sortedMap2;
        SortedMap g = g(inputStream2);
        SortedMap g2 = g(inputStream3);
        SortedMap w = lre.w();
        char c = 2;
        char c2 = 1;
        int i2 = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String[] strArr2 = new String[3];
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!f(k, readLine, strArr2)) {
                    ((luc) ((luc) j.c()).k("com/google/android/apps/inputmethod/libs/chinese/WordExplanationMap", "loadIntermediateWordExplanationData", 261, "WordExplanationMap.java")).w("Invalid word explanation entry: %s", readLine);
                } else {
                    String intern = strArr2[i2].trim().intern();
                    String trim = strArr2[c2].trim();
                    String trim2 = strArr2[c].trim();
                    if (!TextUtils.isEmpty(intern) && !TextUtils.isEmpty(trim2)) {
                        lfy lfyVar = l;
                        String[] e = e(lfyVar, trim);
                        String[] e2 = e(lfyVar, trim2);
                        List list = (List) w.get(intern);
                        if (list == null) {
                            list = lre.A();
                            w.put(intern, list);
                        }
                        String[] strArr3 = g2 != null ? new String[e.length] : null;
                        String[] strArr4 = new String[e.length];
                        int codePointCount = intern.codePointCount(i2, intern.length());
                        int i3 = 0;
                        while (true) {
                            int length = e.length;
                            if (i3 >= length) {
                                break;
                            }
                            if (g == null) {
                                strArr = strArr2;
                                str = null;
                            } else {
                                strArr = strArr2;
                                str = (String) g.get(e[i3]);
                            }
                            if (str != null) {
                                strArr4[i3] = str;
                                sortedMap2 = g;
                            } else if (length != codePointCount) {
                                sortedMap2 = g;
                                strArr4[i3] = e[i3];
                            } else {
                                sortedMap2 = g;
                                strArr4[i3] = new String(Character.toChars(intern.codePointAt(intern.offsetByCodePoints(0, i3))));
                            }
                            if (g2 != null) {
                                String str2 = (String) g2.get(e[i3]);
                                strArr3[i3] = str2 == null ? "" : str2;
                            }
                            i3++;
                            strArr2 = strArr;
                            g = sortedMap2;
                        }
                        SortedMap sortedMap3 = g;
                        String[] strArr5 = strArr2;
                        list.add(new gck(intern, e2, e, strArr3, strArr4));
                        strArr2 = strArr5;
                        g = sortedMap3;
                        c = 2;
                        c2 = 1;
                        i2 = 0;
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException e3) {
            ((luc) ((luc) j.c()).k("com/google/android/apps/inputmethod/libs/chinese/WordExplanationMap", "loadIntermediateWordExplanationData", 311, "WordExplanationMap.java")).w("Read file exception: %s", e3.getMessage());
        }
        ArrayList A = lre.A();
        gvy gvyVar = new gvy(2);
        ArrayList A2 = lre.A();
        ArrayList A3 = lre.A();
        ArrayList A4 = lre.A();
        ArrayList arrayList = inputStream3 != null ? new ArrayList() : null;
        gvy gvyVar2 = new gvy(2);
        gvy gvyVar3 = new gvy(2);
        this.a = new SparseIntArray();
        Iterator it2 = w.keySet().iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            List list2 = (List) w.get(str3);
            if (list2.size() != 1) {
                int min = Math.min(list2.size(), 15);
                int i4 = (gvyVar2.a << 4) | Integer.MIN_VALUE | min;
                int i5 = 0;
                while (i5 < min) {
                    Iterator it3 = it2;
                    gck gckVar = (gck) list2.get(i5);
                    SortedMap sortedMap4 = w;
                    List list3 = list2;
                    int min2 = Math.min(((String[]) gckVar.d).length, 255);
                    int size = (A3.size() << 8) | min2;
                    int i6 = min;
                    int i7 = 0;
                    while (i7 < min2) {
                        int i8 = min2;
                        A3.add(((String[]) gckVar.d)[i7]);
                        if (arrayList != null && (obj = gckVar.e) != null) {
                            arrayList.add(((String[]) obj)[i7]);
                        }
                        A4.add(((String[]) gckVar.b)[i7]);
                        i7++;
                        min2 = i8;
                    }
                    gvyVar2.b(size);
                    gvyVar3.b(h(gckVar, A2));
                    i5++;
                    it2 = it3;
                    list2 = list3;
                    w = sortedMap4;
                    min = i6;
                }
                it = it2;
                sortedMap = w;
                i = i4;
            } else {
                i = h((gck) list2.get(0), A2);
                it = it2;
                sortedMap = w;
            }
            if (str3.codePointCount(0, str3.length()) == 1) {
                this.a.put(str3.codePointAt(0), i);
            } else {
                A.add(str3);
                gvyVar.b(i);
            }
            it2 = it;
            w = sortedMap;
        }
        this.b = (String[]) A.toArray(new String[A.size()]);
        this.c = gvyVar.e();
        this.g = (String[]) A2.toArray(new String[A2.size()]);
        this.d = (String[]) A3.toArray(new String[A3.size()]);
        this.e = arrayList != null ? (String[]) arrayList.toArray(new String[arrayList.size()]) : null;
        this.f = (String[]) A4.toArray(new String[A4.size()]);
        this.h = gvyVar2.e();
        this.i = gvyVar3.e();
    }

    private static boolean d(int i, String[] strArr, String[] strArr2) {
        int i2 = i >> 8;
        int i3 = i & 255;
        if (strArr2 == null || i3 != strArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            String str = strArr2[i2 + i4];
            String str2 = strArr[i4];
            int length = str.length();
            int length2 = str2.length();
            if ((length != length2 && length != length2 + 1) || !str.startsWith(str2)) {
                return false;
            }
        }
        return true;
    }

    private static final String[] e(lfy lfyVar, String str) {
        Iterable i = lfyVar.i(str);
        LinkedList<String> F = lre.F();
        lre.af(F, i);
        String[] strArr = new String[F.size()];
        int i2 = 0;
        for (String str2 : F) {
            strArr[i2] = str2.intern();
            i2++;
        }
        return strArr;
    }

    private static final boolean f(lfy lfyVar, String str, String[] strArr) {
        Iterator it = lfyVar.i(str).iterator();
        int i = 0;
        while (it.hasNext() && i < strArr.length) {
            strArr[i] = (String) it.next();
            i++;
        }
        return i == strArr.length && !it.hasNext();
    }

    private static final SortedMap g(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        TreeMap w = lre.w();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String[] strArr = new String[2];
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!f(k, readLine, strArr)) {
                    ((luc) ((luc) j.c()).k("com/google/android/apps/inputmethod/libs/chinese/WordExplanationMap", "loadTwoPartLineFile", 232, "WordExplanationMap.java")).w("Invalid entry: %s", readLine);
                } else {
                    String intern = strArr[0].trim().intern();
                    String intern2 = strArr[1].trim().intern();
                    if (!TextUtils.isEmpty(intern) && !TextUtils.isEmpty(intern2)) {
                        w.put(intern, intern2);
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            ((luc) ((luc) j.c()).k("com/google/android/apps/inputmethod/libs/chinese/WordExplanationMap", "loadTwoPartLineFile", 243, "WordExplanationMap.java")).w("Read file exception: %s", e.getMessage());
        }
        return w;
    }

    private static final int h(gck gckVar, List list) {
        int min = Math.min(((String[]) gckVar.c).length, 7);
        int size = (list.size() << 3) | min;
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (((boolean[]) gckVar.a)[i2]) {
                i |= 1 << i2;
            }
            list.add(((String[]) gckVar.c)[i2]);
        }
        return (i << 24) | size;
    }

    public final int a(int i, String[] strArr) {
        int i2 = (2147483632 & i) >> 4;
        int i3 = i & 15;
        if (strArr != null) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = this.h[i5];
                if (d(i6, strArr, this.d) || d(i6, strArr, this.e)) {
                    return i5;
                }
            }
        }
        return i2;
    }

    public final String b(int i) {
        int i2 = i >> 8;
        int i3 = i & 255;
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(this.f[i2 + i4]);
        }
        return sb.toString();
    }

    public final ifz c(int i, String str, String str2) {
        int i2 = (i >> 24) & 127;
        int i3 = (16777208 & i) >> 3;
        int i4 = i & 7;
        boolean z = false;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = 0;
                break;
            } else if (!this.g[i3 + i5].equals(str)) {
                break;
            } else {
                i5++;
            }
        }
        String str3 = this.g[i3 + i5];
        if (1 == ((i2 >> i5) & 1)) {
            z = true;
        }
        return new ifz(str3, z, str2);
    }
}
