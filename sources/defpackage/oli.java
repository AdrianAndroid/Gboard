package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: oli  reason: default package */
/* loaded from: classes2.dex */
public final class oli {
    public static final Iterator a(Object[] objArr) {
        oll.e(objArr, "array");
        return new olc(objArr);
    }

    public static final Class b(oly olyVar) {
        String name;
        oll.e(olyVar, "<this>");
        Class a = ((olf) olyVar).a();
        if (a.isPrimitive() && (name = a.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    return name.equals("double") ? Double.class : a;
                case 104431:
                    return name.equals("int") ? Integer.class : a;
                case 3039496:
                    return name.equals("byte") ? Byte.class : a;
                case 3052374:
                    return name.equals("char") ? Character.class : a;
                case 3327612:
                    return name.equals("long") ? Long.class : a;
                case 3625364:
                    return name.equals("void") ? Void.class : a;
                case 64711720:
                    return name.equals("boolean") ? Boolean.class : a;
                case 97526364:
                    return name.equals("float") ? Float.class : a;
                case 109413500:
                    return name.equals("short") ? Short.class : a;
                default:
                    return a;
            }
        }
        return a;
    }

    public static final int c(int i, int i2, int i3) {
        return i >= i2 ? i2 : i2 - l(l(i2, i3) - l(i, i3), i3);
    }

    public static final int d(ovm ovmVar, int i) {
        int i2;
        int[] iArr = ovmVar.f;
        int i3 = i + 1;
        int length = ovmVar.e.length;
        oll.e(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : i2 ^ (-1);
    }

    public static final String e(byte b) {
        return ols.f(new char[]{ovu.a[(b >> 4) & 15], ovu.a[b & 15]});
    }

    public static final void f(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean g(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        oll.e(bArr, "a");
        oll.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String h(byte[] bArr) {
        oll.e(bArr, "<this>");
        return new String(bArr, omo.a);
    }

    public static final byte[] i(String str) {
        oll.e(str, "<this>");
        byte[] bytes = str.getBytes(omo.a);
        oll.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final long k(our ourVar) {
        return ourVar.b / 4;
    }

    private static final int l(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public final void j(long j, our ourVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        our ourVar2;
        int i8 = i;
        if (i2 < i3) {
            for (int i9 = i2; i9 < i3; i9++) {
                if (((ouu) list.get(i9)).b() < i8) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ouu ouuVar = (ouu) list.get(i2);
            ouu ouuVar2 = (ouu) list.get(i3 - 1);
            if (i8 == ouuVar.b()) {
                int intValue = ((Number) list2.get(i2)).intValue();
                int i10 = i2 + 1;
                i5 = i10;
                i4 = intValue;
                ouuVar = (ouu) list.get(i10);
            } else {
                i4 = -1;
                i5 = i2;
            }
            if (ouuVar.a(i8) == ouuVar2.a(i8)) {
                int min = Math.min(ouuVar.b(), ouuVar2.b());
                int i11 = 0;
                for (int i12 = i8; i12 < min && ouuVar.a(i12) == ouuVar2.a(i12); i12++) {
                    i11++;
                }
                long k = 1 + j + k(ourVar) + 2 + i11;
                ourVar.O(-i11);
                ourVar.O(i4);
                int i13 = i8 + i11;
                while (i8 < i13) {
                    ourVar.O(ouuVar.a(i8) & 255);
                    i8++;
                }
                if (i5 + 1 == i3) {
                    if (i13 != ((ouu) list.get(i5)).b()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ourVar.O(((Number) list2.get(i5)).intValue());
                    return;
                }
                our ourVar3 = new our();
                ourVar.O(-((int) (k(ourVar3) + k)));
                j(k, ourVar3, i13, list, i5, i3, list2);
                ourVar.M(ourVar3);
                return;
            }
            int i14 = 1;
            for (int i15 = i5 + 1; i15 < i3; i15++) {
                if (((ouu) list.get(i15 - 1)).a(i8) != ((ouu) list.get(i15)).a(i8)) {
                    i14++;
                }
            }
            long k2 = j + k(ourVar) + 2 + i14 + i14;
            ourVar.O(i14);
            ourVar.O(i4);
            for (int i16 = i5; i16 < i3; i16++) {
                byte a = ((ouu) list.get(i16)).a(i8);
                if (i16 == i5 || a != ((ouu) list.get(i16 - 1)).a(i8)) {
                    ourVar.O(a & 255);
                }
            }
            our ourVar4 = new our();
            int i17 = i5;
            while (i17 < i3) {
                byte a2 = ((ouu) list.get(i17)).a(i8);
                int i18 = i17 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else if (a2 != ((ouu) list.get(i19)).a(i8)) {
                        i6 = i19;
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i18 != i6 || i8 + 1 != ((ouu) list.get(i17)).b()) {
                    ourVar.O(-((int) (k(ourVar4) + k2)));
                    i7 = i6;
                    j2 = k2;
                    ourVar2 = ourVar4;
                    j(k2, ourVar4, i8 + 1, list, i17, i6, list2);
                } else {
                    ourVar.O(((Number) list2.get(i17)).intValue());
                    i7 = i6;
                    j2 = k2;
                    ourVar2 = ourVar4;
                }
                ourVar4 = ourVar2;
                i17 = i7;
                k2 = j2;
            }
            ourVar.M(ourVar4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
