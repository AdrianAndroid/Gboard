package defpackage;

import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.function.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: drc  reason: default package */
/* loaded from: classes.dex */
public final class drc {
    public static final /* synthetic */ int a = 0;
    private static final llw b;
    private static final llw c;
    private static final llw d;

    static {
        lls h = llw.h();
        h.a(62, ggk.SPACE);
        h.a(66, ggk.VIRTUAL_ENTER);
        h.a(67, ggk.BACKSPACE);
        h.a(21, ggk.VIRTUAL_LEFT);
        h.a(19, ggk.VIRTUAL_UP);
        h.a(22, ggk.VIRTUAL_RIGHT);
        h.a(20, ggk.VIRTUAL_DOWN);
        b = h.l();
        lls h2 = llw.h();
        h2.a(62, ggk.SPACE);
        h2.a(112, ggk.DEL);
        h2.a(67, ggk.BACKSPACE);
        h2.a(124, ggk.INSERT);
        h2.a(214, ggk.HENKAN);
        h2.a(213, ggk.MUHENKAN);
        h2.a(218, ggk.ON);
        h2.a(212, ggk.OFF);
        h2.a(215, ggk.KATAKANA);
        h2.a(211, ggk.HANKAKU);
        h2.a(61, ggk.TAB);
        h2.a(66, ggk.ENTER);
        h2.a(21, ggk.LEFT);
        h2.a(22, ggk.RIGHT);
        h2.a(19, ggk.UP);
        h2.a(20, ggk.DOWN);
        h2.a(111, ggk.ESCAPE);
        h2.a(122, ggk.HOME);
        h2.a(123, ggk.END);
        h2.a(92, ggk.PAGE_UP);
        h2.a(93, ggk.PAGE_DOWN);
        h2.a(154, ggk.DIVIDE);
        h2.a(155, ggk.MULTIPLY);
        h2.a(156, ggk.SUBTRACT);
        h2.a(157, ggk.ADD);
        h2.a(160, ggk.SEPARATOR);
        h2.a(158, ggk.DECIMAL);
        h2.a(144, ggk.NUMPAD0);
        h2.a(145, ggk.NUMPAD1);
        h2.a(146, ggk.NUMPAD2);
        h2.a(147, ggk.NUMPAD3);
        h2.a(148, ggk.NUMPAD4);
        h2.a(149, ggk.NUMPAD5);
        h2.a(150, ggk.NUMPAD6);
        h2.a(151, ggk.NUMPAD7);
        h2.a(152, ggk.NUMPAD8);
        h2.a(153, ggk.NUMPAD9);
        h2.a(131, ggk.F1);
        h2.a(132, ggk.F2);
        h2.a(133, ggk.F3);
        h2.a(134, ggk.F4);
        h2.a(135, ggk.F5);
        h2.a(136, ggk.F6);
        h2.a(137, ggk.F7);
        h2.a(138, ggk.F8);
        h2.a(139, ggk.F9);
        h2.a(140, ggk.F10);
        h2.a(141, ggk.F11);
        h2.a(142, ggk.F12);
        c = h2.l();
        lls h3 = llw.h();
        h3.a(ggi.LEFT_SHIFT, 64);
        h3.a(ggi.RIGHT_SHIFT, 128);
        h3.a(ggi.SHIFT, 1);
        h3.a(ggi.LEFT_CTRL, 8192);
        h3.a(ggi.RIGHT_CTRL, 16384);
        h3.a(ggi.CTRL, 4096);
        h3.a(ggi.LEFT_ALT, 16);
        h3.a(ggi.RIGHT_ALT, 32);
        h3.a(ggi.ALT, 2);
        d = h3.l();
    }

