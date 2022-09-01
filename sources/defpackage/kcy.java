package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kcy  reason: default package */
/* loaded from: classes.dex */
public final class kcy {
    private static final lfy b = lfy.c('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List k = b.k(str);
        return k.size() != 3 ? "MALFORMED" : (String) k.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final onk b(onk onkVar) {
        onf onfVar = onkVar.d;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        if ((onfVar.a & 1) != 0) {
            onf onfVar2 = onkVar.d;
            if (onfVar2 == null) {
                onfVar2 = onf.d;
            }
            nfh nfhVar = (nfh) onfVar2.N(5);
            nfhVar.cG(onfVar2);
            Long l = (Long) this.a.get(Long.valueOf(((onf) nfhVar.b).b));
            jdg.u(l);
            nfh nfhVar2 = (nfh) onkVar.N(5);
            nfhVar2.cG(onkVar);
            long longValue = l.longValue();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            onf onfVar3 = (onf) nfhVar.b;
            onfVar3.a |= 1;
            onfVar3.b = longValue;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            onk onkVar2 = (onk) nfhVar2.b;
            onf onfVar4 = (onf) nfhVar.cz();
            onfVar4.getClass();
            onkVar2.d = onfVar4;
            onkVar2.a |= 4;
            return (onk) nfhVar2.cz();
        }
        return onkVar;
    }

    public final onk c(int i, onk onkVar) {
        onf onfVar = onkVar.d;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        if ((onfVar.a & 2) != 0) {
            onf onfVar2 = onkVar.d;
            if (onfVar2 == null) {
                onfVar2 = onf.d;
            }
            nfh nfhVar = (nfh) onfVar2.N(5);
            nfhVar.cG(onfVar2);
            nfh nfhVar2 = (nfh) onkVar.N(5);
            nfhVar2.cG(onkVar);
            String str = ((onf) nfhVar.b).c;
            Long a = mln.a(str);
            jdg.u(a);
            long longValue = a.longValue();
            ConcurrentHashMap concurrentHashMap = this.a;
            Long valueOf = Long.valueOf(longValue);
            if (!concurrentHashMap.containsKey(valueOf)) {
                int i2 = i - 1;
                if (i2 == 0) {
                    Matcher matcher = c.matcher(str);
                    if (matcher.matches()) {
                        str = str.startsWith("*sync*/") ? "*sync*/".concat(String.valueOf(a(str.substring(7)))) : matcher.group(1);
                    }
                } else if (i2 == 1) {
                    str = a(str);
                } else if (i2 == 2) {
                    str = "--";
                }
                Long a2 = mln.a(str);
                if (a2 != null) {
                    this.a.putIfAbsent(valueOf, a2);
                }
            }
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            onf onfVar3 = (onf) nfhVar.b;
            int i3 = onfVar3.a | 1;
            onfVar3.a = i3;
            onfVar3.b = longValue;
            onfVar3.a = i3 & (-3);
            onfVar3.c = onf.d.c;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            onk onkVar2 = (onk) nfhVar2.b;
            onf onfVar4 = (onf) nfhVar.cz();
            onfVar4.getClass();
            onkVar2.d = onfVar4;
            onkVar2.a |= 4;
            return (onk) nfhVar2.cz();
        }
        return onkVar;
    }
}
