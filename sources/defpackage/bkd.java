package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.chromium.net.UrlRequest;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* compiled from: PG */
/* renamed from: bkd  reason: default package */
/* loaded from: classes.dex */
public final class bkd extends DefaultHandler2 {
    private int d;
    private bjd a = null;
    private bii b = null;
    private boolean c = false;
    private boolean e = false;
    private bkb f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    private static final void A(bif bifVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            int ordinal = bka.a(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        bkc bkcVar = new bkc(trim);
                        HashSet hashSet = new HashSet();
                        while (!bkcVar.n()) {
                            String i2 = bkcVar.i();
                            if (i2.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(i2.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            bkcVar.k();
                        }
                        bifVar.i(hashSet);
                        continue;
                    case 53:
                        bifVar.h(trim);
                        continue;
                    case 54:
                        bkc bkcVar2 = new bkc(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!bkcVar2.n()) {
                            hashSet2.add(bkcVar2.i());
                            bkcVar2.k();
                        }
                        bifVar.k(hashSet2);
                        continue;
                    case 55:
                        List m = m(trim);
                        bifVar.j(m != null ? new HashSet(m) : new HashSet(0));
                        continue;
                }
            } else {
                bkc bkcVar3 = new bkc(trim);
                HashSet hashSet3 = new HashSet();
                while (!bkcVar3.n()) {
                    String i3 = bkcVar3.i();
                    int indexOf = i3.indexOf(45);
                    if (indexOf != -1) {
                        i3 = i3.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(i3, "", "").getLanguage());
                    bkcVar3.k();
                }
                bifVar.l(hashSet3);
            }
        }
    }

