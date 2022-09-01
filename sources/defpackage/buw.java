package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.sharing.SharingLinkReceiveActivity;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.android.libraries.stickers.megamode.MegamodeView;

/* compiled from: PG */
/* renamed from: buw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class buw implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ buw(bui buiVar, buk bukVar, String str, int i) {
        this.d = i;
        this.b = buiVar;
        this.c = bukVar;
        this.a = str;
    }

    public /* synthetic */ buw(bvf bvfVar, buk bukVar, bvd bvdVar, int i) {
        this.d = i;
        this.a = bvfVar;
        this.b = bukVar;
        this.c = bvdVar;
    }

    public /* synthetic */ buw(bvf bvfVar, bvd bvdVar, buk bukVar, int i) {
        this.d = i;
        this.a = bvfVar;
        this.c = bvdVar;
        this.b = bukVar;
    }

    public /* synthetic */ buw(chc chcVar, his hisVar, Object obj, int i) {
        this.d = i;
        this.b = chcVar;
        this.c = hisVar;
        this.a = obj;
    }

    public /* synthetic */ buw(cjt cjtVar, EditorInfo editorInfo, cjo cjoVar, int i) {
        this.d = i;
        this.a = cjtVar;
        this.b = editorInfo;
        this.c = cjoVar;
    }

    public /* synthetic */ buw(SharingLinkReceiveActivity sharingLinkReceiveActivity, ely elyVar, Dialog dialog, int i) {
        this.d = i;
        this.a = sharingLinkReceiveActivity;
        this.c = elyVar;
        this.b = dialog;
    }

    public /* synthetic */ buw(MegamodeView megamodeView, njs njsVar, String str, int i) {
        this.d = i;
        this.b = megamodeView;
        this.c = njsVar;
        this.a = str;
    }

    public /* synthetic */ buw(dmz dmzVar, dmy dmyVar, hqt hqtVar, int i) {
        this.d = i;
        this.c = dmzVar;
        this.b = dmyVar;
        this.a = hqtVar;
    }

    public /* synthetic */ buw(eco ecoVar, ecn ecnVar, eck eckVar, int i) {
        this.d = i;
        this.a = ecoVar;
        this.c = ecnVar;
        this.b = eckVar;
    }

    public /* synthetic */ buw(euf eufVar, ety etyVar, mo moVar, int i) {
        this.d = i;
        this.a = eufVar;
        this.c = etyVar;
        this.b = moVar;
    }

    public /* synthetic */ buw(fbf fbfVar, Context context, hsk hskVar, int i) {
        this.d = i;
        this.c = fbfVar;
        this.b = context;
        this.a = hskVar;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, ety] */
    /* JADX WARN: Type inference failed for: r1v26, types: [ecn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [hsk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [hsk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, hqt] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                Object obj3 = this.c;
                buk bukVar = (buk) obj2;
                if (bukVar.m()) {
                    bukVar.f = ((bvd) obj3).t.getText();
                }
                ((bvf) obj).n.j(bukVar, true);
                bwg.d(view);
                return;
            case 1:
                Object obj4 = this.b;
                Object obj5 = this.c;
                Object obj6 = this.a;
                bwg.d(view);
                bui buiVar = (bui) obj4;
                buiVar.a(0);
                buk bukVar2 = (buk) obj5;
                buiVar.b.e(bwa.ENTITY_CHIP_CLICKED, Integer.valueOf(bukVar2.c()));
                idk idkVar = buiVar.b;
                hsk b = hsx.b();
                if (b != null) {
                    b.at(hfd.d(new iay(-10009, iax.COMMIT, obj6)));
                    b.at(hfd.d(new iay(-10090, null, 0)));
                    bwg.b(b.N(), idkVar);
                    bwg.a((Context) b);
                }
                long j = bukVar2.e;
                bui.h(j);
                buiVar.c(j, true);
                buiVar.b.e(bwa.AUTO_PASTE_TEXT_ITEM_PASTE_LENGTH, Integer.valueOf(((String) obj6).length()));
                return;
            case 2:
                Object obj7 = this.a;
                Object obj8 = this.c;
                Object obj9 = this.b;
                bvd bvdVar = (bvd) obj8;
                if (bvdVar.y.isChecked()) {
                    bvf bvfVar = (bvf) obj7;
                    bvfVar.h.put(((mo) obj8).b(), obj9);
                    bvfVar.i += ((buk) obj9).l() ? 1 : 0;
                    bvdVar.z.setVisibility(0);
                    bvdVar.A.setVisibility(8);
                } else {
                    bvf bvfVar2 = (bvf) obj7;
                    bvfVar2.h.remove(((mo) obj8).b());
                    bvfVar2.i -= ((buk) obj9).l() ? 1 : 0;
                    bvdVar.z.setVisibility(8);
                    bvdVar.A.setVisibility(0);
                }
                ((bvf) obj7).n.i();
                return;
            case 3:
                this.c.a(this.a, Integer.valueOf(((mo) this.b).b()));
                return;
            case 4:
                Object obj10 = this.a;
                Object obj11 = this.b;
                Object obj12 = this.c;
                fgy.j(view);
                cjt cjtVar = (cjt) obj10;
                crf a = ((crg) cjtVar.c).a();
                cqz a2 = cra.a();
                a2.a = (EditorInfo) obj11;
                cjo cjoVar = (cjo) obj12;
                a2.b(cjoVar.d());
                a2.e((lfb) cjtVar.i.a(cjoVar.d()));
                hiz a3 = a.a(a2.a());
                afp afpVar = afp.STARTED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new bqx(cjtVar, cjoVar, 2));
                e2.h(bxl.f);
                a3.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
                cjtVar.d();
                cjtVar.g.e(ciu.IMAGE_CANDIDATE_USAGE, 6);
                return;
            case 5:
                view.postDelayed(new bue((dmz) this.c, (dmy) this.b, (hqt) this.a, 9), 200L);
                return;
            case 6:
                Object obj13 = this.a;
                ?? r1 = this.c;
                Object obj14 = this.b;
                eco ecoVar = (eco) obj13;
                r1.b(view, ecoVar.C, true);
                hei heiVar = ((EmojiView) view).c;
                if (!((eck) obj14).f.e(heiVar.b)) {
                    return;
                }
                ecoVar.s.d(heiVar);
                return;
            case 7:
                Object obj15 = this.a;
                Object obj16 = this.c;
                Object obj17 = this.b;
                ely elyVar = (ely) obj16;
                ieh.j().e(emm.SHARING_LANGUAGE, mdx.RECEIVE_PAGE, elyVar.x());
                SharingLinkReceiveActivity sharingLinkReceiveActivity = (SharingLinkReceiveActivity) obj15;
                sharingLinkReceiveActivity.k.a(elyVar, "sharing_link", null).run();
                ((Dialog) obj17).dismiss();
                sharingLinkReceiveActivity.finish();
                return;
            case 8:
                euf eufVar = (euf) this.a;
                this.c.c(eufVar.h, eufVar, ((mo) this.b).b());
                return;
            case 9:
                Object obj18 = this.c;
                Object obj19 = this.b;
                ?? r12 = this.a;
                ((fbf) obj18).e();
                Context context = (Context) obj19;
                fay.b(context, true);
                Window window = r12.getWindow().getWindow();
                if (window == null) {
                    return;
                }
                fbf.k(context, window.getDecorView(), r12.F(), true);
                return;
            case 10:
                Object obj20 = this.c;
                Object obj21 = this.b;
                ?? r13 = this.a;
                ((fbf) obj20).e();
                fbf.g((Context) obj21, r13);
                return;
            default:
                Object obj22 = this.b;
                Object obj23 = this.c;
                Object obj24 = this.a;
                MegamodeView megamodeView = (MegamodeView) obj22;
                megamodeView.h.setClickable(false);
                megamodeView.m = !megamodeView.m;
                String k = kfl.k(((njs) obj23).a);
                knn knnVar = (knn) megamodeView.d;
                mko hQ = knnVar.a.hQ(new hlx(knnVar, k, megamodeView.m, 3));
                if (megamodeView.c.containsKey(k)) {
                    ((mko) megamodeView.c.get(k)).cancel(true);
                }
                megamodeView.c.put(k, hQ);
                kcu.U(hQ, new cvt(megamodeView, (String) obj24, view, 12), knp.a);
                kns knsVar = ((knn) megamodeView.d).e;
                int i = true != megamodeView.m ? 11 : 10;
                nfh t = mlr.e.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((mlr) t.b).a = kcu.u(i);
                mlr mlrVar = (mlr) t.b;
                mlrVar.c = k;
                mlrVar.d = kcu.v(15);
                knsVar.a((mlr) t.cz());
                return;
        }
    }
}
