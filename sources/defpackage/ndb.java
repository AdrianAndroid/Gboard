package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ndb  reason: default package */
/* loaded from: classes2.dex */
public class ndb {
    public static volatile nuq d;
    public static volatile nuq e;

    public static void A(Object obj, nia niaVar) {
        ((nfm) obj).cQ = niaVar;
    }

    public static /* bridge */ /* synthetic */ Object B(Object obj) {
        nia z = z(obj);
        if (z == nia.a) {
            nia b = nia.b();
            A(obj, b);
            return b;
        }
        return z;
    }

    public static void C(Object obj) {
        z(obj).c();
    }

    public static String D(nem nemVar) {
        StringBuilder sb = new StringBuilder(nemVar.d());
        for (int i = 0; i < nemVar.d(); i++) {
            byte a = nemVar.a(i);
            if (a != 34) {
                if (a != 39) {
                    if (a == 92) {
                        sb.append("\\\\");
                    } else {
                        switch (a) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                sb.append("\\f");
                                continue;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a < 32 || a > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((a >>> 6) & 3) + 48));
                                    sb.append((char) (((a >>> 3) & 7) + 48));
                                    sb.append((char) ((a & 7) + 48));
                                    break;
                                } else {
                                    sb.append((char) a);
                                    continue;
                                }
                                break;
                        }
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static void E(nem nemVar, ArrayDeque arrayDeque) {
        if (nemVar.h()) {
            int a = a(nemVar.d());
            int c = nhn.c(a + 1);
            if (arrayDeque.isEmpty() || ((nem) arrayDeque.peek()).d() >= c) {
                arrayDeque.push(nemVar);
                return;
            }
            int c2 = nhn.c(a);
            nem nemVar2 = (nem) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((nem) arrayDeque.peek()).d() < c2) {
                nemVar2 = new nhn((nem) arrayDeque.pop(), nemVar2);
            }
            nhn nhnVar = new nhn(nemVar2, nemVar);
            while (!arrayDeque.isEmpty()) {
                if (((nem) arrayDeque.peek()).d() >= nhn.c(a(nhnVar.d) + 1)) {
                    break;
                }
                nhnVar = new nhn((nem) arrayDeque.pop(), nhnVar);
            }
            arrayDeque.push(nhnVar);
        } else if (!(nemVar instanceof nhn)) {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(nemVar.getClass()))));
        } else {
            nhn nhnVar2 = (nhn) nemVar;
            int[] iArr = nhn.a;
            E(nhnVar2.e, arrayDeque);
            E(nhnVar2.f, arrayDeque);
        }
    }

    static void F(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                F(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                F(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(D(nem.w((String) obj)));
                sb.append('\"');
            } else if (obj instanceof nem) {
                sb.append(": \"");
                sb.append(D((nem) obj));
                sb.append('\"');
            } else if (obj instanceof nfm) {
                sb.append(" {");
                G((nfm) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                F(sb, i4, "key", entry2.getKey());
                F(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static void G(ngz ngzVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : ngzVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    F(sb, i, av(concat), nfm.J(method2, ngzVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    F(sb, i, av(concat2), nfm.J(method3, ngzVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(String.valueOf(substring)))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(String.valueOf(substring)));
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object J = nfm.J(method4, ngzVar, new Object[0]);
                    if (method5 == null) {
                        if (J instanceof Boolean) {
                            if (((Boolean) J).booleanValue()) {
                                F(sb, i, av(concat3), J);
                            }
                        } else if (J instanceof Integer) {
                            if (((Integer) J).intValue() != 0) {
                                F(sb, i, av(concat3), J);
                            }
                        } else if (J instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) J).floatValue()) != 0) {
                                F(sb, i, av(concat3), J);
                            }
                        } else if (J instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) J).doubleValue()) != 0) {
                                F(sb, i, av(concat3), J);
                            }
                        } else {
                            if (J instanceof String) {
                                equals = J.equals("");
                            } else if (J instanceof nem) {
                                equals = J.equals(nem.b);
                            } else if (J instanceof ngz) {
                                if (J != ((ngz) J).cB()) {
                                    F(sb, i, av(concat3), J);
                                }
                            } else {
                                if ((J instanceof Enum) && ((Enum) J).ordinal() == 0) {
                                }
                                F(sb, i, av(concat3), J);
                            }
                            if (!equals) {
                                F(sb, i, av(concat3), J);
                            }
                        }
                    } else if (((Boolean) nfm.J(method5, ngzVar, new Object[0])).booleanValue()) {
                        F(sb, i, av(concat3), J);
                    }
                }
            }
        }
        if (ngzVar instanceof nfk) {
            Iterator d2 = ((nfk) ngzVar).d.d();
            while (d2.hasNext()) {
                Map.Entry entry = (Map.Entry) d2.next();
                F(sb, i, "[" + ((nfl) entry.getKey()).a + "]", entry.getValue());
            }
        }
        nia niaVar = ((nfm) ngzVar).cQ;
        if (niaVar != null) {
            for (int i2 = 0; i2 < niaVar.b; i2++) {
                F(sb, i, String.valueOf(nim.a(niaVar.c[i2])), niaVar.d[i2]);
            }
        }
    }

    public static ngt H(Object obj) {
        return (ngt) ((mlu) obj).a;
    }

    public static int I(int i, Object obj, Object obj2) {
        ngu nguVar = (ngu) obj;
        mlu mluVar = (mlu) obj2;
        int i2 = 0;
        if (!nguVar.isEmpty()) {
            for (Map.Entry entry : nguVar.entrySet()) {
                i2 += Cnew.ab(i) + Cnew.R(mlu.d((ngt) mluVar.a, entry.getKey(), entry.getValue()));
            }
        }
        return i2;
    }

    public static boolean J(Object obj) {
        return !((ngu) obj).b;
    }

    public static Object K(Object obj, Object obj2) {
        ngu nguVar = (ngu) obj;
        ngu nguVar2 = (ngu) obj2;
        if (!nguVar2.isEmpty()) {
            if (!nguVar.b) {
                nguVar = nguVar.a();
            }
            nguVar.b();
            if (!nguVar2.isEmpty()) {
                nguVar.putAll(nguVar2);
            }
        }
        return nguVar;
    }

    public static Object L() {
        return ngu.a.a();
    }

    public static int M(Map.Entry entry) {
        return ((nfl) entry.getKey()).a;
    }

    public static nfd N(Object obj) {
        return ((nfk) obj).d;
    }

    public static nfd O(Object obj) {
        return ((nfk) obj).c();
    }

    public static void P(nhk nhkVar, Object obj, nfb nfbVar, nfd nfdVar) {
        ngt ngtVar = (ngt) obj;
        nfdVar.l((nfl) ngtVar.c, nhkVar.t(ngtVar.a.getClass(), nfbVar));
    }

    public static void Q(Object obj) {
        N(obj).e();
    }

    public static nem R(Cnew cnew, byte[] bArr) {
        cnew.al();
        return new nek(bArr);
    }

    public static void S(mlu mluVar, Map.Entry entry) {
        nfl nflVar = (nfl) entry.getKey();
        nik nikVar = nik.DOUBLE;
        switch (nflVar.b.ordinal()) {
            case 0:
                mluVar.h(nflVar.a, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                mluVar.l(nflVar.a, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                mluVar.o(nflVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                mluVar.x(nflVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                mluVar.n(nflVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                mluVar.k(nflVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                mluVar.j(nflVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                mluVar.f(nflVar.a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                mluVar.v(nflVar.a, (String) entry.getValue());
                return;
            case 9:
                mluVar.m(nflVar.a, entry.getValue(), nhh.a.a(entry.getValue().getClass()));
                return;
            case 10:
                mluVar.p(nflVar.a, entry.getValue(), nhh.a.a(entry.getValue().getClass()));
                return;
            case 11:
                mluVar.g(nflVar.a, (nem) entry.getValue());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                mluVar.w(nflVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                mluVar.n(nflVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                mluVar.r(nflVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                mluVar.s(nflVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                mluVar.t(nflVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                mluVar.u(nflVar.a, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    public static List T(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    public static Object U(Object obj, Class cls) {
        boolean z;
        if (obj instanceof noz) {
            if (obj instanceof npb) {
                Annotation[] annotations = cls.getAnnotations();
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                Object[] objArr = {cls.getCanonicalName()};
                if (!(!z)) {
                    throw new IllegalStateException(String.format("Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", objArr));
                }
            }
            return cls.cast(obj);
        } else if (!(obj instanceof npa)) {
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), noz.class, npa.class));
        } else {
            return U(((npa) obj).a(), cls);
        }
    }

    public static int V(int i) {
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
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return 124;
            case 124:
                return 125;
            case 125:
                return 126;
            case 126:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            default:
                return 0;
        }
    }

    public static int W(int i) {
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ String X(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "UNKNOWN_FAILURE";
            case 3:
                return "DOUBLE_INIT";
            case 4:
                return "INVALID_CONFIG";
            case 5:
                return "UNSUPPORTED_LOCALE";
            case 6:
                return "INVALID_LANGUAGE_PACK";
            case 7:
                return "UNDEFINED_BEHAVIOR";
            case 8:
                return "MISSING_HOTWORD";
            case 9:
                return "UNSUPPORTED_LANGUAGE_PACK";
            case 10:
                return "INVALID_LANGUAGE_PACK_FOR_LANGID";
            default:
                return "INVALID_LANGUAGE_PACK_FOR_DIARIZATION";
        }
    }

    public static int Y(int i) {
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
            default:
                return 0;
        }
    }

    public static int Z(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    private static int a(int i) {
        int binarySearch = Arrays.binarySearch(nhn.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public static int aa(int i) {
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
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            default:
                return 0;
        }
    }

    public static int ab(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static /* synthetic */ String ac(int i) {
        switch (i) {
            case 1:
                return "LINEAR16";
            case 2:
                return "FLOAT32";
            case 3:
                return "FLAC";
            case 4:
                return "AMR";
            case 5:
                return "MULAW";
            case 6:
                return "SPEEX_NB";
            case 7:
                return "SPEEX_WB";
            case 8:
                return "OGG_VORBIS";
            case 9:
                return "ADTS_AAC";
            case 10:
                return "AMR_WB";
            default:
                return "OGG_OPUS";
        }
    }

    public static String ad(int i) {
        return Integer.toString(i - 1);
    }

    public static int ae(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int af(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int ag(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int ah(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int ai(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int aj(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    public static String ak(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!as(b)) {
                break;
            }
            i++;
            ap(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (as(b2)) {
                int i7 = i5 + 1;
                ap(b2, cArr, i5);
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!as(b3)) {
                            break;
                        }
                        i++;
                        i7 = i5 + 1;
                        ap(b3, cArr, i5);
                    }
                }
            } else if (au(b2)) {
                if (i6 < i3) {
                    ar(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw ngd.d();
                }
            } else if (at(b2)) {
                if (i6 < i3 - 1) {
                    int i8 = i6 + 1;
                    aq(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    throw ngd.d();
                }
            } else if (i6 < i3 - 2) {
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                ao(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i5 += 2;
                i = i10 + 1;
            } else {
                throw ngd.d();
            }
        }
        return new String(cArr, 0, i5);
    }

    public static String al(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!as(b)) {
                break;
            }
            i++;
            ap(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (as(b2)) {
                int i6 = i4 + 1;
                ap(b2, cArr, i4);
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i < i3) {
                        byte b3 = bArr[i];
                        if (!as(b3)) {
                            break;
                        }
                        i++;
                        i6 = i4 + 1;
                        ap(b3, cArr, i4);
                    }
                }
            } else if (au(b2)) {
                if (i5 < i3) {
                    ar(b2, bArr[i5], cArr, i4);
                    i = i5 + 1;
                    i4++;
                } else {
                    throw ngd.d();
                }
            } else if (at(b2)) {
                if (i5 < i3 - 1) {
                    int i7 = i5 + 1;
                    aq(b2, bArr[i5], bArr[i7], cArr, i4);
                    i = i7 + 1;
                    i4++;
                } else {
                    throw ngd.d();
                }
            } else if (i5 < i3 - 2) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                ao(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                i4 += 2;
                i = i9 + 1;
            } else {
                throw ngd.d();
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
        if (r12[r13] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int am(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndb.am(int, byte[], int, int):int");
    }

    public static boolean an(byte[] bArr, int i, int i2) {
        return am(0, bArr, i, i2) == 0;
    }

    public static void ao(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (ax(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || ax(b3) || ax(b4)) {
            throw ngd.d();
        }
        int aw = ((b & 7) << 18) | (aw(b2) << 12) | (aw(b3) << 6) | aw(b4);
        cArr[i] = (char) ((aw >>> 10) + 55232);
        cArr[i + 1] = (char) ((aw & 1023) + 56320);
    }

    public static void ap(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static void ar(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || ax(b2)) {
            throw ngd.d();
        }
        cArr[i] = (char) (((b & 31) << 6) | aw(b2));
    }

    public static boolean as(byte b) {
        return b >= 0;
    }

    public static boolean at(byte b) {
        return b < -16;
    }

    public static boolean au(byte b) {
        return b < -32;
    }

    private static String av(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static int aw(byte b) {
        return b & 63;
    }

    private static boolean ax(byte b) {
        return b > -65;
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "FIXED_LENGTH_BASE_64";
            case 2:
                return "BOOLEAN";
            case 3:
                return "STRING";
            case 4:
                return "INTEGER";
            case 5:
                return "LONG";
            case 6:
                return "FLOAT";
            case 7:
                return "PREFIX_HEX";
            default:
                return "FIFE_SAFE_BASE_64";
        }
    }

    public static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(s(bArr, i));
    }

    public static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(f(bArr, i));
    }

    public static int e(byte[] bArr, int i, ndz ndzVar) {
        int n = n(bArr, i, ndzVar);
        int i2 = ndzVar.a;
        if (i2 < 0) {
            throw ngd.f();
        }
        if (i2 > bArr.length - n) {
            throw ngd.i();
        }
        if (i2 == 0) {
            ndzVar.c = nem.b;
            return n;
        }
        ndzVar.c = nem.v(bArr, n, i2);
        return n + i2;
    }

    public static int f(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int g(nho nhoVar, byte[] bArr, int i, int i2, int i3, ndz ndzVar) {
        nhb nhbVar = (nhb) nhoVar;
        Object e2 = nhbVar.e();
        int c = nhbVar.c(e2, bArr, i, i2, i3, ndzVar);
        nhbVar.f(e2);
        ndzVar.c = e2;
        return c;
    }

    public static int h(nho nhoVar, byte[] bArr, int i, int i2, ndz ndzVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = o(i4, bArr, i3, ndzVar);
            i4 = ndzVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw ngd.i();
        }
        Object e2 = nhoVar.e();
        int i6 = i4 + i5;
        nhoVar.i(e2, bArr, i5, i6, ndzVar);
        nhoVar.f(e2);
        ndzVar.c = e2;
        return i6;
    }

    public static int i(nho nhoVar, int i, byte[] bArr, int i2, int i3, nga ngaVar, ndz ndzVar) {
        int h = h(nhoVar, bArr, i2, i3, ndzVar);
        ngaVar.add(ndzVar.c);
        while (h < i3) {
            int n = n(bArr, h, ndzVar);
            if (i != ndzVar.a) {
                break;
            }
            h = h(nhoVar, bArr, n, i3, ndzVar);
            ngaVar.add(ndzVar.c);
        }
        return h;
    }

    public static int j(byte[] bArr, int i, nga ngaVar, ndz ndzVar) {
        nfn nfnVar = (nfn) ngaVar;
        int n = n(bArr, i, ndzVar);
        int i2 = ndzVar.a + n;
        while (n < i2) {
            n = n(bArr, n, ndzVar);
            nfnVar.g(ndzVar.a);
        }
        if (n == i2) {
            return n;
        }
        throw ngd.i();
    }

    public static int k(byte[] bArr, int i, ndz ndzVar) {
        int n = n(bArr, i, ndzVar);
        int i2 = ndzVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                ndzVar.c = "";
                return n;
            }
            ndzVar.c = new String(bArr, n, i2, ngb.a);
            return n + i2;
        }
        throw ngd.f();
    }

    public static int l(byte[] bArr, int i, ndz ndzVar) {
        int n = n(bArr, i, ndzVar);
        int i2 = ndzVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                ndzVar.c = "";
                return n;
            }
            ndzVar.c = nij.g(bArr, n, i2);
            return n + i2;
        }
        throw ngd.f();
    }

    public static int m(int i, byte[] bArr, int i2, int i3, nia niaVar, ndz ndzVar) {
        if (nim.a(i) != 0) {
            int b = nim.b(i);
            if (b == 0) {
                int q = q(bArr, i2, ndzVar);
                niaVar.d(i, Long.valueOf(ndzVar.b));
                return q;
            } else if (b == 1) {
                niaVar.d(i, Long.valueOf(s(bArr, i2)));
                return i2 + 8;
            } else if (b == 2) {
                int n = n(bArr, i2, ndzVar);
                int i4 = ndzVar.a;
                if (i4 < 0) {
                    throw ngd.f();
                }
                if (i4 > bArr.length - n) {
                    throw ngd.i();
                }
                if (i4 == 0) {
                    niaVar.d(i, nem.b);
                } else {
                    niaVar.d(i, nem.v(bArr, n, i4));
                }
                return n + i4;
            } else if (b != 3) {
                if (b == 5) {
                    niaVar.d(i, Integer.valueOf(f(bArr, i2)));
                    return i2 + 4;
                }
                throw ngd.c();
            } else {
                int i5 = (i & (-8)) | 4;
                nia b2 = nia.b();
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int n2 = n(bArr, i2, ndzVar);
                    int i7 = ndzVar.a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = n2;
                        break;
                    }
                    i6 = i7;
                    i2 = m(i7, bArr, n2, i3, b2, ndzVar);
                }
                if (i2 > i3 || i6 != i5) {
                    throw ngd.g();
                }
                niaVar.d(i, b2);
                return i2;
            }
        }
        throw ngd.c();
    }

    public static int n(byte[] bArr, int i, ndz ndzVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            ndzVar.a = b;
            return i2;
        }
        return o(b, bArr, i2, ndzVar);
    }

    public static int o(int i, byte[] bArr, int i2, ndz ndzVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            ndzVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            ndzVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ndzVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ndzVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ndzVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int p(int i, byte[] bArr, int i2, int i3, nga ngaVar, ndz ndzVar) {
        nfn nfnVar = (nfn) ngaVar;
        int n = n(bArr, i2, ndzVar);
        nfnVar.g(ndzVar.a);
        while (n < i3) {
            int n2 = n(bArr, n, ndzVar);
            if (i != ndzVar.a) {
                break;
            }
            n = n(bArr, n2, ndzVar);
            nfnVar.g(ndzVar.a);
        }
        return n;
    }

    public static int q(byte[] bArr, int i, ndz ndzVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            ndzVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        ndzVar.b = j2;
        return i3;
    }

    public static int r(int i, byte[] bArr, int i2, int i3, ndz ndzVar) {
        if (nim.a(i) != 0) {
            int b = nim.b(i);
            if (b == 0) {
                return q(bArr, i2, ndzVar);
            }
            if (b == 1) {
                return i2 + 8;
            }
            if (b == 2) {
                return n(bArr, i2, ndzVar) + ndzVar.a;
            }
            if (b != 3) {
                if (b != 5) {
                    throw ngd.c();
                }
                return i2 + 4;
            }
            int i4 = (i & (-8)) | 4;
            int i5 = 0;
            while (i2 < i3) {
                i2 = n(bArr, i2, ndzVar);
                i5 = ndzVar.a;
                if (i5 == i4) {
                    break;
                }
                i2 = r(i5, bArr, i2, i3, ndzVar);
            }
            if (i2 <= i3 && i5 == i4) {
                return i2;
            }
            throw ngd.g();
        }
        throw ngd.c();
    }

    public static long s(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int t(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i = (i * 31) + str.charAt(i2);
        }
        return i;
    }

    public static int u(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            return i != 2 ? 0 : 4;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ defpackage.mzt v(defpackage.mzv r18, java.lang.String r19, java.lang.String r20, defpackage.mzz r21) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndb.v(mzv, java.lang.String, java.lang.String, mzz):mzt");
    }

    public static /* bridge */ /* synthetic */ void x(Object obj, int i, nem nemVar) {
        ((nia) obj).d(nim.c(i, 2), nemVar);
    }

    public static /* bridge */ /* synthetic */ void y(Object obj, int i, long j) {
        ((nia) obj).d(nim.c(i, 0), Long.valueOf(j));
    }

    public static nia z(Object obj) {
        return ((nfm) obj).cQ;
    }

    public final boolean w(Object obj, nhk nhkVar) {
        int d2 = nhkVar.d();
        int a = nim.a(d2);
        int b = nim.b(d2);
        if (b == 0) {
            y(obj, a, nhkVar.l());
            return true;
        } else if (b == 1) {
            ((nia) obj).d(nim.c(a, 1), Long.valueOf(nhkVar.k()));
            return true;
        } else if (b == 2) {
            x(obj, a, nhkVar.q());
            return true;
        } else if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                ((nia) obj).d(nim.c(a, 5), Integer.valueOf(nhkVar.f()));
                return true;
            }
            throw ngd.a();
        } else {
            int c = nim.c(a, 4);
            nia b2 = nia.b();
            while (nhkVar.c() != Integer.MAX_VALUE && w(b2, nhkVar)) {
            }
            if (c == nhkVar.d()) {
                b2.c();
                ((nia) obj).d(nim.c(a, 3), b2);
                return true;
            }
            throw ngd.b();
        }
    }

    public static void aq(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!ax(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!ax(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | (aw(b2) << 6) | aw(b3));
                return;
            }
        }
        throw ngd.d();
    }
}