    private static final void B(bik bikVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (!qName.equals("id") && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String trim = attributes.getValue(i).trim();
                    if ("default".equals(trim)) {
                        bikVar.p = Boolean.FALSE;
                        return;
                    } else if (!"preserve".equals(trim)) {
                        throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(trim)));
                    } else {
                        bikVar.p = Boolean.TRUE;
                        return;
                    }
                }
            } else {
                bikVar.o = attributes.getValue(i).trim();
                return;
            }
        }
    }

    private static final void C(bhy bhyVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (bka.a(attributes.getLocalName(i)) == bka.points) {
                bkc bkcVar = new bkc(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                bkcVar.k();
                while (!bkcVar.n()) {
                    float b = bkcVar.b();
                    if (!Float.isNaN(b)) {
                        bkcVar.p();
                        float b2 = bkcVar.b();
                        if (!Float.isNaN(b2)) {
                            bkcVar.p();
                            arrayList.add(Float.valueOf(b));
                            arrayList.add(Float.valueOf(b2));
                        } else {
                            throw new SAXException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SAXException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                bhyVar.a = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    bhyVar.a[i3] = ((Float) arrayList.get(i2)).floatValue();
                    i2++;
                    i3++;
                }
            }
        }
    }

    private static final void D(bik bikVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                bka bkaVar = bka.CLASS;
                bkb bkbVar = bkb.svg;
                int ordinal = bka.a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    ArrayList arrayList = null;
                    bkc bkcVar = new bkc(trim, (byte[]) null);
                    while (!bkcVar.n()) {
                        String r = bkcVar.r();
                        if (r != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(r);
                            bkcVar.k();
                        } else {
                            throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(trim)));
                        }
                    }
                    bikVar.s = arrayList;
                } else if (ordinal == 72) {
                    bkc bkcVar2 = new bkc(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String j = bkcVar2.j(':');
                        bkcVar2.k();
                        if (bkcVar2.l(':')) {
                            bkcVar2.k();
                            String j2 = bkcVar2.j(';');
                            if (j2 != null) {
                                bkcVar2.k();
                                if (bkcVar2.n() || bkcVar2.l(';')) {
                                    if (bikVar.r == null) {
                                        bikVar.r = new bid();
                                    }
                                    c(bikVar.r, j, j2);
                                    bkcVar2.k();
                                }
                            }
                        }
                    }
                } else {
                    if (bikVar.q == null) {
                        bikVar.q = new bid();
                    }
                    c(bikVar.q, attributes.getLocalName(i), attributes.getValue(i).trim());
                }
            }
        }
    }

    private static final void E(biz bizVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            int ordinal = bka.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                bizVar.d = n(trim);
            } else if (ordinal == 10) {
                bizVar.e = n(trim);
            } else if (ordinal == 82) {
                bizVar.b = n(trim);
            } else if (ordinal == 83) {
                bizVar.c = n(trim);
            }
        }
    }

    private static final void F(biq biqVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            int ordinal = bka.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                x(biqVar, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                bkc bkcVar = new bkc(trim);
                bkcVar.k();
                float b = bkcVar.b();
                bkcVar.p();
                float b2 = bkcVar.b();
                bkcVar.p();
                float b3 = bkcVar.b();
                bkcVar.p();
                float b4 = bkcVar.b();
                if (Float.isNaN(b) || Float.isNaN(b2) || Float.isNaN(b3) || Float.isNaN(b4)) {
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                }
                if (b3 < 0.0f) {
                    throw new SAXException("Invalid viewBox. width cannot be negative");
                }
                if (b4 < 0.0f) {
                    throw new SAXException("Invalid viewBox. height cannot be negative");
                }
                biqVar.w = new bhb(b, b2, b3, b4);
            }
        }
    }

    private static float G(String str, int i) {
        float a = new bgx().a(str, 0, i);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new SAXException("Invalid float value: ".concat(String.valueOf(str)));
    }

    private static final Matrix H(String str) {
        Matrix matrix = new Matrix();
        bkc bkcVar = new bkc(str);
        bkcVar.k();
        while (!bkcVar.n()) {
            String str2 = null;
            if (!bkcVar.n()) {
                int i = bkcVar.a;
                int charAt = ((String) bkcVar.c).charAt(i);
                while (true) {
                    if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                        break;
                    }
                    charAt = bkcVar.d();
                }
                int i2 = bkcVar.a;
                while (bkc.s(charAt)) {
                    charAt = bkcVar.d();
                }
                if (charAt == 40) {
                    bkcVar.a++;
                    str2 = ((String) bkcVar.c).substring(i, i2);
                } else {
                    bkcVar.a = i;
                }
            }
            if (str2 != null) {
                if (str2.equals("matrix")) {
                    bkcVar.k();
                    float b = bkcVar.b();
                    bkcVar.p();
                    float b2 = bkcVar.b();
                    bkcVar.p();
                    float b3 = bkcVar.b();
                    bkcVar.p();
                    float b4 = bkcVar.b();
                    bkcVar.p();
                    float b5 = bkcVar.b();
                    bkcVar.p();
                    float b6 = bkcVar.b();
                    bkcVar.k();
                    if (!Float.isNaN(b6) && bkcVar.l(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{b, b3, b5, b2, b4, b6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else if (str2.equals("translate")) {
                    bkcVar.k();
                    float b7 = bkcVar.b();
                    float c = bkcVar.c();
                    bkcVar.k();
                    if (!Float.isNaN(b7) && bkcVar.l(')')) {
                        if (Float.isNaN(c)) {
                            matrix.preTranslate(b7, 0.0f);
                        } else {
                            matrix.preTranslate(b7, c);
                        }
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else if (str2.equals("scale")) {
                    bkcVar.k();
                    float b8 = bkcVar.b();
                    float c2 = bkcVar.c();
                    bkcVar.k();
                    if (!Float.isNaN(b8) && bkcVar.l(')')) {
                        if (Float.isNaN(c2)) {
                            matrix.preScale(b8, b8);
                        } else {
                            matrix.preScale(b8, c2);
                        }
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else if (str2.equals("rotate")) {
                    bkcVar.k();
                    float b9 = bkcVar.b();
                    float c3 = bkcVar.c();
                    float c4 = bkcVar.c();
                    bkcVar.k();
                    if (!Float.isNaN(b9) && bkcVar.l(')')) {
                        if (Float.isNaN(c3)) {
                            matrix.preRotate(b9);
                        } else if (!Float.isNaN(c4)) {
                            matrix.preRotate(b9, c3, c4);
                        } else {
                            throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else if (str2.equals("skewX")) {
                    bkcVar.k();
                    float b10 = bkcVar.b();
                    bkcVar.k();
                    if (!Float.isNaN(b10) && bkcVar.l(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(b10)), 0.0f);
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else if (str2.equals("skewY")) {
                    bkcVar.k();
                    float b11 = bkcVar.b();
                    bkcVar.k();
                    if (!Float.isNaN(b11) && bkcVar.l(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(b11)));
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else {
                    throw new SAXException("Invalid transform list fn: " + str2 + ")");
                }
                if (bkcVar.n()) {
                    break;
                }
                bkcVar.p();
            } else {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
        }
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void I(defpackage.bhj r7, org.xml.sax.Attributes r8) {
        /*
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Ld1
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            bka r3 = defpackage.bka.CLASS
            bkb r3 = defpackage.bkb.svg
            java.lang.String r3 = r8.getLocalName(r1)
            bka r3 = defpackage.bka.a(r3)
            int r3 = r3.ordinal()
            r4 = 23
            if (r3 == r4) goto Lc7
            r4 = 24
            r5 = 1
            if (r3 == r4) goto La1
            r4 = 26
            if (r3 == r4) goto L92
            r4 = 60
            if (r3 == r4) goto L33
            goto Lcd
        L33:
            int r3 = r2.hashCode()     // Catch: java.lang.IllegalArgumentException -> L79
            r4 = -934531685(0xffffffffc84c2d9b, float:-209078.42)
            r6 = 2
            if (r3 == r4) goto L5c
            r4 = 110739(0x1b093, float:1.55178E-40)
            if (r3 == r4) goto L52
            r4 = 1085265597(0x40afd6bd, float:5.494963)
            if (r3 == r4) goto L48
            goto L66
        L48:
            java.lang.String r3 = "reflect"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L66
            r3 = 1
            goto L67
        L52:
            java.lang.String r3 = "pad"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L66
            r3 = 0
            goto L67
        L5c:
            java.lang.String r3 = "repeat"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L66
            r3 = 2
            goto L67
        L66:
            r3 = -1
        L67:
            if (r3 == 0) goto L76
            if (r3 == r5) goto L75
            if (r3 != r6) goto L6f
            r5 = 3
            goto L76
        L6f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L79
            r7.<init>()     // Catch: java.lang.IllegalArgumentException -> L79
            throw r7     // Catch: java.lang.IllegalArgumentException -> L79
        L75:
            r5 = 2
        L76:
            r7.e = r5     // Catch: java.lang.IllegalArgumentException -> L79
            goto Lcd
        L79:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r0 = "\" is not a valid value."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L92:
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            java.lang.String r4 = r8.getURI(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lcd
            r7.d = r2
            goto Lcd
        La1:
            java.lang.String r3 = "objectBoundingBox"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto Lb0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r7.b = r2
            goto Lcd
        Lb0:
            java.lang.String r3 = "userSpaceOnUse"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lbf
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r7.b = r2
            goto Lcd
        Lbf:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute gradientUnits"
            r7.<init>(r8)
            throw r7
        Lc7:
            android.graphics.Matrix r2 = H(r2)
            r7.c = r2
        Lcd:
            int r1 = r1 + 1
            goto L2
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkd.I(bhj, org.xml.sax.Attributes):void");
    }

    private static final void J(bhm bhmVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (bka.a(attributes.getLocalName(i)) == bka.transform) {
                bhmVar.a(H(attributes.getValue(i)));
            }
        }
    }

    protected static bho a(String str) {
        int i;
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        int i2 = length - 1;
        char charAt = str.charAt(i2);
        if (charAt == '%') {
            length = i2;
            i = 9;
        } else {
            i = 1;
            if (length > 2 && Character.isLetter(charAt)) {
                int i3 = length - 2;
                if (Character.isLetter(str.charAt(i3))) {
                    try {
                        i = ce.l(str.substring(i3).toLowerCase(Locale.US));
                        length = i3;
                    } catch (IllegalArgumentException unused) {
                        throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                    }
                }
            }
        }
        try {
            return new bho(G(str, length), i);
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
        }
    }

    public static void c(bid bidVar, String str, String str2) {
        Boolean bool;
        String j;
        int i;
        bho e;
        if (str2.length() != 0 && !str2.equals("inherit")) {
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            int ordinal = bka.a(str).ordinal();
            int i2 = 5;
            bhc bhcVar = null;
            r3 = null;
            r3 = null;
            bho[] bhoVarArr = null;
            String str3 = null;
            int i3 = 1;
            if (ordinal == 1) {
                if (!"auto".equals(str2)) {
                    if (str2.toLowerCase(Locale.US).startsWith("rect(")) {
                        bkc bkcVar = new bkc(str2.substring(5));
                        bkcVar.k();
                        bho i4 = i(bkcVar);
                        bkcVar.p();
                        bho i5 = i(bkcVar);
                        bkcVar.p();
                        bho i6 = i(bkcVar);
                        bkcVar.p();
                        bho i7 = i(bkcVar);
                        bkcVar.k();
                        if (bkcVar.l(')')) {
                            bhcVar = new bhc(i4, i5, i6, i7);
                        } else {
                            throw new SAXException("Bad rect() clip definition: ".concat(String.valueOf(str2)));
                        }
                    } else {
                        throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                    }
                }
                bidVar.p = bhcVar;
                bidVar.a |= 1048576;
            } else if (ordinal == 2) {
                bidVar.x = l(str2, str);
                bidVar.a |= 268435456;
            } else if (ordinal == 4) {
                bidVar.K = y(str2);
                bidVar.a |= 536870912;
            } else if (ordinal == 5) {
                bidVar.k = g(str2);
                bidVar.a |= 4096;
            } else if (ordinal == 8) {
                if (!"ltr".equals(str2)) {
                    if (!"rtl".equals(str2)) {
                        throw new SAXException("Invalid direction property: ".concat(String.valueOf(str2)));
                    }
                    i3 = 2;
                }
                bidVar.I = i3;
                bidVar.a |= 68719476736L;
            } else if (ordinal == 35) {
                bidVar.y = l(str2, str);
                bidVar.a |= 1073741824;
            } else if (ordinal == 40) {
                bidVar.j = Float.valueOf(e(str2));
                bidVar.a |= 2048;
            } else if (ordinal == 42) {
                if ("visible".equals(str2) || "auto".equals(str2)) {
                    bool = Boolean.TRUE;
                } else if ("hidden".equals(str2) || "scroll".equals(str2)) {
                    bool = Boolean.FALSE;
                } else {
                    throw new SAXException("Invalid toverflow property: ".concat(String.valueOf(str2)));
                }
                bidVar.o = bool;
                bidVar.a |= 524288;
            } else if (ordinal == 78) {
                if (!"none".equals(str2)) {
                    if (!"non-scaling-stroke".equals(str2)) {
                        throw new SAXException("Invalid vector-effect property: ".concat(String.valueOf(str2)));
                    }
                    i3 = 2;
                }
                bidVar.L = i3;
                bidVar.a |= 34359738368L;
            } else if (ordinal == 58) {
                if (str2.equals("currentColor")) {
                    bidVar.z = bhg.a;
                } else {
                    bidVar.z = g(str2);
                }
                bidVar.a |= 2147483648L;
            } else if (ordinal == 59) {
                bidVar.A = Float.valueOf(e(str2));
                bidVar.a |= 4294967296L;
            } else if (ordinal == 74) {
                if (!"start".equals(str2)) {
                    if ("middle".equals(str2)) {
                        i3 = 2;
                    } else if (!"end".equals(str2)) {
                        throw new SAXException("Invalid text-anchor property: ".concat(String.valueOf(str2)));
                    } else {
                        i3 = 3;
                    }
                }
                bidVar.J = i3;
                bidVar.a |= 262144;
            } else if (ordinal == 75) {
                if ("none".equals(str2)) {
                    i2 = 1;
                } else if ("underline".equals(str2)) {
                    i2 = 2;
                } else if ("overline".equals(str2)) {
                    i2 = 3;
                } else if ("line-through".equals(str2)) {
                    i2 = 4;
                } else if (!"blink".equals(str2)) {
                    throw new SAXException("Invalid text-decoration property: ".concat(String.valueOf(str2)));
                }
                bidVar.H = i2;
                bidVar.a |= 131072;
            } else {
                switch (ordinal) {
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        if (str2.indexOf(124) < 0) {
                            if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf("|" + str2 + "|") != -1) {
                                bidVar.t = Boolean.valueOf(!str2.equals("none"));
                                bidVar.a |= 16777216;
                                return;
                            }
                        }
                        throw new SAXException("Invalid value for \"display\" attribute: ".concat(String.valueOf(str2)));
                    case 15:
                        bidVar.b = k(str2, "fill");
                        bidVar.a |= 1;
                        return;
                    case 16:
                        bidVar.D = y(str2);
                        bidVar.a |= 2;
                        return;
                    case 17:
                        bidVar.c = Float.valueOf(e(str2));
                        bidVar.a |= 4;
                        return;
                    case 18:
                        if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf("|" + str2 + "|") != -1) {
                            return;
                        }
                        bkc bkcVar2 = new bkc(str2);
                        Integer num = null;
                        String str4 = null;
                        int i8 = 0;
                        while (true) {
                            j = bkcVar2.j('/');
                            bkcVar2.k();
                            if (j != null) {
                                if (num == null) {
                                    i = i8;
                                } else if (i8 == 0) {
                                    i = 0;
                                }
                                if (!j.equals("normal") && (num != null || (num = bjz.a(j)) == null)) {
                                    if (i == 0) {
                                        i8 = z(j);
                                        if (i8 != 0) {
                                            continue;
                                        }
                                    } else {
                                        i8 = i;
                                    }
                                    if (str4 == null && j.equals("small-caps")) {
                                        str4 = j;
                                    }
                                }
                            } else {
                                throw new SAXException("Invalid font style attribute: missing font size and family");
                            }
                        }
                        bho h = h(j);
                        if (bkcVar2.l('/')) {
                            bkcVar2.k();
                            String i9 = bkcVar2.i();
                            if (i9 == null) {
                                throw new SAXException("Invalid font style attribute: missing line-height");
                            }
                            a(i9);
                            bkcVar2.k();
                        }
                        if (!bkcVar2.n()) {
                            int i10 = bkcVar2.a;
                            bkcVar2.a = bkcVar2.b;
                            str3 = ((String) bkcVar2.c).substring(i10);
                        }
                        bidVar.l = m(str3);
                        bidVar.m = h;
                        bidVar.n = Integer.valueOf(num == null ? 400 : num.intValue());
                        if (i8 != 0) {
                            i3 = i8;
                        }
                        bidVar.G = i3;
                        bidVar.a |= 122880;
                        return;
                    case 19:
                        bidVar.l = m(str2);
                        bidVar.a |= 8192;
                        return;
                    case 20:
                        bidVar.m = h(str2);
                        bidVar.a |= 16384;
                        return;
                    case 21:
                        Integer a = bjz.a(str2);
                        if (a == null) {
                            throw new SAXException("Invalid font-weight property: ".concat(String.valueOf(str2)));
                        }
                        bidVar.n = a;
                        bidVar.a |= 32768;
                        return;
                    case 22:
                        int z = z(str2);
                        if (z != 0) {
                            bidVar.G = z;
                            bidVar.a |= 65536;
                            return;
                        }
                        throw new SAXException("Invalid font-style property: ".concat(String.valueOf(str2)));
                    default:
                        switch (ordinal) {
                            case 28:
                                bidVar.q = l(str2, str);
                                String str5 = bidVar.q;
                                bidVar.r = str5;
                                bidVar.s = str5;
                                bidVar.a |= 14680064;
                                return;
                            case 29:
                                bidVar.q = l(str2, str);
                                bidVar.a |= 2097152;
                                return;
                            case 30:
                                bidVar.r = l(str2, str);
                                bidVar.a |= 4194304;
                                return;
                            case 31:
                                bidVar.s = l(str2, str);
                                bidVar.a |= 8388608;
                                return;
                            default:
                                switch (ordinal) {
                                    case 62:
                                        if (str2.equals("currentColor")) {
                                            bidVar.v = bhg.a;
                                        } else {
                                            bidVar.v = g(str2);
                                        }
                                        bidVar.a |= 67108864;
                                        return;
                                    case 63:
                                        bidVar.w = Float.valueOf(e(str2));
                                        bidVar.a |= 134217728;
                                        return;
                                    case 64:
                                        bidVar.d = k(str2, "stroke");
                                        bidVar.a |= 8;
                                        return;
                                    case 65:
                                        if (!"none".equals(str2)) {
                                            bkc bkcVar3 = new bkc(str2);
                                            bkcVar3.k();
                                            if (!bkcVar3.n() && (e = bkcVar3.e()) != null) {
                                                if (!e.e()) {
                                                    float f = e.a;
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add(e);
                                                    while (!bkcVar3.n()) {
                                                        bkcVar3.p();
                                                        bho e2 = bkcVar3.e();
                                                        if (e2 != null) {
                                                            if (!e2.e()) {
                                                                arrayList.add(e2);
                                                                f += e2.a;
                                                            } else {
                                                                throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                                            }
                                                        } else {
                                                            throw new SAXException("Invalid stroke-dasharray. Non-Length content found: ".concat(String.valueOf(str2)));
                                                        }
                                                    }
                                                    if (f != 0.0f) {
                                                        bhoVarArr = (bho[]) arrayList.toArray(new bho[arrayList.size()]);
                                                    }
                                                } else {
                                                    throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                                }
                                            }
                                            bidVar.h = bhoVarArr;
                                        } else {
                                            bidVar.h = null;
                                        }
                                        bidVar.a |= 512;
                                        return;
                                    case 66:
                                        bidVar.i = a(str2);
                                        bidVar.a |= 1024;
                                        return;
                                    case 67:
                                        if (!"butt".equals(str2)) {
                                            if ("round".equals(str2)) {
                                                i3 = 2;
                                            } else if (!"square".equals(str2)) {
                                                throw new SAXException("Invalid stroke-linecap property: ".concat(String.valueOf(str2)));
                                            } else {
                                                i3 = 3;
                                            }
                                        }
                                        bidVar.E = i3;
                                        bidVar.a |= 64;
                                        return;
                                    case 68:
                                        if (!"miter".equals(str2)) {
                                            if ("round".equals(str2)) {
                                                i3 = 2;
                                            } else if (!"bevel".equals(str2)) {
                                                throw new SAXException("Invalid stroke-linejoin property: ".concat(String.valueOf(str2)));
                                            } else {
                                                i3 = 3;
                                            }
                                        }
                                        bidVar.F = i3;
                                        bidVar.a |= 128;
                                        return;
                                    case 69:
                                        bidVar.g = Float.valueOf(d(str2));
                                        bidVar.a |= 256;
                                        return;
                                    case 70:
                                        bidVar.e = Float.valueOf(e(str2));
                                        bidVar.a |= 16;
                                        return;
                                    case 71:
                                        bidVar.f = a(str2);
                                        bidVar.a |= 32;
                                        return;
                                    default:
                                        switch (ordinal) {
                                            case 88:
                                                if (str2.equals("currentColor")) {
                                                    bidVar.B = bhg.a;
                                                } else {
                                                    bidVar.B = g(str2);
                                                }
                                                bidVar.a |= 8589934592L;
                                                return;
                                            case 89:
                                                bidVar.C = Float.valueOf(e(str2));
                                                bidVar.a |= 17179869184L;
                                                return;
                                            case 90:
                                                if (str2.indexOf(124) < 0) {
                                                    if ("|visible|hidden|collapse|".indexOf("|" + str2 + "|") != -1) {
                                                        bidVar.u = Boolean.valueOf(str2.equals("visible"));
                                                        bidVar.a |= 33554432;
                                                        return;
                                                    }
                                                }
                                                throw new SAXException("Invalid value for \"visibility\" attribute: ".concat(String.valueOf(str2)));
                                            default:
                                                return;
                                        }
                                }
                        }
                }
            }
        }
    }

    private static float d(String str) {
        int length = str.length();
        if (length == 0) {
            throw new SAXException("Invalid float value (empty string)");
        }
        return G(str, length);
    }

    private static float e(String str) {
        float d = d(str);
        if (d < 0.0f) {
            return 0.0f;
        }
        if (d <= 1.0f) {
            return d;
        }
        return 1.0f;
    }

    private static int f(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f <= 255.0f) {
            return Math.round(f);
        }
        return 255;
    }

    private static bhf g(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            bgw bgwVar = null;
            if (length > 1) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j = j2 * 16;
                            i = charAt - 'A';
                        } else if (charAt < 'a' || charAt > 'f') {
                            break;
                        } else {
                            j = j2 * 16;
                            i = charAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (charAt - '0');
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    bgwVar = new bgw(j2, i2);
                }
            }
            if (bgwVar != null) {
                int i3 = bgwVar.a;
                if (i3 == 7) {
                    return new bhf(bgwVar.a());
                }
                if (i3 != 4) {
                    throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
                }
                int a = bgwVar.a();
                int i4 = a & 3840;
                int i5 = a & 240;
                int i6 = a & 15;
                return new bhf(i6 | (i4 << 8) | (i4 << 12) | (-16777216) | (i5 << 8) | (i5 << 4) | (i6 << 4));
            }
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        } else if (!str.toLowerCase(Locale.US).startsWith("rgb(")) {
            Integer num = (Integer) bjx.a.get(str.toLowerCase(Locale.US));
            if (num != null) {
                return new bhf(num.intValue());
            }
            throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
        } else {
            bkc bkcVar = new bkc(str.substring(4));
            bkcVar.k();
            float b = bkcVar.b();
            if (!Float.isNaN(b) && bkcVar.l('%')) {
                b = (b * 256.0f) / 100.0f;
            }
            float a2 = bkcVar.a(b);
            if (!Float.isNaN(a2) && bkcVar.l('%')) {
                a2 = (a2 * 256.0f) / 100.0f;
            }
            float a3 = bkcVar.a(a2);
            if (!Float.isNaN(a3) && bkcVar.l('%')) {
                a3 = (a3 * 256.0f) / 100.0f;
            }
            bkcVar.k();
            if (Float.isNaN(a3) || !bkcVar.l(')')) {
                throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
            }
            return new bhf((f(b) << 16) | (f(a2) << 8) | f(a3));
        }
    }

    private static bho h(String str) {
        bho bhoVar = (bho) bjy.a.get(str);
        return bhoVar == null ? a(str) : bhoVar;
    }

    private static bho i(bkc bkcVar) {
        return bkcVar.m("auto") ? new bho(0.0f) : bkcVar.e();
    }

    private static bin j(String str) {
        if (str.equals("none")) {
            return null;
        }
        return str.equals("currentColor") ? bhg.a : g(str);
    }

    private static bin k(String str, String str2) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            if (indexOf == -1) {
                throw new SAXException("Bad " + str2 + " attribute. Unterminated url() reference");
            }
            String trim = str.substring(4, indexOf).trim();
            String trim2 = str.substring(indexOf + 1).trim();
            return new bht(trim, trim2.length() > 0 ? j(trim2) : null);
        }
        return j(str);
    }

    private static String l(String str, String str2) {
        if (str.equals("none")) {
            return null;
        }
        if (!str.startsWith("url(") || !str.endsWith(")")) {
            throw new SAXException("Bad " + str2 + " attribute. Expected \"none\" or \"url()\" format");
        }
        return str.substring(4, str.length() - 1).trim();
    }

    private static List m(String str) {
        bkc bkcVar = new bkc(str);
        ArrayList arrayList = null;
        do {
            String h = bkcVar.h();
            if (h == null) {
                h = bkcVar.j(',');
            }
            if (h == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(h);
            bkcVar.p();
        } while (!bkcVar.n());
        return arrayList;
    }

    private static List n(String str) {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        bkc bkcVar = new bkc(str);
        bkcVar.k();
        while (!bkcVar.n()) {
            float b = bkcVar.b();
            if (!Float.isNaN(b)) {
                int q = bkcVar.q();
                if (q == 0) {
                    q = 1;
                }
                arrayList.add(new bho(b, q));
                bkcVar.p();
            } else {
                int i = bkcVar.a;
                while (!bkcVar.n()) {
                    if (bkc.s(((String) bkcVar.c).charAt(bkcVar.a))) {
                        break;
                    }
                    bkcVar.a++;
                }
                String substring = ((String) bkcVar.c).substring(i, bkcVar.a);
                bkcVar.a = i;
                throw new SAXException("Invalid length list value: ".concat(String.valueOf(substring)));
            }
        }
        return arrayList;
    }

    private final void o(Attributes attributes) {
        bii biiVar = this.b;
        if (biiVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        bhd bhdVar = new bhd();
        bhdVar.t = this.a;
        bhdVar.u = biiVar;
        B(bhdVar, attributes);
        D(bhdVar, attributes);
        J(bhdVar, attributes);
        A(bhdVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            int ordinal = bka.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                bhdVar.a = a(trim);
            } else if (ordinal == 7) {
                bhdVar.b = a(trim);
            } else if (ordinal != 49) {
                continue;
            } else {
                bhdVar.c = a(trim);
                if (bhdVar.c.e()) {
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.b.b(bhdVar);
    }

    private final void p(Attributes attributes) {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        bhe bheVar = new bhe();
        bheVar.t = this.a;
        bheVar.u = this.b;
        B(bheVar, attributes);
        D(bheVar, attributes);
        J(bheVar, attributes);
        A(bheVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            if (bka.a(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(trim)) {
                    bheVar.a = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    bheVar.a = true;
                } else {
                    throw new SAXException("Invalid value for attribute clipPathUnits");
                }
            }
        }
        this.b.b(bheVar);
        this.b = bheVar;
    }

    private final void q(Attributes attributes) {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        bhh bhhVar = new bhh();
        bhhVar.t = this.a;
        bhhVar.u = this.b;
        B(bhhVar, attributes);
        D(bhhVar, attributes);
        J(bhhVar, attributes);
        this.b.b(bhhVar);
        this.b = bhhVar;
    }

    private final void r(Attributes attributes) {
        bii biiVar = this.b;
        if (biiVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        bhi bhiVar = new bhi();
        bhiVar.t = this.a;
        bhiVar.u = biiVar;
        B(bhiVar, attributes);
        D(bhiVar, attributes);
        J(bhiVar, attributes);
        A(bhiVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            int ordinal = bka.a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                bhiVar.a = a(trim);
            } else if (ordinal == 7) {
                bhiVar.b = a(trim);
            } else if (ordinal == 56) {
                bhiVar.c = a(trim);
                if (bhiVar.c.e()) {
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (ordinal != 57) {
                continue;
            } else {
                bhiVar.d = a(trim);
                if (bhiVar.d.e()) {
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
        this.b.b(bhiVar);
    }

    private final void s(Attributes attributes) {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        bhl bhlVar = new bhl();
        bhlVar.t = this.a;
        bhlVar.u = this.b;
        B(bhlVar, attributes);
        D(bhlVar, attributes);
        J(bhlVar, attributes);
        A(bhlVar, attributes);
        this.b.b(bhlVar);
        this.b = bhlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t(org.xml.sax.Attributes r6) {
        /*
            r5 = this;
            bii r0 = r5.b
            if (r0 == 0) goto La5
            bhn r0 = new bhn
            r0.<init>()
            bjd r1 = r5.a
            r0.t = r1
            bii r1 = r5.b
            r0.u = r1
            B(r0, r6)
            D(r0, r6)
            J(r0, r6)
            A(r0, r6)
            r1 = 0
        L1e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L9d
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            bka r3 = defpackage.bka.CLASS
            bkb r3 = defpackage.bkb.svg
            java.lang.String r3 = r6.getLocalName(r1)
            bka r3 = defpackage.bka.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L84
            r4 = 26
            if (r3 == r4) goto L75
            r4 = 48
            if (r3 == r4) goto L71
            switch(r3) {
                case 81: goto L5a;
                case 82: goto L53;
                case 83: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L92
        L4c:
            bho r2 = a(r2)
            r0.c = r2
            goto L92
        L53:
            bho r2 = a(r2)
            r0.b = r2
            goto L92
        L5a:
            bho r2 = a(r2)
            r0.d = r2
            bho r2 = r0.d
            boolean r2 = r2.e()
            if (r2 != 0) goto L69
            goto L92
        L69:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L71:
            x(r0, r2)
            goto L92
        L75:
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            java.lang.String r4 = r6.getURI(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L92
            r0.a = r2
            goto L92
        L84:
            bho r2 = a(r2)
            r0.e = r2
            bho r2 = r0.e
            boolean r2 = r2.e()
            if (r2 != 0) goto L95
        L92:
            int r1 = r1 + 1
            goto L1e
        L95:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L9d:
            bii r6 = r5.b
            r6.b(r0)
            r5.b = r0
            return
        La5:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            goto Lae
        Lad:
            throw r6
        Lae:
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkd.t(org.xml.sax.Attributes):void");
    }

    private final void u(Attributes attributes) {
        bii biiVar = this.b;
        if (biiVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        bhp bhpVar = new bhp();
        bhpVar.t = this.a;
        bhpVar.u = biiVar;
        B(bhpVar, attributes);
        D(bhpVar, attributes);
        J(bhpVar, attributes);
        A(bhpVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            bka bkaVar = bka.CLASS;
            bkb bkbVar = bkb.svg;
            switch (bka.a(attributes.getLocalName(i)).ordinal()) {
                case 84:
                    bhpVar.a = a(trim);
                    break;
                case 85:
                    bhpVar.b = a(trim);
                    break;
                case 86:
                    bhpVar.c = a(trim);
                    break;
                case 87:
                    bhpVar.d = a(trim);
                    break;
            }
        }
        this.b.b(bhpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(org.xml.sax.Attributes r7) {
        /*
            r6 = this;
            bii r0 = r6.b
            if (r0 == 0) goto Ld0
            bhq r0 = new bhq
            r0.<init>()
            bjd r1 = r6.a
            r0.t = r1
            bii r1 = r6.b
            r0.u = r1
            B(r0, r7)
            D(r0, r7)
            A(r0, r7)
            F(r0, r7)
            r1 = 0
            r2 = 0
        L1f:
            int r3 = r7.getLength()
            if (r2 >= r3) goto Lc8
            java.lang.String r3 = r7.getValue(r2)
            java.lang.String r3 = r3.trim()
            bka r4 = defpackage.bka.CLASS
            bkb r4 = defpackage.bkb.svg
            java.lang.String r4 = r7.getLocalName(r2)
            bka r4 = defpackage.bka.a(r4)
            int r4 = r4.ordinal()
            r5 = 41
            if (r4 == r5) goto La9
            r5 = 50
            if (r4 == r5) goto La2
            r5 = 51
            if (r4 == r5) goto L9b
            switch(r4) {
                case 32: goto L84;
                case 33: goto L65;
                case 34: goto L4e;
                default: goto L4c;
            }
        L4c:
            goto Lc4
        L4e:
            bho r3 = a(r3)
            r0.d = r3
            bho r3 = r0.d
            boolean r3 = r3.e()
            if (r3 != 0) goto L5d
            goto Lc4
        L5d:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            r7.<init>(r0)
            throw r7
        L65:
            java.lang.String r4 = "strokeWidth"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L70
            r0.a = r1
            goto Lc4
        L70:
            java.lang.String r4 = "userSpaceOnUse"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L7c
            r3 = 1
            r0.a = r3
            goto Lc4
        L7c:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            r7.<init>(r0)
            throw r7
        L84:
            bho r3 = a(r3)
            r0.e = r3
            bho r3 = r0.e
            boolean r3 = r3.e()
            if (r3 != 0) goto L93
            goto Lc4
        L93:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            r7.<init>(r0)
            throw r7
        L9b:
            bho r3 = a(r3)
            r0.c = r3
            goto Lc4
        La2:
            bho r3 = a(r3)
            r0.b = r3
            goto Lc4
        La9:
            java.lang.String r4 = "auto"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto Lba
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
            goto Lc4
        Lba:
            float r3 = d(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
        Lc4:
            int r2 = r2 + 1
            goto L1f
        Lc8:
            bii r7 = r6.b
            r7.b(r0)
            r6.b = r0
            return
        Ld0:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r7.<init>(r0)
            goto Ld9
        Ld8:
            throw r7
        Ld9:
            goto Ld8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkd.v(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(org.xml.sax.Attributes r8) {
        /*
            r7 = this;
            bii r0 = r7.b
            if (r0 == 0) goto Lb8
            bhr r0 = new bhr
            r0.<init>()
            bjd r1 = r7.a
            r0.t = r1
            bii r1 = r7.b
            r0.u = r1
            B(r0, r8)
            D(r0, r8)
            A(r0, r8)
            r1 = 0
        L1b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lb0
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            bka r3 = defpackage.bka.CLASS
            bkb r3 = defpackage.bkb.svg
            java.lang.String r3 = r8.getLocalName(r1)
            bka r3 = defpackage.bka.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L96
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L81
            r4 = 37
            if (r3 == r4) goto L6c
            switch(r3) {
                case 81: goto L55;
                case 82: goto L51;
                case 83: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto La4
        L4d:
            a(r2)
            goto La4
        L51:
            a(r2)
            goto La4
        L55:
            bho r2 = a(r2)
            r0.a = r2
            bho r2 = r0.a
            boolean r2 = r2.e()
            if (r2 != 0) goto L64
            goto La4
        L64:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L6c:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La4
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L79
            goto La4
        L79:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L81:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La4
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8e
            goto La4
        L8e:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        L96:
            bho r2 = a(r2)
            r0.b = r2
            bho r2 = r0.b
            boolean r2 = r2.e()
            if (r2 != 0) goto La8
        La4:
            int r1 = r1 + 1
            goto L1b
        La8:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        Lb0:
            bii r8 = r7.b
            r8.b(r0)
            r7.b = r0
            return
        Lb8:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            goto Lc1
        Lc0:
            throw r8
        Lc1:
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkd.w(org.xml.sax.Attributes):void");
    }

    private static void x(bio bioVar, String str) {
        int i;
        bkc bkcVar = new bkc(str);
        bkcVar.k();
        String i2 = bkcVar.i();
        if ("defer".equals(i2)) {
            bkcVar.k();
            i2 = bkcVar.i();
        }
        bgy bgyVar = (bgy) bjw.a.get(i2);
        bkcVar.k();
        if (!bkcVar.n()) {
            String i3 = bkcVar.i();
            if (i3.equals("meet")) {
                i = 1;
            } else if (!i3.equals("slice")) {
                throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        bioVar.v = new bgz(bgyVar, i);
    }

    private static int y(String str) {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if (!"evenodd".equals(str)) {
            throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
        }
        return 2;
    }

    private static int z(String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        if ("normal".equals(str)) {
            return 1;
        }
        return "oblique".equals(str) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bjd b(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new GZIPInputStream(inputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        try {
            try {
                try {
                    try {
                        XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(this);
                        xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                        xMLReader.parse(new InputSource(inputStream));
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                            Log.e("SVGParser", "Exception thrown closing input stream");
                        }
                        return this.a;
                    } catch (SAXException e) {
                        String message = e.getMessage();
                        throw new bjv("SVG parse error: " + message, e);
                    }
                } catch (ParserConfigurationException e2) {
                    throw new bjv("XML Parser problem", e2);
                }
            } catch (IOException e3) {
                throw new bjv("File error", e3);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
            throw th;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else {
            bii biiVar = this.b;
            if (!(biiVar instanceof bix)) {
                return;
            }
            big bigVar = (big) biiVar;
            int size = bigVar.i.size();
            bim bimVar = size == 0 ? null : (bim) bigVar.i.get(size - 1);
            if (bimVar instanceof bja) {
                bja bjaVar = (bja) bimVar;
                bjaVar.a = String.valueOf(bjaVar.a).concat(new String(cArr, i, i2));
                return;
            }
            ((big) this.b).b(new bja(new String(cArr, i, i2)));
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        if (!this.c && this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            bka bkaVar = bka.CLASS;
            switch (bkb.a(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((bim) this.b).u;
                    return;
                case 1:
                case 2:
                case 6:
                case 9:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                case 15:
                case 16:
                case 18:
                case 27:
                default:
                    return;
                case 5:
                case 26:
                    this.e = false;
                    bkb bkbVar = this.f;
                    if (bkbVar == bkb.title) {
                        this.g.toString();
                    } else if (bkbVar == bkb.desc) {
                        this.g.toString();
                    }
                    this.g.setLength(0);
                    return;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb == null) {
                        return;
                    }
                    this.h = false;
                    String sb2 = sb.toString();
                    hxf hxfVar = new hxf(bgr.screen);
                    bjd bjdVar = this.a;
                    bkc bkcVar = new bkc(sb2, (byte[]) null);
                    bkcVar.k();
                    bjdVar.c.a(hxfVar.d(bkcVar));
                    this.i.setLength(0);
                    return;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.a = new bjd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x046b, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0632, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0aa0, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0983 A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void startElement(java.lang.String r24, java.lang.String r25, java.lang.String r26, org.xml.sax.Attributes r27) {
        /*
            Method dump skipped, instructions count: 2956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkd.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }
}
