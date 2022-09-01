package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ofb  reason: default package */
/* loaded from: classes2.dex */
public final class ofb {
    private ofb() {
    }

    public static Set a(Map map, String str) {
        nvr a;
        List e = obh.e(map, str);
        if (e == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(nvr.class);
        for (Object obj : e) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                boolean z = true;
                jez.Y(((double) intValue) == d.doubleValue(), "Status code %s is not integral", obj);
                a = nvu.c(intValue).o;
                if (a.r != d.intValue()) {
                    z = false;
                }
                jez.Y(z, "Status code %s is not valid", obj);
            } else if (!(obj instanceof String)) {
                throw new lgj("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
            } else {
                try {
                    a = nvr.a((String) obj);
                } catch (IllegalArgumentException e2) {
                    throw new lgj("Status code " + obj + " is not valid", e2);
                }
            }
            noneOf.add(a);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? "OUTBOUND" : "INBOUND";
    }

    public static String c(opz opzVar) {
        String d = opzVar.d();
        String e = opzVar.e();
        if (e != null) {
            return d + "?" + e;
        }
        return d;
    }

    public static boolean d(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean e(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            default:
                return 0;
        }
    }
}
