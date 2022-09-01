package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cfp  reason: default package */
/* loaded from: classes.dex */
public final class cfp implements ifw {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKlpDownloadModule");
    private final cfn b;
    private final mkr c;
    private final hqq d = new cfo(this);
    private final hhk e = new bvl(this, 4);

    public cfp(Context context) {
        mks a2 = gxo.a(9);
        this.c = a2;
        this.b = new cfn(context, hyy.a(), a2, gzc.b);
    }

    public final void c(List list) {
        try {
            List a2 = cat.a(list);
            cfn cfnVar = this.b;
            if (cfnVar == null) {
                return;
            }
            ArrayList<Locale> arrayList = new ArrayList(a2.size());
            Iterator it = a2.iterator();
            while (true) {
                Locale locale = null;
                if (!it.hasNext()) {
                    break;
                }
                Locale locale2 = (Locale) it.next();
                Locale b = cat.b(cfnVar.e, locale2);
                if (b.equals(locale2)) {
                    Iterator it2 = jaz.a(cfnVar.e, b).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Locale locale3 = (Locale) it2.next();
                            if (cfq.a.contains(locale3)) {
                                locale = locale3;
                                break;
                            }
                        } else {
                            ((ltd) ((ltd) cfn.a.c()).k("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKLPDownloader", "getBestAvailableLocale", 88, "DelightKLPDownloader.java")).w("klp for %s is not found", b);
                            break;
                        }
                    }
                } else {
                    locale = b;
                }
                if (locale != null) {
                    arrayList.add(locale);
                    int intValue = ((Long) cfd.b.c()).intValue();
                    String str = ((String) cfd.a.c()) + "-perlang/" + locale.toLanguageTag() + ".json";
                    boolean isEmpty = cfnVar.d.c("delight", locale.toLanguageTag()).isEmpty();
                    ((ltd) ((ltd) cfn.a.b()).k("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKLPDownloader", "downloadKLPInternal", 140, "DelightKLPDownloader.java")).w("downloading KLP for %s", locale);
                    String a3 = cfn.a(locale);
                    hzl hzlVar = cfnVar.f;
                    opu opuVar = new opu(locale);
                    hyt a4 = hyz.a();
                    a4.c(isEmpty);
                    a4.b(isEmpty);
                    a4.e(500);
                    kcu.U(hzlVar.a(str, a3, intValue, opuVar, a4.a()), new bvo(cfnVar, locale, 7), cfnVar.c);
                }
            }
            HashSet hashSet = new HashSet();
            for (Locale locale4 : arrayList) {
                hashSet.add(cfn.b(locale4));
                hashSet.add(cfn.a(locale4));
            }
            jix jixVar = cfnVar.b.d;
            jqi jqiVar = new jqi(null);
            jqiVar.e(false);
            jqiVar.b = (byte) (jqiVar.b | 6);
            jqiVar.e(true);
            if (jqiVar.b != 7) {
                StringBuilder sb = new StringBuilder();
                if ((jqiVar.b & 1) == 0) {
                    sb.append(" includeAllGroups");
                }
                if ((jqiVar.b & 2) == 0) {
                    sb.append(" groupWithNoAccountOnly");
                }
                if ((jqiVar.b & 4) == 0) {
                    sb.append(" preserveZipDirectories");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            jib jibVar = new jib(jqiVar.a, (lfb) jqiVar.d, (lfb) jqiVar.c, (lfb) jqiVar.e);
            if (!jibVar.a) {
                jdg.w(false, "Request must provide a group name or source to filter by");
            } else {
                jdg.v(true);
                jdg.v(true);
                jdg.v(true);
                jdg.v(true);
            }
            kcu.U(mio.g(mkh.q(((jjb) jixVar).g.a(new dus((jjb) jixVar, jibVar, 8), ((jjb) jixVar).d)), hwy.e, mjl.a), new bvo(cfnVar, hashSet, 6), cfnVar.c);
        } catch (cen e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/delightklpdownloader/DelightKlpDownloadModule", "refreshKLPs", '2', "DelightKlpDownloadModule.java")).s();
        }
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.d.d(this.c);
        cfd.b.e(this.e);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.d.e();
        cfd.b.g(this.e);
    }
}
