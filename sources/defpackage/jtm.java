package defpackage;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jtm  reason: default package */
/* loaded from: classes.dex */
public abstract class jtm {
    public static int l(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i, i2));
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    private final void n(java.io.PrintWriter r17, defpackage.jtk r18, boolean r19, java.util.Set r20) {
        /*
            r16 = this;
            r0 = r17
            llp r1 = r16.b()
            lrl r1 = (defpackage.lrl) r1
            int r1 = r1.c
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r1) goto L1b
            r5 = r18
            java.lang.String r6 = r5.a(r4)
            r2[r4] = r6
            int r4 = r4 + 1
            goto Le
        L1b:
            r4 = r19
            r5 = 0
            r6 = 0
        L1f:
            if (r5 != 0) goto Lca
            r5 = 1
            int r6 = r6 + r5
            r7 = 1
            r8 = 0
        L25:
            if (r8 >= r1) goto Lc0
            r9 = r2[r8]
            if (r9 != 0) goto L2d
            java.lang.String r9 = ""
        L2d:
            int r10 = r9.length()
            llp r11 = r16.h()
            java.lang.Object r11 = r11.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 <= r11) goto L64
            boolean r12 = r16.f()
            if (r12 == 0) goto L58
            java.lang.String r7 = r9.substring(r3, r11)
            int r10 = r9.length()
            java.lang.String r9 = r9.substring(r11, r10)
            r2[r8] = r9
            r9 = r7
            r7 = 0
            goto L67
        L58:
            if (r4 == 0) goto L5d
            r10 = r11
            r12 = 0
            goto L5f
        L5d:
            int r12 = r10 - r11
        L5f:
            java.lang.String r9 = r9.substring(r12, r10)
            goto L67
        L64:
            r10 = 0
            r2[r8] = r10
        L67:
            llp r10 = r16.b()
            java.lang.Object r10 = r10.get(r8)
            jtj r10 = (defpackage.jtj) r10
            boolean r12 = r10.f
            r4 = r4 | r12
            if (r8 != 0) goto L7d
            o(r0, r10)
            r12 = r20
            r8 = 0
            goto L7f
        L7d:
            r12 = r20
        L7f:
            boolean r13 = r12.contains(r10)
            if (r13 != 0) goto Lbd
            if (r6 != r5) goto L8b
            if (r4 != 0) goto L8b
            r13 = 1
            goto L8c
        L8b:
            r13 = 0
        L8c:
            int r14 = r9.length()
            if (r11 <= r14) goto Lb7
            if (r5 == r13) goto L97
            java.lang.String r13 = "%1$-"
            goto L99
        L97:
            java.lang.String r13 = "%1$"
        L99:
            java.util.Locale r14 = java.util.Locale.US
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r11)
            java.lang.String r11 = "s"
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r3] = r9
            java.lang.String r9 = java.lang.String.format(r14, r11, r13)
        Lb7:
            r0.print(r9)
            o(r0, r10)
        Lbd:
            int r8 = r8 + r5
            goto L25
        Lc0:
            r12 = r20
            if (r7 != 0) goto Lc7
            r17.println()
        Lc7:
            r5 = r7
            goto L1f
        Lca:
            r17.println()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtm.n(java.io.PrintWriter, jtk, boolean, java.util.Set):void");
    }

    private static final void o(PrintWriter printWriter, jtj jtjVar) {
        char c = jtjVar.d;
        if (c != 0) {
            printWriter.print(c);
        }
    }

    public abstract int a();

    public abstract llp b();

    public abstract llp c();

    public abstract String d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public llp h() {
        throw null;
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public final void m(PrintWriter printWriter) {
        Set emptySet = Collections.emptySet();
        if (e()) {
            for (int i = 0; i < ((lrl) b()).c; i++) {
                llp c = c();
                int i2 = ((lrl) c).c;
                int i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        String a = new jtl((List) c.get(i3)).a(i);
                        if (a == null || a.isEmpty()) {
                            i3++;
                        }
                    } else {
                        if (emptySet.isEmpty()) {
                            emptySet = new HashSet();
                        }
                        emptySet.add((jtj) b().get(i));
                    }
                }
            }
        }
        boolean z = emptySet.size() == ((lrl) b()).c || c().isEmpty();
        if (g()) {
            n(printWriter, new jtk() { // from class: jtg
                @Override // defpackage.jtk
                public final String a(int i4) {
                    return ((jtj) jtm.this.b().get(i4)).a;
                }
            }, true, z ? Collections.emptySet() : emptySet);
        }
        if (z) {
            if (d() == null) {
                return;
            }
            printWriter.println(d());
            return;
        }
        llp c2 = c();
        int i4 = ((lrl) c2).c;
        for (int i5 = 0; i5 < i4; i5++) {
            List list = (List) c2.get(i5);
            if (list.size() == ((lrl) b()).c) {
                n(printWriter, new jtl(list), false, emptySet);
            } else {
                throw new IllegalArgumentException("Row has fewer columns than required.");
            }
        }
    }
}
