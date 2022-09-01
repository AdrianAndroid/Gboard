package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.hint.CentralizedHintManager;
import com.google.android.libraries.inputmethod.hint.notice.NoticeHolderView;
import java.io.File;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cir  reason: default package */
/* loaded from: classes.dex */
public final class cir implements ijj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cir(bxm bxmVar, int i) {
        this.b = i;
        this.a = bxmVar;
    }

    public cir(cmn cmnVar, int i) {
        this.b = i;
        this.a = cmnVar;
    }

    public cir(CentralizedHintManager centralizedHintManager, int i) {
        this.b = i;
        this.a = centralizedHintManager;
    }

    public cir(dcu dcuVar, int i) {
        this.b = i;
        this.a = dcuVar;
    }

    public cir(dhz dhzVar, int i) {
        this.b = i;
        this.a = dhzVar;
    }

    public cir(dyp dypVar, int i) {
        this.b = i;
        this.a = dypVar;
    }

    public cir(dyu dyuVar, int i) {
        this.b = i;
        this.a = dyuVar;
    }

    public cir(grt grtVar, int i) {
        this.b = i;
        this.a = grtVar;
    }

    public cir(ilb ilbVar, int i) {
        this.b = i;
        this.a = ilbVar;
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fd(ijg ijgVar) {
        hpy b;
        iou iouVar;
        mko mkoVar = null;
        switch (this.b) {
            case 0:
                cis cisVar = (cis) ijgVar;
                if (((Boolean) cmo.v.c()).booleanValue() || ((Boolean) cmo.y.c()).booleanValue() || ((cmn) this.a).d || (b = hqj.b()) == null || b.c.toString().trim().equals(((cmn) this.a).g.trim())) {
                    return;
                }
                cmn.v((cmn) this.a);
                ((cmn) this.a).u(may.EMOJI_CANDIDATE_AVAILABLE);
                return;
            case 1:
                lmz lmzVar = bxm.a;
                bxm bxmVar = (bxm) this.a;
                bye a = bye.a(bxmVar.f);
                ijk ijkVar = ((exo) ijgVar).a;
                if (!((Boolean) bxn.b.c()).booleanValue()) {
                    ((ltd) ((ltd) bye.a.d()).k("com/google/android/apps/inputmethod/libs/crank/nextwordpredictor/NwpModelManager", "checkPersonalizedModelUpdate", 205, "NwpModelManager.java")).t("nwp_p13n: personalization is disabled via flag");
                } else {
                    mkoVar = kcu.O(new cak(a, (String) ijkVar.a, (jav) ijkVar.b, 1), gxo.a(10));
                }
                if (mkoVar == null) {
                    return;
                }
                hji.c(mkoVar, new bxj(bxmVar, 0), bxl.b, bxm.b());
                return;
            case 2:
                boolean z = ((cjl) ijgVar).a;
                if (!((Boolean) cmo.y.c()).booleanValue()) {
                    return;
                }
                cmn cmnVar = (cmn) this.a;
                if (cmnVar.e) {
                    cmnVar.l = z;
                    return;
                }
                cmnVar.l = false;
                if (z) {
                    cmn.v(cmnVar);
                    ((cmn) this.a).u(may.EXPRESSION_MOMENT_CANDIDATE_AVAILABLE);
                    return;
                } else if (cmnVar.n == 2) {
                    return;
                } else {
                    cmnVar.l(may.EXPRESSION_MOMENT_CANDIDATE_UNAVAILABLE);
                    return;
                }
            case 3:
                if (!TextUtils.equals(((dhz) this.a).d, ((dic) ijgVar).a)) {
                    return;
                }
                NoticeHolderView noticeHolderView = ((dhz) this.a).b;
                if (noticeHolderView == null || !noticeHolderView.isShown()) {
                    ((dhz) this.a).g();
                    return;
                } else {
                    ((dhz) this.a).i();
                    return;
                }
            case 4:
                ((dyu) this.a).Y().b(((eko) ijgVar).b);
                dyu dyuVar = (dyu) this.a;
                hsy hsyVar = dyuVar.e;
                if (hsyVar == null) {
                    return;
                }
                hsyVar.r(dyuVar.ag(), null, false);
                return;
            case 5:
                gqq gqqVar = (gqq) ijgVar;
                if (!gqqVar.c) {
                    ((grt) this.a).f(gqqVar.a, gqqVar.b, false);
                    return;
                } else {
                    ((grt) this.a).f(gqqVar.a, gqqVar.b, true);
                    return;
                }
            case 6:
                grd grdVar = (grd) ijgVar;
                int i = grdVar.a;
                String str = grdVar.b;
                Object obj = this.a;
                if (i == 0) {
                    grt grtVar = (grt) obj;
                    gqh gqhVar = (gqh) grtVar.i.remove(str);
                    if (gqhVar == null) {
                        return;
                    }
                    if (grt.v(gqhVar)) {
                        grtVar.d.h(null);
                    }
                    grtVar.t();
                    return;
                }
                gqv gqvVar = (gqv) ((grt) obj).h.get(i);
                if (gqvVar != null) {
                    gqvVar.b(str);
                    return;
                } else {
                    ((ltd) ((ltd) grt.a.c()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointsManager", "removeAccessPoint", 734, "AccessPointsManager.java")).w("Invalid holderId %s", jbi.i(i));
                    return;
                }
            case 7:
                hkp hkpVar = (hkp) ijgVar;
                String str2 = hkpVar.a;
                boolean z2 = hkpVar.b;
                hkb hkbVar = ((CentralizedHintManager) this.a).a;
                if (hkbVar == null) {
                    return;
                }
                hkbVar.a(llp.r(str2), z2, hkz.INITIATIVE, true);
                return;
            case 8:
                hlf hlfVar = ((hkq) ijgVar).a;
                hkb hkbVar2 = ((CentralizedHintManager) this.a).a;
                if (hkbVar2 == null) {
                    return;
                }
                if (hkbVar2.b.containsKey(hlfVar.a)) {
                    hkbVar2.a.d(hlfVar, 1);
                    return;
                } else if (hkbVar2.c.containsKey(hlfVar.a)) {
                    hkbVar2.a.d(hlfVar, 0);
                    return;
                } else {
                    Map map = ((dhy) hkbVar2.a).e;
                    String str3 = hlfVar.a;
                    if (hlfVar == null) {
                        throw new NullPointerException("Null tooltip");
                    }
                    map.put(str3, dip.c(hlfVar, null, null));
                    Map map2 = hkbVar2.b;
                    String str4 = hlfVar.a;
                    hjz hjzVar = new hjz();
                    hjzVar.d(0L);
                    hjzVar.b(0L);
                    hjzVar.a = (byte) (hjzVar.a | 48);
                    hjzVar.c(0L);
                    hjzVar.a = (byte) (hjzVar.a | 72);
                    hjzVar.c(System.currentTimeMillis());
                    map2.put(str4, hjzVar.a());
                    hkbVar2.c();
                    return;
                }
            case 9:
                Object obj2 = this.a;
                File file = ((ila) ijgVar).a;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.SUBJECT", "PersonalDictionary.zip");
                intent.setType("application/zip");
                an anVar = (an) obj2;
                String packageName = anVar.fS().getPackageName();
                String name = file.getName();
                intent.putExtra("android.intent.extra.STREAM", Uri.parse("content://" + packageName + ".fileprovider/personal-dictionary/" + name));
                intent.addFlags(268435457);
                anVar.af(intent);
                return;
            case 10:
                ioq ioqVar = (ioq) ijgVar;
                iou iouVar2 = ioqVar.a;
                boolean z3 = ioqVar.b;
                iot iotVar = iouVar2.a;
                dyp dypVar = (dyp) this.a;
                iou iouVar3 = dypVar.f;
                if ((iouVar3 == null || iouVar3.a != iotVar) && ((iouVar = dypVar.l) == null || iouVar.a != iotVar)) {
                    return;
                }
                if (iouVar3 != null) {
                    dypVar.a(z3);
                    return;
                }
                if (dypVar.g(z3)) {
                    ((dyp) this.a).b();
                    dye dyeVar = ((dyp) this.a).e;
                    if (dyeVar != null) {
                        dyeVar.c();
                    }
                }
                ((dyp) this.a).f();
                return;
            case 11:
                ior iorVar = (ior) ijgVar;
                iou iouVar4 = iorVar.a;
                hwv hwvVar = iorVar.b;
                ((ltd) ((ltd) dyp.a.b()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager$3", "display", 214, "ProactiveSuggestionsHolderManager.java")).G("Requesting to show proactive suggestions: %s %s", iouVar4.a, hwvVar);
                dyp dypVar2 = (dyp) this.a;
                if (!dypVar2.i) {
                    ((ltd) ((ltd) dyp.a.b()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager$3", "display", 218, "ProactiveSuggestionsHolderManager.java")).t("no keyboard is showing, suggestions are pending to show");
                } else if (dypVar2.e == null) {
                    ((ltd) ((ltd) dyp.a.b()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager$3", "display", 220, "ProactiveSuggestionsHolderManager.java")).t("a request is received while current keyboard doesn't have this sub view, suggestions are pending to show.");
                } else {
                    dypVar2.h(iouVar4, hwvVar);
                    return;
                }
                dyp dypVar3 = (dyp) this.a;
                dypVar3.l = iouVar4;
                dypVar3.m = hwvVar;
                return;
            default:
                isz iszVar = (isz) ijgVar;
                ((dcu) this.a).O.set(true);
                return;
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
