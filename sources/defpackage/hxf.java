package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.CheckedTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* renamed from: hxf  reason: default package */
/* loaded from: classes.dex */
public final class hxf {
    public boolean a;
    public final Object b;

    public hxf() {
        this.b = new Handler(Looper.getMainLooper(), new bfe(1));
    }

    public hxf(View view, boolean z) {
        this.b = view;
        this.a = z;
    }

    public hxf(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    public hxf(bgr bgrVar) {
        this.a = false;
        this.b = bgrVar;
    }

    public static boolean a(String str, bgr bgrVar) {
        bkc bkcVar = new bkc(str, (byte[]) null);
        bkcVar.k();
        List k = k(bkcVar);
        if (!bkcVar.n()) {
            throw new SAXException("Invalid @media type list");
        }
        return i(k, bgrVar);
    }

    public static boolean b(bgu bguVar, int i, List list, int i2, bik bikVar) {
        bgv b = bguVar.b(i);
        if (!c(b, list, i2, bikVar)) {
            return false;
        }
        int i3 = b.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return j(bguVar, i - 1, list, i2);
            }
            int h = h(list, i2, bikVar);
            if (h > 0) {
                return b(bguVar, i - 1, list, i2, (bik) bikVar.u.n().get(h - 1));
            }
            return false;
        } else if (i == 0) {
            return true;
        } else {
            while (i2 >= 0) {
                if (j(bguVar, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.bgv r5, java.util.List r6, int r7, defpackage.bik r8) {
        /*
            java.lang.String r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r2 = "G"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L13
            boolean r0 = r8 instanceof defpackage.bhl
            if (r0 == 0) goto L12
            goto L2a
        L12:
            return r1
        L13:
            java.lang.String r0 = r5.a
            java.lang.Class r2 = r8.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2a
            return r1
        L2a:
            java.util.List r0 = r5.b
            if (r0 == 0) goto L63
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r0.next()
            nwo r2 = (defpackage.nwo) r2
            java.lang.Object r3 = r2.b
            java.lang.String r4 = "id"
            if (r3 != r4) goto L51
            java.lang.Object r2 = r2.c
            java.lang.String r3 = r8.o
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L32
            return r1
        L51:
            java.lang.String r4 = "class"
            if (r3 != r4) goto L62
            java.util.List r3 = r8.s
            if (r3 != 0) goto L5a
            return r1
        L5a:
            java.lang.Object r2 = r2.c
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L32
        L62:
            return r1
        L63:
            java.util.List r5 = r5.c
            if (r5 == 0) goto L86
            java.util.Iterator r5 = r5.iterator()
        L6b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "first-child"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L85
            int r0 = h(r6, r7, r8)
            if (r0 == 0) goto L6b
        L85:
            return r1
        L86:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxf.c(bgv, java.util.List, int, bik):boolean");
    }

    private static int h(List list, int i, bik bikVar) {
        if (i < 0) {
            return -1;
        }
        Object obj = list.get(i);
        bii biiVar = bikVar.u;
        if (obj != biiVar) {
            return -1;
        }
        int i2 = 0;
        for (bim bimVar : biiVar.n()) {
            if (bimVar == bikVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean i(List list, bgr bgrVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bgr bgrVar2 = (bgr) it.next();
            if (bgrVar2 == bgr.all) {
                return true;
            }
            if (bgrVar2 == bgrVar) {
                return true;
            }
        }
        return false;
    }

    private static boolean j(bgu bguVar, int i, List list, int i2) {
        bgv b = bguVar.b(i);
        bik bikVar = (bik) list.get(i2);
        if (!c(b, list, i2, bikVar)) {
            return false;
        }
        int i3 = b.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return j(bguVar, i - 1, list, i2 - 1);
            }
            int h = h(list, i2, bikVar);
            if (h > 0) {
                return b(bguVar, i - 1, list, i2, (bik) bikVar.u.n().get(h - 1));
            }
            return false;
        } else if (i == 0) {
            return true;
        } else {
            while (i2 > 0) {
                i2--;
                if (j(bguVar, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static List k(bkc bkcVar) {
        ArrayList arrayList = new ArrayList();
        while (!bkcVar.n()) {
            try {
                arrayList.add(bgr.a(bkcVar.j(',')));
                if (!bkcVar.p()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x027b, code lost:
        if (r11.d() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x027d, code lost:
        r3.add(r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x024e A[EDGE_INSN: B:214:0x024e->B:188:0x024e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0114  */
    /* JADX WARN: Type inference failed for: r14v0, types: [bgv] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [bgv] */
    /* JADX WARN: Type inference failed for: r8v17, types: [bgv] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bgt d(defpackage.bkc r18) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxf.d(bkc):bgt");
    }

    public final synchronized void e(axh axhVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            axhVar.e();
            this.a = false;
            return;
        }
        ((Handler) this.b).obtainMessage(1, axhVar).sendToTarget();
    }

    public final void f() {
        ((CheckedTextView) this.b).getCheckMarkDrawable();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x002e, B:5:0x0034, B:8:0x003a, B:9:0x006b, B:11:0x0072, B:12:0x007d, B:14:0x0084, B:21:0x004d, B:23:0x0053, B:25:0x0059), top: B:2:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x002e, B:5:0x0034, B:8:0x003a, B:9:0x006b, B:11:0x0072, B:12:0x007d, B:14:0x0084, B:21:0x004d, B:23:0x0053, B:25:0x0059), top: B:2:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.util.AttributeSet r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.b
            android.widget.CheckedTextView r0 = (android.widget.CheckedTextView) r0
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.ei.l
            r2 = 2130969302(0x7f0402d6, float:1.7547282E38)
            r3 = 0
            gkn r0 = defpackage.gkn.w(r0, r12, r1, r2, r3)
            java.lang.Object r1 = r11.b
            r2 = r1
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2
            android.content.Context r5 = r2.getContext()
            int[] r6 = defpackage.ei.l
            java.lang.Object r2 = r0.a
            r8 = r2
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            r9 = 2130969302(0x7f0402d6, float:1.7547282E38)
            r10 = 0
            r7 = r12
            defpackage.aad.L(r4, r5, r6, r7, r8, r9, r10)
            r12 = 1
            boolean r1 = r0.t(r12)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L4d
            int r12 = r0.l(r12, r3)     // Catch: java.lang.Throwable -> L99
            if (r12 == 0) goto L4d
            java.lang.Object r1 = r11.b     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            r2 = r1
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.content.Context r2 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.graphics.drawable.Drawable r12 = defpackage.ej.a(r2, r12)     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            r1.setCheckMarkDrawable(r12)     // Catch: android.content.res.Resources.NotFoundException -> L4d java.lang.Throwable -> L99
            goto L6b
        L4d:
            boolean r12 = r0.t(r3)     // Catch: java.lang.Throwable -> L99
            if (r12 == 0) goto L6b
            int r12 = r0.l(r3, r3)     // Catch: java.lang.Throwable -> L99
            if (r12 == 0) goto L6b
            java.lang.Object r1 = r11.b     // Catch: java.lang.Throwable -> L99
            r2 = r1
            android.widget.CheckedTextView r2 = (android.widget.CheckedTextView) r2     // Catch: java.lang.Throwable -> L99
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L99
            android.graphics.drawable.Drawable r12 = defpackage.ej.a(r2, r12)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkDrawable(r12)     // Catch: java.lang.Throwable -> L99
        L6b:
            r12 = 2
            boolean r1 = r0.t(r12)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r11.b     // Catch: java.lang.Throwable -> L99
            android.content.res.ColorStateList r12 = r0.m(r12)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkTintList(r12)     // Catch: java.lang.Throwable -> L99
        L7d:
            r12 = 3
            boolean r1 = r0.t(r12)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L95
            java.lang.Object r1 = r11.b     // Catch: java.lang.Throwable -> L99
            r2 = -1
            int r12 = r0.i(r12, r2)     // Catch: java.lang.Throwable -> L99
            r2 = 0
            android.graphics.PorterDuff$Mode r12 = defpackage.ke.a(r12, r2)     // Catch: java.lang.Throwable -> L99
            android.widget.CheckedTextView r1 = (android.widget.CheckedTextView) r1     // Catch: java.lang.Throwable -> L99
            r1.setCheckMarkTintMode(r12)     // Catch: java.lang.Throwable -> L99
        L95:
            r0.r()
            return
        L99:
            r12 = move-exception
            r0.r()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxf.g(android.util.AttributeSet):void");
    }
}
