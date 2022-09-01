package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: th  reason: default package */
/* loaded from: classes2.dex */
public final class th {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = tl.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r9 == (-1)) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th.j(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(sy syVar, String str) {
        int i;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf <= 0 || indexOf >= length - 1) {
                i = -1;
            } else {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i3 = i2;
                i2 = indexOf + 1;
                i = i3;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        syVar.G = str;
    }

    private static final int[] m(View view, String str) {
        int length;
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = split.length;
            if (i2 >= length) {
                break;
            }
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = tk.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0) {
                if (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                    if ((trim instanceof String) && (hashMap = constraintLayout.g) != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.g.get(trim);
                    }
                    if (obj != null && (obj instanceof Integer)) {
                        i = ((Integer) obj).intValue();
                    }
                }
                i = 0;
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private static final tc n(Context context, AttributeSet attributeSet, boolean z) {
        tc tcVar = new tc();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? tl.c : tl.a);
        if (z) {
            o(tcVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    tcVar.c.b = true;
                    tcVar.d.c = true;
                    tcVar.b.a = true;
                    tcVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        td tdVar = tcVar.d;
                        tdVar.r = a(obtainStyledAttributes, index, tdVar.r);
                        break;
                    case 2:
                        td tdVar2 = tcVar.d;
                        tdVar2.K = obtainStyledAttributes.getDimensionPixelSize(index, tdVar2.K);
                        break;
                    case 3:
                        td tdVar3 = tcVar.d;
                        tdVar3.q = a(obtainStyledAttributes, index, tdVar3.q);
                        break;
                    case 4:
                        td tdVar4 = tcVar.d;
                        tdVar4.p = a(obtainStyledAttributes, index, tdVar4.p);
                        break;
                    case 5:
                        tcVar.d.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        td tdVar5 = tcVar.d;
                        tdVar5.E = obtainStyledAttributes.getDimensionPixelOffset(index, tdVar5.E);
                        break;
                    case 7:
                        td tdVar6 = tcVar.d;
                        tdVar6.F = obtainStyledAttributes.getDimensionPixelOffset(index, tdVar6.F);
                        break;
                    case 8:
                        td tdVar7 = tcVar.d;
                        tdVar7.L = obtainStyledAttributes.getDimensionPixelSize(index, tdVar7.L);
                        break;
                    case 9:
                        td tdVar8 = tcVar.d;
                        tdVar8.x = a(obtainStyledAttributes, index, tdVar8.x);
                        break;
                    case 10:
                        td tdVar9 = tcVar.d;
                        tdVar9.w = a(obtainStyledAttributes, index, tdVar9.w);
                        break;
                    case 11:
                        td tdVar10 = tcVar.d;
                        tdVar10.R = obtainStyledAttributes.getDimensionPixelSize(index, tdVar10.R);
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        td tdVar11 = tcVar.d;
                        tdVar11.S = obtainStyledAttributes.getDimensionPixelSize(index, tdVar11.S);
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        td tdVar12 = tcVar.d;
                        tdVar12.O = obtainStyledAttributes.getDimensionPixelSize(index, tdVar12.O);
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        td tdVar13 = tcVar.d;
                        tdVar13.Q = obtainStyledAttributes.getDimensionPixelSize(index, tdVar13.Q);
                        break;
                    case 15:
                        td tdVar14 = tcVar.d;
                        tdVar14.T = obtainStyledAttributes.getDimensionPixelSize(index, tdVar14.T);
                        break;
                    case 16:
                        td tdVar15 = tcVar.d;
                        tdVar15.P = obtainStyledAttributes.getDimensionPixelSize(index, tdVar15.P);
                        break;
                    case 17:
                        td tdVar16 = tcVar.d;
                        tdVar16.f = obtainStyledAttributes.getDimensionPixelOffset(index, tdVar16.f);
                        break;
                    case 18:
                        td tdVar17 = tcVar.d;
                        tdVar17.g = obtainStyledAttributes.getDimensionPixelOffset(index, tdVar17.g);
                        break;
                    case 19:
                        td tdVar18 = tcVar.d;
                        tdVar18.h = obtainStyledAttributes.getFloat(index, tdVar18.h);
                        break;
                    case 20:
                        td tdVar19 = tcVar.d;
                        tdVar19.y = obtainStyledAttributes.getFloat(index, tdVar19.y);
                        break;
                    case 21:
                        td tdVar20 = tcVar.d;
                        tdVar20.e = obtainStyledAttributes.getLayoutDimension(index, tdVar20.e);
                        break;
                    case 22:
                        tf tfVar = tcVar.b;
                        tfVar.b = obtainStyledAttributes.getInt(index, tfVar.b);
                        tf tfVar2 = tcVar.b;
                        tfVar2.b = a[tfVar2.b];
                        break;
                    case 23:
                        td tdVar21 = tcVar.d;
                        tdVar21.d = obtainStyledAttributes.getLayoutDimension(index, tdVar21.d);
                        break;
                    case 24:
                        td tdVar22 = tcVar.d;
                        tdVar22.H = obtainStyledAttributes.getDimensionPixelSize(index, tdVar22.H);
                        break;
                    case 25:
                        td tdVar23 = tcVar.d;
                        tdVar23.j = a(obtainStyledAttributes, index, tdVar23.j);
                        break;
                    case 26:
                        td tdVar24 = tcVar.d;
                        tdVar24.k = a(obtainStyledAttributes, index, tdVar24.k);
                        break;
                    case 27:
                        td tdVar25 = tcVar.d;
                        tdVar25.G = obtainStyledAttributes.getInt(index, tdVar25.G);
                        break;
                    case 28:
                        td tdVar26 = tcVar.d;
                        tdVar26.I = obtainStyledAttributes.getDimensionPixelSize(index, tdVar26.I);
                        break;
                    case 29:
                        td tdVar27 = tcVar.d;
                        tdVar27.l = a(obtainStyledAttributes, index, tdVar27.l);
                        break;
                    case 30:
                        td tdVar28 = tcVar.d;
                        tdVar28.m = a(obtainStyledAttributes, index, tdVar28.m);
                        break;
                    case 31:
                        td tdVar29 = tcVar.d;
                        tdVar29.M = obtainStyledAttributes.getDimensionPixelSize(index, tdVar29.M);
                        break;
                    case 32:
                        td tdVar30 = tcVar.d;
                        tdVar30.u = a(obtainStyledAttributes, index, tdVar30.u);
                        break;
                    case 33:
                        td tdVar31 = tcVar.d;
                        tdVar31.v = a(obtainStyledAttributes, index, tdVar31.v);
                        break;
                    case 34:
                        td tdVar32 = tcVar.d;
                        tdVar32.J = obtainStyledAttributes.getDimensionPixelSize(index, tdVar32.J);
                        break;
                    case 35:
                        td tdVar33 = tcVar.d;
                        tdVar33.o = a(obtainStyledAttributes, index, tdVar33.o);
                        break;
                    case 36:
                        td tdVar34 = tcVar.d;
                        tdVar34.n = a(obtainStyledAttributes, index, tdVar34.n);
                        break;
                    case 37:
                        td tdVar35 = tcVar.d;
                        tdVar35.z = obtainStyledAttributes.getFloat(index, tdVar35.z);
                        break;
                    case 38:
                        tcVar.a = obtainStyledAttributes.getResourceId(index, tcVar.a);
                        break;
                    case 39:
                        td tdVar36 = tcVar.d;
                        tdVar36.W = obtainStyledAttributes.getFloat(index, tdVar36.W);
                        break;
                    case 40:
                        td tdVar37 = tcVar.d;
                        tdVar37.V = obtainStyledAttributes.getFloat(index, tdVar37.V);
                        break;
                    case 41:
                        td tdVar38 = tcVar.d;
                        tdVar38.X = obtainStyledAttributes.getInt(index, tdVar38.X);
                        break;
                    case 42:
                        td tdVar39 = tcVar.d;
                        tdVar39.Y = obtainStyledAttributes.getInt(index, tdVar39.Y);
                        break;
                    case 43:
                        tf tfVar3 = tcVar.b;
                        tfVar3.d = obtainStyledAttributes.getFloat(index, tfVar3.d);
                        break;
                    case 44:
                        tg tgVar = tcVar.e;
                        tgVar.n = true;
                        tgVar.o = obtainStyledAttributes.getDimension(index, tgVar.o);
                        break;
                    case 45:
                        tg tgVar2 = tcVar.e;
                        tgVar2.d = obtainStyledAttributes.getFloat(index, tgVar2.d);
                        break;
                    case 46:
                        tg tgVar3 = tcVar.e;
                        tgVar3.e = obtainStyledAttributes.getFloat(index, tgVar3.e);
                        break;
                    case 47:
                        tg tgVar4 = tcVar.e;
                        tgVar4.f = obtainStyledAttributes.getFloat(index, tgVar4.f);
                        break;
                    case 48:
                        tg tgVar5 = tcVar.e;
                        tgVar5.g = obtainStyledAttributes.getFloat(index, tgVar5.g);
                        break;
                    case 49:
                        tg tgVar6 = tcVar.e;
                        tgVar6.h = obtainStyledAttributes.getDimension(index, tgVar6.h);
                        break;
                    case 50:
                        tg tgVar7 = tcVar.e;
                        tgVar7.i = obtainStyledAttributes.getDimension(index, tgVar7.i);
                        break;
                    case 51:
                        tg tgVar8 = tcVar.e;
                        tgVar8.k = obtainStyledAttributes.getDimension(index, tgVar8.k);
                        break;
                    case 52:
                        tg tgVar9 = tcVar.e;
                        tgVar9.l = obtainStyledAttributes.getDimension(index, tgVar9.l);
                        break;
                    case 53:
                        tg tgVar10 = tcVar.e;
                        tgVar10.m = obtainStyledAttributes.getDimension(index, tgVar10.m);
                        break;
                    case 54:
                        td tdVar40 = tcVar.d;
                        tdVar40.Z = obtainStyledAttributes.getInt(index, tdVar40.Z);
                        break;
                    case 55:
                        td tdVar41 = tcVar.d;
                        tdVar41.aa = obtainStyledAttributes.getInt(index, tdVar41.aa);
                        break;
                    case 56:
                        td tdVar42 = tcVar.d;
                        tdVar42.ab = obtainStyledAttributes.getDimensionPixelSize(index, tdVar42.ab);
                        break;
                    case 57:
                        td tdVar43 = tcVar.d;
                        tdVar43.ac = obtainStyledAttributes.getDimensionPixelSize(index, tdVar43.ac);
                        break;
                    case 58:
                        td tdVar44 = tcVar.d;
                        tdVar44.ad = obtainStyledAttributes.getDimensionPixelSize(index, tdVar44.ad);
                        break;
                    case 59:
                        td tdVar45 = tcVar.d;
                        tdVar45.ae = obtainStyledAttributes.getDimensionPixelSize(index, tdVar45.ae);
                        break;
                    case 60:
                        tg tgVar11 = tcVar.e;
                        tgVar11.c = obtainStyledAttributes.getFloat(index, tgVar11.c);
                        break;
                    case 61:
                        td tdVar46 = tcVar.d;
                        tdVar46.B = a(obtainStyledAttributes, index, tdVar46.B);
                        break;
                    case 62:
                        td tdVar47 = tcVar.d;
                        tdVar47.C = obtainStyledAttributes.getDimensionPixelSize(index, tdVar47.C);
                        break;
                    case 63:
                        td tdVar48 = tcVar.d;
                        tdVar48.D = obtainStyledAttributes.getFloat(index, tdVar48.D);
                        break;
                    case 64:
                        te teVar = tcVar.c;
                        teVar.c = a(obtainStyledAttributes, index, teVar.c);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            tcVar.c.e = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            tcVar.c.e = rv.a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        tcVar.c.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        te teVar2 = tcVar.c;
                        teVar2.j = obtainStyledAttributes.getFloat(index, teVar2.j);
                        break;
                    case 68:
                        tf tfVar4 = tcVar.b;
                        tfVar4.e = obtainStyledAttributes.getFloat(index, tfVar4.e);
                        break;
                    case 69:
                        tcVar.d.af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        tcVar.d.ag = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        td tdVar49 = tcVar.d;
                        tdVar49.ah = obtainStyledAttributes.getInt(index, tdVar49.ah);
                        break;
                    case 73:
                        td tdVar50 = tcVar.d;
                        tdVar50.ai = obtainStyledAttributes.getDimensionPixelSize(index, tdVar50.ai);
                        break;
                    case 74:
                        tcVar.d.al = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        td tdVar51 = tcVar.d;
                        tdVar51.ap = obtainStyledAttributes.getBoolean(index, tdVar51.ap);
                        break;
                    case 76:
                        te teVar3 = tcVar.c;
                        teVar3.f = obtainStyledAttributes.getInt(index, teVar3.f);
                        break;
                    case 77:
                        tcVar.d.am = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        tf tfVar5 = tcVar.b;
                        tfVar5.c = obtainStyledAttributes.getInt(index, tfVar5.c);
                        break;
                    case 79:
                        te teVar4 = tcVar.c;
                        teVar4.h = obtainStyledAttributes.getFloat(index, teVar4.h);
                        break;
                    case 80:
                        td tdVar52 = tcVar.d;
                        tdVar52.an = obtainStyledAttributes.getBoolean(index, tdVar52.an);
                        break;
                    case 81:
                        td tdVar53 = tcVar.d;
                        tdVar53.ao = obtainStyledAttributes.getBoolean(index, tdVar53.ao);
                        break;
                    case 82:
                        te teVar5 = tcVar.c;
                        teVar5.d = obtainStyledAttributes.getInteger(index, teVar5.d);
                        break;
                    case 83:
                        tg tgVar12 = tcVar.e;
                        tgVar12.j = a(obtainStyledAttributes, index, tgVar12.j);
                        break;
                    case 84:
                        te teVar6 = tcVar.c;
                        teVar6.l = obtainStyledAttributes.getInteger(index, teVar6.l);
                        break;
                    case 85:
                        te teVar7 = tcVar.c;
                        teVar7.k = obtainStyledAttributes.getFloat(index, teVar7.k);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            tcVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                            te teVar8 = tcVar.c;
                            if (teVar8.o != -1) {
                                teVar8.n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            tcVar.c.m = obtainStyledAttributes.getString(index);
                            if (tcVar.c.m.indexOf("/") > 0) {
                                tcVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                                tcVar.c.n = -2;
                                break;
                            } else {
                                tcVar.c.n = -1;
                                break;
                            }
                        } else {
                            te teVar9 = tcVar.c;
                            teVar9.n = obtainStyledAttributes.getInteger(index, teVar9.o);
                            break;
                        }
                    case 87:
                        String hexString = Integer.toHexString(index);
                        int i2 = sparseIntArray.get(index);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                        sb.append("unused attribute 0x");
                        sb.append(hexString);
                        sb.append("   ");
                        sb.append(i2);
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        String hexString2 = Integer.toHexString(index);
                        int i3 = sparseIntArray.get(index);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                        sb2.append("Unknown attribute 0x");
                        sb2.append(hexString2);
                        sb2.append("   ");
                        sb2.append(i3);
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        td tdVar54 = tcVar.d;
                        tdVar54.s = a(obtainStyledAttributes, index, tdVar54.s);
                        break;
                    case 92:
                        td tdVar55 = tcVar.d;
                        tdVar55.t = a(obtainStyledAttributes, index, tdVar55.t);
                        break;
                    case 93:
                        td tdVar56 = tcVar.d;
                        tdVar56.N = obtainStyledAttributes.getDimensionPixelSize(index, tdVar56.N);
                        break;
                    case 94:
                        td tdVar57 = tcVar.d;
                        tdVar57.U = obtainStyledAttributes.getDimensionPixelSize(index, tdVar57.U);
                        break;
                    case 95:
                        j(tcVar.d, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        j(tcVar.d, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        td tdVar58 = tcVar.d;
                        tdVar58.aq = obtainStyledAttributes.getInt(index, tdVar58.aq);
                        break;
                }
            }
            td tdVar59 = tcVar.d;
            if (tdVar59.al != null) {
                tdVar59.ak = null;
            }
        }
        obtainStyledAttributes.recycle();
        return tcVar;
    }

    private static void o(tc tcVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        tb tbVar = new tb();
        tcVar.g = tbVar;
        tcVar.c.b = false;
        tcVar.d.c = false;
        tcVar.b.a = false;
        tcVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (d.get(index)) {
                case 2:
                    tbVar.b(2, typedArray.getDimensionPixelSize(index, tcVar.d.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    String hexString = Integer.toHexString(index);
                    int i2 = c.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 34);
                    sb.append("Unknown attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i2);
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 5:
                    tbVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    tbVar.b(6, typedArray.getDimensionPixelOffset(index, tcVar.d.E));
                    break;
                case 7:
                    tbVar.b(7, typedArray.getDimensionPixelOffset(index, tcVar.d.F));
                    break;
                case 8:
                    tbVar.b(8, typedArray.getDimensionPixelSize(index, tcVar.d.L));
                    break;
                case 11:
                    tbVar.b(11, typedArray.getDimensionPixelSize(index, tcVar.d.R));
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    tbVar.b(12, typedArray.getDimensionPixelSize(index, tcVar.d.S));
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    tbVar.b(13, typedArray.getDimensionPixelSize(index, tcVar.d.O));
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    tbVar.b(14, typedArray.getDimensionPixelSize(index, tcVar.d.Q));
                    break;
                case 15:
                    tbVar.b(15, typedArray.getDimensionPixelSize(index, tcVar.d.T));
                    break;
                case 16:
                    tbVar.b(16, typedArray.getDimensionPixelSize(index, tcVar.d.P));
                    break;
                case 17:
                    tbVar.b(17, typedArray.getDimensionPixelOffset(index, tcVar.d.f));
                    break;
                case 18:
                    tbVar.b(18, typedArray.getDimensionPixelOffset(index, tcVar.d.g));
                    break;
                case 19:
                    tbVar.a(19, typedArray.getFloat(index, tcVar.d.h));
                    break;
                case 20:
                    tbVar.a(20, typedArray.getFloat(index, tcVar.d.y));
                    break;
                case 21:
                    tbVar.b(21, typedArray.getLayoutDimension(index, tcVar.d.e));
                    break;
                case 22:
                    tbVar.b(22, a[typedArray.getInt(index, tcVar.b.b)]);
                    break;
                case 23:
                    tbVar.b(23, typedArray.getLayoutDimension(index, tcVar.d.d));
                    break;
                case 24:
                    tbVar.b(24, typedArray.getDimensionPixelSize(index, tcVar.d.H));
                    break;
                case 27:
                    tbVar.b(27, typedArray.getInt(index, tcVar.d.G));
                    break;
                case 28:
                    tbVar.b(28, typedArray.getDimensionPixelSize(index, tcVar.d.I));
                    break;
                case 31:
                    tbVar.b(31, typedArray.getDimensionPixelSize(index, tcVar.d.M));
                    break;
                case 34:
                    tbVar.b(34, typedArray.getDimensionPixelSize(index, tcVar.d.J));
                    break;
                case 37:
                    tbVar.a(37, typedArray.getFloat(index, tcVar.d.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, tcVar.a);
                    tcVar.a = resourceId;
                    tbVar.b(38, resourceId);
                    break;
                case 39:
                    tbVar.a(39, typedArray.getFloat(index, tcVar.d.W));
                    break;
                case 40:
                    tbVar.a(40, typedArray.getFloat(index, tcVar.d.V));
                    break;
                case 41:
                    tbVar.b(41, typedArray.getInt(index, tcVar.d.X));
                    break;
                case 42:
                    tbVar.b(42, typedArray.getInt(index, tcVar.d.Y));
                    break;
                case 43:
                    tbVar.a(43, typedArray.getFloat(index, tcVar.b.d));
                    break;
                case 44:
                    tbVar.d(44, true);
                    tbVar.a(44, typedArray.getDimension(index, tcVar.e.o));
                    break;
                case 45:
                    tbVar.a(45, typedArray.getFloat(index, tcVar.e.d));
                    break;
                case 46:
                    tbVar.a(46, typedArray.getFloat(index, tcVar.e.e));
                    break;
                case 47:
                    tbVar.a(47, typedArray.getFloat(index, tcVar.e.f));
                    break;
                case 48:
                    tbVar.a(48, typedArray.getFloat(index, tcVar.e.g));
                    break;
                case 49:
                    tbVar.a(49, typedArray.getDimension(index, tcVar.e.h));
                    break;
                case 50:
                    tbVar.a(50, typedArray.getDimension(index, tcVar.e.i));
                    break;
                case 51:
                    tbVar.a(51, typedArray.getDimension(index, tcVar.e.k));
                    break;
                case 52:
                    tbVar.a(52, typedArray.getDimension(index, tcVar.e.l));
                    break;
                case 53:
                    tbVar.a(53, typedArray.getDimension(index, tcVar.e.m));
                    break;
                case 54:
                    tbVar.b(54, typedArray.getInt(index, tcVar.d.Z));
                    break;
                case 55:
                    tbVar.b(55, typedArray.getInt(index, tcVar.d.aa));
                    break;
                case 56:
                    tbVar.b(56, typedArray.getDimensionPixelSize(index, tcVar.d.ab));
                    break;
                case 57:
                    tbVar.b(57, typedArray.getDimensionPixelSize(index, tcVar.d.ac));
                    break;
                case 58:
                    tbVar.b(58, typedArray.getDimensionPixelSize(index, tcVar.d.ad));
                    break;
                case 59:
                    tbVar.b(59, typedArray.getDimensionPixelSize(index, tcVar.d.ae));
                    break;
                case 60:
                    tbVar.a(60, typedArray.getFloat(index, tcVar.e.c));
                    break;
                case 62:
                    tbVar.b(62, typedArray.getDimensionPixelSize(index, tcVar.d.C));
                    break;
                case 63:
                    tbVar.a(63, typedArray.getFloat(index, tcVar.d.D));
                    break;
                case 64:
                    tbVar.b(64, a(typedArray, index, tcVar.c.c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        tbVar.c(65, typedArray.getString(index));
                        break;
                    } else {
                        tbVar.c(65, rv.a[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    tbVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    tbVar.a(67, typedArray.getFloat(index, tcVar.c.j));
                    break;
                case 68:
                    tbVar.a(68, typedArray.getFloat(index, tcVar.b.e));
                    break;
                case 69:
                    tbVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    tbVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    tbVar.b(72, typedArray.getInt(index, tcVar.d.ah));
                    break;
                case 73:
                    tbVar.b(73, typedArray.getDimensionPixelSize(index, tcVar.d.ai));
                    break;
                case 74:
                    tbVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    tbVar.d(75, typedArray.getBoolean(index, tcVar.d.ap));
                    break;
                case 76:
                    tbVar.b(76, typedArray.getInt(index, tcVar.c.f));
                    break;
                case 77:
                    tbVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    tbVar.b(78, typedArray.getInt(index, tcVar.b.c));
                    break;
                case 79:
                    tbVar.a(79, typedArray.getFloat(index, tcVar.c.h));
                    break;
                case 80:
                    tbVar.d(80, typedArray.getBoolean(index, tcVar.d.an));
                    break;
                case 81:
                    tbVar.d(81, typedArray.getBoolean(index, tcVar.d.ao));
                    break;
                case 82:
                    tbVar.b(82, typedArray.getInteger(index, tcVar.c.d));
                    break;
                case 83:
                    tbVar.b(83, a(typedArray, index, tcVar.e.j));
                    break;
                case 84:
                    tbVar.b(84, typedArray.getInteger(index, tcVar.c.l));
                    break;
                case 85:
                    tbVar.a(85, typedArray.getFloat(index, tcVar.c.k));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        tcVar.c.o = typedArray.getResourceId(index, -1);
                        tbVar.b(89, tcVar.c.o);
                        te teVar = tcVar.c;
                        if (teVar.o != -1) {
                            teVar.n = -2;
                            tbVar.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        tcVar.c.m = typedArray.getString(index);
                        tbVar.c(90, tcVar.c.m);
                        if (tcVar.c.m.indexOf("/") > 0) {
                            tcVar.c.o = typedArray.getResourceId(index, -1);
                            tbVar.b(89, tcVar.c.o);
                            tcVar.c.n = -2;
                            tbVar.b(88, -2);
                            break;
                        } else {
                            tcVar.c.n = -1;
                            tbVar.b(88, -1);
                            break;
                        }
                    } else {
                        te teVar2 = tcVar.c;
                        teVar2.n = typedArray.getInteger(index, teVar2.o);
                        tbVar.b(88, tcVar.c.n);
                        break;
                    }
                case 87:
                    String hexString2 = Integer.toHexString(index);
                    int i3 = c.get(index);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 33);
                    sb2.append("unused attribute 0x");
                    sb2.append(hexString2);
                    sb2.append("   ");
                    sb2.append(i3);
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 93:
                    tbVar.b(93, typedArray.getDimensionPixelSize(index, tcVar.d.N));
                    break;
                case 94:
                    tbVar.b(94, typedArray.getDimensionPixelSize(index, tcVar.d.U));
                    break;
                case 95:
                    j(tbVar, typedArray, index, 0);
                    break;
                case 96:
                    j(tbVar, typedArray, index, 1);
                    break;
                case 97:
                    tbVar.b(97, typedArray.getInt(index, tcVar.d.aq));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        tcVar.a = typedArray.getResourceId(index, tcVar.a);
                        break;
                    }
                case 99:
                    tbVar.d(99, typedArray.getBoolean(index, tcVar.d.i));
                    break;
            }
        }
    }

    public final tc b(int i) {
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.b.put(valueOf, new tc());
        }
        return (tc) this.b.get(valueOf);
    }

    public final void c(ConstraintLayout constraintLayout) {
        l(constraintLayout);
        constraintLayout.f = null;
        constraintLayout.requestLayout();
    }

    public final void d(ConstraintLayout constraintLayout) {
        th thVar = this;
        int childCount = constraintLayout.getChildCount();
        thVar.b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            sy syVar = (sy) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                HashMap hashMap = thVar.b;
                Integer valueOf = Integer.valueOf(id);
                if (!hashMap.containsKey(valueOf)) {
                    thVar.b.put(valueOf, new tc());
                }
                tc tcVar = (tc) thVar.b.get(valueOf);
                if (tcVar != null) {
                    HashMap hashMap2 = thVar.e;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        sv svVar = (sv) hashMap2.get(str);
                        try {
                        } catch (IllegalAccessException e) {
                            e = e;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                        } catch (InvocationTargetException e3) {
                            e = e3;
                        }
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new sv(svVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            String valueOf2 = String.valueOf(str);
                            try {
                                hashMap3.put(str, new sv(svVar, cls.getMethod(valueOf2.length() != 0 ? "getMap".concat(valueOf2) : new String("getMap"), new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                e.printStackTrace();
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                e.printStackTrace();
                            }
                        }
                    }
                    tcVar.f = hashMap3;
                    tcVar.a = id;
                    td tdVar = tcVar.d;
                    tdVar.j = syVar.e;
                    tdVar.k = syVar.f;
                    tdVar.l = syVar.g;
                    tdVar.m = syVar.h;
                    tdVar.n = syVar.i;
                    tdVar.o = syVar.j;
                    tdVar.p = syVar.k;
                    tdVar.q = syVar.l;
                    tdVar.r = syVar.m;
                    tdVar.s = syVar.n;
                    tdVar.t = syVar.o;
                    tdVar.u = syVar.s;
                    tdVar.v = syVar.t;
                    tdVar.w = syVar.u;
                    tdVar.x = syVar.v;
                    tdVar.y = syVar.E;
                    tdVar.z = syVar.F;
                    tdVar.A = syVar.G;
                    tdVar.B = syVar.p;
                    tdVar.C = syVar.q;
                    tdVar.D = syVar.r;
                    tdVar.E = syVar.T;
                    tdVar.F = syVar.U;
                    tdVar.G = syVar.V;
                    tdVar.h = syVar.c;
                    tdVar.f = syVar.a;
                    tdVar.g = syVar.b;
                    tdVar.d = syVar.width;
                    tcVar.d.e = syVar.height;
                    tcVar.d.H = syVar.leftMargin;
                    tcVar.d.I = syVar.rightMargin;
                    tcVar.d.J = syVar.topMargin;
                    tcVar.d.K = syVar.bottomMargin;
                    td tdVar2 = tcVar.d;
                    tdVar2.N = syVar.D;
                    tdVar2.V = syVar.I;
                    tdVar2.W = syVar.H;
                    tdVar2.Y = syVar.K;
                    tdVar2.X = syVar.J;
                    tdVar2.an = syVar.W;
                    tdVar2.ao = syVar.X;
                    tdVar2.Z = syVar.L;
                    tdVar2.aa = syVar.M;
                    tdVar2.ab = syVar.P;
                    tdVar2.ac = syVar.Q;
                    tdVar2.ad = syVar.N;
                    tdVar2.ae = syVar.O;
                    tdVar2.af = syVar.R;
                    tdVar2.ag = syVar.S;
                    tdVar2.am = syVar.Y;
                    tdVar2.P = syVar.x;
                    tdVar2.R = syVar.z;
                    tdVar2.O = syVar.w;
                    tdVar2.Q = syVar.y;
                    tdVar2.T = syVar.A;
                    tdVar2.S = syVar.B;
                    tdVar2.U = syVar.C;
                    tdVar2.aq = syVar.Z;
                    tdVar2.L = syVar.getMarginEnd();
                    tcVar.d.M = syVar.getMarginStart();
                    tcVar.b.b = childAt.getVisibility();
                    tcVar.b.d = childAt.getAlpha();
                    tcVar.e.c = childAt.getRotation();
                    tcVar.e.d = childAt.getRotationX();
                    tcVar.e.e = childAt.getRotationY();
                    tcVar.e.f = childAt.getScaleX();
                    tcVar.e.g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        tg tgVar = tcVar.e;
                        tgVar.h = pivotX;
                        tgVar.i = pivotY;
                    }
                    tcVar.e.k = childAt.getTranslationX();
                    tcVar.e.l = childAt.getTranslationY();
                    tcVar.e.m = childAt.getTranslationZ();
                    tg tgVar2 = tcVar.e;
                    if (tgVar2.n) {
                        tgVar2.o = childAt.getElevation();
                    }
                    if (childAt instanceof su) {
                        su suVar = (su) childAt;
                        td tdVar3 = tcVar.d;
                        tdVar3.ap = suVar.b.b;
                        tdVar3.ak = Arrays.copyOf(suVar.c, suVar.d);
                        td tdVar4 = tcVar.d;
                        tdVar4.ah = suVar.a;
                        tdVar4.ai = suVar.b.c;
                    }
                }
                i++;
                thVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i) {
        d((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.b.put(valueOf, new tc());
        }
        tc tcVar = (tc) this.b.get(valueOf);
        if (tcVar == null) {
            return;
        }
        if (i2 == 6) {
            td tdVar = tcVar.d;
            if (i4 == 6) {
                tdVar.v = i3;
                tdVar.u = -1;
            } else {
                tdVar.u = i3;
                tdVar.v = -1;
            }
            tcVar.d.M = i5;
            return;
        }
        if (i4 == 7) {
            td tdVar2 = tcVar.d;
            tdVar2.x = i3;
            tdVar2.w = -1;
        } else {
            td tdVar3 = tcVar.d;
            tdVar3.w = i3;
            tdVar3.x = -1;
        }
        tcVar.d.L = i5;
    }

    public final void g(int i, float f) {
        b(i).d.af = f;
    }

    public final void h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    tc n = n(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        n.d.b = true;
                    }
                    this.b.put(Integer.valueOf(n.a), n);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i(Context context, XmlPullParser xmlPullParser) {
        char c2;
        Object obj;
        char c3;
        try {
            int eventType = xmlPullParser.getEventType();
            tc tcVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i = 2;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                tcVar = n(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case 1:
                                tcVar = n(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case 2:
                                tcVar = n(context, Xml.asAttributeSet(xmlPullParser), false);
                                td tdVar = tcVar.d;
                                tdVar.b = true;
                                tdVar.c = true;
                                break;
                            case 3:
                                tcVar = n(context, Xml.asAttributeSet(xmlPullParser), false);
                                tcVar.d.aj = 1;
                                break;
                            case 4:
                                if (tcVar != null) {
                                    tf tfVar = tcVar.b;
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tl.g);
                                    tfVar.a = true;
                                    int indexCount = obtainStyledAttributes.getIndexCount();
                                    for (int i2 = 0; i2 < indexCount; i2++) {
                                        int index = obtainStyledAttributes.getIndex(i2);
                                        if (index == 1) {
                                            tfVar.d = obtainStyledAttributes.getFloat(1, tfVar.d);
                                        } else if (index == 0) {
                                            int i3 = obtainStyledAttributes.getInt(0, tfVar.b);
                                            tfVar.b = i3;
                                            tfVar.b = a[i3];
                                        } else {
                                            if (index == 4) {
                                                tfVar.c = obtainStyledAttributes.getInt(4, tfVar.c);
                                            } else if (index == 3) {
                                                tfVar.e = obtainStyledAttributes.getFloat(3, tfVar.e);
                                            }
                                        }
                                    }
                                    obtainStyledAttributes.recycle();
                                    break;
                                } else {
                                    int lineNumber = xmlPullParser.getLineNumber();
                                    StringBuilder sb = new StringBuilder(56);
                                    sb.append("XML parser error must be within a Constraint ");
                                    sb.append(lineNumber);
                                    throw new RuntimeException(sb.toString());
                                }
                            case 5:
                                if (tcVar != null) {
                                    tg tgVar = tcVar.e;
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tl.i);
                                    tgVar.b = true;
                                    int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                    for (int i4 = 0; i4 < indexCount2; i4++) {
                                        int index2 = obtainStyledAttributes2.getIndex(i4);
                                        switch (tg.a.get(index2)) {
                                            case 1:
                                                tgVar.c = obtainStyledAttributes2.getFloat(index2, tgVar.c);
                                                break;
                                            case 2:
                                                tgVar.d = obtainStyledAttributes2.getFloat(index2, tgVar.d);
                                                break;
                                            case 3:
                                                tgVar.e = obtainStyledAttributes2.getFloat(index2, tgVar.e);
                                                break;
                                            case 4:
                                                tgVar.f = obtainStyledAttributes2.getFloat(index2, tgVar.f);
                                                break;
                                            case 5:
                                                tgVar.g = obtainStyledAttributes2.getFloat(index2, tgVar.g);
                                                break;
                                            case 6:
                                                tgVar.h = obtainStyledAttributes2.getDimension(index2, tgVar.h);
                                                break;
                                            case 7:
                                                tgVar.i = obtainStyledAttributes2.getDimension(index2, tgVar.i);
                                                break;
                                            case 8:
                                                tgVar.k = obtainStyledAttributes2.getDimension(index2, tgVar.k);
                                                break;
                                            case 9:
                                                tgVar.l = obtainStyledAttributes2.getDimension(index2, tgVar.l);
                                                break;
                                            case 10:
                                                tgVar.m = obtainStyledAttributes2.getDimension(index2, tgVar.m);
                                                break;
                                            case 11:
                                                tgVar.n = true;
                                                tgVar.o = obtainStyledAttributes2.getDimension(index2, tgVar.o);
                                                break;
                                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                                tgVar.j = a(obtainStyledAttributes2, index2, tgVar.j);
                                                break;
                                        }
                                    }
                                    obtainStyledAttributes2.recycle();
                                    break;
                                } else {
                                    int lineNumber2 = xmlPullParser.getLineNumber();
                                    StringBuilder sb2 = new StringBuilder(56);
                                    sb2.append("XML parser error must be within a Constraint ");
                                    sb2.append(lineNumber2);
                                    throw new RuntimeException(sb2.toString());
                                }
                            case 6:
                                if (tcVar != null) {
                                    td tdVar2 = tcVar.d;
                                    TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tl.e);
                                    tdVar2.c = true;
                                    int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                    for (int i5 = 0; i5 < indexCount3; i5++) {
                                        int index3 = obtainStyledAttributes3.getIndex(i5);
                                        int i6 = td.a.get(index3);
                                        switch (i6) {
                                            case 1:
                                                tdVar2.r = a(obtainStyledAttributes3, index3, tdVar2.r);
                                                break;
                                            case 2:
                                                tdVar2.K = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.K);
                                                break;
                                            case 3:
                                                tdVar2.q = a(obtainStyledAttributes3, index3, tdVar2.q);
                                                break;
                                            case 4:
                                                tdVar2.p = a(obtainStyledAttributes3, index3, tdVar2.p);
                                                break;
                                            case 5:
                                                tdVar2.A = obtainStyledAttributes3.getString(index3);
                                                break;
                                            case 6:
                                                tdVar2.E = obtainStyledAttributes3.getDimensionPixelOffset(index3, tdVar2.E);
                                                break;
                                            case 7:
                                                tdVar2.F = obtainStyledAttributes3.getDimensionPixelOffset(index3, tdVar2.F);
                                                break;
                                            case 8:
                                                tdVar2.L = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.L);
                                                break;
                                            case 9:
                                                tdVar2.x = a(obtainStyledAttributes3, index3, tdVar2.x);
                                                break;
                                            case 10:
                                                tdVar2.w = a(obtainStyledAttributes3, index3, tdVar2.w);
                                                break;
                                            case 11:
                                                tdVar2.R = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.R);
                                                break;
                                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                                tdVar2.S = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.S);
                                                break;
                                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                                tdVar2.O = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.O);
                                                break;
                                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                                tdVar2.Q = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.Q);
                                                break;
                                            case 15:
                                                tdVar2.T = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.T);
                                                break;
                                            case 16:
                                                tdVar2.P = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.P);
                                                break;
                                            case 17:
                                                tdVar2.f = obtainStyledAttributes3.getDimensionPixelOffset(index3, tdVar2.f);
                                                break;
                                            case 18:
                                                tdVar2.g = obtainStyledAttributes3.getDimensionPixelOffset(index3, tdVar2.g);
                                                break;
                                            case 19:
                                                tdVar2.h = obtainStyledAttributes3.getFloat(index3, tdVar2.h);
                                                break;
                                            case 20:
                                                tdVar2.y = obtainStyledAttributes3.getFloat(index3, tdVar2.y);
                                                break;
                                            case 21:
                                                tdVar2.e = obtainStyledAttributes3.getLayoutDimension(index3, tdVar2.e);
                                                break;
                                            case 22:
                                                tdVar2.d = obtainStyledAttributes3.getLayoutDimension(index3, tdVar2.d);
                                                break;
                                            case 23:
                                                tdVar2.H = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.H);
                                                break;
                                            case 24:
                                                tdVar2.j = a(obtainStyledAttributes3, index3, tdVar2.j);
                                                break;
                                            case 25:
                                                tdVar2.k = a(obtainStyledAttributes3, index3, tdVar2.k);
                                                break;
                                            case 26:
                                                tdVar2.G = obtainStyledAttributes3.getInt(index3, tdVar2.G);
                                                break;
                                            case 27:
                                                tdVar2.I = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.I);
                                                break;
                                            case 28:
                                                tdVar2.l = a(obtainStyledAttributes3, index3, tdVar2.l);
                                                break;
                                            case 29:
                                                tdVar2.m = a(obtainStyledAttributes3, index3, tdVar2.m);
                                                break;
                                            case 30:
                                                tdVar2.M = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.M);
                                                break;
                                            case 31:
                                                tdVar2.u = a(obtainStyledAttributes3, index3, tdVar2.u);
                                                break;
                                            case 32:
                                                tdVar2.v = a(obtainStyledAttributes3, index3, tdVar2.v);
                                                break;
                                            case 33:
                                                tdVar2.J = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.J);
                                                break;
                                            case 34:
                                                tdVar2.o = a(obtainStyledAttributes3, index3, tdVar2.o);
                                                break;
                                            case 35:
                                                tdVar2.n = a(obtainStyledAttributes3, index3, tdVar2.n);
                                                break;
                                            case 36:
                                                tdVar2.z = obtainStyledAttributes3.getFloat(index3, tdVar2.z);
                                                break;
                                            case 37:
                                                tdVar2.W = obtainStyledAttributes3.getFloat(index3, tdVar2.W);
                                                break;
                                            case 38:
                                                tdVar2.V = obtainStyledAttributes3.getFloat(index3, tdVar2.V);
                                                break;
                                            case 39:
                                                tdVar2.X = obtainStyledAttributes3.getInt(index3, tdVar2.X);
                                                break;
                                            case 40:
                                                tdVar2.Y = obtainStyledAttributes3.getInt(index3, tdVar2.Y);
                                                break;
                                            case 41:
                                                j(tdVar2, obtainStyledAttributes3, index3, 0);
                                                break;
                                            case 42:
                                                j(tdVar2, obtainStyledAttributes3, index3, 1);
                                                break;
                                            default:
                                                switch (i6) {
                                                    case 61:
                                                        tdVar2.B = a(obtainStyledAttributes3, index3, tdVar2.B);
                                                        break;
                                                    case 62:
                                                        tdVar2.C = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.C);
                                                        break;
                                                    case 63:
                                                        tdVar2.D = obtainStyledAttributes3.getFloat(index3, tdVar2.D);
                                                        break;
                                                    default:
                                                        switch (i6) {
                                                            case 69:
                                                                tdVar2.af = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                break;
                                                            case 70:
                                                                tdVar2.ag = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                break;
                                                            case 71:
                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                break;
                                                            case 72:
                                                                tdVar2.ah = obtainStyledAttributes3.getInt(index3, tdVar2.ah);
                                                                break;
                                                            case 73:
                                                                tdVar2.ai = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.ai);
                                                                break;
                                                            case 74:
                                                                tdVar2.al = obtainStyledAttributes3.getString(index3);
                                                                break;
                                                            case 75:
                                                                tdVar2.ap = obtainStyledAttributes3.getBoolean(index3, tdVar2.ap);
                                                                break;
                                                            case 76:
                                                                tdVar2.aq = obtainStyledAttributes3.getInt(index3, tdVar2.aq);
                                                                break;
                                                            case 77:
                                                                tdVar2.s = a(obtainStyledAttributes3, index3, tdVar2.s);
                                                                break;
                                                            case 78:
                                                                tdVar2.t = a(obtainStyledAttributes3, index3, tdVar2.t);
                                                                break;
                                                            case 79:
                                                                tdVar2.U = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.U);
                                                                break;
                                                            case 80:
                                                                tdVar2.N = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.N);
                                                                break;
                                                            case 81:
                                                                tdVar2.Z = obtainStyledAttributes3.getInt(index3, tdVar2.Z);
                                                                break;
                                                            case 82:
                                                                tdVar2.aa = obtainStyledAttributes3.getInt(index3, tdVar2.aa);
                                                                break;
                                                            case 83:
                                                                tdVar2.ac = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.ac);
                                                                break;
                                                            case 84:
                                                                tdVar2.ab = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.ab);
                                                                break;
                                                            case 85:
                                                                tdVar2.ae = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.ae);
                                                                break;
                                                            case 86:
                                                                tdVar2.ad = obtainStyledAttributes3.getDimensionPixelSize(index3, tdVar2.ad);
                                                                break;
                                                            case 87:
                                                                tdVar2.an = obtainStyledAttributes3.getBoolean(index3, tdVar2.an);
                                                                break;
                                                            case 88:
                                                                tdVar2.ao = obtainStyledAttributes3.getBoolean(index3, tdVar2.ao);
                                                                break;
                                                            case 89:
                                                                tdVar2.am = obtainStyledAttributes3.getString(index3);
                                                                break;
                                                            case 90:
                                                                tdVar2.i = obtainStyledAttributes3.getBoolean(index3, tdVar2.i);
                                                                break;
                                                            case 91:
                                                                String hexString = Integer.toHexString(index3);
                                                                int i7 = td.a.get(index3);
                                                                StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + 33);
                                                                sb3.append("unused attribute 0x");
                                                                sb3.append(hexString);
                                                                sb3.append("   ");
                                                                sb3.append(i7);
                                                                Log.w("ConstraintSet", sb3.toString());
                                                                break;
                                                            default:
                                                                String hexString2 = Integer.toHexString(index3);
                                                                int i8 = td.a.get(index3);
                                                                StringBuilder sb4 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                                                                sb4.append("Unknown attribute 0x");
                                                                sb4.append(hexString2);
                                                                sb4.append("   ");
                                                                sb4.append(i8);
                                                                Log.w("ConstraintSet", sb4.toString());
                                                                break;
                                                        }
                                                }
                                        }
                                    }
                                    obtainStyledAttributes3.recycle();
                                    break;
                                } else {
                                    int lineNumber3 = xmlPullParser.getLineNumber();
                                    StringBuilder sb5 = new StringBuilder(56);
                                    sb5.append("XML parser error must be within a Constraint ");
                                    sb5.append(lineNumber3);
                                    throw new RuntimeException(sb5.toString());
                                }
                            case 7:
                                if (tcVar != null) {
                                    te teVar = tcVar.c;
                                    TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tl.f);
                                    teVar.b = true;
                                    int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                    for (int i9 = 0; i9 < indexCount4; i9++) {
                                        int index4 = obtainStyledAttributes4.getIndex(i9);
                                        switch (te.a.get(index4)) {
                                            case 1:
                                                teVar.j = obtainStyledAttributes4.getFloat(index4, teVar.j);
                                                break;
                                            case 2:
                                                teVar.f = obtainStyledAttributes4.getInt(index4, teVar.f);
                                                break;
                                            case 3:
                                                if (obtainStyledAttributes4.peekValue(index4).type == 3) {
                                                    teVar.e = obtainStyledAttributes4.getString(index4);
                                                    break;
                                                } else {
                                                    teVar.e = rv.a[obtainStyledAttributes4.getInteger(index4, 0)];
                                                    break;
                                                }
                                            case 4:
                                                teVar.g = obtainStyledAttributes4.getInt(index4, 0);
                                                break;
                                            case 5:
                                                teVar.c = a(obtainStyledAttributes4, index4, teVar.c);
                                                break;
                                            case 6:
                                                teVar.d = obtainStyledAttributes4.getInteger(index4, teVar.d);
                                                break;
                                            case 7:
                                                teVar.h = obtainStyledAttributes4.getFloat(index4, teVar.h);
                                                break;
                                            case 8:
                                                teVar.l = obtainStyledAttributes4.getInteger(index4, teVar.l);
                                                break;
                                            case 9:
                                                teVar.k = obtainStyledAttributes4.getFloat(index4, teVar.k);
                                                break;
                                            case 10:
                                                TypedValue peekValue = obtainStyledAttributes4.peekValue(index4);
                                                if (peekValue.type == 1) {
                                                    int resourceId = obtainStyledAttributes4.getResourceId(index4, -1);
                                                    teVar.o = resourceId;
                                                    if (resourceId != -1) {
                                                        teVar.n = -2;
                                                    }
                                                } else if (peekValue.type == 3) {
                                                    teVar.m = obtainStyledAttributes4.getString(index4);
                                                    if (teVar.m.indexOf("/") <= 0) {
                                                        teVar.n = -1;
                                                        break;
                                                    } else {
                                                        teVar.o = obtainStyledAttributes4.getResourceId(index4, -1);
                                                        teVar.n = -2;
                                                    }
                                                } else {
                                                    teVar.n = obtainStyledAttributes4.getInteger(index4, teVar.o);
                                                    break;
                                                }
                                        }
                                    }
                                    obtainStyledAttributes4.recycle();
                                    break;
                                } else {
                                    int lineNumber4 = xmlPullParser.getLineNumber();
                                    StringBuilder sb6 = new StringBuilder(56);
                                    sb6.append("XML parser error must be within a Constraint ");
                                    sb6.append(lineNumber4);
                                    throw new RuntimeException(sb6.toString());
                                }
                            case '\b':
                            case '\t':
                                if (tcVar != null) {
                                    HashMap hashMap = tcVar.f;
                                    TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tl.d);
                                    int indexCount5 = obtainStyledAttributes5.getIndexCount();
                                    int i10 = 0;
                                    String str = null;
                                    Object obj2 = null;
                                    int i11 = 0;
                                    boolean z = false;
                                    while (i10 < indexCount5) {
                                        int index5 = obtainStyledAttributes5.getIndex(i10);
                                        if (index5 == 0) {
                                            String string = obtainStyledAttributes5.getString(0);
                                            if (string == null || string.length() <= 0) {
                                                str = string;
                                            } else {
                                                char upperCase = Character.toUpperCase(string.charAt(0));
                                                String substring = string.substring(1);
                                                StringBuilder sb7 = new StringBuilder(String.valueOf(substring).length() + 1);
                                                sb7.append(upperCase);
                                                sb7.append(substring);
                                                str = sb7.toString();
                                            }
                                        } else if (index5 == 10) {
                                            str = obtainStyledAttributes5.getString(10);
                                            z = true;
                                        } else if (index5 == 1) {
                                            obj2 = Boolean.valueOf(obtainStyledAttributes5.getBoolean(1, false));
                                            i11 = 6;
                                        } else if (index5 == 3) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(3, 0));
                                            i11 = 3;
                                        } else if (index5 == i) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(i, 0));
                                            i11 = 4;
                                        } else {
                                            if (index5 == 7) {
                                                obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes5.getDimension(7, 0.0f), context.getResources().getDisplayMetrics()));
                                            } else if (index5 == 4) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getDimension(4, 0.0f));
                                            } else if (index5 == 5) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getFloat(5, Float.NaN));
                                                i11 = 2;
                                            } else if (index5 == 6) {
                                                obj2 = Integer.valueOf(obtainStyledAttributes5.getInteger(6, -1));
                                                i11 = 1;
                                            } else if (index5 == 9) {
                                                obj2 = obtainStyledAttributes5.getString(9);
                                                i11 = 5;
                                            } else if (index5 == 8) {
                                                int resourceId2 = obtainStyledAttributes5.getResourceId(8, -1);
                                                if (resourceId2 == -1) {
                                                    resourceId2 = obtainStyledAttributes5.getInt(8, -1);
                                                }
                                                obj2 = Integer.valueOf(resourceId2);
                                                i11 = 8;
                                            }
                                            i11 = 7;
                                        }
                                        i10++;
                                        i = 2;
                                    }
                                    String str2 = str;
                                    if (str2 != null && (obj = obj2) != null) {
                                        hashMap.put(str2, new sv(str2, i11, obj, z));
                                    }
                                    obtainStyledAttributes5.recycle();
                                    break;
                                } else {
                                    int lineNumber5 = xmlPullParser.getLineNumber();
                                    StringBuilder sb8 = new StringBuilder(56);
                                    sb8.append("XML parser error must be within a Constraint ");
                                    sb8.append(lineNumber5);
                                    throw new RuntimeException(sb8.toString());
                                }
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0) {
                            return;
                        }
                        if (c3 == 1 || c3 == 2 || c3 == 3) {
                            try {
                                this.b.put(Integer.valueOf(tcVar.a), tcVar);
                                tcVar = null;
                            } catch (IOException e) {
                                e = e;
                                e.printStackTrace();
                                return;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }

    public final void l(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        String str;
        int i;
        View findViewById;
        HashMap hashMap;
        String str2;
        int i2;
        int i3;
        int i4;
        ConstraintLayout constraintLayout3 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.b.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout3.getChildAt(i5);
            int id = childAt.getId();
            HashMap hashMap2 = this.b;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap2.containsKey(valueOf)) {
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                String valueOf2 = String.valueOf(str);
                Log.w("ConstraintSet", valueOf2.length() != 0 ? "id unknown ".concat(valueOf2) : new String("id unknown "));
            } else if (id != -1) {
                if (id != -1 && this.b.containsKey(valueOf)) {
                    hashSet.remove(valueOf);
                    tc tcVar = (tc) this.b.get(valueOf);
                    if (tcVar != null) {
                        if (childAt instanceof su) {
                            tcVar.d.aj = 1;
                            su suVar = (su) childAt;
                            suVar.setId(id);
                            td tdVar = tcVar.d;
                            suVar.a = tdVar.ah;
                            suVar.b(tdVar.ai);
                            td tdVar2 = tcVar.d;
                            suVar.b.b = tdVar2.ap;
                            int[] iArr = tdVar2.ak;
                            if (iArr != null) {
                                suVar.e(iArr);
                            } else {
                                String str3 = tdVar2.al;
                                if (str3 != null) {
                                    tdVar2.ak = m(suVar, str3);
                                    suVar.e(tcVar.d.ak);
                                }
                            }
                        }
                        sy syVar = (sy) childAt.getLayoutParams();
                        syVar.a();
                        tcVar.a(syVar);
                        HashMap hashMap3 = tcVar.f;
                        Class<?> cls = childAt.getClass();
                        for (String str4 : hashMap3.keySet()) {
                            sv svVar = (sv) hashMap3.get(str4);
                            if (!svVar.a) {
                                String valueOf3 = String.valueOf(str4);
                                hashMap = hashMap3;
                                str2 = valueOf3.length() != 0 ? "set".concat(valueOf3) : new String("set");
                            } else {
                                hashMap = hashMap3;
                                str2 = str4;
                            }
                            try {
                                i3 = svVar.h;
                                i4 = i3 - 1;
                            } catch (IllegalAccessException e) {
                                e = e;
                                i2 = childCount;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                i2 = childCount;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                i2 = childCount;
                            }
                            if (i3 == 0) {
                                i2 = childCount;
                                throw null;
                            }
                            switch (i4) {
                                case 0:
                                    i2 = childCount;
                                    Class<?>[] clsArr = new Class[1];
                                    try {
                                        clsArr[0] = Integer.TYPE;
                                        cls.getMethod(str2, clsArr).invoke(childAt, Integer.valueOf(svVar.c));
                                    } catch (IllegalAccessException e4) {
                                        e = e4;
                                        String name = cls.getName();
                                        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(name).length());
                                        sb.append(" Custom Attribute \"");
                                        sb.append(str4);
                                        sb.append("\" not found on ");
                                        sb.append(name);
                                        Log.e("TransitionLayout", sb.toString());
                                        e.printStackTrace();
                                        childCount = i2;
                                        hashMap3 = hashMap;
                                    } catch (NoSuchMethodException e5) {
                                        e = e5;
                                        Log.e("TransitionLayout", e.getMessage());
                                        String name2 = cls.getName();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(name2).length());
                                        sb2.append(" Custom Attribute \"");
                                        sb2.append(str4);
                                        sb2.append("\" not found on ");
                                        sb2.append(name2);
                                        Log.e("TransitionLayout", sb2.toString());
                                        String name3 = cls.getName();
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(name3).length() + 20 + String.valueOf(str2).length());
                                        sb3.append(name3);
                                        sb3.append(" must have a method ");
                                        sb3.append(str2);
                                        Log.e("TransitionLayout", sb3.toString());
                                        childCount = i2;
                                        hashMap3 = hashMap;
                                    } catch (InvocationTargetException e6) {
                                        e = e6;
                                        String name4 = cls.getName();
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(name4).length());
                                        sb4.append(" Custom Attribute \"");
                                        sb4.append(str4);
                                        sb4.append("\" not found on ");
                                        sb4.append(name4);
                                        Log.e("TransitionLayout", sb4.toString());
                                        e.printStackTrace();
                                        childCount = i2;
                                        hashMap3 = hashMap;
                                    }
                                    childCount = i2;
                                case 1:
                                    i2 = childCount;
                                    cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(svVar.d));
                                    childCount = i2;
                                    break;
                                case 2:
                                    i2 = childCount;
                                    cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(svVar.g));
                                    childCount = i2;
                                    break;
                                case 3:
                                    i2 = childCount;
                                    Method method = cls.getMethod(str2, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(svVar.g);
                                    method.invoke(childAt, colorDrawable);
                                    childCount = i2;
                                    break;
                                case 4:
                                    i2 = childCount;
                                    cls.getMethod(str2, CharSequence.class).invoke(childAt, svVar.e);
                                    childCount = i2;
                                    break;
                                case 5:
                                    i2 = childCount;
                                    cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(svVar.f));
                                    childCount = i2;
                                    break;
                                case 6:
                                    i2 = childCount;
                                    cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(svVar.d));
                                    childCount = i2;
                                    break;
                                case 7:
                                    i2 = childCount;
                                    try {
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(svVar.c));
                                    } catch (IllegalAccessException e7) {
                                        e = e7;
                                        String name5 = cls.getName();
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(name5).length());
                                        sb5.append(" Custom Attribute \"");
                                        sb5.append(str4);
                                        sb5.append("\" not found on ");
                                        sb5.append(name5);
                                        Log.e("TransitionLayout", sb5.toString());
                                        e.printStackTrace();
                                        childCount = i2;
                                        hashMap3 = hashMap;
                                    } catch (NoSuchMethodException e8) {
                                        e = e8;
                                        Log.e("TransitionLayout", e.getMessage());
                                        String name22 = cls.getName();
                                        StringBuilder sb22 = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(name22).length());
                                        sb22.append(" Custom Attribute \"");
                                        sb22.append(str4);
                                        sb22.append("\" not found on ");
                                        sb22.append(name22);
                                        Log.e("TransitionLayout", sb22.toString());
                                        String name32 = cls.getName();
                                        StringBuilder sb32 = new StringBuilder(String.valueOf(name32).length() + 20 + String.valueOf(str2).length());
                                        sb32.append(name32);
                                        sb32.append(" must have a method ");
                                        sb32.append(str2);
                                        Log.e("TransitionLayout", sb32.toString());
                                        childCount = i2;
                                        hashMap3 = hashMap;
                                    } catch (InvocationTargetException e9) {
                                        e = e9;
                                        String name42 = cls.getName();
                                        StringBuilder sb42 = new StringBuilder(String.valueOf(str4).length() + 34 + String.valueOf(name42).length());
                                        sb42.append(" Custom Attribute \"");
                                        sb42.append(str4);
                                        sb42.append("\" not found on ");
                                        sb42.append(name42);
                                        Log.e("TransitionLayout", sb42.toString());
                                        e.printStackTrace();
                                        childCount = i2;
                                        hashMap3 = hashMap;
                                    }
                                    childCount = i2;
                            }
                            hashMap3 = hashMap;
                        }
                        i = childCount;
                        childAt.setLayoutParams(syVar);
                        tf tfVar = tcVar.b;
                        if (tfVar.c == 0) {
                            childAt.setVisibility(tfVar.b);
                        }
                        childAt.setAlpha(tcVar.b.d);
                        childAt.setRotation(tcVar.e.c);
                        childAt.setRotationX(tcVar.e.d);
                        childAt.setRotationY(tcVar.e.e);
                        childAt.setScaleX(tcVar.e.f);
                        childAt.setScaleY(tcVar.e.g);
                        tg tgVar = tcVar.e;
                        if (tgVar.j != -1) {
                            if (((View) childAt.getParent()).findViewById(tcVar.e.j) != null) {
                                float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    int left2 = childAt.getLeft();
                                    int top2 = childAt.getTop();
                                    childAt.setPivotX(left - left2);
                                    childAt.setPivotY(top - top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(tgVar.h)) {
                                childAt.setPivotX(tcVar.e.h);
                            }
                            if (!Float.isNaN(tcVar.e.i)) {
                                childAt.setPivotY(tcVar.e.i);
                            }
                        }
                        childAt.setTranslationX(tcVar.e.k);
                        childAt.setTranslationY(tcVar.e.l);
                        childAt.setTranslationZ(tcVar.e.m);
                        tg tgVar2 = tcVar.e;
                        if (tgVar2.n) {
                            childAt.setElevation(tgVar2.o);
                        }
                        i5++;
                        constraintLayout3 = constraintLayout;
                        childCount = i;
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            i = childCount;
            i5++;
            constraintLayout3 = constraintLayout;
            childCount = i;
        }
        int i6 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            tc tcVar2 = (tc) this.b.get(num);
            if (tcVar2 != null) {
                if (tcVar2.d.aj == 1) {
                    su suVar2 = new su(constraintLayout.getContext());
                    suVar2.setId(num.intValue());
                    td tdVar3 = tcVar2.d;
                    int[] iArr2 = tdVar3.ak;
                    if (iArr2 != null) {
                        suVar2.e(iArr2);
                    } else {
                        String str5 = tdVar3.al;
                        if (str5 != null) {
                            tdVar3.ak = m(suVar2, str5);
                            suVar2.e(tcVar2.d.ak);
                        }
                    }
                    td tdVar4 = tcVar2.d;
                    suVar2.a = tdVar4.ah;
                    suVar2.b(tdVar4.ai);
                    sy f = ConstraintLayout.f();
                    suVar2.f();
                    tcVar2.a(f);
                    constraintLayout2 = constraintLayout;
                    constraintLayout2.addView(suVar2, f);
                } else {
                    constraintLayout2 = constraintLayout;
                }
                if (tcVar2.d.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    sy f2 = ConstraintLayout.f();
                    tcVar2.a(f2);
                    constraintLayout2.addView(guideline, f2);
                }
            }
        }
        for (int i7 = 0; i7 < i6; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof sw) {
                sw swVar = (sw) childAt2;
            }
        }
    }
}
