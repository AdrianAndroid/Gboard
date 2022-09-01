package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* compiled from: PG */
/* renamed from: bjo  reason: default package */
/* loaded from: classes.dex */
public final class bjo {
    private static HashSet j;
    public final Canvas a;
    public final bhb b;
    public bhf c;
    public bhf d;
    public bjd e;
    public bjk f;
    public Stack g;
    public Stack h;
    public Stack i;

    /* JADX INFO: Access modifiers changed from: protected */
    public bjo(Canvas canvas, bhb bhbVar) {
        this.a = canvas;
        this.b = bhbVar;
    }

    private final void A(bhj bhjVar, String str) {
        bim d = bhjVar.t.d(str);
        if (d == null) {
            h("Gradient reference '%s' not found", str);
        } else if (!(d instanceof bhj)) {
            e("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (d == bhjVar) {
            e("Circular reference in gradient href attribute '%s'", str);
        } else {
            bhj bhjVar2 = (bhj) d;
            if (bhjVar.b == null) {
                bhjVar.b = bhjVar2.b;
            }
            if (bhjVar.c == null) {
                bhjVar.c = bhjVar2.c;
            }
            if (bhjVar.e == 0) {
                bhjVar.e = bhjVar2.e;
            }
            if (bhjVar.a.isEmpty()) {
                bhjVar.a = bhjVar2.a;
            }
            try {
                if (bhjVar instanceof bil) {
                    bil bilVar = (bil) bhjVar;
                    bil bilVar2 = (bil) d;
                    if (bilVar.f == null) {
                        bilVar.f = bilVar2.f;
                    }
                    if (bilVar.g == null) {
                        bilVar.g = bilVar2.g;
                    }
                    if (bilVar.h == null) {
                        bilVar.h = bilVar2.h;
                    }
                    if (bilVar.i == null) {
                        bilVar.i = bilVar2.i;
                    }
                } else {
                    bip bipVar = (bip) bhjVar;
                    bip bipVar2 = (bip) d;
                    if (bipVar.f == null) {
                        bipVar.f = bipVar2.f;
                    }
                    if (bipVar.g == null) {
                        bipVar.g = bipVar2.g;
                    }
                    if (bipVar.h == null) {
                        bipVar.h = bipVar2.h;
                    }
                    if (bipVar.i == null) {
                        bipVar.i = bipVar2.i;
                    }
                    if (bipVar.j == null) {
                        bipVar.j = bipVar2.j;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str2 = bhjVar2.d;
            if (str2 == null) {
                return;
            }
            A(bhjVar, str2);
        }
    }

    private final void B(bhx bhxVar, String str) {
        bim d = bhxVar.t.d(str);
        if (d == null) {
            h("Pattern reference '%s' not found", str);
        } else if (!(d instanceof bhx)) {
            e("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (d == bhxVar) {
            e("Circular reference in pattern href attribute '%s'", str);
        } else {
            bhx bhxVar2 = (bhx) d;
            if (bhxVar.a == null) {
                bhxVar.a = bhxVar2.a;
            }
            if (bhxVar.b == null) {
                bhxVar.b = bhxVar2.b;
            }
            if (bhxVar.c == null) {
                bhxVar.c = bhxVar2.c;
            }
            if (bhxVar.d == null) {
                bhxVar.d = bhxVar2.d;
            }
            if (bhxVar.e == null) {
                bhxVar.e = bhxVar2.e;
            }
            if (bhxVar.f == null) {
                bhxVar.f = bhxVar2.f;
            }
            if (bhxVar.g == null) {
                bhxVar.g = bhxVar2.g;
            }
            if (bhxVar.i.isEmpty()) {
                bhxVar.i = bhxVar2.i;
            }
            if (bhxVar.w == null) {
                bhxVar.w = bhxVar2.w;
            }
            if (bhxVar.v == null) {
                bhxVar.v = bhxVar2.v;
            }
            String str2 = bhxVar2.h;
            if (str2 == null) {
                return;
            }
            B(bhxVar, str2);
        }
    }

    private static synchronized void C() {
        synchronized (bjo.class) {
            HashSet hashSet = new HashSet();
            j = hashSet;
            hashSet.add("Structure");
            j.add("BasicStructure");
            j.add("ConditionalProcessing");
            j.add("Image");
            j.add("Style");
            j.add("ViewportAttribute");
            j.add("Shape");
            j.add("BasicText");
            j.add("PaintAttribute");
            j.add("BasicPaintAttribute");
            j.add("OpacityAttribute");
            j.add("BasicGraphicsAttribute");
            j.add("Marker");
            j.add("Gradient");
            j.add("Pattern");
            j.add("Clip");
            j.add("BasicClip");
            j.add("Mask");
            j.add("View");
        }
    }

    private final void D() {
        this.h.pop();
        this.i.pop();
    }

    private final void E(bii biiVar) {
        this.h.push(biiVar);
        this.i.push(this.a.getMatrix());
    }

    private final void F(bim bimVar) {
        bho bhoVar;
        bho bhoVar2;
        Path.FillType fillType;
        bho bhoVar3;
        int indexOf;
        Set g;
        bho bhoVar4;
        if (bimVar instanceof bhs) {
            return;
        }
        M();
        d(bimVar);
        if (bimVar instanceof bie) {
            bie bieVar = (bie) bimVar;
            G(bieVar, bieVar.c, bieVar.d);
        } else {
            float f = 0.0f;
            if (bimVar instanceof bjb) {
                bjb bjbVar = (bjb) bimVar;
                bho bhoVar5 = bjbVar.e;
                if ((bhoVar5 == null || !bhoVar5.f()) && ((bhoVar4 = bjbVar.f) == null || !bhoVar4.f())) {
                    O(this.f, bjbVar);
                    if (Q()) {
                        bim d = bjbVar.t.d(bjbVar.a);
                        if (d == null) {
                            e("Use reference '%s' not found", bjbVar.a);
                        } else {
                            Matrix matrix = bjbVar.b;
                            if (matrix != null) {
                                this.a.concat(matrix);
                            }
                            Matrix matrix2 = new Matrix();
                            bho bhoVar6 = bjbVar.c;
                            float c = bhoVar6 != null ? bhoVar6.c(this) : 0.0f;
                            bho bhoVar7 = bjbVar.d;
                            matrix2.preTranslate(c, bhoVar7 != null ? bhoVar7.d(this) : 0.0f);
                            this.a.concat(matrix2);
                            s(bjbVar);
                            boolean R = R();
                            E(bjbVar);
                            if (d instanceof bie) {
                                M();
                                bie bieVar2 = (bie) d;
                                bho bhoVar8 = bjbVar.e;
                                if (bhoVar8 == null) {
                                    bhoVar8 = bieVar2.c;
                                }
                                bho bhoVar9 = bjbVar.f;
                                if (bhoVar9 == null) {
                                    bhoVar9 = bieVar2.d;
                                }
                                G(bieVar2, bhoVar8, bhoVar9);
                                L();
                            } else if (d instanceof bis) {
                                bho bhoVar10 = bjbVar.e;
                                if (bhoVar10 == null) {
                                    bhoVar10 = new bho(100.0f, 9);
                                }
                                bho bhoVar11 = bjbVar.f;
                                if (bhoVar11 == null) {
                                    bhoVar11 = new bho(100.0f, 9);
                                }
                                M();
                                bis bisVar = (bis) d;
                                if (!bhoVar10.f() && !bhoVar11.f()) {
                                    bgz bgzVar = bisVar.v;
                                    if (bgzVar == null) {
                                        bgzVar = bgz.b;
                                    }
                                    O(this.f, bisVar);
                                    float c2 = bhoVar10.c(this);
                                    float c3 = bhoVar11.c(this);
                                    bjk bjkVar = this.f;
                                    bjkVar.f = new bhb(0.0f, 0.0f, c2, c3);
                                    if (!bjkVar.a.o.booleanValue()) {
                                        bhb bhbVar = this.f.f;
                                        K(bhbVar.a, bhbVar.b, bhbVar.c, bhbVar.d);
                                    }
                                    bhb bhbVar2 = bisVar.w;
                                    if (bhbVar2 != null) {
                                        this.a.concat(U(this.f.f, bhbVar2, bgzVar));
                                        this.f.g = bisVar.w;
                                    }
                                    boolean R2 = R();
                                    H(bisVar, true);
                                    if (R2) {
                                        Z();
                                    }
                                    N(bisVar);
                                }
                                L();
                            } else {
                                F(d);
                            }
                            D();
                            if (R) {
                                Z();
                            }
                            N(bjbVar);
                        }
                    }
                }
            } else if (bimVar instanceof bir) {
                bir birVar = (bir) bimVar;
                O(this.f, birVar);
                if (Q()) {
                    Matrix matrix3 = birVar.b;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    s(birVar);
                    boolean R3 = R();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = birVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        bim bimVar2 = (bim) it.next();
                        if (bimVar2 instanceof bif) {
                            bif bifVar = (bif) bimVar2;
                            if (bifVar.c() == null && ((g = bifVar.g()) == null || (!g.isEmpty() && g.contains(language)))) {
                                Set d2 = bifVar.d();
                                if (d2 != null) {
                                    if (j == null) {
                                        C();
                                    }
                                    if (!d2.isEmpty() && j.containsAll(d2)) {
                                    }
                                }
                                Set f2 = bifVar.f();
                                if (f2 == null) {
                                    Set e = bifVar.e();
                                    if (e != null) {
                                        e.isEmpty();
                                    } else {
                                        F(bimVar2);
                                        break;
                                    }
                                } else {
                                    f2.isEmpty();
                                }
                            }
                        }
                    }
                    if (R3) {
                        Z();
                    }
                    N(birVar);
                }
            } else if (bimVar instanceof bhl) {
                bhl bhlVar = (bhl) bimVar;
                O(this.f, bhlVar);
                if (Q()) {
                    Matrix matrix4 = bhlVar.b;
                    if (matrix4 != null) {
                        this.a.concat(matrix4);
                    }
                    s(bhlVar);
                    boolean R4 = R();
                    H(bhlVar, true);
                    if (R4) {
                        Z();
                    }
                    N(bhlVar);
                }
            } else {
                Bitmap bitmap = null;
                if (bimVar instanceof bhn) {
                    bhn bhnVar = (bhn) bimVar;
                    bho bhoVar12 = bhnVar.d;
                    if (bhoVar12 != null && !bhoVar12.f() && (bhoVar3 = bhnVar.e) != null && !bhoVar3.f() && bhnVar.a != null) {
                        bgz bgzVar2 = bhnVar.v;
                        if (bgzVar2 == null) {
                            bgzVar2 = bgz.b;
                        }
                        String str = bhnVar.a;
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) != -1 && indexOf >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        }
                        if (bitmap != null) {
                            O(this.f, bhnVar);
                            if (Q() && i()) {
                                Matrix matrix5 = bhnVar.f;
                                if (matrix5 != null) {
                                    this.a.concat(matrix5);
                                }
                                bho bhoVar13 = bhnVar.b;
                                float c4 = bhoVar13 != null ? bhoVar13.c(this) : 0.0f;
                                bho bhoVar14 = bhnVar.c;
                                float d3 = bhoVar14 != null ? bhoVar14.d(this) : 0.0f;
                                float c5 = bhnVar.d.c(this);
                                float c6 = bhnVar.e.c(this);
                                bjk bjkVar2 = this.f;
                                bjkVar2.f = new bhb(c4, d3, c5, c6);
                                if (!bjkVar2.a.o.booleanValue()) {
                                    bhb bhbVar3 = this.f.f;
                                    K(bhbVar3.a, bhbVar3.b, bhbVar3.c, bhbVar3.d);
                                }
                                bhnVar.n = new bhb(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                                this.a.concat(U(this.f.f, bhnVar.n, bgzVar2));
                                N(bhnVar);
                                s(bhnVar);
                                boolean R5 = R();
                                P();
                                this.a.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
                                if (R5) {
                                    Z();
                                }
                            }
                        }
                    }
                } else if (bimVar instanceof bhu) {
                    bhu bhuVar = (bhu) bimVar;
                    if (bhuVar.a != null) {
                        O(this.f, bhuVar);
                        if (Q() && i()) {
                            bjk bjkVar3 = this.f;
                            if (bjkVar3.c || bjkVar3.b) {
                                Matrix matrix6 = bhuVar.e;
                                if (matrix6 != null) {
                                    this.a.concat(matrix6);
                                }
                                Path path = new bjg(bhuVar.a).a;
                                if (bhuVar.n == null) {
                                    bhuVar.n = T(path);
                                }
                                N(bhuVar);
                                u(bhuVar);
                                s(bhuVar);
                                boolean R6 = R();
                                bjk bjkVar4 = this.f;
                                if (bjkVar4.b) {
                                    if (bjkVar4.a.D == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        bgy bgyVar = bgy.None;
                                        int i = this.f.a.D;
                                        int i2 = i - 1;
                                        if (i == 0) {
                                            throw null;
                                        }
                                        fillType = i2 != 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                                    }
                                    path.setFillType(fillType);
                                    w(bhuVar, path);
                                }
                                if (this.f.c) {
                                    x(path);
                                }
                                J(bhuVar);
                                if (R6) {
                                    Z();
                                }
                            }
                        }
                    }
                } else if (bimVar instanceof bia) {
                    bia biaVar = (bia) bimVar;
                    bho bhoVar15 = biaVar.c;
                    if (bhoVar15 != null && (bhoVar2 = biaVar.d) != null && !bhoVar15.f() && !bhoVar2.f()) {
                        O(this.f, biaVar);
                        if (Q() && i()) {
                            Matrix matrix7 = biaVar.e;
                            if (matrix7 != null) {
                                this.a.concat(matrix7);
                            }
                            Path o = o(biaVar);
                            N(biaVar);
                            u(biaVar);
                            s(biaVar);
                            boolean R7 = R();
                            if (this.f.b) {
                                w(biaVar, o);
                            }
                            if (this.f.c) {
                                x(o);
                            }
                            if (R7) {
                                Z();
                            }
                        }
                    }
                } else if (bimVar instanceof bhd) {
                    bhd bhdVar = (bhd) bimVar;
                    bho bhoVar16 = bhdVar.c;
                    if (bhoVar16 != null && !bhoVar16.f()) {
                        O(this.f, bhdVar);
                        if (Q() && i()) {
                            Matrix matrix8 = bhdVar.e;
                            if (matrix8 != null) {
                                this.a.concat(matrix8);
                            }
                            Path l = l(bhdVar);
                            N(bhdVar);
                            u(bhdVar);
                            s(bhdVar);
                            boolean R8 = R();
                            if (this.f.b) {
                                w(bhdVar, l);
                            }
                            if (this.f.c) {
                                x(l);
                            }
                            if (R8) {
                                Z();
                            }
                        }
                    }
                } else if (bimVar instanceof bhi) {
                    bhi bhiVar = (bhi) bimVar;
                    bho bhoVar17 = bhiVar.c;
                    if (bhoVar17 != null && (bhoVar = bhiVar.d) != null && !bhoVar17.f() && !bhoVar.f()) {
                        O(this.f, bhiVar);
                        if (Q() && i()) {
                            Matrix matrix9 = bhiVar.e;
                            if (matrix9 != null) {
                                this.a.concat(matrix9);
                            }
                            Path m = m(bhiVar);
                            N(bhiVar);
                            u(bhiVar);
                            s(bhiVar);
                            boolean R9 = R();
                            if (this.f.b) {
                                w(bhiVar, m);
                            }
                            if (this.f.c) {
                                x(m);
                            }
                            if (R9) {
                                Z();
                            }
                        }
                    }
                } else if (bimVar instanceof bhp) {
                    bhp bhpVar = (bhp) bimVar;
                    O(this.f, bhpVar);
                    if (Q() && i() && this.f.c) {
                        Matrix matrix10 = bhpVar.e;
                        if (matrix10 != null) {
                            this.a.concat(matrix10);
                        }
                        bho bhoVar18 = bhpVar.a;
                        float c7 = bhoVar18 == null ? 0.0f : bhoVar18.c(this);
                        bho bhoVar19 = bhpVar.b;
                        float d4 = bhoVar19 == null ? 0.0f : bhoVar19.d(this);
                        bho bhoVar20 = bhpVar.c;
                        float c8 = bhoVar20 == null ? 0.0f : bhoVar20.c(this);
                        bho bhoVar21 = bhpVar.d;
                        if (bhoVar21 != null) {
                            f = bhoVar21.d(this);
                        }
                        if (bhpVar.n == null) {
                            bhpVar.n = new bhb(Math.min(c7, d4), Math.min(d4, f), Math.abs(c8 - c7), Math.abs(f - d4));
                        }
                        Path path2 = new Path();
                        path2.moveTo(c7, d4);
                        path2.lineTo(c8, f);
                        N(bhpVar);
                        u(bhpVar);
                        s(bhpVar);
                        boolean R10 = R();
                        x(path2);
                        J(bhpVar);
                        if (R10) {
                            Z();
                        }
                    }
                } else if (bimVar instanceof bhz) {
                    bhz bhzVar = (bhz) bimVar;
                    O(this.f, bhzVar);
                    if (Q() && i()) {
                        bjk bjkVar5 = this.f;
                        if (bjkVar5.c || bjkVar5.b) {
                            Matrix matrix11 = bhzVar.e;
                            if (matrix11 != null) {
                                this.a.concat(matrix11);
                            }
                            if (bhzVar.a.length >= 2) {
                                Path n = n(bhzVar);
                                N(bhzVar);
                                u(bhzVar);
                                s(bhzVar);
                                boolean R11 = R();
                                if (this.f.b) {
                                    w(bhzVar, n);
                                }
                                if (this.f.c) {
                                    x(n);
                                }
                                J(bhzVar);
                                if (R11) {
                                    Z();
                                }
                            }
                        }
                    }
                } else if (bimVar instanceof bhy) {
                    bhy bhyVar = (bhy) bimVar;
                    O(this.f, bhyVar);
                    if (Q() && i()) {
                        bjk bjkVar6 = this.f;
                        if (bjkVar6.c || bjkVar6.b) {
                            Matrix matrix12 = bhyVar.e;
                            if (matrix12 != null) {
                                this.a.concat(matrix12);
                            }
                            if (bhyVar.a.length >= 2) {
                                Path n2 = n(bhyVar);
                                N(bhyVar);
                                u(bhyVar);
                                s(bhyVar);
                                boolean R12 = R();
                                if (this.f.b) {
                                    w(bhyVar, n2);
                                }
                                if (this.f.c) {
                                    x(n2);
                                }
                                J(bhyVar);
                                if (R12) {
                                    Z();
                                }
                            }
                        }
                    }
                } else if (bimVar instanceof biv) {
                    biv bivVar = (biv) bimVar;
                    O(this.f, bivVar);
                    if (Q()) {
                        Matrix matrix13 = bivVar.a;
                        if (matrix13 != null) {
                            this.a.concat(matrix13);
                        }
                        List list = bivVar.b;
                        float c9 = (list == null || list.size() == 0) ? 0.0f : ((bho) bivVar.b.get(0)).c(this);
                        List list2 = bivVar.c;
                        float d5 = (list2 == null || list2.size() == 0) ? 0.0f : ((bho) bivVar.c.get(0)).d(this);
                        List list3 = bivVar.d;
                        float c10 = (list3 == null || list3.size() == 0) ? 0.0f : ((bho) bivVar.d.get(0)).c(this);
                        List list4 = bivVar.e;
                        if (list4 != null && list4.size() != 0) {
                            f = ((bho) bivVar.e.get(0)).d(this);
                        }
                        int S = S();
                        if (S != 1) {
                            float j2 = j(bivVar);
                            if (S == 2) {
                                j2 /= 2.0f;
                            }
                            c9 -= j2;
                        }
                        if (bivVar.n == null) {
                            bjl bjlVar = new bjl(this, c9, d5);
                            y(bivVar, bjlVar);
                            bivVar.n = new bhb(bjlVar.c.left, bjlVar.c.top, bjlVar.c.width(), bjlVar.c.height());
                        }
                        N(bivVar);
                        u(bivVar);
                        s(bivVar);
                        boolean R13 = R();
                        y(bivVar, new bji(this, c9 + c10, d5 + f));
                        if (R13) {
                            Z();
                        }
                    }
                }
            }
        }
        L();
    }

    private final void G(bie bieVar, bho bhoVar, bho bhoVar2) {
        f(bieVar, bhoVar, bhoVar2, bieVar.w, bieVar.v);
    }

    private final void H(bii biiVar, boolean z) {
        if (z) {
            E(biiVar);
        }
        for (bim bimVar : biiVar.n()) {
            F(bimVar);
        }
        if (z) {
            D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[PHI: r1 
      PHI: (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:51:0x00f4, B:53:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(defpackage.bhq r12, defpackage.bjf r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjo.I(bhq, bjf):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014f A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e A[LOOP:0: B:36:0x016e->B:38:0x0172, LOOP_START, PHI: r5 
      PHI: (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:35:0x016c, B:38:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void J(defpackage.bhk r18) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjo.J(bhk):void");
    }

    private final void K(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        bhc bhcVar = this.f.a.p;
        if (bhcVar != null) {
            f += ((bho) bhcVar.d).c(this);
            f2 += ((bho) this.f.a.p.a).d(this);
            f5 -= ((bho) this.f.a.p.b).c(this);
            f6 -= ((bho) this.f.a.p.c).d(this);
        }
        this.a.clipRect(f, f2, f5, f6);
    }

    private final void L() {
        this.a.restore();
        this.f = (bjk) this.g.pop();
    }

    private final void M() {
        this.a.save();
        this.g.push(this.f);
        this.f = (bjk) this.f.clone();
    }

    private final void N(bij bijVar) {
        if (bijVar.u == null || bijVar.n == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (!((Matrix) this.i.peek()).invert(matrix)) {
            return;
        }
        bhb bhbVar = bijVar.n;
        bhb bhbVar2 = bijVar.n;
        bhb bhbVar3 = bijVar.n;
        float[] fArr = {bhbVar.a, bhbVar.b, bhbVar.a(), bhbVar2.b, bhbVar2.a(), bijVar.n.b(), bhbVar3.a, bhbVar3.b()};
        matrix.preConcat(this.a.getMatrix());
        matrix.mapPoints(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        RectF rectF = new RectF(f, f2, f, f2);
        for (int i = 2; i <= 6; i += 2) {
            if (fArr[i] < rectF.left) {
                rectF.left = fArr[i];
            }
            if (fArr[i] > rectF.right) {
                rectF.right = fArr[i];
            }
            int i2 = i + 1;
            if (fArr[i2] < rectF.top) {
                rectF.top = fArr[i2];
            }
            if (fArr[i2] > rectF.bottom) {
                rectF.bottom = fArr[i2];
            }
        }
        bij bijVar2 = (bij) this.h.peek();
        bhb bhbVar4 = bijVar2.n;
        if (bhbVar4 == null) {
            bijVar2.n = bhb.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
            return;
        }
        bhb c = bhb.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
        float f3 = c.a;
        float f4 = bhbVar4.a;
        if (f3 < f4) {
            bhbVar4.a = f3;
        } else {
            f3 = f4;
        }
        float f5 = c.b;
        float f6 = bhbVar4.b;
        if (f5 < f6) {
            bhbVar4.b = f5;
        } else {
            f5 = f6;
        }
        if (c.a() > bhbVar4.a()) {
            bhbVar4.c = c.a() - f3;
        }
        if (c.b() <= bhbVar4.b()) {
            return;
        }
        bhbVar4.d = c.b() - f5;
    }

    private final void O(bjk bjkVar, bik bikVar) {
        boolean b;
        bii biiVar = bikVar.u;
        bid bidVar = bjkVar.a;
        bidVar.t = Boolean.TRUE;
        bidVar.o = biiVar == null ? Boolean.TRUE : Boolean.FALSE;
        bidVar.p = null;
        bidVar.x = null;
        Float valueOf = Float.valueOf(1.0f);
        bidVar.j = valueOf;
        bidVar.v = bhf.a;
        bidVar.w = valueOf;
        bidVar.y = null;
        bidVar.z = null;
        bidVar.A = valueOf;
        bidVar.B = null;
        bidVar.C = valueOf;
        bidVar.L = 1;
        bid bidVar2 = bikVar.q;
        if (bidVar2 != null) {
            g(bjkVar, bidVar2);
        }
        List list = this.e.c.a;
        if (list != null && !list.isEmpty()) {
            for (bgs bgsVar : this.e.c.a) {
                bgu bguVar = bgsVar.a;
                ArrayList arrayList = new ArrayList();
                for (bii biiVar2 = bikVar.u; biiVar2 != null; biiVar2 = ((bim) biiVar2).u) {
                    arrayList.add(0, biiVar2);
                }
                int size = arrayList.size() - 1;
                if (bguVar.a() == 1) {
                    b = hxf.c(bguVar.b(0), arrayList, size, bikVar);
                } else {
                    b = hxf.b(bguVar, bguVar.a() - 1, arrayList, size, bikVar);
                }
                if (b) {
                    g(bjkVar, bgsVar.b);
                }
            }
        }
        bid bidVar3 = bikVar.r;
        if (bidVar3 != null) {
            g(bjkVar, bidVar3);
        }
    }

    private final void P() {
        int i;
        bid bidVar = this.f.a;
        bin binVar = bidVar.B;
        if (binVar instanceof bhf) {
            i = ((bhf) binVar).b;
        } else if (!(binVar instanceof bhg)) {
            return;
        } else {
            i = bidVar.k.b;
        }
        Float f = bidVar.C;
        if (f != null) {
            i |= W(f.floatValue()) << 24;
        }
        this.a.drawColor(i);
    }

    private final boolean Q() {
        Boolean bool = this.f.a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean R() {
        bjk bjkVar = this.f;
        if (bjkVar.a.y != null) {
            boolean z = bjkVar.i;
            h("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.f.a.j.floatValue() >= 1.0f) {
            bjk bjkVar2 = this.f;
            if (bjkVar2.a.y != null) {
                boolean z2 = bjkVar2.i;
            }
            return false;
        }
        this.a.saveLayerAlpha(null, W(this.f.a.j.floatValue()), 31);
        this.g.push(this.f);
        bjk bjkVar3 = (bjk) this.f.clone();
        this.f = bjkVar3;
        if (bjkVar3.a.y == null) {
            return true;
        }
        boolean z3 = bjkVar3.i;
        return true;
    }

    private final int S() {
        int i;
        bid bidVar = this.f.a;
        if (bidVar.I == 1 || (i = bidVar.J) == 2) {
            return bidVar.J;
        }
        return i == 1 ? 3 : 1;
    }

    private static final bhb T(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new bhb(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r7 != 9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[PHI: r4 
      PHI: (r4v2 float) = (r4v1 float), (r4v3 float) binds: [B:23:0x0066, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.graphics.Matrix U(defpackage.bhb r9, defpackage.bhb r10, defpackage.bgz r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8e
            bgy r1 = r11.c
            if (r1 != 0) goto Ld
            goto L8e
        Ld:
            float r1 = r9.c
            float r2 = r10.c
            float r1 = r1 / r2
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r10.a
            float r3 = -r3
            float r4 = r10.b
            float r4 = -r4
            bgz r5 = defpackage.bgz.a
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L81
            int r5 = r11.d
            r6 = 2
            if (r5 != r6) goto L2f
            float r1 = java.lang.Math.max(r1, r2)
            goto L33
        L2f:
            float r1 = java.lang.Math.min(r1, r2)
        L33:
            float r2 = r9.c
            float r2 = r2 / r1
            float r5 = r9.d
            float r5 = r5 / r1
            bgy r7 = defpackage.bgy.None
            bgy r7 = r11.c
            int r7 = r7.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L5b
            r6 = 3
            if (r7 == r6) goto L57
            r6 = 5
            if (r7 == r6) goto L5b
            r6 = 6
            if (r7 == r6) goto L57
            r6 = 8
            if (r7 == r6) goto L5b
            r6 = 9
            if (r7 == r6) goto L57
            goto L60
        L57:
            float r6 = r10.c
            float r6 = r6 - r2
            goto L5f
        L5b:
            float r6 = r10.c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L5f:
            float r3 = r3 - r6
        L60:
            bgy r11 = r11.c
            int r11 = r11.ordinal()
            switch(r11) {
                case 4: goto L6e;
                case 5: goto L6e;
                case 6: goto L6e;
                case 7: goto L6a;
                case 8: goto L6a;
                case 9: goto L6a;
                default: goto L69;
            }
        L69:
            goto L73
        L6a:
            float r10 = r10.d
            float r10 = r10 - r5
            goto L72
        L6e:
            float r10 = r10.d
            float r10 = r10 - r5
            float r10 = r10 / r8
        L72:
            float r4 = r4 - r10
        L73:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
            return r0
        L81:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjo.U(bhb, bhb, bgz):android.graphics.Matrix");
    }

    private static final Typeface V(String str, Integer num, int i) {
        int i2 = 2;
        if (num.intValue() > 500) {
            i2 = i == 2 ? 3 : 1;
        } else if (i != 2) {
            i2 = 0;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i2);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i2);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("fantasy")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        return null;
    }

    private static final int W(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i <= 255) {
            return i;
        }
        return 255;
    }

    private final void X(bim bimVar, bjk bjkVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (bimVar instanceof bik) {
                arrayList.add(0, (bik) bimVar);
            }
            bii biiVar = bimVar.u;
            if (biiVar == null) {
                break;
            }
            bimVar = (bim) biiVar;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O(bjkVar, (bik) arrayList.get(i));
        }
        bjkVar.g = this.e.a.w;
        if (bjkVar.g == null) {
            bjkVar.g = this.b;
        }
        bjkVar.f = this.b;
        boolean z = this.f.i;
        bjkVar.i = false;
    }

    private static final boolean Y(bid bidVar, long j2) {
        return (j2 & bidVar.a) != 0;
    }

    private final void Z() {
        bjk bjkVar = this.f;
        if (bjkVar.a.y != null) {
            boolean z = bjkVar.i;
        }
        L();
    }

    private static final void aa(bjk bjkVar, boolean z, bin binVar) {
        int i;
        bid bidVar = bjkVar.a;
        float floatValue = (z ? bidVar.c : bidVar.e).floatValue();
        if (binVar instanceof bhf) {
            i = ((bhf) binVar).b;
        } else if (!(binVar instanceof bhg)) {
            return;
        } else {
            i = bjkVar.a.k.b;
        }
        int W = i | (W(floatValue) << 24);
        if (z) {
            bjkVar.d.setColor(W);
        } else {
            bjkVar.e.setColor(W);
        }
    }

    public static void e(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private final float j(bix bixVar) {
        bjn bjnVar = new bjn(this);
        y(bixVar, bjnVar);
        return bjnVar.a;
    }

    private final Path.FillType k() {
        if (this.f.a.K == 0) {
            return Path.FillType.WINDING;
        }
        bgy bgyVar = bgy.None;
        int i = this.f.a.K;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        return i2 != 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private final Path l(bhd bhdVar) {
        bho bhoVar = bhdVar.a;
        float f = 0.0f;
        float c = bhoVar != null ? bhoVar.c(this) : 0.0f;
        bho bhoVar2 = bhdVar.b;
        if (bhoVar2 != null) {
            f = bhoVar2.d(this);
        }
        float a = bhdVar.c.a(this);
        float f2 = c - a;
        float f3 = f - a;
        float f4 = c + a;
        float f5 = f + a;
        if (bhdVar.n == null) {
            float f6 = a + a;
            bhdVar.n = new bhb(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * a;
        Path path = new Path();
        path.moveTo(c, f3);
        float f8 = c + f7;
        float f9 = f - f7;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path.cubicTo(f4, f10, f8, f5, c, f5);
        float f11 = c - f7;
        path.cubicTo(f11, f5, f2, f10, f2, f);
        path.cubicTo(f2, f9, f11, f3, c, f3);
        path.close();
        return path;
    }

    private final Path m(bhi bhiVar) {
        bho bhoVar = bhiVar.a;
        float f = 0.0f;
        float c = bhoVar != null ? bhoVar.c(this) : 0.0f;
        bho bhoVar2 = bhiVar.b;
        if (bhoVar2 != null) {
            f = bhoVar2.d(this);
        }
        float c2 = bhiVar.c.c(this);
        float d = bhiVar.d.d(this);
        float f2 = c - c2;
        float f3 = f - d;
        float f4 = c + c2;
        float f5 = f + d;
        if (bhiVar.n == null) {
            bhiVar.n = new bhb(f2, f3, c2 + c2, d + d);
        }
        float f6 = c2 * 0.5522848f;
        float f7 = 0.5522848f * d;
        Path path = new Path();
        path.moveTo(c, f3);
        float f8 = c + f6;
        float f9 = f - f7;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f7 + f;
        path.cubicTo(f4, f10, f8, f5, c, f5);
        float f11 = c - f6;
        path.cubicTo(f11, f5, f2, f10, f2, f);
        path.cubicTo(f2, f9, f11, f3, c, f3);
        path.close();
        return path;
    }

    private final Path n(bhy bhyVar) {
        Path path = new Path();
        float[] fArr = bhyVar.a;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = bhyVar.a;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (bhyVar instanceof bhz) {
            path.close();
        }
        if (bhyVar.n == null) {
            bhyVar.n = T(path);
        }
        path.setFillType(k());
        return path;
    }

    private final Path o(bia biaVar) {
        float c;
        float d;
        Path path;
        bho bhoVar = biaVar.f;
        if (bhoVar == null && biaVar.g == null) {
            c = 0.0f;
            d = 0.0f;
        } else {
            if (bhoVar == null) {
                c = biaVar.g.d(this);
            } else if (biaVar.g == null) {
                c = bhoVar.c(this);
            } else {
                c = bhoVar.c(this);
                d = biaVar.g.d(this);
            }
            d = c;
        }
        float min = Math.min(c, biaVar.c.c(this) / 2.0f);
        float min2 = Math.min(d, biaVar.d.d(this) / 2.0f);
        bho bhoVar2 = biaVar.a;
        float c2 = bhoVar2 != null ? bhoVar2.c(this) : 0.0f;
        bho bhoVar3 = biaVar.b;
        float d2 = bhoVar3 != null ? bhoVar3.d(this) : 0.0f;
        float c3 = biaVar.c.c(this);
        float d3 = biaVar.d.d(this);
        if (biaVar.n == null) {
            biaVar.n = new bhb(c2, d2, c3, d3);
        }
        float f = c2 + c3;
        float f2 = d2 + d3;
        Path path2 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path = path2;
            path.moveTo(c2, d2);
            path.lineTo(f, d2);
            path.lineTo(f, f2);
            path.lineTo(c2, f2);
            path.lineTo(c2, d2);
        } else {
            float f3 = min * 0.5522848f;
            float f4 = 0.5522848f * min2;
            float f5 = d2 + min2;
            path2.moveTo(c2, f5);
            float f6 = f5 - f4;
            float f7 = c2 + min;
            float f8 = f7 - f3;
            path2.cubicTo(c2, f6, f8, d2, f7, d2);
            float f9 = f - min;
            path2.lineTo(f9, d2);
            float f10 = f9 + f3;
            path2.cubicTo(f10, d2, f, f6, f, f5);
            float f11 = f2 - min2;
            path2.lineTo(f, f11);
            float f12 = f11 + f4;
            path = path2;
            path2.cubicTo(f, f12, f10, f2, f9, f2);
            path.lineTo(f7, f2);
            path.cubicTo(f8, f2, c2, f12, c2, f11);
            path.lineTo(c2, f5);
        }
        path.close();
        return path;
    }

    private final bjk p(bim bimVar) {
        bjk bjkVar = new bjk();
        g(bjkVar, bid.a());
        X(bimVar, bjkVar);
        return bjkVar;
    }

    private final String q(String str, boolean z, boolean z2) {
        if (this.f.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private final void r(bim bimVar, boolean z, Path path, Matrix matrix) {
        Path n;
        if (Q()) {
            this.a.save();
            this.g.push(this.f);
            bjk bjkVar = (bjk) this.f.clone();
            this.f = bjkVar;
            if (bimVar instanceof bjb) {
                if (z) {
                    bjb bjbVar = (bjb) bimVar;
                    O(bjkVar, bjbVar);
                    if (Q() && i()) {
                        Matrix matrix2 = bjbVar.b;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        bim d = bjbVar.t.d(bjbVar.a);
                        if (d == null) {
                            e("Use reference '%s' not found", bjbVar.a);
                        } else {
                            s(bjbVar);
                            r(d, false, path, matrix);
                        }
                    }
                } else {
                    e("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (bimVar instanceof bhu) {
                bhu bhuVar = (bhu) bimVar;
                O(bjkVar, bhuVar);
                if (Q() && i()) {
                    Matrix matrix3 = bhuVar.e;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path2 = new bjg(bhuVar.a).a;
                    if (bhuVar.n == null) {
                        bhuVar.n = T(path2);
                    }
                    s(bhuVar);
                    path.setFillType(k());
                    path.addPath(path2, matrix);
                }
            } else if (bimVar instanceof biv) {
                biv bivVar = (biv) bimVar;
                O(bjkVar, bivVar);
                if (Q()) {
                    Matrix matrix4 = bivVar.a;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = bivVar.b;
                    float f = 0.0f;
                    float c = (list == null || list.size() == 0) ? 0.0f : ((bho) bivVar.b.get(0)).c(this);
                    List list2 = bivVar.c;
                    float d2 = (list2 == null || list2.size() == 0) ? 0.0f : ((bho) bivVar.c.get(0)).d(this);
                    List list3 = bivVar.d;
                    float c2 = (list3 == null || list3.size() == 0) ? 0.0f : ((bho) bivVar.d.get(0)).c(this);
                    List list4 = bivVar.e;
                    if (list4 != null && list4.size() != 0) {
                        f = ((bho) bivVar.e.get(0)).d(this);
                    }
                    if (this.f.a.J != 1) {
                        float j2 = j(bivVar);
                        if (this.f.a.J == 2) {
                            j2 /= 2.0f;
                        }
                        c -= j2;
                    }
                    if (bivVar.n == null) {
                        bjl bjlVar = new bjl(this, c, d2);
                        y(bivVar, bjlVar);
                        bivVar.n = new bhb(bjlVar.c.left, bjlVar.c.top, bjlVar.c.width(), bjlVar.c.height());
                    }
                    s(bivVar);
                    Path path3 = new Path();
                    y(bivVar, new bjj(this, c + c2, d2 + f, path3));
                    path.setFillType(k());
                    path.addPath(path3, matrix);
                }
            } else if (bimVar instanceof bhk) {
                bhk bhkVar = (bhk) bimVar;
                O(bjkVar, bhkVar);
                if (Q() && i()) {
                    Matrix matrix5 = bhkVar.e;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (bhkVar instanceof bia) {
                        n = o((bia) bhkVar);
                    } else if (bhkVar instanceof bhd) {
                        n = l((bhd) bhkVar);
                    } else if (bhkVar instanceof bhi) {
                        n = m((bhi) bhkVar);
                    } else if (bhkVar instanceof bhy) {
                        n = n((bhy) bhkVar);
                    }
                    s(bhkVar);
                    path.setFillType(n.getFillType());
                    path.addPath(n, matrix);
                }
            } else {
                e("Invalid %s element found in clipPath definition", bimVar.getClass().getSimpleName());
            }
            this.a.restore();
            this.f = (bjk) this.g.pop();
        }
    }

    private final void s(bij bijVar) {
        t(bijVar, bijVar.n);
    }

    private final void t(bij bijVar, bhb bhbVar) {
        String str = this.f.a.x;
        if (str == null) {
            return;
        }
        bim d = bijVar.t.d(str);
        if (d == null) {
            e("ClipPath reference '%s' not found", this.f.a.x);
            return;
        }
        bhe bheVar = (bhe) d;
        if (bheVar.i.isEmpty()) {
            this.a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = bheVar.a;
        boolean z = bool == null || bool.booleanValue();
        if ((bijVar instanceof bhl) && !z) {
            h("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", bijVar.getClass().getSimpleName());
            return;
        }
        this.g.push(this.f);
        this.f = (bjk) this.f.clone();
        Matrix matrix = new Matrix();
        if (!z) {
            Matrix matrix2 = new Matrix();
            matrix2.preTranslate(bhbVar.a, bhbVar.b);
            matrix2.preScale(bhbVar.c, bhbVar.d);
            this.a.concat(matrix2);
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
        Matrix matrix4 = bheVar.b;
        if (matrix4 != null) {
            this.a.concat(matrix4);
            Matrix matrix5 = new Matrix();
            if (matrix4.invert(matrix5)) {
                matrix.postConcat(matrix5);
            }
        }
        this.f = p(bheVar);
        s(bheVar);
        Path path = new Path();
        for (bim bimVar : bheVar.i) {
            r(bimVar, true, path, new Matrix());
        }
        this.a.clipPath(path);
        this.f = (bjk) this.g.pop();
        this.a.concat(matrix);
    }

    private final void u(bij bijVar) {
        bin binVar = this.f.a.b;
        if (binVar instanceof bht) {
            v(true, bijVar.n, (bht) binVar);
        }
        bin binVar2 = this.f.a.d;
        if (binVar2 instanceof bht) {
            v(false, bijVar.n, (bht) binVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(boolean r25, defpackage.bhb r26, defpackage.bht r27) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjo.v(boolean, bhb, bht):void");
    }

    private final void w(bij bijVar, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        bin binVar = this.f.a.b;
        if (binVar instanceof bht) {
            bim d = this.e.d(((bht) binVar).a);
            if (d instanceof bhx) {
                bhx bhxVar = (bhx) d;
                Boolean bool = bhxVar.a;
                boolean z = bool != null && bool.booleanValue();
                String str = bhxVar.h;
                if (str != null) {
                    B(bhxVar, str);
                }
                if (z) {
                    bho bhoVar = bhxVar.d;
                    f = bhoVar != null ? bhoVar.c(this) : 0.0f;
                    bho bhoVar2 = bhxVar.e;
                    f3 = bhoVar2 != null ? bhoVar2.d(this) : 0.0f;
                    bho bhoVar3 = bhxVar.f;
                    f4 = bhoVar3 != null ? bhoVar3.c(this) : 0.0f;
                    bho bhoVar4 = bhxVar.g;
                    f2 = bhoVar4 != null ? bhoVar4.d(this) : 0.0f;
                } else {
                    bho bhoVar5 = bhxVar.d;
                    float b = bhoVar5 != null ? bhoVar5.b(this, 1.0f) : 0.0f;
                    bho bhoVar6 = bhxVar.e;
                    float b2 = bhoVar6 != null ? bhoVar6.b(this, 1.0f) : 0.0f;
                    bho bhoVar7 = bhxVar.f;
                    float b3 = bhoVar7 != null ? bhoVar7.b(this, 1.0f) : 0.0f;
                    bho bhoVar8 = bhxVar.g;
                    float b4 = bhoVar8 != null ? bhoVar8.b(this, 1.0f) : 0.0f;
                    bhb bhbVar = bijVar.n;
                    float f5 = bhbVar.a;
                    float f6 = bhbVar.c;
                    f = (b * f6) + f5;
                    float f7 = bhbVar.b;
                    float f8 = bhbVar.d;
                    float f9 = b3 * f6;
                    f2 = b4 * f8;
                    f3 = (b2 * f8) + f7;
                    f4 = f9;
                }
                if (f4 == 0.0f || f2 == 0.0f) {
                    return;
                }
                bgz bgzVar = bhxVar.v;
                if (bgzVar == null) {
                    bgzVar = bgz.b;
                }
                M();
                this.a.clipPath(path);
                bjk bjkVar = new bjk();
                g(bjkVar, bid.a());
                bjkVar.a.o = false;
                X(bhxVar, bjkVar);
                this.f = bjkVar;
                bhb bhbVar2 = bijVar.n;
                Matrix matrix = bhxVar.c;
                if (matrix != null) {
                    this.a.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (bhxVar.c.invert(matrix2)) {
                        bhb bhbVar3 = bijVar.n;
                        bhb bhbVar4 = bijVar.n;
                        bhb bhbVar5 = bijVar.n;
                        float[] fArr = {bhbVar3.a, bhbVar3.b, bhbVar3.a(), bhbVar4.b, bhbVar4.a(), bijVar.n.b(), bhbVar5.a, bhbVar5.b()};
                        matrix2.mapPoints(fArr);
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        RectF rectF = new RectF(f10, f11, f10, f11);
                        for (int i = 2; i <= 6; i += 2) {
                            if (fArr[i] < rectF.left) {
                                rectF.left = fArr[i];
                            }
                            if (fArr[i] > rectF.right) {
                                rectF.right = fArr[i];
                            }
                            int i2 = i + 1;
                            if (fArr[i2] < rectF.top) {
                                rectF.top = fArr[i2];
                            }
                            if (fArr[i2] > rectF.bottom) {
                                rectF.bottom = fArr[i2];
                            }
                        }
                        bhbVar2 = new bhb(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                    }
                }
                float floor = f + (((float) Math.floor((bhbVar2.a - f) / f4)) * f4);
                float a = bhbVar2.a();
                float b5 = bhbVar2.b();
                bhb bhbVar6 = new bhb(0.0f, 0.0f, f4, f2);
                for (float floor2 = f3 + (((float) Math.floor((bhbVar2.b - f3) / f2)) * f2); floor2 < b5; floor2 += f2) {
                    for (float f12 = floor; f12 < a; f12 += f4) {
                        bhbVar6.a = f12;
                        bhbVar6.b = floor2;
                        M();
                        if (!this.f.a.o.booleanValue()) {
                            K(bhbVar6.a, bhbVar6.b, bhbVar6.c, bhbVar6.d);
                        }
                        bhb bhbVar7 = bhxVar.w;
                        if (bhbVar7 != null) {
                            this.a.concat(U(bhbVar6, bhbVar7, bgzVar));
                        } else {
                            Boolean bool2 = bhxVar.b;
                            boolean z2 = bool2 == null || bool2.booleanValue();
                            this.a.translate(f12, floor2);
                            if (!z2) {
                                Canvas canvas = this.a;
                                bhb bhbVar8 = bijVar.n;
                                canvas.scale(bhbVar8.c, bhbVar8.d);
                            }
                        }
                        boolean R = R();
                        for (bim bimVar : bhxVar.i) {
                            F(bimVar);
                        }
                        if (R) {
                            Z();
                        }
                        L();
                    }
                }
                L();
                return;
            }
        }
        this.a.drawPath(path, this.f.d);
    }

    private final void x(Path path) {
        bjk bjkVar = this.f;
        if (bjkVar.a.L == 2) {
            Matrix matrix = this.a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.a.setMatrix(new Matrix());
            Shader shader = this.f.e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.a.drawPath(path2, this.f.e);
            this.a.setMatrix(matrix);
            if (shader == null) {
                return;
            }
            shader.setLocalMatrix(matrix2);
            return;
        }
        this.a.drawPath(path, bjkVar.e);
    }

    private final void y(bix bixVar, bjm bjmVar) {
        float f;
        float f2;
        float f3;
        if (!Q()) {
            return;
        }
        Iterator it = bixVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            bim bimVar = (bim) it.next();
            if (!(bimVar instanceof bja)) {
                if (bjmVar.b((bix) bimVar)) {
                    float f4 = 0.0f;
                    if (bimVar instanceof biy) {
                        M();
                        biy biyVar = (biy) bimVar;
                        O(this.f, biyVar);
                        if (Q() && i()) {
                            bim d = biyVar.t.d(biyVar.a);
                            if (d == null) {
                                e("TextPath reference '%s' not found", biyVar.a);
                            } else {
                                bhu bhuVar = (bhu) d;
                                Path path = new bjg(bhuVar.a).a;
                                Matrix matrix = bhuVar.e;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                bho bhoVar = biyVar.b;
                                if (bhoVar != null) {
                                    f4 = bhoVar.b(this, pathMeasure.getLength());
                                }
                                int S = S();
                                if (S != 1) {
                                    float j2 = j(biyVar);
                                    if (S == 2) {
                                        j2 /= 2.0f;
                                    }
                                    f4 -= j2;
                                }
                                u(biyVar.c);
                                boolean R = R();
                                y(biyVar, new bjh(this, path, f4));
                                if (R) {
                                    Z();
                                }
                            }
                        }
                        L();
                    } else if (bimVar instanceof biu) {
                        M();
                        biu biuVar = (biu) bimVar;
                        O(this.f, biuVar);
                        if (Q()) {
                            boolean z2 = bjmVar instanceof bji;
                            if (z2) {
                                List list = biuVar.b;
                                float c = (list == null || list.size() == 0) ? ((bji) bjmVar).b : ((bho) biuVar.b.get(0)).c(this);
                                List list2 = biuVar.c;
                                f2 = (list2 == null || list2.size() == 0) ? ((bji) bjmVar).c : ((bho) biuVar.c.get(0)).d(this);
                                List list3 = biuVar.d;
                                f3 = (list3 == null || list3.size() == 0) ? 0.0f : ((bho) biuVar.d.get(0)).c(this);
                                List list4 = biuVar.e;
                                if (list4 != null && list4.size() != 0) {
                                    f4 = ((bho) biuVar.e.get(0)).d(this);
                                }
                                float f5 = c;
                                f = f4;
                                f4 = f5;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            u(biuVar.a);
                            if (z2) {
                                bji bjiVar = (bji) bjmVar;
                                bjiVar.b = f4 + f3;
                                bjiVar.c = f2 + f;
                            }
                            boolean R2 = R();
                            y(biuVar, bjmVar);
                            if (R2) {
                                Z();
                            }
                        }
                        L();
                    } else if (bimVar instanceof bit) {
                        M();
                        bit bitVar = (bit) bimVar;
                        O(this.f, bitVar);
                        if (Q()) {
                            u(bitVar.b);
                            bim d2 = bimVar.t.d(bitVar.a);
                            if (d2 == null || !(d2 instanceof bix)) {
                                e("Tref reference '%s' not found", bitVar.a);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                z((bix) d2, sb);
                                if (sb.length() > 0) {
                                    bjmVar.a(sb.toString());
                                }
                            }
                        }
                        L();
                    }
                }
            } else {
                bjmVar.a(q(((bja) bimVar).a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private final void z(bix bixVar, StringBuilder sb) {
        Iterator it = bixVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            bim bimVar = (bim) it.next();
            if (bimVar instanceof bix) {
                z((bix) bimVar, sb);
            } else if (bimVar instanceof bja) {
                sb.append(q(((bja) bimVar).a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float a() {
        return this.f.d.getTextSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bhb b() {
        bjk bjkVar = this.f;
        bhb bhbVar = bjkVar.g;
        return bhbVar != null ? bhbVar : bjkVar.f;
    }

    public final void d(bim bimVar) {
        Boolean bool;
        if ((bimVar instanceof bik) && (bool = ((bik) bimVar).p) != null) {
            this.f.h = bool.booleanValue();
        }
    }

    public final void f(bie bieVar, bho bhoVar, bho bhoVar2, bhb bhbVar, bgz bgzVar) {
        float f;
        if (bhoVar == null || !bhoVar.f()) {
            if (bhoVar2 != null && bhoVar2.f()) {
                return;
            }
            if (bgzVar == null && (bgzVar = bieVar.v) == null) {
                bgzVar = bgz.b;
            }
            O(this.f, bieVar);
            if (!Q()) {
                return;
            }
            float f2 = 0.0f;
            if (bieVar.u != null) {
                bho bhoVar3 = bieVar.a;
                float c = bhoVar3 != null ? bhoVar3.c(this) : 0.0f;
                bho bhoVar4 = bieVar.b;
                if (bhoVar4 != null) {
                    f2 = bhoVar4.d(this);
                }
                float f3 = f2;
                f2 = c;
                f = f3;
            } else {
                f = 0.0f;
            }
            bhb b = b();
            float c2 = bhoVar != null ? bhoVar.c(this) : b.c;
            float d = bhoVar2 != null ? bhoVar2.d(this) : b.d;
            bjk bjkVar = this.f;
            bjkVar.f = new bhb(f2, f, c2, d);
            if (!bjkVar.a.o.booleanValue()) {
                bhb bhbVar2 = this.f.f;
                K(bhbVar2.a, bhbVar2.b, bhbVar2.c, bhbVar2.d);
            }
            t(bieVar, this.f.f);
            if (bhbVar != null) {
                this.a.concat(U(this.f.f, bhbVar, bgzVar));
                this.f.g = bieVar.w;
            } else {
                this.a.translate(f2, f);
            }
            boolean R = R();
            P();
            H(bieVar, true);
            if (R) {
                Z();
            }
            N(bieVar);
        }
    }

    public final void g(bjk bjkVar, bid bidVar) {
        bhf bhfVar;
        bhf bhfVar2;
        bid bidVar2;
        if (Y(bidVar, 4096L)) {
            bjkVar.a.k = bidVar.k;
        }
        if (Y(bidVar, 2048L)) {
            bjkVar.a.j = bidVar.j;
        }
        if (Y(bidVar, 1L)) {
            bjkVar.a.b = bidVar.b;
            bjkVar.b = bidVar.b != null;
        }
        if (Y(bidVar, 4L)) {
            bjkVar.a.c = bidVar.c;
        }
        if (Y(bidVar, 6149L)) {
            aa(bjkVar, true, bjkVar.a.b);
        }
        if (Y(bidVar, 2L)) {
            bjkVar.a.D = bidVar.D;
        }
        if (Y(bidVar, 8L)) {
            bjkVar.a.d = bidVar.d;
            bjkVar.c = bidVar.d != null;
        }
        if (Y(bidVar, 16L)) {
            bjkVar.a.e = bidVar.e;
        }
        if (Y(bidVar, 6168L)) {
            aa(bjkVar, false, bjkVar.a.d);
        }
        if (Y(bidVar, 34359738368L)) {
            bjkVar.a.L = bidVar.L;
        }
        if (Y(bidVar, 32L)) {
            bid bidVar3 = bjkVar.a;
            bidVar3.f = bidVar.f;
            bjkVar.e.setStrokeWidth(bidVar3.f.a(this));
        }
        Typeface typeface = null;
        if (Y(bidVar, 64L)) {
            bjkVar.a.E = bidVar.E;
            bgy bgyVar = bgy.None;
            int i = bidVar.E;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                bjkVar.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 1) {
                bjkVar.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 2) {
                bjkVar.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Y(bidVar, 128L)) {
            bjkVar.a.F = bidVar.F;
            bgy bgyVar2 = bgy.None;
            int i3 = bidVar.F;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                bjkVar.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i4 == 1) {
                bjkVar.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i4 == 2) {
                bjkVar.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Y(bidVar, 256L)) {
            bjkVar.a.g = bidVar.g;
            bjkVar.e.setStrokeMiter(bidVar.g.floatValue());
        }
        if (Y(bidVar, 512L)) {
            bjkVar.a.h = bidVar.h;
        }
        if (Y(bidVar, 1024L)) {
            bjkVar.a.i = bidVar.i;
        }
        if (Y(bidVar, 1536L)) {
            bho[] bhoVarArr = bjkVar.a.h;
            if (bhoVarArr == null) {
                bjkVar.e.setPathEffect(null);
            } else {
                int length = bhoVarArr.length;
                int i5 = (length & 1) == 0 ? length : length + length;
                float[] fArr = new float[i5];
                float f = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    float a = bjkVar.a.h[i6 % length].a(this);
                    fArr[i6] = a;
                    f += a;
                }
                if (f == 0.0f) {
                    bjkVar.e.setPathEffect(null);
                } else {
                    float a2 = bjkVar.a.i.a(this);
                    if (a2 < 0.0f) {
                        a2 = (a2 % f) + f;
                    }
                    bjkVar.e.setPathEffect(new DashPathEffect(fArr, a2));
                }
            }
        }
        if (Y(bidVar, 16384L)) {
            float a3 = a();
            bjkVar.a.m = bidVar.m;
            bjkVar.d.setTextSize(bidVar.m.b(this, a3));
            bjkVar.e.setTextSize(bidVar.m.b(this, a3));
        }
        if (Y(bidVar, 8192L)) {
            bjkVar.a.l = bidVar.l;
        }
        if (Y(bidVar, 32768L)) {
            if (bidVar.n.intValue() != -1 || bjkVar.a.n.intValue() <= 100) {
                if (bidVar.n.intValue() != 1 || bjkVar.a.n.intValue() >= 900) {
                    bjkVar.a.n = bidVar.n;
                } else {
                    bid bidVar4 = bjkVar.a;
                    bidVar4.n = Integer.valueOf(bidVar4.n.intValue() + 100);
                }
            } else {
                bjkVar.a.n = Integer.valueOf(bidVar2.n.intValue() - 100);
            }
        }
        if (Y(bidVar, 65536L)) {
            bjkVar.a.G = bidVar.G;
        }
        if (Y(bidVar, 106496L)) {
            List<String> list = bjkVar.a.l;
            if (list != null && this.e != null) {
                for (String str : list) {
                    bid bidVar5 = bjkVar.a;
                    typeface = V(str, bidVar5.n, bidVar5.G);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                bid bidVar6 = bjkVar.a;
                typeface = V("sans-serif", bidVar6.n, bidVar6.G);
            }
            bjkVar.d.setTypeface(typeface);
            bjkVar.e.setTypeface(typeface);
        }
        if (Y(bidVar, 131072L)) {
            bjkVar.a.H = bidVar.H;
            bjkVar.d.setStrikeThruText(bidVar.H == 4);
            bjkVar.d.setUnderlineText(bidVar.H == 2);
            bjkVar.e.setStrikeThruText(bidVar.H == 4);
            bjkVar.e.setUnderlineText(bidVar.H == 2);
        }
        if (Y(bidVar, 68719476736L)) {
            bjkVar.a.I = bidVar.I;
        }
        if (Y(bidVar, 262144L)) {
            bjkVar.a.J = bidVar.J;
        }
        if (Y(bidVar, 524288L)) {
            bjkVar.a.o = bidVar.o;
        }
        if (Y(bidVar, 2097152L)) {
            bjkVar.a.q = bidVar.q;
        }
        if (Y(bidVar, 4194304L)) {
            bjkVar.a.r = bidVar.r;
        }
        if (Y(bidVar, 8388608L)) {
            bjkVar.a.s = bidVar.s;
        }
        if (Y(bidVar, 16777216L)) {
            bjkVar.a.t = bidVar.t;
        }
        if (Y(bidVar, 33554432L)) {
            bjkVar.a.u = bidVar.u;
        }
        if (Y(bidVar, 1048576L)) {
            bjkVar.a.p = bidVar.p;
        }
        if (Y(bidVar, 268435456L)) {
            bjkVar.a.x = bidVar.x;
        }
        if (Y(bidVar, 536870912L)) {
            bjkVar.a.K = bidVar.K;
        }
        if (Y(bidVar, 1073741824L)) {
            bjkVar.a.y = bidVar.y;
        }
        if (Y(bidVar, 67108864L)) {
            bjkVar.a.v = bidVar.v;
        }
        if (Y(bidVar, 134217728L)) {
            bjkVar.a.w = bidVar.w;
        }
        if (Y(bidVar, 8589934592L)) {
            bjkVar.a.B = bidVar.B;
        }
        if (Y(bidVar, 17179869184L)) {
            bjkVar.a.C = bidVar.C;
        }
        if (this.c != null) {
            bjkVar.a.c = Float.valueOf(Color.alpha(bhfVar.b) / 255.0f);
            aa(bjkVar, true, this.c);
        }
        if (this.d != null) {
            bjkVar.a.e = Float.valueOf(Color.alpha(bhfVar2.b) / 255.0f);
            aa(bjkVar, false, this.d);
        }
    }

    public final boolean i() {
        Boolean bool = this.f.a.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static void c(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, bhw bhwVar) {
        float f8;
        bhw bhwVar2;
        float f9;
        float f10;
        float f11;
        float f12;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f) {
            f8 = f6;
            bhwVar2 = bhwVar;
        } else if (f4 != 0.0f) {
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double d = f5;
            Double.isNaN(d);
            double radians = (float) Math.toRadians(d % 360.0d);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f13 = (f - f6) / 2.0f;
            float f14 = (f2 - f7) / 2.0f;
            float f15 = (cos * f13) + (sin * f14);
            float f16 = ((-sin) * f13) + (f14 * cos);
            float f17 = abs * abs;
            float f18 = abs2 * abs2;
            float f19 = f15 * f15;
            float f20 = f16 * f16;
            float f21 = (f19 / f17) + (f20 / f18);
            if (f21 > 1.0f) {
                double d2 = f21;
                f9 = sin;
                abs *= (float) Math.sqrt(d2);
                abs2 *= (float) Math.sqrt(d2);
                f17 = abs * abs;
                f18 = abs2 * abs2;
            } else {
                f9 = sin;
            }
            float f22 = -1.0f;
            float f23 = z == z2 ? -1.0f : 1.0f;
            float f24 = f20 * f17;
            float f25 = f19 * f18;
            float f26 = (((f17 * f18) - f24) - f25) / (f24 + f25);
            if (f26 < 0.0f) {
                f26 = 0.0f;
            }
            double d3 = f23;
            double sqrt = Math.sqrt(f26);
            Double.isNaN(d3);
            float f27 = (float) (d3 * sqrt);
            float f28 = ((abs * f16) / abs2) * f27;
            float f29 = f27 * (-((abs2 * f15) / abs));
            float f30 = ((f + f6) / 2.0f) + ((cos * f28) - (f9 * f29));
            float f31 = ((f2 + f7) / 2.0f) + (f9 * f28) + (cos * f29);
            float f32 = (f15 - f28) / abs;
            float f33 = (f16 - f29) / abs2;
            float f34 = ((-f15) - f28) / abs;
            float f35 = ((-f16) - f29) / abs2;
            float f36 = abs;
            float sqrt2 = (float) Math.sqrt((f32 * f32) + (f33 * f33));
            if (f33 < 0.0f) {
                f11 = f33;
                f12 = -1.0f;
            } else {
                f11 = f33;
                f12 = 1.0f;
            }
            double d4 = f12;
            double acos = Math.acos(f32 / sqrt2);
            Double.isNaN(d4);
            float degrees = (float) Math.toDegrees(d4 * acos);
            float sqrt3 = (float) Math.sqrt(f10 * ((f34 * f34) + (f35 * f35)));
            float f37 = (f32 * f34) + (f11 * f35);
            if ((f32 * f35) - (f11 * f34) >= 0.0f) {
                f22 = 1.0f;
            }
            double d5 = f22;
            double acos2 = Math.acos(f37 / sqrt3);
            Double.isNaN(d5);
            float degrees2 = (float) Math.toDegrees(d5 * acos2);
            if (!z2) {
                if (degrees2 > 0.0f) {
                    degrees2 -= 360.0f;
                }
            } else if (degrees2 < 0.0f) {
                degrees2 += 360.0f;
            }
            double d6 = degrees2 % 360.0f;
            int ceil = (int) Math.ceil(Math.abs(d6) / 90.0d);
            double radians2 = Math.toRadians(degrees % 360.0f);
            double radians3 = Math.toRadians(d6);
            double d7 = ceil;
            Double.isNaN(d7);
            float f38 = (float) (radians3 / d7);
            double d8 = f38;
            Double.isNaN(d8);
            double d9 = d8 / 2.0d;
            double sin2 = (Math.sin(d9) * 1.3333333333333333d) / (Math.cos(d9) + 1.0d);
            int i = ceil * 6;
            float[] fArr = new float[i];
            int i2 = 0;
            int i3 = 0;
            while (i2 < ceil) {
                int i4 = ceil;
                double d10 = i2 * f38;
                Double.isNaN(d10);
                double d11 = d10 + radians2;
                double cos2 = Math.cos(d11);
                double sin3 = Math.sin(d11);
                int i5 = i3 + 1;
                double d12 = radians2;
                fArr[i3] = (float) (cos2 - (sin2 * sin3));
                int i6 = i5 + 1;
                int i7 = i;
                fArr[i5] = (float) (sin3 + (cos2 * sin2));
                Double.isNaN(d8);
                double d13 = d11 + d8;
                double cos3 = Math.cos(d13);
                double sin4 = Math.sin(d13);
                int i8 = i6 + 1;
                fArr[i6] = (float) (cos3 + (sin2 * sin4));
                int i9 = i8 + 1;
                fArr[i8] = (float) (sin4 - (sin2 * cos3));
                int i10 = i9 + 1;
                fArr[i9] = (float) cos3;
                i3 = i10 + 1;
                fArr[i10] = (float) sin4;
                i2++;
                i = i7;
                f30 = f30;
                radians2 = d12;
                f38 = f38;
                ceil = i4;
                d8 = d8;
            }
            int i11 = i;
            Matrix matrix = new Matrix();
            matrix.postScale(f36, abs2);
            matrix.postRotate(f5);
            matrix.postTranslate(f30, f31);
            matrix.mapPoints(fArr);
            if (i11 >= 2) {
                fArr[i11 - 2] = f6;
                fArr[i11 - 1] = f7;
            }
            for (int i12 = 0; i12 < i11; i12 += 6) {
                bhwVar.c(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]);
            }
            return;
        } else {
            bhwVar2 = bhwVar;
            f8 = f6;
        }
        bhwVar2.e(f8, f7);
    }
}
