package defpackage;

import j$.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ndq  reason: default package */
/* loaded from: classes2.dex */
public final class ndq {
    public static final /* synthetic */ int a = 0;
    private static final lex b = lex.d("-");

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public static final String a(mnl mnlVar) {
        boolean z;
        String str;
        String i;
        Object obj = mnlVar.a;
        ?? r2 = mnlVar.c;
        ?? r0 = mnlVar.b;
        if (r0.size() == 0) {
            String str2 = (String) obj;
            return str2.isEmpty() ? "" : "".concat(str2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = r2.entrySet().iterator();
        Iterator it2 = r0.entrySet().iterator();
        Map.Entry entry = it.hasNext() ? (Map.Entry) it.next() : null;
        int i2 = 0;
        Map.Entry entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
        boolean z2 = false;
        while (true) {
            if (entry == null && entry2 == null) {
                if (z2) {
                    arrayList.add(((String) obj).substring(i2, i2));
                }
                return arrayList.isEmpty() ? "" : "".concat(b.f(arrayList));
            }
            if (entry2 == null) {
                z = true;
            } else if (entry == null) {
                z = false;
            } else {
                int compareTo = ((ndo) entry.getKey()).compareTo((ndo) entry2.getKey());
                z = compareTo < 0;
                if (compareTo == 0) {
                    entry = null;
                }
            }
            if (z) {
                ndp ndpVar = (ndp) entry.getValue();
                if (z2) {
                    int i3 = ndpVar.a;
                    arrayList.add(((String) obj).substring(i2, i2));
                    int i4 = ndpVar.a;
                    int i5 = ndpVar.b;
                } else {
                    int i6 = ndpVar.a;
                    int i7 = ndpVar.b;
                }
                entry = null;
                z2 = true;
            } else {
                ndo ndoVar = (ndo) entry2.getKey();
                nsx nsxVar = (nsx) entry2.getValue();
                if (z2) {
                    arrayList.add(((String) obj).substring(i2, i2));
                }
                if (nsxVar.b != null) {
                    boolean z3 = nsxVar.a;
                    String str3 = ndoVar.aS;
                    int i8 = ndoVar.aT;
                    int i9 = i8 - 1;
                    if (i8 != 0) {
                        switch (i9) {
                            case 0:
                                lyk f = lyk.e.f();
                                long longValue = ((Long) ((nsx) entry2.getValue()).b).longValue();
                                byte[] bArr = new byte[8];
                                int i10 = 7;
                                while (i10 >= 0) {
                                    bArr[i10] = (byte) (longValue & 255);
                                    longValue >>= 8;
                                    i10--;
                                    str3 = str3;
                                }
                                str = str3;
                                i = f.i(bArr);
                                break;
                            case 1:
                                i = "";
                                str = str3;
                                break;
                            case 2:
                                i = ((String) ((nsx) entry2.getValue()).b).replace(';', ':');
                                str = str3;
                                break;
                            case 3:
                                i = ((Integer) ((nsx) entry2.getValue()).b).toString();
                                str = str3;
                                break;
                            case 4:
                                i = ((Long) ((nsx) entry2.getValue()).b).toString();
                                str = str3;
                                break;
                            case 5:
                                i = ((Float) ((nsx) entry2.getValue()).b).toString();
                                str = str3;
                                break;
                            case 6:
                                Object[] objArr = new Object[1];
                                objArr[i2] = Integer.valueOf(((Integer) ((nsx) entry2.getValue()).b).intValue());
                                i = "0x".concat(String.valueOf(String.format("%08x", objArr)));
                                str = str3;
                                break;
                            case 7:
                                i = lyk.e.f().i(((String) ((nsx) entry2.getValue()).b).getBytes(StandardCharsets.ISO_8859_1)).replace('-', '~');
                                str = str3;
                                break;
                            default:
                                throw new IllegalStateException("OptionType " + ndb.b(i8) + " not handled.");
                        }
                        arrayList.add(String.valueOf(str).concat(String.valueOf(i)));
                    } else {
                        throw null;
                    }
                }
                entry2 = null;
                z2 = false;
            }
            if (entry == null && it.hasNext()) {
                entry = (Map.Entry) it.next();
            }
            if (entry2 == null && it2.hasNext()) {
                entry2 = (Map.Entry) it2.next();
            }
            i2 = 0;
        }
    }
}