    public static int a(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((Integer) d.getOrDefault((ggi) it.next(), 0)).intValue();
        }
        return i;
    }

    public static ggl b(iay[] iayVarArr, float[] fArr, int i, boolean z) {
        llp g;
        if (z) {
            nfh d2 = d(iayVarArr[0], c, i);
            if (d2 != null) {
                return (ggl) d2.cz();
            }
            return null;
        }
        nfh d3 = d(iayVarArr[0], b, 0);
        if (d3 == null) {
            return null;
        }
        int length = iayVarArr.length;
        jdg.v(length == fArr.length);
        if (length <= 1) {
            g = llp.q();
        } else {
            float[] fArr2 = new float[length];
            float f = 0.0f;
            for (int i2 = 0; i2 < iayVarArr.length; i2++) {
                jdg.v(fArr[i2] <= 0.0f);
                float pow = (float) Math.pow(2.0d, fArr[i2]);
                fArr2[i2] = pow;
                f += pow;
            }
            llk e = llp.e();
            for (int i3 = 0; i3 < iayVarArr.length; i3++) {
                jdg.v(iayVarArr[i3].e instanceof String);
                String str = (String) iayVarArr[i3].e;
                nfh t = ggj.d.t();
                jdg.u(str);
                int codePointAt = str.codePointAt(0);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ggj ggjVar = (ggj) t.b;
                int i4 = ggjVar.a | 1;
                ggjVar.a = i4;
                ggjVar.b = codePointAt;
                float f2 = fArr2[i3];
                ggjVar.a = i4 | 4;
                ggjVar.c = f2 / f;
                e.h((ggj) t.cz());
            }
            g = e.g();
        }
        if (d3.c) {
            d3.cD();
            d3.c = false;
        }
        ggl gglVar = (ggl) d3.b;
        nft nftVar = ggl.e;
        nga ngaVar = gglVar.g;
        if (!ngaVar.c()) {
            gglVar.g = nfm.H(ngaVar);
        }
        ndt.cs(g, gglVar.g);
        return (ggl) d3.cz();
    }

    private static llp c(final int i) {
        return (llp) Collection$EL.stream(d.entrySet()).filter(new Predicate() { // from class: drb
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Objects.requireNonNull(predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Objects.requireNonNull(predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = i;
                int i3 = drc.a;
                return (((Integer) ((Map.Entry) obj).getValue()).intValue() & i2) != 0;
            }
        }).map(byw.t).collect(ljr.a);
    }

    private static nfh d(iay iayVar, llw llwVar, int i) {
        ggk ggkVar = (ggk) llwVar.get(Integer.valueOf(iayVar.c));
        if (ggkVar != null) {
            nfh t = ggl.h.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggl gglVar = (ggl) t.b;
            gglVar.c = ggkVar.aA;
            gglVar.a |= 4;
            t.cQ(c(i));
            return t;
        }
        Object obj = iayVar.e;
        if (obj instanceof CharSequence) {
            String obj2 = obj.toString();
            if (iayVar.c == -10009 || obj2.codePointCount(0, obj2.length()) >= 2) {
                nfh t2 = ggl.h.t();
                String obj3 = iayVar.e.toString();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ggl gglVar2 = (ggl) t2.b;
                obj3.getClass();
                gglVar2.a |= 8;
                gglVar2.f = obj3;
                return t2;
            } else if (obj2.length() > 0) {
                nfh t3 = ggl.h.t();
                int codePointAt = iayVar.e.toString().codePointAt(0);
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                ggl gglVar3 = (ggl) t3.b;
                gglVar3.a |= 1;
                gglVar3.b = codePointAt;
                return t3;
            }
        }
        int i2 = iayVar.c;
        int i3 = (i2 < 29 || i2 > 54) ? (i2 < 7 || i2 > 16) ? 0 : i2 + 41 : i2 + 68;
        if (i3 == 0 || i == 0) {
            return null;
        }
        nfh t4 = ggl.h.t();
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        ggl gglVar4 = (ggl) t4.b;
        gglVar4.a |= 1;
        gglVar4.b = i3;
        t4.cQ(c(i));
        return t4;
    }
}
