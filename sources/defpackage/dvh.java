package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: dvh  reason: default package */
/* loaded from: classes.dex */
public final class dvh {
    private static final Pattern a = Pattern.compile("\\p{So}\\p{M}*+\\p{Sk}*+");

    public static bnq a(fhj fhjVar, hbd hbdVar) {
        if (hbdVar == null) {
            nfh t = bnq.b.t();
            t.cI(fhjVar.a);
            return (bnq) t.cz();
        }
        nfh t2 = bnq.b.t();
        for (bns bnsVar : fhjVar.a) {
            nfh u = bns.f.u(bnsVar);
            String str = bnsVar.b;
            int codePointCount = str.codePointCount(0, str.length()) + 1;
            int[] iArr = new int[codePointCount];
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = a.matcher(str);
            int i = 0;
            int i2 = 0;
            while (matcher.find()) {
                String group = matcher.group();
                String i3 = hbdVar.i(group);
                if (i3 != null) {
                    matcher.appendReplacement(stringBuffer, i3);
                    int codePointCount2 = str.codePointCount(0, matcher.end());
                    while (i < codePointCount2) {
                        iArr[i] = i2;
                        i++;
                    }
                    i2 += i3.codePointCount(0, i3.length()) - group.codePointCount(0, group.length());
                    i = codePointCount2;
                }
            }
            matcher.appendTail(stringBuffer);
            for (int i4 = i; i4 < codePointCount; i4++) {
                iArr[i4] = i2;
            }
            String stringBuffer2 = stringBuffer.toString();
            if (u.c) {
                u.cD();
                u.c = false;
            }
            bns bnsVar2 = (bns) u.b;
            bnsVar2.a |= 1;
            bnsVar2.b = stringBuffer2;
            if (i > 0) {
                bnsVar2.e = bns.G();
                for (bnr bnrVar : bnsVar.e) {
                    nfh u2 = bnr.e.u(bnrVar);
                    int i5 = bnrVar.b;
                    int i6 = i5 + iArr[i5];
                    if (u2.c) {
                        u2.cD();
                        u2.c = false;
                    }
                    bnr bnrVar2 = (bnr) u2.b;
                    int i7 = bnrVar2.a | 1;
                    bnrVar2.a = i7;
                    bnrVar2.b = i6;
                    int i8 = bnrVar.c;
                    int i9 = iArr[i8];
                    bnrVar2.a = i7 | 2;
                    bnrVar2.c = i8 + i9;
                    bnr bnrVar3 = (bnr) u2.cz();
                    if (u.c) {
                        u.cD();
                        u.c = false;
                    }
                    bns bnsVar3 = (bns) u.b;
                    bnrVar3.getClass();
                    nga ngaVar = bnsVar3.e;
                    if (!ngaVar.c()) {
                        bnsVar3.e = nfm.H(ngaVar);
                    }
                    bnsVar3.e.add(bnrVar3);
                }
            }
            bns bnsVar4 = (bns) u.cz();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            bnq bnqVar = (bnq) t2.b;
            bnsVar4.getClass();
            bnqVar.b();
            bnqVar.a.add(bnsVar4);
        }
        return (bnq) t2.cz();
    }
}
