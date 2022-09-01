package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: iaz  reason: default package */
/* loaded from: classes.dex */
public final class iaz {
    public static final SparseIntArray a;
    private static volatile KeyCharacterMap c;
    private static volatile SparseIntArray d;
    private static final qv f;
    private static final ltg b = ltg.j("com/google/android/libraries/inputmethod/metadata/KeyEventUtil");
    private static final lfy e = lfy.e("+");

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.put(57, 18);
        sparseIntArray.put(58, 34);
        sparseIntArray.put(115, 1048576);
        sparseIntArray.put(113, 12288);
        sparseIntArray.put(114, 20480);
        sparseIntArray.put(119, 8);
        sparseIntArray.put(117, 196608);
        sparseIntArray.put(118, 327680);
        sparseIntArray.put(143, 2097152);
        sparseIntArray.put(116, 4194304);
        sparseIntArray.put(59, 65);
        sparseIntArray.put(60, 129);
        sparseIntArray.put(63, 4);
        qv qvVar = new qv();
        f = qvVar;
        qvVar.put("ALT", 2);
        qvVar.put("ALT_LEFT", 16);
        qvVar.put("ALT_RIGHT", 32);
        qvVar.put("CAPS_LOCK", 1048576);
        qvVar.put("CTRL", 4096);
        qvVar.put("CTRL_LEFT", 8192);
        qvVar.put("CTRL_RIGHT", 16384);
        qvVar.put("FUNCTION", 8);
        qvVar.put("META", 65536);
        qvVar.put("META_LEFT", 131072);
        qvVar.put("META_RIGHT", 262144);
        qvVar.put("NUM_LOCK", 2097152);
        qvVar.put("SCROLL_LOCK", 4194304);
        qvVar.put("SHIFT", 1);
        qvVar.put("SHIFT_LEFT", 64);
        qvVar.put("SHIFT_RIGHT", 128);
        qvVar.put("SYM", 4);
    }

    private iaz() {
    }

    public static int a(KeyEvent keyEvent) {
        try {
            return keyEvent.getUnicodeChar();
        } catch (RuntimeException unused) {
            ((ltd) ((ltd) b.d()).k("com/google/android/libraries/inputmethod/metadata/KeyEventUtil", "getUnicodeChar", 278, "KeyEventUtil.java")).u("Failed to get the unicode of: %d", keyEvent.getKeyCode());
            return 0;
        }
    }

    public static int c(String str) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Integer num2 = (Integer) icg.b.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        String upperCase = str.toUpperCase(Locale.US);
        Integer num3 = (Integer) icg.b.get(upperCase);
        if (num3 != null) {
            return num3.intValue();
        }
        if (!upperCase.startsWith("KEYCODE_") || (num = (Integer) icg.b.get(upperCase.substring(8))) == null) {
            return Integer.decode(upperCase).intValue();
        }
        return num.intValue();
    }

    public static int d(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        for (String str2 : e.i(str.toUpperCase(Locale.US))) {
            Integer num = (Integer) f.get(str2);
            if (num != null) {
                i |= num.intValue();
            }
        }
        return i;
    }

    public static KeyCharacterMap e() {
        KeyCharacterMap keyCharacterMap = c;
        if (keyCharacterMap == null) {
            synchronized (iaz.class) {
                keyCharacterMap = c;
                if (keyCharacterMap == null) {
                    try {
                        KeyCharacterMap load = KeyCharacterMap.load(-1);
                        c = load;
                        keyCharacterMap = load;
                    } catch (RuntimeException e2) {
                        ((ltd) ((ltd) ((ltd) b.c()).i(e2)).k("com/google/android/libraries/inputmethod/metadata/KeyEventUtil", "getKeyCharacterMap", (char) 292, "KeyEventUtil.java")).t("Error loading KeyCharacterMap");
                    }
                }
            }
        }
        return keyCharacterMap;
    }

    public static String f(int i) {
        String str = (String) ((lrk) icg.b).e.get(Integer.valueOf(i));
        return str != null ? str : "0x".concat(String.valueOf(Integer.toHexString(i)));
    }

    public static boolean g(int i) {
        return i < 0 ? !i(i) : i < 7 || (i > 18 && i < 29) || ((i > 56 && i < 62) || ((i > 62 && i < 68) || ((i > 77 && i < 81) || ((i > 81 && i < 144) || i > 163))));
    }

    public static boolean h(int i) {
        return a.indexOfKey(i) >= 0;
    }

    public static boolean i(int i) {
        return i == -10043 || i == -10009 || i == -10027 || i == -10139;
    }

    public static boolean j(int i) {
        return ((i & 1) == 0 && (i & 1048576) == 0) ? false : true;
    }

    public static int[] k(String str, lfy lfyVar) {
        if (TextUtils.isEmpty(str)) {
            return gvw.b;
        }
        if (lfyVar == null) {
            return new int[]{c(str)};
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : lfyVar.i(str)) {
            arrayList.add(Integer.valueOf(c(str2)));
        }
        hgw.e(arrayList, 0);
        return arrayList.isEmpty() ? gvw.b : mhq.p(arrayList);
    }

    public static int b(char c2, int[] iArr) {
        SparseIntArray sparseIntArray;
        int i;
        int i2;
        iArr[0] = 0;
        if (c2 < 'a' || c2 > 'z') {
            if (c2 >= 'A' && c2 <= 'Z') {
                iArr[0] = 1;
                return c2 - '$';
            } else if (c2 >= '0' && c2 <= '9') {
                return c2 - ')';
            } else {
                SparseIntArray sparseIntArray2 = d;
                if (sparseIntArray2 == null) {
                    synchronized (iaz.class) {
                        sparseIntArray2 = d;
                        if (sparseIntArray2 == null) {
                            try {
                                KeyCharacterMap e2 = e();
                                if (e2 == null) {
                                    sparseIntArray = null;
                                } else {
                                    SparseIntArray sparseIntArray3 = new SparseIntArray();
                                    if (!jam.b) {
                                        int maxKeyCode = KeyEvent.getMaxKeyCode();
                                        for (int i3 = 1; i3 < maxKeyCode; i3++) {
                                            if ((i3 < 29 || i3 > 54) && ((i3 < 144 || i3 > 163) && (i = e2.get(i3, 1)) != 0 && (i & Integer.MIN_VALUE) == 0)) {
                                                if (sparseIntArray3.get(i) <= 0) {
                                                    sparseIntArray3.put(i, -i3);
                                                }
                                                if ((i3 < 7 || i3 > 16) && (i2 = e2.get(i3, 0)) != 0 && (Integer.MIN_VALUE & i2) == 0) {
                                                    sparseIntArray3.put(i2, i3);
                                                }
                                            }
                                        }
                                    }
                                    sparseIntArray = sparseIntArray3;
                                }
                                d = sparseIntArray;
                                sparseIntArray2 = sparseIntArray;
                            } catch (RuntimeException e3) {
                                ((ltd) ((ltd) ((ltd) b.c()).i(e3)).k("com/google/android/libraries/inputmethod/metadata/KeyEventUtil", "getCharToKeyCodeMap", (char) 309, "KeyEventUtil.java")).t("Error loading charToKeyCodeMap");
                            }
                        }
                    }
                }
                if (sparseIntArray2 == null) {
                    return 0;
                }
                int i4 = sparseIntArray2.get(c2);
                if (i4 >= 0) {
                    return i4;
                }
                iArr[0] = 1;
                return -i4;
            }
        }
        return c2 - 'D';
    }
}
