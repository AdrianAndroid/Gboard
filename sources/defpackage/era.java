package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: era  reason: default package */
/* loaded from: classes.dex */
public final class era {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils");
    static final hhl a = isy.a;

    public static float a(eut eutVar, Resources resources) {
        return TypedValue.applyDimension(1, (float) eutVar.i, resources.getDisplayMetrics());
    }

    public static int b(eut eutVar) {
        char c;
        String str = eutVar.c;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int hashCode = lowerCase.hashCode();
        if (hashCode == -1106037339) {
            if (lowerCase.equals("outside")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 96673) {
            if (hashCode == 3387192 && lowerCase.equals("none")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("all")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2) {
            return 2;
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "getBlurMode", 245, "StyleSheetProtoUtils.java")).w("Unknown blur mode: <%s>", str);
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int c(eut eutVar) {
        char c;
        if (eutVar.c.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (String str : lfy.c('|').i(eutVar.c)) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -1383228885:
                    if (lowerCase.equals("bottom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (lowerCase.equals("top")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (lowerCase.equals("left")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (lowerCase.equals("right")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i |= 80;
            } else if (c == 1) {
                i |= 3;
            } else if (c == 2) {
                i |= 5;
            } else if (c != 3) {
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "getGravity", 176, "StyleSheetProtoUtils.java")).w("Unknown word %s in gravity string_value.", str);
            } else {
                i |= 48;
            }
        }
        return i;
    }

    public static int d(eut eutVar) {
        char c;
        if (eutVar.c.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (String str : lfy.c('|').i(eutVar.c)) {
            String lowerCase = str.toLowerCase(Locale.US);
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1633016142) {
                if (hashCode == -483365792 && lowerCase.equals("fill_horizontal")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (lowerCase.equals("fill_vertical")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                i |= 1;
            } else if (c != 1) {
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "getScaleMode", 203, "StyleSheetProtoUtils.java")).w("Unknown word %s in scale mode string_value.", str);
            } else {
                i |= 2;
            }
        }
        return i;
    }

    public static int e(eut eutVar) {
        char c;
        String str = eutVar.c;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (String str2 : lfy.c('|').i(eutVar.c)) {
            String lowerCase = str2.toLowerCase(Locale.US);
            int hashCode = lowerCase.hashCode();
            if (hashCode == -1178781136) {
                if (lowerCase.equals("italic")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != -1039745817) {
                if (hashCode == 3029637 && lowerCase.equals("bold")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (lowerCase.equals("normal")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c == 1) {
                    i |= 1;
                } else if (c != 2) {
                    ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "getTextStyle", 270, "StyleSheetProtoUtils.java")).w("Unknown text style: %s", str);
                } else {
                    i |= 2;
                }
            }
        }
        return i;
    }

    public static int f(eut eutVar) {
        char c;
        String str = eutVar.c;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int hashCode = lowerCase.hashCode();
        if (hashCode == -1901805651) {
            if (lowerCase.equals("invisible")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 3178655) {
            if (hashCode == 466743410 && lowerCase.equals("visible")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("gone")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 4;
        }
        if (c == 2) {
            return 8;
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "getVisibility", 312, "StyleSheetProtoUtils.java")).w("Unknown visibility: %s", str);
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Shader.TileMode g(eut eutVar) {
        char c;
        String str = eutVar.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1073910849:
                if (lowerCase.equals("mirror")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -934531685:
                if (lowerCase.equals("repeat")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (lowerCase.equals("none")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 94742715:
                if (lowerCase.equals("clamp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return null;
        }
        if (c == 1) {
            return Shader.TileMode.CLAMP;
        }
        if (c == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (c == 3) {
            return Shader.TileMode.REPEAT;
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "getTileMode", 226, "StyleSheetProtoUtils.java")).w("Unknown value as tile mode: <%s>", str);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Typeface h(eut eutVar) {
        char c;
        String str = eutVar.c;
        if (TextUtils.isEmpty(str)) {
            return Typeface.DEFAULT;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1431958525:
                if (lowerCase.equals("monospace")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1039745817:
                if (lowerCase.equals("normal")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3522707:
                if (lowerCase.equals("sans")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109326717:
                if (lowerCase.equals("serif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return Typeface.DEFAULT;
        }
        if (c == 1) {
            return Typeface.MONOSPACE;
        }
        if (c == 2) {
            return Typeface.SANS_SERIF;
        }
        if (c == 3) {
            return Typeface.SERIF;
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "getTypeface", 293, "StyleSheetProtoUtils.java")).w("Unknown typeface: %s", str);
        return Typeface.DEFAULT;
    }

    public static eut i(SparseArray sparseArray, euu euuVar) {
        eqq eqqVar = (eqq) sparseArray.get(euuVar.ae);
        Object obj = null;
        if (eqqVar == null) {
            return null;
        }
        Iterator it = eqqVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ewj ewjVar = (ewj) it.next();
            if (((int[]) ewjVar.b).length == 0) {
                obj = ewjVar.a;
                break;
            }
        }
        return (eut) obj;
    }

    public static eut j(int i) {
        nfh t = eut.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eut eutVar = (eut) t.b;
        eutVar.a |= 1;
        eutVar.b = i;
        return (eut) t.cz();
    }

    public static eut k(double d) {
        nfh t = eut.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eut eutVar = (eut) t.b;
        eutVar.a |= 16;
        eutVar.i = d;
        return (eut) t.cz();
    }

    public static euv l(euu euuVar, double d, String... strArr) {
        return m(euuVar, k(d), strArr);
    }

    public static euv m(euu euuVar, eut eutVar, String... strArr) {
        nfh t = euv.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        euv euvVar = (euv) t.b;
        euvVar.c = euuVar.ae;
        int i = euvVar.a | 1;
        euvVar.a = i;
        eutVar.getClass();
        euvVar.d = eutVar;
        euvVar.a = i | 2;
        t.cL(Arrays.asList(strArr));
        return (euv) t.cz();
    }

    public static euv n(euu euuVar, String str, String... strArr) {
        nfh t = eut.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eut eutVar = (eut) t.b;
        eutVar.a |= 2;
        eutVar.c = str;
        return m(euuVar, (eut) t.cz(), strArr);
    }

    public static euv o(euu euuVar, String str, String... strArr) {
        nfh t = euv.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        euv euvVar = (euv) t.b;
        euvVar.c = euuVar.ae;
        int i = euvVar.a | 1;
        euvVar.a = i;
        euvVar.a = i | 4;
        euvVar.e = str;
        t.cL(Arrays.asList(strArr));
        return (euv) t.cz();
    }

    public static euw p(euw... euwVarArr) {
        nfh t = euw.c.t();
        for (int i = 0; i < 2; i++) {
            t.cG(euwVarArr[i]);
        }
        return (euw) t.cz();
    }

    public static eux q(String str, eut eutVar) {
        nfh t = eux.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eux euxVar = (eux) t.b;
        int i = euxVar.a | 1;
        euxVar.a = i;
        euxVar.b = str;
        eutVar.getClass();
        euxVar.c = eutVar;
        euxVar.a = i | 2;
        return (eux) t.cz();
    }

    public static Map r(List list, Set set) {
        int i;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            eux euxVar = (eux) it.next();
            if (!euxVar.b.isEmpty()) {
                if ((euxVar.a & 8) != 0) {
                    eup b2 = eup.b(euxVar.e);
                    if (b2 == null) {
                        b2 = eup.FLAG_ID_NONE;
                    }
                    if (set.contains(b2)) {
                    }
                }
                if ((euxVar.a & 2) != 0) {
                    z = true;
                }
                boolean z2 = !euxVar.d.isEmpty();
                if (z == z2) {
                    ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "buildVariableMap", 412, "StyleSheetProtoUtils.java")).J("Set one of value OR variableRef. name:%s, hasValue:%b, hasVariableRef:%b", euxVar.b, Boolean.valueOf(z), Boolean.valueOf(z2));
                } else if (!z) {
                    hashMap2.put(euxVar.b, euxVar.d);
                    hashMap.remove(euxVar.b);
                } else {
                    String str = euxVar.b;
                    eut eutVar = euxVar.c;
                    if (eutVar == null) {
                        eutVar = eut.j;
                    }
                    hashMap.put(str, eutVar);
                    hashMap2.remove(euxVar.b);
                }
            } else {
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "buildVariableMap", 403, "StyleSheetProtoUtils.java")).t("Variable name is not set. Ignoring variable entry.");
            }
        }
        for (String str2 : (String[]) hashMap2.keySet().toArray(new String[0])) {
            u(str2, hashMap, hashMap2);
        }
        if (!hashMap2.isEmpty()) {
            ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "buildVariableMap", 432, "StyleSheetProtoUtils.java")).t("All variableRef should be resolved here.");
        }
        return hashMap;
    }

    public static Set s(Context context) {
        HashSet hashSet = new HashSet();
        if (((Boolean) a.c()).booleanValue()) {
            hashSet.add(eup.DUMMY_FLAG_FOR_TESTING);
        }
        if (itb.n() && itb.k()) {
            hashSet.add(eup.USE_RECT_KEY_ON_GRADIENT_THEME);
        }
        if (itb.n()) {
            hashSet.add(eup.PILL_SHAPED_KEY);
        }
        if (((Boolean) itb.n.c()).booleanValue()) {
            hashSet.add(eup.AC_INDICATOR_LOW_CONTRAST);
        }
        if (((Boolean) iho.a(context).c()).booleanValue()) {
            hashSet.add(eup.CONSISTENT_NAV);
        }
        return hashSet;
    }

    public static void t(nfh nfhVar, AssetManager assetManager, String str) {
        try {
            InputStream b2 = erg.b(assetManager, str);
            try {
                if (b2 == null) {
                    ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "mergeStyleSheetFromAsset", 386, "StyleSheetProtoUtils.java")).w("Could not read asset file: %s", str);
                    return;
                }
                nfhVar.cu(b2, nfb.b());
                b2.close();
            } catch (Throwable th) {
                if (b2 != null) {
                    try {
                        b2.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                }
                throw th;
            }
        } catch (ngd e) {
            ((ltd) ((ltd) b.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "mergeStyleSheetFromAsset", 391, "StyleSheetProtoUtils.java")).w("Invalid pb file in assets: %s", str);
        } catch (IOException e2) {
            ((ltd) ((ltd) b.a(hip.a).i(e2)).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "mergeStyleSheetFromAsset", 393, "StyleSheetProtoUtils.java")).w("Could not read asset file: %s", str);
        }
    }

    private static boolean u(String str, Map map, Map map2) {
        if (map.containsKey(str)) {
            return true;
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "resolveVariableRef", 467, "StyleSheetProtoUtils.java")).w("variableRef should be in variableRefMap. name: %s", str);
            return false;
        }
        map2.remove(str);
        if (!u(str2, map, map2)) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "resolveVariableRef", 473, "StyleSheetProtoUtils.java")).w("Invalid variable-ref. name: %s", str2);
            return false;
        }
        eut eutVar = (eut) map.get(str2);
        if (eutVar == null) {
            ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/StyleSheetProtoUtils", "resolveVariableRef", 479, "StyleSheetProtoUtils.java")).w("The variableRef should be resolved here. name: %s", str2);
            return false;
        }
        map.put(str, eutVar);
        return true;
    }
}
