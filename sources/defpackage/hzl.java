package defpackage;

import android.util.JsonReader;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hzl  reason: default package */
/* loaded from: classes.dex */
public final class hzl {
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/mdd/ManifestedDataDownloader");
    public final hyy a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final mkr d;

    public hzl(hyy hyyVar, mkr mkrVar) {
        this.a = hyyVar;
        this.d = mkrVar;
    }

    public final mkh a(String str, String str2, int i, final opu opuVar, hyz hyzVar) {
        mko h;
        nfh t = jhs.h.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jhs jhsVar = (jhs) t.b;
        str2.getClass();
        int i2 = jhsVar.a | 1;
        jhsVar.a = i2;
        jhsVar.b = str2;
        jhsVar.a = i2 | 4;
        jhsVar.d = i;
        nfh t2 = jhr.k.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        jhr jhrVar = (jhr) t2.b;
        jhrVar.a |= 2;
        jhrVar.c = str;
        jhr jhrVar2 = (jhr) t2.b;
        jhrVar2.e = 1;
        jhrVar2.a |= 8;
        String str3 = str2 + i;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        jhr jhrVar3 = (jhr) t2.b;
        jhrVar3.a |= 1;
        jhrVar3.b = str3;
        jhr jhrVar4 = (jhr) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jhs jhsVar2 = (jhs) t.b;
        jhrVar4.getClass();
        jhsVar2.b();
        jhsVar2.f.add(jhrVar4);
        jhs jhsVar3 = (jhs) t.cz();
        ((ltd) ((ltd) c.b()).k("com/google/android/libraries/inputmethod/mdd/ManifestedDataDownloader", "download", 55, "ManifestedDataDownloader.java")).w("downloading manifest %s", str);
        hyy hyyVar = this.a;
        nzv a = jhp.a();
        a.g(jhsVar3);
        jhp f = a.f();
        if ((jhsVar3.a & 4) == 0) {
            h = mio.h(mkh.q(hyyVar.d.a(f)), new dvb(hyyVar, jhsVar3, 18), mjl.a);
        } else {
            jhz a2 = jia.a();
            a2.b(jhsVar3.b);
            jia a3 = a2.a();
            hyyVar.e.e(hzn.MDD_DOWNLOAD_REQUESTED, jhsVar3.b, Integer.valueOf(jhsVar3.d));
            h = mio.h(mio.h(mkh.q(hyyVar.d.a(f)), new dvb(hyyVar, a3, 19), mjl.a), new dvb(hyyVar, jhsVar3, 20), mjl.a);
        }
        return (mkh) mio.h(mio.g(mkh.q(h), new leq(opuVar, null, null, null, null) { // from class: hzj
            public final /* synthetic */ opu b;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.leq
            public final Object a(Object obj) {
                char c2;
                hzl hzlVar = hzl.this;
                opu opuVar2 = this.b;
                jho jhoVar = (jho) obj;
                if (jhoVar.g.size() != 1) {
                    throw new IllegalStateException(String.format("Incorrect file counts for manifest: %s", jhoVar.b));
                }
                File e = hzlVar.a.e((jhn) jhoVar.g.get(0));
                if (e == null) {
                    throw new IllegalStateException(String.format("Unable to open file: %s", ((jhn) jhoVar.g.get(0)).c));
                }
                Object obj2 = opuVar2.a;
                try {
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(e)));
                    nfh t3 = jhs.h.t();
                    nfh t4 = jhr.k.t();
                    String b = cfn.b((Locale) obj2);
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    jhs jhsVar4 = (jhs) t3.b;
                    b.getClass();
                    jhsVar4.a |= 1;
                    jhsVar4.b = b;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        switch (nextName.hashCode()) {
                            case 116079:
                                if (nextName.equals("url")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3528965:
                                if (nextName.equals("sha1")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3530753:
                                if (nextName.equals("size")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 351608024:
                                if (nextName.equals("version")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1109992585:
                                if (nextName.equals("downloadsize")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1145356460:
                                if (nextName.equals("downloadedsha1")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            String nextString = jsonReader.nextString();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            jhr jhrVar5 = (jhr) t4.b;
                            nextString.getClass();
                            jhrVar5.a |= 2;
                            jhrVar5.c = nextString;
                        } else if (c2 == 1) {
                            int nextInt = jsonReader.nextInt();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            jhr jhrVar6 = (jhr) t4.b;
                            jhrVar6.a |= 4;
                            jhrVar6.d = nextInt;
                        } else if (c2 == 2) {
                            String nextString2 = jsonReader.nextString();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            jhr jhrVar7 = (jhr) t4.b;
                            nextString2.getClass();
                            jhrVar7.a |= 16;
                            jhrVar7.f = nextString2;
                        } else if (c2 == 3) {
                            int nextInt2 = jsonReader.nextInt();
                            if (t3.c) {
                                t3.cD();
                                t3.c = false;
                            }
                            jhs jhsVar5 = (jhs) t3.b;
                            jhsVar5.a |= 4;
                            jhsVar5.d = nextInt2;
                        } else if (c2 == 4) {
                            int nextInt3 = jsonReader.nextInt();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            jhr jhrVar8 = (jhr) t4.b;
                            jhrVar8.a |= 128;
                            jhrVar8.i = nextInt3;
                        } else if (c2 == 5) {
                            String nextString3 = jsonReader.nextString();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            jhr jhrVar9 = (jhr) t4.b;
                            nextString3.getClass();
                            jhrVar9.a |= 64;
                            jhrVar9.h = nextString3;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str4 = b + "_" + ((jhs) t3.b).d;
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    jhr jhrVar10 = (jhr) t4.b;
                    jhrVar10.a |= 1;
                    jhrVar10.b = str4;
                    nfh t5 = noi.b.t();
                    nfh t6 = noh.c.t();
                    nfh t7 = noe.d.t();
                    if (t7.c) {
                        t7.cD();
                        t7.c = false;
                    }
                    noe noeVar = (noe) t7.b;
                    noeVar.a |= 1;
                    noeVar.b = "xz";
                    noe noeVar2 = (noe) t7.cz();
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    noh nohVar = (noh) t6.b;
                    noeVar2.getClass();
                    nohVar.b = noeVar2;
                    nohVar.a = 5;
                    noh nohVar2 = (noh) t6.cz();
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    noi noiVar = (noi) t5.b;
                    nohVar2.getClass();
                    nga ngaVar = noiVar.a;
                    if (!ngaVar.c()) {
                        noiVar.a = nfm.H(ngaVar);
                    }
                    noiVar.a.add(nohVar2);
                    noi noiVar2 = (noi) t5.cz();
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    jhr jhrVar11 = (jhr) t4.b;
                    noiVar2.getClass();
                    jhrVar11.g = noiVar2;
                    jhrVar11.a |= 32;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    jhs jhsVar6 = (jhs) t3.b;
                    jhr jhrVar12 = (jhr) t4.cz();
                    jhrVar12.getClass();
                    jhsVar6.b();
                    jhsVar6.f.add(jhrVar12);
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    jhs jhsVar7 = (jhs) t3.b;
                    jhsVar7.a |= 2048;
                    jhsVar7.e = false;
                    jhs jhsVar8 = (jhs) t3.cz();
                    jsonReader.close();
                    return jhsVar8;
                } catch (IOException e2) {
                    ((ltd) ((ltd) ((ltd) cfn.a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKLPDownloader", "parseManifest", (char) 241, "DelightKLPDownloader.java")).s();
                    return jhs.h;
                }
            }
        }, this.d), new hap(this, hyzVar, str2, str, i, opuVar, 2, null, null, null, null), this.d);
    }
}
