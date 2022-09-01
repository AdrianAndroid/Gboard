package defpackage;

import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dpy  reason: default package */
/* loaded from: classes.dex */
public final class dpy {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersUtils");
    private static final lmz b;

    static {
        lmx h = lmz.h(4);
        h.d(-10000);
        h.d(-10004);
        h.d(-10012);
        h.d(-10030);
        h.d(-10011);
        h.d(-60000);
        h.d(-10002);
        h.d(-10022);
        h.d(-10016);
        h.d(-10041);
        h.d(-30007);
        h.d(-10109);
        h.d(-10110);
        b = h.g();
    }

    public static int a(ibz ibzVar) {
        if (ibz.a.equals(ibzVar)) {
            return 0;
        }
        if (ibz.b.equals(ibzVar)) {
            return 1;
        }
        return ibz.c.equals(ibzVar) ? 2 : 5;
    }

    public static int b(hfd hfdVar) {
        iay[] iayVarArr = hfdVar.b;
        if (iayVarArr == null || iayVarArr.length <= 0) {
            return -1;
        }
        iay iayVar = iayVarArr[0];
        int i = iayVar.c;
        if (i == -10018) {
            return 11;
        }
        if (i == 62) {
            return 1;
        }
        if (i == 55) {
            return 7;
        }
        if (i == 56) {
            return 6;
        }
        if (i == 59 || i == 60) {
            return 8;
        }
        if (i == 66) {
            return 11;
        }
        if (i == 67) {
            return 9;
        }
        if (i == -10058) {
            int i2 = hfdVar.d;
            if (i2 == R.id.key_pos_switch_to_next_language || i2 == R.id.f119440_resource_name_obfuscated_res_0x7f0b1d55) {
                return 13;
            }
            i = -10058;
        }
        if (i >= 7 && i <= 16) {
            return 2;
        }
        if (i >= 29 && i <= 54) {
            return 3;
        }
        if (iayVar.d != null || i >= 0) {
            Object obj = iayVar.e;
            if (!(obj instanceof String)) {
                return 5;
            }
            String str = (String) obj;
            if (Character.codePointCount(str, 0, str.length()) != 1) {
                return 10;
            }
            int codePointAt = Character.codePointAt(str, 0);
            if (Character.getType(codePointAt) == 15) {
                return 0;
            }
            if (Character.isSupplementaryCodePoint(codePointAt)) {
                return 4;
            }
            if (Character.isWhitespace(codePointAt)) {
                return 1;
            }
            if (Character.isDigit(codePointAt)) {
                return 2;
            }
            return Character.isLetter(codePointAt) ? 3 : 5;
        } else if (!b.contains(Integer.valueOf(i))) {
            return -1;
        } else {
            return -iayVar.c;
        }
    }

    public static int c(String str) {
        if (str.equals("en")) {
            return 1;
        }
        if (str.equals("es")) {
            return 2;
        }
        if (str.equals("pt")) {
            return 3;
        }
        if (str.equals("ru")) {
            return 4;
        }
        return str.equals("fr") ? 5 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(String str) {
        char c;
        if (!li.f() || !str.equals("android.permission.READ_MEDIA_IMAGES")) {
            switch (str.hashCode()) {
                case -2062386608:
                    if (str.equals("android.permission.READ_SMS")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -406040016:
                    if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1831139720:
                    if (str.equals("android.permission.RECORD_AUDIO")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1977429404:
                    if (str.equals("android.permission.READ_CONTACTS")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return 1;
            }
            if (c == 1) {
                return 2;
            }
            if (c == 2) {
                return 3;
            }
            if (c == 3) {
                return 4;
            }
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersUtils", "getPermissionCode", 304, "LatinCommonCountersUtils.java")).w("Fail to find code for permission: %s.", str);
            return 0;
        }
        return 5;
    }

    public static int e(long j) {
        if (j == iby.p) {
            return 1;
        }
        if (j == iby.q) {
            return 2;
        }
        return j == iby.r ? 3 : 0;
    }

    public static int f(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (cbw.g((mvm) it.next())) {
                i++;
            }
        }
        if (i != 0) {
            return i != 1 ? 5 : 4;
        }
        return 0;
    }

    public static int g(int i) {
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 1 : 5;
        }
        return 2;
    }

    public static int h(ibz ibzVar, ibz ibzVar2) {
        ibz ibzVar3 = ibz.a;
        if (ibzVar == ibzVar3) {
            if (ibzVar2 == ibz.b) {
                return 2;
            }
            return ibzVar2 == ibz.c ? 3 : 1;
        }
        ibz ibzVar4 = ibz.b;
        if (ibzVar == ibzVar4) {
            if (ibzVar2 == ibzVar3) {
                return 101;
            }
            return ibzVar2 == ibz.c ? 103 : 1;
        } else if (ibzVar != ibz.c) {
            return 1;
        } else {
            if (ibzVar2 == ibzVar3) {
                return 201;
            }
            return ibzVar2 == ibzVar4 ? 202 : 1;
        }
    }
}
