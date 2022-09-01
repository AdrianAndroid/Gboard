package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* renamed from: kqa  reason: default package */
/* loaded from: classes.dex */
public final class kqa {
    static {
        nfh t = noh.c.t();
        noc nocVar = noc.a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        noh nohVar = (noh) t.b;
        nocVar.getClass();
        nohVar.b = nocVar;
        nohVar.a = 1;
        noh nohVar2 = (noh) t.cz();
        nfh t2 = noh.c.t();
        nof nofVar = nof.c;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        noh nohVar3 = (noh) t2.b;
        nofVar.getClass();
        nohVar3.b = nofVar;
        nohVar3.a = 2;
        noh nohVar4 = (noh) t2.cz();
        nfh t3 = noh.c.t();
        nog nogVar = nog.c;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        noh nohVar5 = (noh) t3.b;
        nogVar.getClass();
        nohVar5.b = nogVar;
        nohVar5.a = 3;
        noh nohVar6 = (noh) t3.cz();
    }

    public static String a(noi noiVar) {
        String str;
        nof nofVar;
        nog nogVar;
        noj nojVar;
        noe noeVar;
        String str2;
        llk e = llp.e();
        for (noh nohVar : noiVar.a) {
            int i = nohVar.a;
            boolean z = false;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    str = "compress";
                } else if (i3 == 1) {
                    if (i == 2) {
                        nofVar = (nof) nohVar.b;
                    } else {
                        nofVar = nof.c;
                    }
                    str = nofVar.a == 1 ? "encrypt(aes_gcm_key=" + b((String) nofVar.b) + ")" : "encrypt";
                } else if (i3 == 2) {
                    if (i == 3) {
                        nogVar = (nog) nohVar.b;
                    } else {
                        nogVar = nog.c;
                    }
                    str = nogVar.a == 1 ? "integrity(sha256=" + b((String) nogVar.b) + ")" : "integrity";
                } else if (i3 == 3) {
                    if (i == 4) {
                        nojVar = (noj) nohVar.b;
                    } else {
                        nojVar = noj.c;
                    }
                    if (1 == (nojVar.a & 1)) {
                        z = true;
                    }
                    jdg.v(z);
                    str = "zip(target=" + b(nojVar.b) + ")";
                } else if (i3 == 4) {
                    if (i == 5) {
                        noeVar = (noe) nohVar.b;
                    } else {
                        noeVar = noe.d;
                    }
                    if (noeVar.c.size() > 0) {
                        llk e2 = llp.e();
                        for (nod nodVar : noeVar.c) {
                            jdg.v(1 == (nodVar.a & 1));
                            if ((nodVar.a & 2) == 0) {
                                e2.h(nodVar.b);
                            } else {
                                e2.h(nodVar.b + "=" + b(nodVar.c));
                            }
                        }
                        str2 = "(" + lex.d(",").f(e2.g()) + ")";
                    } else {
                        str2 = "";
                    }
                    str = String.valueOf(noeVar.b).concat(str2);
                } else {
                    throw new IllegalArgumentException("No transform specified");
                }
                e.h(str);
            } else {
                throw null;
            }
        }
        return kpg.b(e.g());
    }

    private static final String b(String str) {
        try {
            return URLEncoder.encode(str, kpd.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
